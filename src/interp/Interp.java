/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package interp;

import parser.*;

import java.util.ArrayList;
import java.util.*;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

/** Class that implements the interpreter of the language. */

public class Interp {

    Double deltaTime = 0.0;

    ArrayList<ArrayList<String>> states = new ArrayList<ArrayList<String>>();

    HashMap<String,Integer> changePos = new HashMap<String,Integer>();

    /** Memory of the virtual machine. */
    private Stack Stack;
    private PrintWriter fileOutput;

    /**
     * Map between function names (keys) and ASTs (values).
     * Each entry of the map stores the root of the AST
     * correponding to the function.
     */
    private HashMap<String,AslTree> FuncName2Tree;

    /** Standard input of the interpreter (System.in). */
    private Scanner stdin;

    /**
     * Stores the line number of the current statement.
     * The line number is used to report runtime errors.
     */
    private int linenumber = -1;

    /** File to write the trace of function calls. */
    private PrintWriter trace = null;

    /** Nested levels of function calls. */
    private int function_nesting = -1;
    
    /**
     * Constructor of the interpreter. It prepares the main
     * data structures for the execution of the main program.
     */
    public Interp(AslTree T, String tracefile) {
        assert T != null;
        MapFunctions(T);  // Creates the table to map function names into AST nodes
        PreProcessAST(T); // Some internal pre-processing ot the AST
        Stack = new Stack(); // Creates the memory of the virtual machine
        // Initializes the standard input of the program
        stdin = new Scanner (new BufferedReader(new InputStreamReader(System.in)));
        if (tracefile != null) {
            try {
                trace = new PrintWriter(new FileWriter(tracefile));
            } catch (IOException e) {
                System.err.println(e);
                System.exit(1);
            }
        }
        function_nesting = -1;
    }

    /** Runs the program by calling the main function without parameters. */
    public void Run() {
        executeFunction ("main", null);
    }

    /** Returns the contents of the stack trace */
    public String getStackTrace() {
        return Stack.getStackTrace(lineNumber());
    }

    /** Returns a summarized contents of the stack trace */
    public String getStackTrace(int nitems) {
        return Stack.getStackTrace(lineNumber(), nitems);
    }
    
    /**
     * Gathers information from the AST and creates the map from
     * function names to the corresponding AST nodes.
     */
    private void MapFunctions(AslTree T) {
        assert T != null && T.getType() == AslLexer.LIST_FUNCTIONS;
        FuncName2Tree = new HashMap<String,AslTree> ();
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) {
            AslTree f = T.getChild(i);
            assert f.getType() == AslLexer.FUNC;
            String fname = f.getChild(0).getText();
            if (FuncName2Tree.containsKey(fname)) {
                throw new RuntimeException("Multiple definitions of function " + fname);
            }
            FuncName2Tree.put(fname, f);
        } 
    }

    /**
     * Performs some pre-processing on the AST. Basically, it
     * calculates the value of the literals and stores a simpler
     * representation. See AslTree.java for details.
     */
    private void PreProcessAST(AslTree T) {
        if (T == null) return;
        switch(T.getType()) {
            case AslLexer.INT: T.setIntValue(); break;
            case AslLexer.STRING: T.setStringValue(); break;
            case AslLexer.BOOLEAN: T.setBooleanValue(); break;
            default: break;
        }
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) PreProcessAST(T.getChild(i));
    }

    /**
     * Gets the current line number. In case of a runtime error,
     * it returns the line number of the statement causing the
     * error.
     */
    public int lineNumber() { return linenumber; }

    /** Defines the current line number associated to an AST node. */
    private void setLineNumber(AslTree t) { linenumber = t.getLine();}

    /** Defines the current line number with a specific value */
    private void setLineNumber(int l) { linenumber = l;}
    private void printInit(){
	try{
	  fileOutput = new PrintWriter("generated.html", "UTF-8");
	}
	catch(Exception e){
	  e.printStackTrace();
	}
	fileOutput.println("<!DOCTYPE html> \n <html> \n <body> \n <svg height=800 width=600>\n");
	
    }
    private void printEnd(){
    for (int i = 0; i < states.size(); ++i) {
        for (String s : states.get(i)) {
            fileOutput.println(s);
        }
    }
	fileOutput.println("</svg>\n </body> \n </html>");
	fileOutput.close();
    }
    /**
     * Executes a function.
     * @param funcname The name of the function.
     * @param args The AST node representing the list of arguments of the caller.
     * @return The data returned by the function.
     */
    private Data executeFunction (String funcname, AslTree args) {
        // Get the AST of the function
        AslTree f = FuncName2Tree.get(funcname);
        if (f == null) throw new RuntimeException(" function " + funcname + " not declared");
        if (funcname.equals("main")) printInit();

        // Gather the list of arguments of the caller. This function
        // performs all the checks required for the compatibility of
        // parameters.
        ArrayList<Data> Arg_values = listArguments(f, args);

        // Dumps trace information (function call and arguments)
        if (trace != null) traceFunctionCall(f, Arg_values);
        
        // List of parameters of the callee
        AslTree p = f.getChild(1);
        int nparam = p.getChildCount(); // Number of parameters

        // Create the activation record in memory
        Stack.pushActivationRecord(funcname, lineNumber());

        // Track line number
        setLineNumber(f);
         
        // Copy the parameters to the current activation record
        for (int i = 0; i < nparam; ++i) {
            String param_name = p.getChild(i).getText();
            Stack.defineVariable(param_name, Arg_values.get(i));
        }

        // Execute the instructions
        Data result = executeListInstructions (f.getChild(2));
        if (funcname.equals("main")) printEnd();
        // If the result is null, then the function returns void
        if (result == null) result = new Data();
        
        // Dumps trace information
        if (trace != null) traceReturn(f, result, Arg_values);
        
        // Destroy the activation record
        Stack.popActivationRecord();

        return result;
    }

    /**
     * Executes a block of instructions. The block is terminated
     * as soon as an instruction returns a non-null result.
     * Non-null results are only returned by "return" statements.
     * @param t The AST of the block of instructions.
     * @return The data returned by the instructions (null if no return
     * statement has been executed).
     */
    private Data executeListInstructions (AslTree t) {
        assert t != null;
        Data result = null;
        int ninstr = t.getChildCount();
        for (int i = 0; i < ninstr; ++i) {
            result = executeInstruction (t.getChild(i));
            if (result != null) return result;
        }
        return null;
    }
    private void showObject(Data objecte){
	String toPrint = "<";
	HashMap<String,String> att = objecte.getListAttributes();
	toPrint += att.get("objectType") + " ";
	Set<String> keys = att.keySet();
	for (String attribute : keys){
	if (!attribute.equals("objectType"))
	    if (!attribute.equals("color"))
	   toPrint += attribute + "=\"" + att.get(attribute)+ "\" ";
	   else toPrint += "fill=\"" + att.get(attribute)+ "\" ";
	}
	toPrint += "/>";
	fileOutput.println(toPrint);
    }
    
    /**
     * Executes an instruction. 
     * Non-null results are only returned by "return" statements.
     * @param t The AST of the instruction.
     * @return The data returned by the instruction. The data will be
     * non-null only if a return statement is executed or a block
     * of instructions executing a return.
     */
    private Data executeInstruction (AslTree t) {
        assert t != null;
        System.out.println("hola" + t.getType());
        setLineNumber(t);
        Data value; // The returned value
        Integer nChange;
        Double elapsedTime;
        String from;
        String prefixPosition;


        // A big switch for all type of instructions
        switch (t.getType()) {
            case AslLexer.BLOCK:
                HashSet<String> objs = new HashSet();
                for (int i =1; i<t.getChildCount();++i){
                    executeInstruction(t.getChild(i));
                    objs.add(t.getChild(i).getChild(0).getText());
                }
                value = new Data(objs);
                return null;
    	    case AslLexer.CREATE:
                prefixPosition = (t.getChild(1).getText().equals("circle") ? "c" : "");

                nChange = states.size();
                changePos.put(t.getChild(0).getText(),nChange);
                states.add(new ArrayList<String>());

                states.get(nChange).add("<"+t.getChild(1).getText()+">");
                states.get(nChange).add("</"+t.getChild(1).getText()+">");
                states.get(nChange).add(states.get(nChange).size()-1, Change.toString(prefixPosition+"x", deltaTime, 0.001, "",t.getChild(2).getText()));
                states.get(nChange).add(states.get(nChange).size()-1, Change.toString(prefixPosition+"y", deltaTime, 0.001, "",t.getChild(3).getText()));

                System.out.println(states.get(nChange));

                System.out.println("adio");
                HashMap<String,String> att = new HashMap<String,String>();
                att.put("objectType",t.getChild(1).getText());
                att.put(prefixPosition+"x",t.getChild(2).getText());
                att.put(prefixPosition+"y",t.getChild(3).getText());
                if (t.getChildCount() == 5) {
                    AslTree listAttributes = t.getChild(4);
                    for (int i = 0; i< t.getChild(4).getChildCount();++i){
                        value = evaluateExpression(listAttributes.getChild(i).getChild(0));
                        value = new Data(value.toString());
                        checkString(value);
                        states.get(nChange).add(states.get(nChange).size()-1, Change.toString(listAttributes.getChild(i).getText(), deltaTime, 0.001, "",value.toString()));
                        att.put(listAttributes.getChild(i).getText(),value.toString());
                    }
                }
        		Data objecte = new Data(att);
        		Stack.defineVariable(t.getChild(0).getText(),objecte);
        		return null;

            case AslLexer.DESTROY:
                try {
                    nChange = changePos.get(t.getChild(0).getText());
                    changePos.put(t.getChild(0).getText(),-1);
                    states.get(nChange).add(states.get(nChange).size()-1,Change.toString("opacity", deltaTime, 0.001, "","0"));
                    Stack.getVariable(t.getChild(0).getText()).getListAttributes().clear();
                }
                catch (Exception e) {
                    throw new RuntimeException("The object \"" + t.getChild(0).getText() + "\" is not defined");
                }
                return null;

            case AslLexer.MOVE:
                try {
                    nChange = changePos.get(t.getChild(0).getText());
                    prefixPosition = (Stack.getVariable(t.getChild(0).getText()).getListAttributes().get("objectType").equals("circle") ? "c" : "");
                    
                    value = evaluateExpression(t.getChild(1));
                    checkInteger(value);
                    Stack.getVariable(t.getChild(0).getText()).getListAttributes().put(prefixPosition+"x",value.toString());
                    states.get(nChange).add(states.get(nChange).size()-1, Change.toString(prefixPosition+"x", deltaTime, 0.001, "", value.toString()));
                    
                    value = evaluateExpression(t.getChild(2));
                    checkInteger(value);
                    Stack.getVariable(t.getChild(0).getText()).getListAttributes().put(prefixPosition+"y",value.toString());
                    states.get(nChange).add(states.get(nChange).size()-1, Change.toString(prefixPosition+"y", deltaTime, 0.001, "", value.toString()));
                }
                catch (Exception e) {
                    throw new RuntimeException("The object \"" + t.getChild(0).getText() + "\" is not defined");
                }
                return null;

            case AslLexer.MOVE_T:
                try {
                    nChange = changePos.get(t.getChild(0).getText());
                    elapsedTime = Double.parseDouble(t.getChild(1).getChild(0).getText()) * (t.getChild(1).getText().equals("ms") ? 0.001 : 1);
                    prefixPosition = (Stack.getVariable(t.getChild(0).getText()).getListAttributes().get("objectType").equals("circle") ? "c" : "");
                    
                    value = evaluateExpression(t.getChild(2));
                    checkInteger(value);
                    from = Stack.getVariable(t.getChild(0).getText()).getListAttributes().get(prefixPosition+"x");
                    Stack.getVariable(t.getChild(0).getText()).getListAttributes().put(prefixPosition+"x",value.toString());
                    states.get(nChange).add(states.get(nChange).size()-1, Change.toString(prefixPosition+"x", deltaTime,elapsedTime, from, value.toString()));
                    
                    value = evaluateExpression(t.getChild(3));
                    checkInteger(value);
                    from = Stack.getVariable(t.getChild(0).getText()).getListAttributes().get(prefixPosition+"y");
                    Stack.getVariable(t.getChild(0).getText()).getListAttributes().put(prefixPosition+"y",value.toString());
                    states.get(nChange).add(states.get(nChange).size()-1, Change.toString(prefixPosition+"y", deltaTime, elapsedTime, from, value.toString()));
                    deltaTime += elapsedTime;
        
                }
                catch (Exception e) {
                    throw new RuntimeException("The object \"" + t.getChild(0).getText() + "\" is not defined");
                }
                return null;

            case AslLexer.MODIFY:
                try {
                    nChange = changePos.get(t.getChild(0).getText());

                    AslTree listAttributes = t.getChild(1);
                    for (int i = 0; i< listAttributes.getChildCount();++i){
                        states.get(nChange).add(states.get(nChange).size()-1, Change.toString(listAttributes.getChild(i).getText(), deltaTime, 0.001, "",listAttributes.getChild(i).getChild(0).getText()));
                    }

                    // Modificar los atributos del objecto en cuestion
                    for (int i = 0; i< listAttributes.getChildCount();++i){
                        Stack.getVariable(t.getChild(0).getText()).getListAttributes().put(listAttributes.getChild(i).getText(),listAttributes.getChild(i).getChild(0).getText());
                    }
                }
                catch (Exception e) {
                    throw new RuntimeException("The object \"" + t.getChild(0).getText() + "\" is not defined");
                }   
                return null;

            case AslLexer.MODIFY_T:
                try {
                    nChange = changePos.get(t.getChild(0).getText());

                    elapsedTime = Double.parseDouble(t.getChild(1).getChild(0).getText()) * (t.getChild(1).getText().equals("ms") ? 0.001 : 1);

                    AslTree listAttributes = t.getChild(2);
                    for (int i = 0; i< listAttributes.getChildCount();++i){
                        from = Stack.getVariable(t.getChild(0).getText()).getListAttributes().get(listAttributes.getChild(i).getText());
                        states.get(nChange).add(states.get(nChange).size()-1, Change.toString(listAttributes.getChild(i).getText(), deltaTime, elapsedTime, from,listAttributes.getChild(i).getChild(0).getText()));
                    }

                    deltaTime += elapsedTime;

                    // Modificar los atributos del objecto en cuestion
                    for (int i = 0; i< listAttributes.getChildCount();++i){
                        Stack.getVariable(t.getChild(0).getText()).getListAttributes().put(listAttributes.getChild(i).getText(),listAttributes.getChild(i).getChild(0).getText());
                    }
                }
                catch (Exception e) {
                    throw new RuntimeException("The object \"" + t.getChild(0).getText() + "\" is not defined");
                }   
                return null;
	
	        case AslLexer.SHOW:
                System.out.println("buenos dias");
                // showObject(Stack.getVariable(t.getChild(0).getText()));
                try {
                    nChange = changePos.get(t.getChild(0).getText());
                    states.get(nChange).add(states.get(nChange).size()-1, Change.toString("opacity", deltaTime, 0.001, "", "1"));

                    // Modificar la opcidad del objecto en cuestion
                    Stack.getVariable(t.getChild(0).getText()).getListAttributes().put("opacity","1");
                }
                catch (Exception e) {
                    throw new RuntimeException("The object \"" + t.getChild(0).getText() + "\" is not defined");
                }
                return null;

            case AslLexer.SHOW_T:
                System.out.println("buenos dias compiyogui");
                // showObject(Stack.getVariable(t.getChild(0).getText()));
                try {
                    nChange = changePos.get(t.getChild(0).getText());
                    elapsedTime = Double.parseDouble(t.getChild(1).getChild(0).getText()) * (t.getChild(1).getText().equals("ms") ? 0.001 : 1);
                    from = Stack.getVariable(t.getChild(0).getText()).getListAttributes().get("opacity");
                    if (from == null) from = "0";
                    states.get(nChange).add(states.get(nChange).size()-1, Change.toString("opacity", deltaTime, elapsedTime, from, "1"));
                    deltaTime += elapsedTime;

                    // Modificar la opcidad del objecto en cuestion
                    Stack.getVariable(t.getChild(0).getText()).getListAttributes().put("opacity","1");
                }
                catch (Exception e) {
                    throw new RuntimeException("The object \"" + t.getChild(0).getText() + "\" is not defined");
                }
                return null;

            case AslLexer.HIDE:
                System.out.println("buenas noches");
                // showObject(Stack.getVariable(t.getChild(0).getText()));
                try {
                    nChange = changePos.get(t.getChild(0).getText());
                    states.get(nChange).add(states.get(nChange).size()-1, Change.toString("opacity", deltaTime, 0.001, "", "0"));

                    // Modificar la opcidad del objecto en cuestion
                    Stack.getVariable(t.getChild(0).getText()).getListAttributes().put("opacity","0");
                }
                catch (Exception e) {
                    throw new RuntimeException("The object \"" + t.getChild(0).getText() + "\" is not defined");
                }
                return null;

            case AslLexer.HIDE_T:
                System.out.println("buenas noches compiyogui");
                // showObject(Stack.getVariable(t.getChild(0).getText()));
                try {
                    nChange = changePos.get(t.getChild(0).getText());
                    System.out.println("0");
                    elapsedTime = Double.parseDouble(t.getChild(1).getChild(0).getText()) * (t.getChild(1).getText().equals("ms") ? 0.001 : 1);

                    System.out.println("1");
                    from = Stack.getVariable(t.getChild(0).getText()).getListAttributes().get("opacity");

                    System.out.println("2");
                    if (from == null) from = "1";
                    states.get(nChange).add(states.get(nChange).size()-1, Change.toString("opacity", deltaTime, elapsedTime, from, "0"));
                    deltaTime += elapsedTime;

                    // Modificar la opcidad del objecto en cuestion
                    Stack.getVariable(t.getChild(0).getText()).getListAttributes().put("opacity","0");
                }
                catch (Exception e) {
                    throw new RuntimeException("The object \"" + t.getChild(0).getText() + "\" is not defined");
                }

                return null;

            case AslLexer.DELAY:
                deltaTime += Double.parseDouble(t.getChild(0).getChild(0).getText()) * (t.getChild(0).getText().equals("ms") ? 0.001 : 1);
                return null;

            case AslLexer.PARALLEL:
                Double currentDeltaTime = deltaTime;
                Data useless;
                Double lastDeltaTime = 0.0;
                if (t.getChildCount() == 1) {
                    for (int i = 0; i < t.getChild(0).getChildCount(); ++i) {
                        deltaTime = currentDeltaTime;
                        useless = executeInstruction(t.getChild(0).getChild(i));
                        lastDeltaTime = Math.max(lastDeltaTime,deltaTime);
                    }
                    deltaTime = lastDeltaTime;
                }
                else {
                    elapsedTime = Double.parseDouble(t.getChild(0).getChild(0).getText()) * (t.getChild(0).getText().equals("ms") ? 0.001 : 1);
                    for (int i = 0; i < t.getChild(1).getChildCount(); ++i) {
                        deltaTime = currentDeltaTime;
                        AslTree treeAux = t.getChild(1).getChild(i);
                        System.out.println("test " + treeAux.getText() + " " + treeAux.getType());
                        treeAux.myType = treeAux.getType() + 1; // Esto depnede del AslLexer. Si se generan los "static final int .... en orden diferente, peta"
                        System.out.println("size " + treeAux.getChildCount());
                        treeAux.addChild(1,t.getChild(0));
                        System.out.println("size " + treeAux.getChildCount());
                        useless = executeInstruction(treeAux);
                    }
                }
                return null;

                
            // Assignment
            case AslLexer.ASSIGN:
                value = evaluateExpression(t.getChild(1));
                if (value.getType() == Data.Type.OBJECT) {
                    try {
                        // Remove the last object if exist
                        nChange = changePos.get(t.getChild(0).getText());
                        changePos.put(t.getChild(0).getText(),-1);
                        states.get(nChange).add(states.get(nChange).size()-1,Change.toString("opacity", deltaTime, 0.001, "","0"));
                        Stack.getVariable(t.getChild(0).getText()).getListAttributes().clear();
                    }
                    catch (Exception e) {}
                    try {
                        nChange = states.size();
                        changePos.put(t.getChild(0).getText(),nChange);
                        states.add(new ArrayList<String>());
                        states.get(nChange).add("<"+value.getListAttributes().get("objectType")+">");
                        for (Map.Entry<String,String> p : value.getListAttributes().entrySet()) {
                            states.get(nChange).add(Change.toString(p.getKey(),deltaTime, 0.001,"",p.getValue()));
                        }
                        states.get(nChange).add("</"+value.getListAttributes().get("objectType")+">");
                    }
                    catch (Exception e) {
                        throw new RuntimeException("The object \"" + t.getChild(1).getText() + "\" is not defined");
                    }
                }
                Stack.defineVariable (t.getChild(0).getText(), value);
                return null;

            // If-then-else
            case AslLexer.IF:
                value = evaluateExpression(t.getChild(0));
                checkBoolean(value);
                if (value.getBooleanValue()) return executeListInstructions(t.getChild(1));
                // Is there else statement ?
                if (t.getChildCount() == 3) return executeListInstructions(t.getChild(2));
                return null;

            // While
            case AslLexer.WHILE:
                while (true) {
                    value = evaluateExpression(t.getChild(0));
                    checkBoolean(value);
                    if (!value.getBooleanValue()) return null;
                    Data r = executeListInstructions(t.getChild(1));
                    if (r != null) return r;
                }

            // Return
            case AslLexer.RETURN:
                if (t.getChildCount() != 0) {
                    return evaluateExpression(t.getChild(0));
                }
                return new Data(); // No expression: returns void data

            // Read statement: reads a variable and raises an exception
            // in case of a format error.
            case AslLexer.READ:
                String token = null;
                Data val = new Data(0);;
                try {
                    token = stdin.next();
                    val.setValue(Integer.parseInt(token)); 
                } catch (NumberFormatException ex) {
                    throw new RuntimeException ("Format error when reading a number: " + token);
                }
                Stack.defineVariable (t.getChild(0).getText(), val);
                return null;

            // Write statement: it can write an expression or a string.
            case AslLexer.WRITE:
                AslTree v = t.getChild(0);
                // Special case for strings
                if (v.getType() == AslLexer.STRING) {
                    System.out.format(v.getStringValue());
                    return null;
                }

                // Write an expression
                System.out.print(evaluateExpression(v).toString());
                return null;

            // Function call
            case AslLexer.FUNCALL:
                executeFunction(t.getChild(0).getText(), t.getChild(1));
                return null;

            default: assert false; // Should never happen
        }

        // All possible instructions should have been treated.
        assert false;
        return null;
    }
//true if its a color attribute, false otherwise
private Boolean isColorAttribute(String attribute){
    if (attribute.equals("color")) return true;
    if (attribute.equals("stroke")) return true;
    return false;
}
    /**
     * Evaluates the expression represented in the AST t.
     * @param t The AST of the expression
     * @return The value of the expression.
     */
     
    private Data evaluateExpression(AslTree t) {
        assert t != null;

        int previous_line = lineNumber();
        setLineNumber(t);
        int type = t.getType();

        Data value = null;
        String string;
        // Atoms
        switch (type) {
            // A variable
            case AslLexer.ID:
                value = new Data(Stack.getVariable(t.getText()));
                break;
            case AslLexer.ATTR:
                value = Stack.getVariable(t.getChild(0).getText());
                string = t.getChild(1).getText();
                if (isColorAttribute(string)) value = new Data(value.getAttribute(string));
                else value = new Data(Integer.parseInt(value.getAttribute(string)));
                break;
            // An integer literal
            case AslLexer.INT:
                value = new Data(t.getIntValue());
                break;
            // A Boolean literal
            case AslLexer.BOOLEAN:
                value = new Data(t.getBooleanValue());
                break;
            // A function call. Checks that the function returns a result.
            case AslLexer.FUNCALL:
                value = executeFunction(t.getChild(0).getText(), t.getChild(1));
                assert value != null;
                if (value.isVoid()) {
                    throw new RuntimeException ("function expected to return a value");
                }
                break;
            case AslLexer.COLORHEXA:
                value = new Data(t.getChild(0).getText());
                checkString(value);
                break;
            case AslLexer.COLORINT:
                string = "rgb(";
                value = evaluateExpression(t.getChild(0));
                checkInteger(value);
                string += value.toString() + ',';
                value = evaluateExpression(t.getChild(1));
                checkInteger(value);
                string += value.toString() + ',';
                value = evaluateExpression(t.getChild(2));
                checkInteger(value);
                string += value.toString() + ')';
                value = new Data(string);
                break;
            case AslLexer.COLORPRCTJ:
                string = "rgb(";
                value = evaluateExpression(t.getChild(0));
                checkInteger(value);
                string += value.toString() + "%%,";
                value = evaluateExpression(t.getChild(1));
                checkInteger(value);
                string += value.toString() + "%%,";
                value = evaluateExpression(t.getChild(2));
                checkInteger(value);
                string += value.toString() + "%%)";
                value = new Data(string);
                break;
            case AslLexer.COLORKEYWORD:
                value = new Data(t.getChild(0).getText());
                checkString(value);
                break;
            default: break;
        }

        // Retrieve the original line and return
        if (value != null) {
            setLineNumber(previous_line);
            return value;
        }
        
        // Unary operators
        value = evaluateExpression(t.getChild(0));
        if (t.getChildCount() == 1) {
            switch (type) {
                case AslLexer.PLUS:
                    checkInteger(value);
                    break;
                case AslLexer.MINUS:
                    checkInteger(value);
                    value.setValue(-value.getIntegerValue());
                    break;
                case AslLexer.NOT:
                    checkBoolean(value);
                    value.setValue(!value.getBooleanValue());
                    break;
                default: assert false; // Should never happen
            }
            setLineNumber(previous_line);
            return value;
        }

        // Two operands
        Data value2;
        switch (type) {
            // Relational operators
            case AslLexer.EQUAL:
            case AslLexer.NOT_EQUAL:
            case AslLexer.LT:
            case AslLexer.LE:
            case AslLexer.GT:
            case AslLexer.GE:
                value2 = evaluateExpression(t.getChild(1));
                if (value.getType() != value2.getType()) {
                  throw new RuntimeException ("Incompatible types in relational expression");
                }
                value = value.evaluateRelational(type, value2);
                break;

            // Arithmetic operators
            case AslLexer.PLUS:
            case AslLexer.MINUS:
            case AslLexer.MUL:
            case AslLexer.DIV:
            case AslLexer.MOD:
                value2 = evaluateExpression(t.getChild(1));
                checkInteger(value); checkInteger(value2);
                value.evaluateArithmetic(type, value2);
                break;

            // Boolean operators
            case AslLexer.AND:
            case AslLexer.OR:
                // The first operand is evaluated, but the second
                // is deferred (lazy, short-circuit evaluation).
                checkBoolean(value);
                value = evaluateBoolean(type, value, t.getChild(1));
                break;

            default: assert false; // Should never happen
        }
        
        setLineNumber(previous_line);
        return value;
    }
    
    /**
     * Evaluation of Boolean expressions. This function implements
     * a short-circuit evaluation. The second operand is still a tree
     * and is only evaluated if the value of the expression cannot be
     * determined by the first operand.
     * @param type Type of operator (token).
     * @param v First operand.
     * @param t AST node of the second operand.
     * @return An Boolean data with the value of the expression.
     */
    private Data evaluateBoolean (int type, Data v, AslTree t) {
        // Boolean evaluation with short-circuit

        switch (type) {
            case AslLexer.AND:
                // Short circuit if v is false
                if (!v.getBooleanValue()) return v;
                break;
        
            case AslLexer.OR:
                // Short circuit if v is true
                if (v.getBooleanValue()) return v;
                break;
                
            default: assert false;
        }

        // Return the value of the second expression
        v = evaluateExpression(t);
        checkBoolean(v);
        return v;
    }

    /** Checks that the data is Boolean and raises an exception if it is not. */
    private void checkBoolean (Data b) {
        if (!b.isBoolean()) {
            throw new RuntimeException ("Expecting Boolean expression");
        }
    }
    
    /** Checks that the data is integer and raises an exception if it is not. */
    private void checkInteger (Data b) {
        if (!b.isInteger()) {
            throw new RuntimeException ("Expecting numerical expression");
        }
    }

    /** Checks that the data is integer and raises an exception if it is not. */
    private void checkString (Data b) {
        if (!b.isString()) {
            throw new RuntimeException ("Expecting string expression");
        }
    }

    /**
     * Gathers the list of arguments of a function call. It also checks
     * that the arguments are compatible with the parameters. In particular,
     * it checks that the number of parameters is the same and that no
     * expressions are passed as parametres by reference.
     * @param AstF The AST of the callee.
     * @param args The AST of the list of arguments passed by the caller.
     * @return The list of evaluated arguments.
     */
     
    private ArrayList<Data> listArguments (AslTree AstF, AslTree args) {
        if (args != null) setLineNumber(args);
        AslTree pars = AstF.getChild(1);   // Parameters of the function
        
        // Create the list of parameters
        ArrayList<Data> Params = new ArrayList<Data> ();
        int n = pars.getChildCount();

        // Check that the number of parameters is the same
        int nargs = (args == null) ? 0 : args.getChildCount();
        if (n != nargs) {
            throw new RuntimeException ("Incorrect number of parameters calling function " +
                                        AstF.getChild(0).getText());
        }

        // Checks the compatibility of the parameters passed by
        // reference and calculates the values and references of
        // the parameters.
        for (int i = 0; i < n; ++i) {
            AslTree p = pars.getChild(i); // Parameters of the callee
            AslTree a = args.getChild(i); // Arguments passed by the caller
            setLineNumber(a);
            if (p.getType() == AslLexer.PVALUE) {
                // Pass by value: evaluate the expression
                Params.add(i,evaluateExpression(a));
            } else {
                // Pass by reference: check that it is a variable
                if (a.getType() != AslLexer.ID) {
                    throw new RuntimeException("Wrong argument for pass by reference");
                }
                // Find the variable and pass the reference
                Data v = Stack.getVariable(a.getText());
                Params.add(i,v);
            }
        }
        return Params;
    }

    /**
     * Writes trace information of a function call in the trace file.
     * The information is the name of the function, the value of the
     * parameters and the line number where the function call is produced.
     * @param f AST of the function
     * @param arg_values Values of the parameters passed to the function
     */
    private void traceFunctionCall(AslTree f, ArrayList<Data> arg_values) {
        function_nesting++;
        AslTree params = f.getChild(1);
        int nargs = params.getChildCount();
        
        for (int i=0; i < function_nesting; ++i) trace.print("|   ");

        // Print function name and parameters
        trace.print(f.getChild(0) + "(");
        for (int i = 0; i < nargs; ++i) {
            if (i > 0) trace.print(", ");
            AslTree p = params.getChild(i);
            if (p.getType() == AslLexer.PREF) trace.print("&");
            trace.print(p.getText() + "=" + arg_values.get(i));
        }
        trace.print(") ");
        
        if (function_nesting == 0) trace.println("<entry point>");
        else trace.println("<line " + lineNumber() + ">");
    }

    /**
     * Writes the trace information about the return of a function.
     * The information is the value of the returned value and of the
     * variables passed by reference. It also reports the line number
     * of the return.
     * @param f AST of the function
     * @param result The value of the result
     * @param arg_values The value of the parameters passed to the function
     */
    private void traceReturn(AslTree f, Data result, ArrayList<Data> arg_values) {
        for (int i=0; i < function_nesting; ++i) trace.print("|   ");
        function_nesting--;
        trace.print("return");
        if (!result.isVoid()) trace.print(" " + result);
        
        // Print the value of arguments passed by reference
        AslTree params = f.getChild(1);
        int nargs = params.getChildCount();
        for (int i = 0; i < nargs; ++i) {
            AslTree p = params.getChild(i);
            if (p.getType() == AslLexer.PVALUE) continue;
            trace.print(", &" + p.getText() + "=" + arg_values.get(i));
        }
        
        trace.println(" <line " + lineNumber() + ">");
        if (function_nesting < 0) trace.close();
    }
}



class Change {
    // String attribute;
    // Double duration;
    // Double start;
    // String from;
    // String to;

    // Change (String attribute, Double start, Double duration, String from, String to) {
    //     this.attribute = attribute;
    //     this.duration = duration;
    //     this.start = start;
    //     this.from = from;
    //     this.to = to;
    // }

    static public String toString(String attribute, Double start, Double duration, String from, String to) {
        return "<animate attributeName=\""+(attribute.equals("color") ? "fill" : attribute)
                +"\" attributeType=\"XML\" begin=\""+start
                +"s\" dur=\""+duration
                +"s\" fill=\"freeze\" from=\""+from+"\" to=\""+to+"\" />";
    }
}