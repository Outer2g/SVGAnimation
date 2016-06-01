package interp;

import java.util.ArrayList;
import java.util.*;
import java.util.HashMap;

import java.io.*;

class States {
	
	private ArrayList<ArrayList<String>> states = new ArrayList<ArrayList<String>>();

    private HashMap<String,Integer> changePos = new HashMap<String,Integer>();

    private Stack Stack;

    Double deltaTime = 0.0;

    States(Stack s) {
    	Stack = s;
    }

    void create(String id,String type) {
    	String idaux = new String(id);
    	id = id+Stack.getCurrentActivationRecordNumber();
    	int nChange = states.size();
        changePos.put(id,nChange);

        states.add(new ArrayList<String>());
        states.get(nChange).add("<"+type+">");
        states.get(nChange).add("</"+type+">");

        Data objecte = new Data(new HashMap<String,String>());
        objecte.getListAttributes().put("objectType",type);
        Stack.defineVariable(idaux, objecte);
    }

    void modify(String id, String attribute, Double duration, String from, String to) {
    	String idaux = new String(id);
    	id = id+Stack.getCurrentActivationRecordNumber();
    	Data value = Stack.getVariable(idaux);
    	checkObject(value);
    	attribute = (value.getListAttributes().get("objectType").equals("circle") && (attribute.equals("x") || attribute.equals("y"))? "c" : "") + attribute;

    	int nChange = changePos.get(id);
    	if (nChange == -1) throw new RuntimeException("The object \"" + id + "\" is not defined or has been destroyed");
    	states.get(nChange).add(states.get(nChange).size()-1, Changee.toString(attribute, deltaTime, (duration == 0.0 ? 0.001 : duration), from, to));

    	value.getListAttributes().put(attribute,to);

    	deltaTime += duration;
    }

    void modify(String id, String attribute, Double duration, String to) {
    	String idaux = new String(id);
    	id = id+Stack.getCurrentActivationRecordNumber();
    	Data value = Stack.getVariable(idaux);
    	checkObject(value);
        System.out.println(idaux);
    	attribute = (value
            .getListAttributes()
            .get("objectType")
            .equals("circle") 
            && (attribute.equals("x") 

                || attribute.equals("y"))? "c" : "") + attribute;

    	String from = value.getListAttributes().get(attribute);
        if (from == null) from = "";
    	int nChange = changePos.get(id);
    	if (nChange == -1) throw new RuntimeException("The object \"" + id + "\" is not defined or has been destroyed");
    	states.get(nChange).add(states.get(nChange).size()-1, Changee.toString(attribute, deltaTime, (duration == 0.0 ? 0.001 : duration), from, to));

    	value.getListAttributes().put(attribute,to);

    	deltaTime += duration;
    }

    void destroy(String id) {
        System.out.println("la id es " + id);
    	String idaux = new String(id);
    	id = id+Stack.getCurrentActivationRecordNumber();
        System.out.println("la nueva id es " + id + " la vieja es " + idaux);
    	// System.out.println(id + " " + idaux);
    	Data value = Stack.getVariable(idaux);
    	checkObject(value);

        modify(idaux,"opacity", 0.0,"0");
        changePos.put(id,-1);
        value.getListAttributes().clear();
    }

     /** Checks that the data is integer and raises an exception if it is not. */
    private void checkObject(Data b) {
        if (!b.isObject()) {
            throw new RuntimeException ("Expecting Object");
        }
    }

    void printEnd(PrintWriter fileOutput) {
	    for (int i = 0; i < states.size(); ++i) {
	        for (String s : states.get(i)) {
	            fileOutput.println(s);
	        }
	    }
	}

    

}

class Changee {
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