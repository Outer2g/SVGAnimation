// $ANTLR 3.4 /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g 2016-04-25 08:46:07

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class Asl extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", 
    };

    public static final int EOF=-1;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public Asl(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public Asl(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return Asl.tokenNames; }
    public String getGrammarFileName() { return "/home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g"; }



    // Delegated rules


 

}