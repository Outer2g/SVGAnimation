// $ANTLR 3.4 /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g 2016-05-02 08:17:40

package parser;
import interp.AslTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


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
@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "BLACK", "BLUE", "BOOLEAN", "CIRCLE", "COLOR", "COLORHEX", "COLORINT", "COLORPRCTJ", "COMMENT", "CREATE", "DESTROY", "DIV", "DO", "EEQUAL", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GREEN", "GT", "HASHTAG", "HEXADIGIT", "ID", "IF", "INT", "LE", "LIST_ATTR", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MODIFY", "MODIFY_T", "MOVE", "MOVE_T", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "POSX", "POSY", "PREF", "PVALUE", "READ", "RECTANGLE", "RED", "RETURN", "RGB", "RGBPRCTJ", "STRING", "TEXT", "THEN", "TRUE", "WHILE", "WHITE", "WRITE", "WS", "'&'", "'('", "')'", "','", "':'", "';'", "'s'"
    };

    public static final int EOF=-1;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ASSIGN=6;
    public static final int BLACK=7;
    public static final int BLUE=8;
    public static final int BOOLEAN=9;
    public static final int CIRCLE=10;
    public static final int COLOR=11;
    public static final int COLORHEX=12;
    public static final int COLORINT=13;
    public static final int COLORPRCTJ=14;
    public static final int COMMENT=15;
    public static final int CREATE=16;
    public static final int DESTROY=17;
    public static final int DIV=18;
    public static final int DO=19;
    public static final int EEQUAL=20;
    public static final int ELSE=21;
    public static final int ENDFUNC=22;
    public static final int ENDIF=23;
    public static final int ENDWHILE=24;
    public static final int EQUAL=25;
    public static final int ESC_SEQ=26;
    public static final int FALSE=27;
    public static final int FUNC=28;
    public static final int FUNCALL=29;
    public static final int GE=30;
    public static final int GREEN=31;
    public static final int GT=32;
    public static final int HASHTAG=33;
    public static final int HEXADIGIT=34;
    public static final int ID=35;
    public static final int IF=36;
    public static final int INT=37;
    public static final int LE=38;
    public static final int LIST_ATTR=39;
    public static final int LIST_FUNCTIONS=40;
    public static final int LIST_INSTR=41;
    public static final int LT=42;
    public static final int MINUS=43;
    public static final int MOD=44;
    public static final int MODIFY=45;
    public static final int MODIFY_T=46;
    public static final int MOVE=47;
    public static final int MOVE_T=48;
    public static final int MUL=49;
    public static final int NOT=50;
    public static final int NOT_EQUAL=51;
    public static final int OR=52;
    public static final int PARAMS=53;
    public static final int PLUS=54;
    public static final int POSX=55;
    public static final int POSY=56;
    public static final int PREF=57;
    public static final int PVALUE=58;
    public static final int READ=59;
    public static final int RECTANGLE=60;
    public static final int RED=61;
    public static final int RETURN=62;
    public static final int RGB=63;
    public static final int RGBPRCTJ=64;
    public static final int STRING=65;
    public static final int TEXT=66;
    public static final int THEN=67;
    public static final int TRUE=68;
    public static final int WHILE=69;
    public static final int WHITE=70;
    public static final int WRITE=71;
    public static final int WS=72;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AslParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return AslParser.tokenNames; }
    public String getGrammarFileName() { return "/home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:64:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
    public final AslParser.prog_return prog() throws RecognitionException {
        AslParser.prog_return retval = new AslParser.prog_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EOF2=null;
        AslParser.func_return func1 =null;


        AslTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_func=new RewriteRuleSubtreeStream(adaptor,"rule func");
        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:64:9: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:64:11: ( func )+ EOF
            {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:64:11: ( func )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:64:11: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog188);
            	    func1=func();

            	    state._fsp--;

            	    stream_func.add(func1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog191);  
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: func
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 64:21: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:64:24: ^( LIST_FUNCTIONS ( func )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_FUNCTIONS, "LIST_FUNCTIONS")
                , root_1);

                if ( !(stream_func.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_func.hasNext() ) {
                    adaptor.addChild(root_1, stream_func.nextTree());

                }
                stream_func.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class func_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:68:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
    public final AslParser.func_return func() throws RecognitionException {
        AslParser.func_return retval = new AslParser.func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FUNC3=null;
        Token ID4=null;
        Token ENDFUNC7=null;
        AslParser.params_return params5 =null;

        AslParser.block_instructions_return block_instructions6 =null;


        AslTree FUNC3_tree=null;
        AslTree ID4_tree=null;
        AslTree ENDFUNC7_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:68:9: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:68:11: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func233); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func236); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func238);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func240);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func242); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func"


    public static class params_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:72:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:72:9: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:72:11: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,74,FOLLOW_74_in_params262);  
            stream_74.add(char_literal8);


            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:72:15: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==73) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:72:15: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params264);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,75,FOLLOW_75_in_params267);  
            stream_75.add(char_literal10);


            // AST REWRITE
            // elements: paramlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 72:30: -> ^( PARAMS ( paramlist )? )
            {
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:72:33: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:72:42: ( paramlist )?
                if ( stream_paramlist.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramlist.nextTree());

                }
                stream_paramlist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class paramlist_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramlist"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:76:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:76:10: ( param ( ',' ! param )* )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:76:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist293);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:76:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==76) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:76:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,76,FOLLOW_76_in_paramlist296); 

            	    pushFollow(FOLLOW_param_in_paramlist299);
            	    param13=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param13.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "paramlist"


    public static class param_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:81:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal14=null;

        AslTree id_tree=null;
        AslTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:81:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==73) ) {
                alt4=1;
            }
            else if ( (LA4_0==ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:81:13: '&' id= ID
                    {
                    char_literal14=(Token)match(input,73,FOLLOW_73_in_param324);  
                    stream_73.add(char_literal14);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param328);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 81:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:81:26: ^( PREF[$id,$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PREF, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:82:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param351);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 82:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:82:22: ^( PVALUE[$id,$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PVALUE, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param"


    public static class block_instructions_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_instructions"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:86:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal16=null;
        AslParser.instruction_return instruction15 =null;

        AslParser.instruction_return instruction17 =null;


        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:87:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:87:14: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions387);
            instruction15=instruction();

            state._fsp--;

            stream_instruction.add(instruction15.getTree());

            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:87:26: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==78) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:87:27: ';' instruction
            	    {
            	    char_literal16=(Token)match(input,78,FOLLOW_78_in_block_instructions390);  
            	    stream_78.add(char_literal16);


            	    pushFollow(FOLLOW_instruction_in_block_instructions392);
            	    instruction17=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction17.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // AST REWRITE
            // elements: instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 88:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:88:16: ^( LIST_INSTR ( instruction )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_INSTR, "LIST_INSTR")
                , root_1);

                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block_instructions"


    public static class instruction_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:92:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | create | destroy | move | modify |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign18 =null;

        AslParser.ite_stmt_return ite_stmt19 =null;

        AslParser.while_stmt_return while_stmt20 =null;

        AslParser.funcall_return funcall21 =null;

        AslParser.return_stmt_return return_stmt22 =null;

        AslParser.read_return read23 =null;

        AslParser.write_return write24 =null;

        AslParser.create_return create25 =null;

        AslParser.destroy_return destroy26 =null;

        AslParser.move_return move27 =null;

        AslParser.modify_return modify28 =null;



        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:93:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | create | destroy | move | modify |)
            int alt6=12;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EEQUAL) ) {
                    alt6=1;
                }
                else if ( (LA6_1==74) ) {
                    alt6=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt6=2;
                }
                break;
            case WHILE:
                {
                alt6=3;
                }
                break;
            case RETURN:
                {
                alt6=5;
                }
                break;
            case READ:
                {
                alt6=6;
                }
                break;
            case WRITE:
                {
                alt6=7;
                }
                break;
            case CREATE:
                {
                alt6=8;
                }
                break;
            case DESTROY:
                {
                alt6=9;
                }
                break;
            case MOVE:
            case MOVE_T:
                {
                alt6=10;
                }
                break;
            case MODIFY:
            case MODIFY_T:
                {
                alt6=11;
                }
                break;
            case ELSE:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case 78:
                {
                alt6=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:93:13: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction443);
                    assign18=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign18.getTree());

                    }
                    break;
                case 2 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:94:13: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction467);
                    ite_stmt19=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt19.getTree());

                    }
                    break;
                case 3 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:95:13: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction489);
                    while_stmt20=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt20.getTree());

                    }
                    break;
                case 4 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:96:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction509);
                    funcall21=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall21.getTree());

                    }
                    break;
                case 5 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:97:13: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction532);
                    return_stmt22=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt22.getTree());

                    }
                    break;
                case 6 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:98:13: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction551);
                    read23=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read23.getTree());

                    }
                    break;
                case 7 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:99:13: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction577);
                    write24=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write24.getTree());

                    }
                    break;
                case 8 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:100:13: create
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_create_in_instruction602);
                    create25=create();

                    state._fsp--;

                    adaptor.addChild(root_0, create25.getTree());

                    }
                    break;
                case 9 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:101:13: destroy
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_destroy_in_instruction626);
                    destroy26=destroy();

                    state._fsp--;

                    adaptor.addChild(root_0, destroy26.getTree());

                    }
                    break;
                case 10 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:102:13: move
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_in_instruction649);
                    move27=move();

                    state._fsp--;

                    adaptor.addChild(root_0, move27.getTree());

                    }
                    break;
                case 11 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:103:13: modify
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_in_instruction675);
                    modify28=modify();

                    state._fsp--;

                    adaptor.addChild(root_0, modify28.getTree());

                    }
                    break;
                case 12 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:110:9: 
                    {
                    root_0 = (AslTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instruction"


    public static class assign_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:113:1: assign : ID eq= EEQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID29=null;
        AslParser.expr_return expr30 =null;


        AslTree eq_tree=null;
        AslTree ID29_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EEQUAL=new RewriteRuleTokenStream(adaptor,"token EEQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:113:9: ( ID eq= EEQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:113:13: ID eq= EEQUAL expr
            {
            ID29=(Token)match(input,ID,FOLLOW_ID_in_assign747);  
            stream_ID.add(ID29);


            eq=(Token)match(input,EEQUAL,FOLLOW_EEQUAL_in_assign751);  
            stream_EEQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign753);
            expr30=expr();

            state._fsp--;

            stream_expr.add(expr30.getTree());

            // AST REWRITE
            // elements: expr, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 113:31: -> ^( ASSIGN[$eq,\":=\"] ID expr )
            {
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:113:34: ^( ASSIGN[$eq,\":=\"] ID expr )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ASSIGN, eq, ":=")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class ite_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:117:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF31=null;
        Token THEN33=null;
        Token ELSE35=null;
        Token ENDIF37=null;
        AslParser.expr_return expr32 =null;

        AslParser.block_instructions_return block_instructions34 =null;

        AslParser.block_instructions_return block_instructions36 =null;


        AslTree IF31_tree=null;
        AslTree THEN33_tree=null;
        AslTree ELSE35_tree=null;
        AslTree ENDIF37_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:117:13: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:117:17: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF31=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt787); 
            IF31_tree = 
            (AslTree)adaptor.create(IF31)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF31_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt790);
            expr32=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr32.getTree());

            THEN33=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt792); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt795);
            block_instructions34=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions34.getTree());

            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:117:51: ( ELSE ! block_instructions )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ELSE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:117:52: ELSE ! block_instructions
                    {
                    ELSE35=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt798); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt801);
                    block_instructions36=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions36.getTree());

                    }
                    break;

            }


            ENDIF37=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt805); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ite_stmt"


    public static class while_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:121:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE38=null;
        Token DO40=null;
        Token ENDWHILE42=null;
        AslParser.expr_return expr39 =null;

        AslParser.block_instructions_return block_instructions41 =null;


        AslTree WHILE38_tree=null;
        AslTree DO40_tree=null;
        AslTree ENDWHILE42_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:121:13: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:121:17: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE38=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt831); 
            WHILE38_tree = 
            (AslTree)adaptor.create(WHILE38)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE38_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt834);
            expr39=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr39.getTree());

            DO40=(Token)match(input,DO,FOLLOW_DO_in_while_stmt836); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt839);
            block_instructions41=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions41.getTree());

            ENDWHILE42=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt841); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_stmt"


    public static class return_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:125:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN43=null;
        AslParser.expr_return expr44 =null;


        AslTree RETURN43_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:125:13: ( RETURN ^ ( expr )? )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:125:17: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN43=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt866); 
            RETURN43_tree = 
            (AslTree)adaptor.create(RETURN43)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN43_tree, root_0);


            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:125:25: ( expr )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==FALSE||LA8_0==ID||LA8_0==INT||LA8_0==MINUS||LA8_0==NOT||LA8_0==PLUS||LA8_0==TRUE||LA8_0==74) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:125:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt869);
                    expr44=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr44.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_stmt"


    public static class read_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:129:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ45=null;
        Token ID46=null;

        AslTree READ45_tree=null;
        AslTree ID46_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:129:9: ( READ ^ ID )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:129:13: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ45=(Token)match(input,READ,FOLLOW_READ_in_read893); 
            READ45_tree = 
            (AslTree)adaptor.create(READ45)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ45_tree, root_0);


            ID46=(Token)match(input,ID,FOLLOW_ID_in_read896); 
            ID46_tree = 
            (AslTree)adaptor.create(ID46)
            ;
            adaptor.addChild(root_0, ID46_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "read"


    public static class write_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "write"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:133:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE47=null;
        Token STRING49=null;
        AslParser.expr_return expr48 =null;


        AslTree WRITE47_tree=null;
        AslTree STRING49_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:133:9: ( WRITE ^ ( expr | STRING ) )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:133:13: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE47=(Token)match(input,WRITE,FOLLOW_WRITE_in_write918); 
            WRITE47_tree = 
            (AslTree)adaptor.create(WRITE47)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE47_tree, root_0);


            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:133:20: ( expr | STRING )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==TRUE||LA9_0==74) ) {
                alt9=1;
            }
            else if ( (LA9_0==STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:133:21: expr
                    {
                    pushFollow(FOLLOW_expr_in_write922);
                    expr48=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr48.getTree());

                    }
                    break;
                case 2 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:133:28: STRING
                    {
                    STRING49=(Token)match(input,STRING,FOLLOW_STRING_in_write926); 
                    STRING49_tree = 
                    (AslTree)adaptor.create(STRING49)
                    ;
                    adaptor.addChild(root_0, STRING49_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "write"


    public static class create_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:138:1: create : CREATE ^ ID '(' ! obj_type ',' ! expr ',' ! expr ( ',' ! list_attributes )? ')' !;
    public final AslParser.create_return create() throws RecognitionException {
        AslParser.create_return retval = new AslParser.create_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token CREATE50=null;
        Token ID51=null;
        Token char_literal52=null;
        Token char_literal54=null;
        Token char_literal56=null;
        Token char_literal58=null;
        Token char_literal60=null;
        AslParser.obj_type_return obj_type53 =null;

        AslParser.expr_return expr55 =null;

        AslParser.expr_return expr57 =null;

        AslParser.list_attributes_return list_attributes59 =null;


        AslTree CREATE50_tree=null;
        AslTree ID51_tree=null;
        AslTree char_literal52_tree=null;
        AslTree char_literal54_tree=null;
        AslTree char_literal56_tree=null;
        AslTree char_literal58_tree=null;
        AslTree char_literal60_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:138:9: ( CREATE ^ ID '(' ! obj_type ',' ! expr ',' ! expr ( ',' ! list_attributes )? ')' !)
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:138:13: CREATE ^ ID '(' ! obj_type ',' ! expr ',' ! expr ( ',' ! list_attributes )? ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            CREATE50=(Token)match(input,CREATE,FOLLOW_CREATE_in_create950); 
            CREATE50_tree = 
            (AslTree)adaptor.create(CREATE50)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(CREATE50_tree, root_0);


            ID51=(Token)match(input,ID,FOLLOW_ID_in_create953); 
            ID51_tree = 
            (AslTree)adaptor.create(ID51)
            ;
            adaptor.addChild(root_0, ID51_tree);


            char_literal52=(Token)match(input,74,FOLLOW_74_in_create955); 

            pushFollow(FOLLOW_obj_type_in_create958);
            obj_type53=obj_type();

            state._fsp--;

            adaptor.addChild(root_0, obj_type53.getTree());

            char_literal54=(Token)match(input,76,FOLLOW_76_in_create960); 

            pushFollow(FOLLOW_expr_in_create963);
            expr55=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr55.getTree());

            char_literal56=(Token)match(input,76,FOLLOW_76_in_create965); 

            pushFollow(FOLLOW_expr_in_create968);
            expr57=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr57.getTree());

            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:138:58: ( ',' ! list_attributes )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==76) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:138:59: ',' ! list_attributes
                    {
                    char_literal58=(Token)match(input,76,FOLLOW_76_in_create971); 

                    pushFollow(FOLLOW_list_attributes_in_create974);
                    list_attributes59=list_attributes();

                    state._fsp--;

                    adaptor.addChild(root_0, list_attributes59.getTree());

                    }
                    break;

            }


            char_literal60=(Token)match(input,75,FOLLOW_75_in_create978); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create"


    public static class destroy_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "destroy"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:141:1: destroy : DESTROY ^ '(' ! ID ')' !;
    public final AslParser.destroy_return destroy() throws RecognitionException {
        AslParser.destroy_return retval = new AslParser.destroy_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token DESTROY61=null;
        Token char_literal62=null;
        Token ID63=null;
        Token char_literal64=null;

        AslTree DESTROY61_tree=null;
        AslTree char_literal62_tree=null;
        AslTree ID63_tree=null;
        AslTree char_literal64_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:141:9: ( DESTROY ^ '(' ! ID ')' !)
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:141:13: DESTROY ^ '(' ! ID ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            DESTROY61=(Token)match(input,DESTROY,FOLLOW_DESTROY_in_destroy998); 
            DESTROY61_tree = 
            (AslTree)adaptor.create(DESTROY61)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(DESTROY61_tree, root_0);


            char_literal62=(Token)match(input,74,FOLLOW_74_in_destroy1001); 

            ID63=(Token)match(input,ID,FOLLOW_ID_in_destroy1004); 
            ID63_tree = 
            (AslTree)adaptor.create(ID63)
            ;
            adaptor.addChild(root_0, ID63_tree);


            char_literal64=(Token)match(input,75,FOLLOW_75_in_destroy1006); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "destroy"


    public static class move_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:144:1: move : ( move_time | move_no_time );
    public final AslParser.move_return move() throws RecognitionException {
        AslParser.move_return retval = new AslParser.move_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.move_time_return move_time65 =null;

        AslParser.move_no_time_return move_no_time66 =null;



        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:144:9: ( move_time | move_no_time )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==MOVE_T) ) {
                alt11=1;
            }
            else if ( (LA11_0==MOVE) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:144:13: move_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_time_in_move1029);
                    move_time65=move_time();

                    state._fsp--;

                    adaptor.addChild(root_0, move_time65.getTree());

                    }
                    break;
                case 2 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:144:25: move_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_no_time_in_move1033);
                    move_no_time66=move_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, move_no_time66.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "move"


    public static class move_time_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move_time"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:147:1: move_time : MOVE_T ^ ID time '(' ! expr ',' ! expr ')' !;
    public final AslParser.move_time_return move_time() throws RecognitionException {
        AslParser.move_time_return retval = new AslParser.move_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MOVE_T67=null;
        Token ID68=null;
        Token char_literal70=null;
        Token char_literal72=null;
        Token char_literal74=null;
        AslParser.time_return time69 =null;

        AslParser.expr_return expr71 =null;

        AslParser.expr_return expr73 =null;


        AslTree MOVE_T67_tree=null;
        AslTree ID68_tree=null;
        AslTree char_literal70_tree=null;
        AslTree char_literal72_tree=null;
        AslTree char_literal74_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:147:11: ( MOVE_T ^ ID time '(' ! expr ',' ! expr ')' !)
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:147:13: MOVE_T ^ ID time '(' ! expr ',' ! expr ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            MOVE_T67=(Token)match(input,MOVE_T,FOLLOW_MOVE_T_in_move_time1050); 
            MOVE_T67_tree = 
            (AslTree)adaptor.create(MOVE_T67)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MOVE_T67_tree, root_0);


            ID68=(Token)match(input,ID,FOLLOW_ID_in_move_time1053); 
            ID68_tree = 
            (AslTree)adaptor.create(ID68)
            ;
            adaptor.addChild(root_0, ID68_tree);


            pushFollow(FOLLOW_time_in_move_time1056);
            time69=time();

            state._fsp--;

            adaptor.addChild(root_0, time69.getTree());

            char_literal70=(Token)match(input,74,FOLLOW_74_in_move_time1058); 

            pushFollow(FOLLOW_expr_in_move_time1061);
            expr71=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr71.getTree());

            char_literal72=(Token)match(input,76,FOLLOW_76_in_move_time1063); 

            pushFollow(FOLLOW_expr_in_move_time1066);
            expr73=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr73.getTree());

            char_literal74=(Token)match(input,75,FOLLOW_75_in_move_time1069); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "move_time"


    public static class move_no_time_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "move_no_time"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:150:1: move_no_time : MOVE ^ ID '(' ! expr ',' ! expr ')' !;
    public final AslParser.move_no_time_return move_no_time() throws RecognitionException {
        AslParser.move_no_time_return retval = new AslParser.move_no_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MOVE75=null;
        Token ID76=null;
        Token char_literal77=null;
        Token char_literal79=null;
        Token char_literal81=null;
        AslParser.expr_return expr78 =null;

        AslParser.expr_return expr80 =null;


        AslTree MOVE75_tree=null;
        AslTree ID76_tree=null;
        AslTree char_literal77_tree=null;
        AslTree char_literal79_tree=null;
        AslTree char_literal81_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:150:14: ( MOVE ^ ID '(' ! expr ',' ! expr ')' !)
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:150:16: MOVE ^ ID '(' ! expr ',' ! expr ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            MOVE75=(Token)match(input,MOVE,FOLLOW_MOVE_in_move_no_time1087); 
            MOVE75_tree = 
            (AslTree)adaptor.create(MOVE75)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MOVE75_tree, root_0);


            ID76=(Token)match(input,ID,FOLLOW_ID_in_move_no_time1090); 
            ID76_tree = 
            (AslTree)adaptor.create(ID76)
            ;
            adaptor.addChild(root_0, ID76_tree);


            char_literal77=(Token)match(input,74,FOLLOW_74_in_move_no_time1092); 

            pushFollow(FOLLOW_expr_in_move_no_time1095);
            expr78=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr78.getTree());

            char_literal79=(Token)match(input,76,FOLLOW_76_in_move_no_time1097); 

            pushFollow(FOLLOW_expr_in_move_no_time1100);
            expr80=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr80.getTree());

            char_literal81=(Token)match(input,75,FOLLOW_75_in_move_no_time1102); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "move_no_time"


    public static class modify_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "modify"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:153:1: modify : ( modify_time | modify_no_time );
    public final AslParser.modify_return modify() throws RecognitionException {
        AslParser.modify_return retval = new AslParser.modify_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.modify_time_return modify_time82 =null;

        AslParser.modify_no_time_return modify_no_time83 =null;



        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:153:11: ( modify_time | modify_no_time )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==MODIFY_T) ) {
                alt12=1;
            }
            else if ( (LA12_0==MODIFY) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:153:15: modify_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_time_in_modify1125);
                    modify_time82=modify_time();

                    state._fsp--;

                    adaptor.addChild(root_0, modify_time82.getTree());

                    }
                    break;
                case 2 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:153:29: modify_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_no_time_in_modify1129);
                    modify_no_time83=modify_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, modify_no_time83.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "modify"


    public static class modify_time_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "modify_time"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:156:1: modify_time : MODIFY_T ^ ID time list_attributes ;
    public final AslParser.modify_time_return modify_time() throws RecognitionException {
        AslParser.modify_time_return retval = new AslParser.modify_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MODIFY_T84=null;
        Token ID85=null;
        AslParser.time_return time86 =null;

        AslParser.list_attributes_return list_attributes87 =null;


        AslTree MODIFY_T84_tree=null;
        AslTree ID85_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:156:13: ( MODIFY_T ^ ID time list_attributes )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:156:15: MODIFY_T ^ ID time list_attributes
            {
            root_0 = (AslTree)adaptor.nil();


            MODIFY_T84=(Token)match(input,MODIFY_T,FOLLOW_MODIFY_T_in_modify_time1146); 
            MODIFY_T84_tree = 
            (AslTree)adaptor.create(MODIFY_T84)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MODIFY_T84_tree, root_0);


            ID85=(Token)match(input,ID,FOLLOW_ID_in_modify_time1149); 
            ID85_tree = 
            (AslTree)adaptor.create(ID85)
            ;
            adaptor.addChild(root_0, ID85_tree);


            pushFollow(FOLLOW_time_in_modify_time1151);
            time86=time();

            state._fsp--;

            adaptor.addChild(root_0, time86.getTree());

            pushFollow(FOLLOW_list_attributes_in_modify_time1153);
            list_attributes87=list_attributes();

            state._fsp--;

            adaptor.addChild(root_0, list_attributes87.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "modify_time"


    public static class modify_no_time_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "modify_no_time"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:159:1: modify_no_time : MODIFY ^ ID list_attributes ;
    public final AslParser.modify_no_time_return modify_no_time() throws RecognitionException {
        AslParser.modify_no_time_return retval = new AslParser.modify_no_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MODIFY88=null;
        Token ID89=null;
        AslParser.list_attributes_return list_attributes90 =null;


        AslTree MODIFY88_tree=null;
        AslTree ID89_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:159:16: ( MODIFY ^ ID list_attributes )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:159:18: MODIFY ^ ID list_attributes
            {
            root_0 = (AslTree)adaptor.nil();


            MODIFY88=(Token)match(input,MODIFY,FOLLOW_MODIFY_in_modify_no_time1170); 
            MODIFY88_tree = 
            (AslTree)adaptor.create(MODIFY88)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MODIFY88_tree, root_0);


            ID89=(Token)match(input,ID,FOLLOW_ID_in_modify_no_time1173); 
            ID89_tree = 
            (AslTree)adaptor.create(ID89)
            ;
            adaptor.addChild(root_0, ID89_tree);


            pushFollow(FOLLOW_list_attributes_in_modify_no_time1175);
            list_attributes90=list_attributes();

            state._fsp--;

            adaptor.addChild(root_0, list_attributes90.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "modify_no_time"


    public static class list_attributes_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_attributes"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:162:1: list_attributes : '(' attribute ( ',' attribute )* ')' -> ^( LIST_ATTR ( attribute )+ ) ;
    public final AslParser.list_attributes_return list_attributes() throws RecognitionException {
        AslParser.list_attributes_return retval = new AslParser.list_attributes_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal91=null;
        Token char_literal93=null;
        Token char_literal95=null;
        AslParser.attribute_return attribute92 =null;

        AslParser.attribute_return attribute94 =null;


        AslTree char_literal91_tree=null;
        AslTree char_literal93_tree=null;
        AslTree char_literal95_tree=null;
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:162:17: ( '(' attribute ( ',' attribute )* ')' -> ^( LIST_ATTR ( attribute )+ ) )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:162:19: '(' attribute ( ',' attribute )* ')'
            {
            char_literal91=(Token)match(input,74,FOLLOW_74_in_list_attributes1193);  
            stream_74.add(char_literal91);


            pushFollow(FOLLOW_attribute_in_list_attributes1195);
            attribute92=attribute();

            state._fsp--;

            stream_attribute.add(attribute92.getTree());

            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:162:33: ( ',' attribute )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==76) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:162:34: ',' attribute
            	    {
            	    char_literal93=(Token)match(input,76,FOLLOW_76_in_list_attributes1198);  
            	    stream_76.add(char_literal93);


            	    pushFollow(FOLLOW_attribute_in_list_attributes1200);
            	    attribute94=attribute();

            	    state._fsp--;

            	    stream_attribute.add(attribute94.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            char_literal95=(Token)match(input,75,FOLLOW_75_in_list_attributes1204);  
            stream_75.add(char_literal95);


            // AST REWRITE
            // elements: attribute
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 162:54: -> ^( LIST_ATTR ( attribute )+ )
            {
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:162:57: ^( LIST_ATTR ( attribute )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_ATTR, "LIST_ATTR")
                , root_1);

                if ( !(stream_attribute.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_attribute.hasNext() ) {
                    adaptor.addChild(root_1, stream_attribute.nextTree());

                }
                stream_attribute.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "list_attributes"


    public static class attribute_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:165:1: attribute : ( attribute_name_color ^ ':' ! color | attribute_name_expr ^ ':' ! expr );
    public final AslParser.attribute_return attribute() throws RecognitionException {
        AslParser.attribute_return retval = new AslParser.attribute_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal97=null;
        Token char_literal100=null;
        AslParser.attribute_name_color_return attribute_name_color96 =null;

        AslParser.color_return color98 =null;

        AslParser.attribute_name_expr_return attribute_name_expr99 =null;

        AslParser.expr_return expr101 =null;


        AslTree char_literal97_tree=null;
        AslTree char_literal100_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:165:13: ( attribute_name_color ^ ':' ! color | attribute_name_expr ^ ':' ! expr )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==COLOR) ) {
                alt14=1;
            }
            else if ( ((LA14_0 >= POSX && LA14_0 <= POSY)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:165:17: attribute_name_color ^ ':' ! color
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_attribute_name_color_in_attribute1234);
                    attribute_name_color96=attribute_name_color();

                    state._fsp--;

                    root_0 = (AslTree)adaptor.becomeRoot(attribute_name_color96.getTree(), root_0);

                    char_literal97=(Token)match(input,77,FOLLOW_77_in_attribute1237); 

                    pushFollow(FOLLOW_color_in_attribute1240);
                    color98=color();

                    state._fsp--;

                    adaptor.addChild(root_0, color98.getTree());

                    }
                    break;
                case 2 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:166:17: attribute_name_expr ^ ':' ! expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_attribute_name_expr_in_attribute1258);
                    attribute_name_expr99=attribute_name_expr();

                    state._fsp--;

                    root_0 = (AslTree)adaptor.becomeRoot(attribute_name_expr99.getTree(), root_0);

                    char_literal100=(Token)match(input,77,FOLLOW_77_in_attribute1261); 

                    pushFollow(FOLLOW_expr_in_attribute1264);
                    expr101=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr101.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribute"


    public static class attribute_name_color_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute_name_color"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:169:1: attribute_name_color : COLOR ;
    public final AslParser.attribute_name_color_return attribute_name_color() throws RecognitionException {
        AslParser.attribute_name_color_return retval = new AslParser.attribute_name_color_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token COLOR102=null;

        AslTree COLOR102_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:169:25: ( COLOR )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:169:27: COLOR
            {
            root_0 = (AslTree)adaptor.nil();


            COLOR102=(Token)match(input,COLOR,FOLLOW_COLOR_in_attribute_name_color1288); 
            COLOR102_tree = 
            (AslTree)adaptor.create(COLOR102)
            ;
            adaptor.addChild(root_0, COLOR102_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribute_name_color"


    public static class attribute_name_expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute_name_expr"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:172:1: attribute_name_expr : ( POSX | POSY );
    public final AslParser.attribute_name_expr_return attribute_name_expr() throws RecognitionException {
        AslParser.attribute_name_expr_return retval = new AslParser.attribute_name_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set103=null;

        AslTree set103_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:172:21: ( POSX | POSY )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set103=(Token)input.LT(1);

            if ( (input.LA(1) >= POSX && input.LA(1) <= POSY) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set103)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribute_name_expr"


    public static class color_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "color"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:176:1: color : ( COLORHEX | RGB '(' expr ',' expr ',' expr ')' -> ^( COLORINT expr expr expr ) | RGBPRCTJ '(' expr ',' expr ',' expr ')' -> ^( COLORPRCTJ expr expr expr ) | color_keyword );
    public final AslParser.color_return color() throws RecognitionException {
        AslParser.color_return retval = new AslParser.color_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token COLORHEX104=null;
        Token RGB105=null;
        Token char_literal106=null;
        Token char_literal108=null;
        Token char_literal110=null;
        Token char_literal112=null;
        Token RGBPRCTJ113=null;
        Token char_literal114=null;
        Token char_literal116=null;
        Token char_literal118=null;
        Token char_literal120=null;
        AslParser.expr_return expr107 =null;

        AslParser.expr_return expr109 =null;

        AslParser.expr_return expr111 =null;

        AslParser.expr_return expr115 =null;

        AslParser.expr_return expr117 =null;

        AslParser.expr_return expr119 =null;

        AslParser.color_keyword_return color_keyword121 =null;


        AslTree COLORHEX104_tree=null;
        AslTree RGB105_tree=null;
        AslTree char_literal106_tree=null;
        AslTree char_literal108_tree=null;
        AslTree char_literal110_tree=null;
        AslTree char_literal112_tree=null;
        AslTree RGBPRCTJ113_tree=null;
        AslTree char_literal114_tree=null;
        AslTree char_literal116_tree=null;
        AslTree char_literal118_tree=null;
        AslTree char_literal120_tree=null;
        RewriteRuleTokenStream stream_RGBPRCTJ=new RewriteRuleTokenStream(adaptor,"token RGBPRCTJ");
        RewriteRuleTokenStream stream_RGB=new RewriteRuleTokenStream(adaptor,"token RGB");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:176:9: ( COLORHEX | RGB '(' expr ',' expr ',' expr ')' -> ^( COLORINT expr expr expr ) | RGBPRCTJ '(' expr ',' expr ',' expr ')' -> ^( COLORPRCTJ expr expr expr ) | color_keyword )
            int alt15=4;
            switch ( input.LA(1) ) {
            case COLORHEX:
                {
                alt15=1;
                }
                break;
            case RGB:
                {
                alt15=2;
                }
                break;
            case RGBPRCTJ:
                {
                alt15=3;
                }
                break;
            case BLACK:
            case BLUE:
            case GREEN:
            case RED:
            case WHITE:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:176:13: COLORHEX
                    {
                    root_0 = (AslTree)adaptor.nil();


                    COLORHEX104=(Token)match(input,COLORHEX,FOLLOW_COLORHEX_in_color1378); 
                    COLORHEX104_tree = 
                    (AslTree)adaptor.create(COLORHEX104)
                    ;
                    adaptor.addChild(root_0, COLORHEX104_tree);


                    }
                    break;
                case 2 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:177:13: RGB '(' expr ',' expr ',' expr ')'
                    {
                    RGB105=(Token)match(input,RGB,FOLLOW_RGB_in_color1393);  
                    stream_RGB.add(RGB105);


                    char_literal106=(Token)match(input,74,FOLLOW_74_in_color1395);  
                    stream_74.add(char_literal106);


                    pushFollow(FOLLOW_expr_in_color1397);
                    expr107=expr();

                    state._fsp--;

                    stream_expr.add(expr107.getTree());

                    char_literal108=(Token)match(input,76,FOLLOW_76_in_color1399);  
                    stream_76.add(char_literal108);


                    pushFollow(FOLLOW_expr_in_color1401);
                    expr109=expr();

                    state._fsp--;

                    stream_expr.add(expr109.getTree());

                    char_literal110=(Token)match(input,76,FOLLOW_76_in_color1403);  
                    stream_76.add(char_literal110);


                    pushFollow(FOLLOW_expr_in_color1405);
                    expr111=expr();

                    state._fsp--;

                    stream_expr.add(expr111.getTree());

                    char_literal112=(Token)match(input,75,FOLLOW_75_in_color1407);  
                    stream_75.add(char_literal112);


                    // AST REWRITE
                    // elements: expr, expr, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 177:48: -> ^( COLORINT expr expr expr )
                    {
                        // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:177:51: ^( COLORINT expr expr expr )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(COLORINT, "COLORINT")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:178:13: RGBPRCTJ '(' expr ',' expr ',' expr ')'
                    {
                    RGBPRCTJ113=(Token)match(input,RGBPRCTJ,FOLLOW_RGBPRCTJ_in_color1433);  
                    stream_RGBPRCTJ.add(RGBPRCTJ113);


                    char_literal114=(Token)match(input,74,FOLLOW_74_in_color1435);  
                    stream_74.add(char_literal114);


                    pushFollow(FOLLOW_expr_in_color1437);
                    expr115=expr();

                    state._fsp--;

                    stream_expr.add(expr115.getTree());

                    char_literal116=(Token)match(input,76,FOLLOW_76_in_color1439);  
                    stream_76.add(char_literal116);


                    pushFollow(FOLLOW_expr_in_color1441);
                    expr117=expr();

                    state._fsp--;

                    stream_expr.add(expr117.getTree());

                    char_literal118=(Token)match(input,76,FOLLOW_76_in_color1443);  
                    stream_76.add(char_literal118);


                    pushFollow(FOLLOW_expr_in_color1445);
                    expr119=expr();

                    state._fsp--;

                    stream_expr.add(expr119.getTree());

                    char_literal120=(Token)match(input,75,FOLLOW_75_in_color1447);  
                    stream_75.add(char_literal120);


                    // AST REWRITE
                    // elements: expr, expr, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 178:53: -> ^( COLORPRCTJ expr expr expr )
                    {
                        // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:178:56: ^( COLORPRCTJ expr expr expr )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(COLORPRCTJ, "COLORPRCTJ")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:179:13: color_keyword
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_color_keyword_in_color1473);
                    color_keyword121=color_keyword();

                    state._fsp--;

                    adaptor.addChild(root_0, color_keyword121.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "color"


    public static class color_keyword_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "color_keyword"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:191:1: color_keyword : ( RED | WHITE | BLACK | BLUE | GREEN );
    public final AslParser.color_keyword_return color_keyword() throws RecognitionException {
        AslParser.color_keyword_return retval = new AslParser.color_keyword_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set122=null;

        AslTree set122_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:191:15: ( RED | WHITE | BLACK | BLUE | GREEN )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set122=(Token)input.LT(1);

            if ( (input.LA(1) >= BLACK && input.LA(1) <= BLUE)||input.LA(1)==GREEN||input.LA(1)==RED||input.LA(1)==WHITE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set122)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "color_keyword"


    public static class obj_type_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "obj_type"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:193:1: obj_type : ( CIRCLE | RECTANGLE | TEXT );
    public final AslParser.obj_type_return obj_type() throws RecognitionException {
        AslParser.obj_type_return retval = new AslParser.obj_type_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set123=null;

        AslTree set123_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:193:10: ( CIRCLE | RECTANGLE | TEXT )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set123=(Token)input.LT(1);

            if ( input.LA(1)==CIRCLE||input.LA(1)==RECTANGLE||input.LA(1)==TEXT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set123)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "obj_type"


    public static class time_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "time"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:196:1: time : INT 's' ^;
    public final AslParser.time_return time() throws RecognitionException {
        AslParser.time_return retval = new AslParser.time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token INT124=null;
        Token char_literal125=null;

        AslTree INT124_tree=null;
        AslTree char_literal125_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:196:6: ( INT 's' ^)
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:196:9: INT 's' ^
            {
            root_0 = (AslTree)adaptor.nil();


            INT124=(Token)match(input,INT,FOLLOW_INT_in_time1550); 
            INT124_tree = 
            (AslTree)adaptor.create(INT124)
            ;
            adaptor.addChild(root_0, INT124_tree);


            char_literal125=(Token)match(input,79,FOLLOW_79_in_time1552); 
            char_literal125_tree = 
            (AslTree)adaptor.create(char_literal125)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(char_literal125_tree, root_0);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "time"


    public static class expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:199:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR127=null;
        AslParser.boolterm_return boolterm126 =null;

        AslParser.boolterm_return boolterm128 =null;


        AslTree OR127_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:199:9: ( boolterm ( OR ^ boolterm )* )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:199:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr1568);
            boolterm126=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm126.getTree());

            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:199:22: ( OR ^ boolterm )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==OR) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:199:23: OR ^ boolterm
            	    {
            	    OR127=(Token)match(input,OR,FOLLOW_OR_in_expr1571); 
            	    OR127_tree = 
            	    (AslTree)adaptor.create(OR127)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR127_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr1574);
            	    boolterm128=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm128.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:202:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND130=null;
        AslParser.boolfact_return boolfact129 =null;

        AslParser.boolfact_return boolfact131 =null;


        AslTree AND130_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:202:9: ( boolfact ( AND ^ boolfact )* )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:202:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1594);
            boolfact129=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact129.getTree());

            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:202:22: ( AND ^ boolfact )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==AND) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:202:23: AND ^ boolfact
            	    {
            	    AND130=(Token)match(input,AND,FOLLOW_AND_in_boolterm1597); 
            	    AND130_tree = 
            	    (AslTree)adaptor.create(AND130)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND130_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1600);
            	    boolfact131=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact131.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:205:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL133=null;
        Token NOT_EQUAL134=null;
        Token LT135=null;
        Token LE136=null;
        Token GT137=null;
        Token GE138=null;
        AslParser.num_expr_return num_expr132 =null;

        AslParser.num_expr_return num_expr139 =null;


        AslTree EQUAL133_tree=null;
        AslTree NOT_EQUAL134_tree=null;
        AslTree LT135_tree=null;
        AslTree LE136_tree=null;
        AslTree GT137_tree=null;
        AslTree GE138_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:205:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:205:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1620);
            num_expr132=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr132.getTree());

            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:205:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==EQUAL||LA19_0==GE||LA19_0==GT||LA19_0==LE||LA19_0==LT||LA19_0==NOT_EQUAL) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:205:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:205:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt18=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt18=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt18=2;
                        }
                        break;
                    case LT:
                        {
                        alt18=3;
                        }
                        break;
                    case LE:
                        {
                        alt18=4;
                        }
                        break;
                    case GT:
                        {
                        alt18=5;
                        }
                        break;
                    case GE:
                        {
                        alt18=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;

                    }

                    switch (alt18) {
                        case 1 :
                            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:205:24: EQUAL ^
                            {
                            EQUAL133=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact1624); 
                            EQUAL133_tree = 
                            (AslTree)adaptor.create(EQUAL133)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL133_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:205:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL134=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1629); 
                            NOT_EQUAL134_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL134)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL134_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:205:46: LT ^
                            {
                            LT135=(Token)match(input,LT,FOLLOW_LT_in_boolfact1634); 
                            LT135_tree = 
                            (AslTree)adaptor.create(LT135)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT135_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:205:52: LE ^
                            {
                            LE136=(Token)match(input,LE,FOLLOW_LE_in_boolfact1639); 
                            LE136_tree = 
                            (AslTree)adaptor.create(LE136)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE136_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:205:58: GT ^
                            {
                            GT137=(Token)match(input,GT,FOLLOW_GT_in_boolfact1644); 
                            GT137_tree = 
                            (AslTree)adaptor.create(GT137)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT137_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:205:64: GE ^
                            {
                            GE138=(Token)match(input,GE,FOLLOW_GE_in_boolfact1649); 
                            GE138_tree = 
                            (AslTree)adaptor.create(GE138)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE138_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1653);
                    num_expr139=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr139.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolfact"


    public static class num_expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_expr"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:208:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS141=null;
        Token MINUS142=null;
        AslParser.term_return term140 =null;

        AslParser.term_return term143 =null;


        AslTree PLUS141_tree=null;
        AslTree MINUS142_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:208:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:208:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1673);
            term140=term();

            state._fsp--;

            adaptor.addChild(root_0, term140.getTree());

            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:208:18: ( ( PLUS ^| MINUS ^) term )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==MINUS||LA21_0==PLUS) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:208:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:208:20: ( PLUS ^| MINUS ^)
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==PLUS) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==MINUS) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:208:21: PLUS ^
            	            {
            	            PLUS141=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1678); 
            	            PLUS141_tree = 
            	            (AslTree)adaptor.create(PLUS141)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS141_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:208:29: MINUS ^
            	            {
            	            MINUS142=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1683); 
            	            MINUS142_tree = 
            	            (AslTree)adaptor.create(MINUS142)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS142_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1687);
            	    term143=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term143.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:211:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL145=null;
        Token DIV146=null;
        Token MOD147=null;
        AslParser.factor_return factor144 =null;

        AslParser.factor_return factor148 =null;


        AslTree MUL145_tree=null;
        AslTree DIV146_tree=null;
        AslTree MOD147_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:211:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:211:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1711);
            factor144=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor144.getTree());

            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:211:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==DIV||LA23_0==MOD||LA23_0==MUL) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:211:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:211:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt22=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:211:23: MUL ^
            	            {
            	            MUL145=(Token)match(input,MUL,FOLLOW_MUL_in_term1716); 
            	            MUL145_tree = 
            	            (AslTree)adaptor.create(MUL145)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL145_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:211:30: DIV ^
            	            {
            	            DIV146=(Token)match(input,DIV,FOLLOW_DIV_in_term1721); 
            	            DIV146_tree = 
            	            (AslTree)adaptor.create(DIV146)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV146_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:211:37: MOD ^
            	            {
            	            MOD147=(Token)match(input,MOD,FOLLOW_MOD_in_term1726); 
            	            MOD147_tree = 
            	            (AslTree)adaptor.create(MOD147)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD147_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1730);
            	    factor148=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor148.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:214:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT149=null;
        Token PLUS150=null;
        Token MINUS151=null;
        AslParser.atom_return atom152 =null;


        AslTree NOT149_tree=null;
        AslTree PLUS150_tree=null;
        AslTree MINUS151_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:214:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:214:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:214:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt24=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt24=1;
                    }
                    break;
                case PLUS:
                    {
                    alt24=2;
                    }
                    break;
                case MINUS:
                    {
                    alt24=3;
                    }
                    break;
            }

            switch (alt24) {
                case 1 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:214:14: NOT ^
                    {
                    NOT149=(Token)match(input,NOT,FOLLOW_NOT_in_factor1753); 
                    NOT149_tree = 
                    (AslTree)adaptor.create(NOT149)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT149_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:214:21: PLUS ^
                    {
                    PLUS150=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1758); 
                    PLUS150_tree = 
                    (AslTree)adaptor.create(PLUS150)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS150_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:214:29: MINUS ^
                    {
                    MINUS151=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1763); 
                    MINUS151_tree = 
                    (AslTree)adaptor.create(MINUS151)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS151_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1768);
            atom152=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom152.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class atom_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:220:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID153=null;
        Token INT154=null;
        Token char_literal156=null;
        Token char_literal158=null;
        AslParser.funcall_return funcall155 =null;

        AslParser.expr_return expr157 =null;


        AslTree b_tree=null;
        AslTree ID153_tree=null;
        AslTree INT154_tree=null;
        AslTree char_literal156_tree=null;
        AslTree char_literal158_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:220:9: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt26=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==74) ) {
                    alt26=4;
                }
                else if ( (LA26_1==AND||(LA26_1 >= DIV && LA26_1 <= DO)||(LA26_1 >= ELSE && LA26_1 <= EQUAL)||LA26_1==GE||LA26_1==GT||LA26_1==LE||(LA26_1 >= LT && LA26_1 <= MOD)||LA26_1==MUL||(LA26_1 >= NOT_EQUAL && LA26_1 <= OR)||LA26_1==PLUS||LA26_1==THEN||(LA26_1 >= 75 && LA26_1 <= 76)||LA26_1==78) ) {
                    alt26=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt26=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt26=3;
                }
                break;
            case 74:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:220:13: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID153=(Token)match(input,ID,FOLLOW_ID_in_atom1793); 
                    ID153_tree = 
                    (AslTree)adaptor.create(ID153)
                    ;
                    adaptor.addChild(root_0, ID153_tree);


                    }
                    break;
                case 2 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:221:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT154=(Token)match(input,INT,FOLLOW_INT_in_atom1808); 
                    INT154_tree = 
                    (AslTree)adaptor.create(INT154)
                    ;
                    adaptor.addChild(root_0, INT154_tree);


                    }
                    break;
                case 3 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:222:13: (b= TRUE |b= FALSE )
                    {
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:222:13: (b= TRUE |b= FALSE )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==TRUE) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==FALSE) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;

                    }
                    switch (alt25) {
                        case 1 :
                            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:222:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1825);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:222:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1831);  
                            stream_FALSE.add(b);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 222:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:222:36: ^( BOOLEAN[$b,$b.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(BOOLEAN, b, (b!=null?b.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:223:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1854);
                    funcall155=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall155.getTree());

                    }
                    break;
                case 5 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:224:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal156=(Token)match(input,74,FOLLOW_74_in_atom1868); 

                    pushFollow(FOLLOW_expr_in_atom1871);
                    expr157=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr157.getTree());

                    char_literal158=(Token)match(input,75,FOLLOW_75_in_atom1873); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class funcall_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:228:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID159=null;
        Token char_literal160=null;
        Token char_literal162=null;
        AslParser.expr_list_return expr_list161 =null;


        AslTree ID159_tree=null;
        AslTree char_literal160_tree=null;
        AslTree char_literal162_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:228:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:228:13: ID '(' ( expr_list )? ')'
            {
            ID159=(Token)match(input,ID,FOLLOW_ID_in_funcall1894);  
            stream_ID.add(ID159);


            char_literal160=(Token)match(input,74,FOLLOW_74_in_funcall1896);  
            stream_74.add(char_literal160);


            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:228:20: ( expr_list )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==FALSE||LA27_0==ID||LA27_0==INT||LA27_0==MINUS||LA27_0==NOT||LA27_0==PLUS||LA27_0==TRUE||LA27_0==74) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:228:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1898);
                    expr_list161=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list161.getTree());

                    }
                    break;

            }


            char_literal162=(Token)match(input,75,FOLLOW_75_in_funcall1901);  
            stream_75.add(char_literal162);


            // AST REWRITE
            // elements: expr_list, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 228:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:228:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:228:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:228:61: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcall"


    public static class expr_list_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list"
    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:232:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal164=null;
        AslParser.expr_return expr163 =null;

        AslParser.expr_return expr165 =null;


        AslTree char_literal164_tree=null;

        try {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:232:10: ( expr ( ',' ! expr )* )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:232:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1934);
            expr163=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr163.getTree());

            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:232:18: ( ',' ! expr )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==76) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:232:19: ',' ! expr
            	    {
            	    char_literal164=(Token)match(input,76,FOLLOW_76_in_expr_list1937); 

            	    pushFollow(FOLLOW_expr_in_expr_list1940);
            	    expr165=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr165.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_list"

    // Delegated rules


 

    public static final BitSet FOLLOW_func_in_prog188 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_EOF_in_prog191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func233 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_func236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_params_in_func238 = new BitSet(new long[]{0x4801E01800030000L,0x00000000000040A0L});
    public static final BitSet FOLLOW_block_instructions_in_func240 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_params262 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000A00L});
    public static final BitSet FOLLOW_paramlist_in_params264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_params267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist293 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_paramlist296 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_param_in_paramlist299 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_73_in_param324 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_param328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions387 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_block_instructions390 = new BitSet(new long[]{0x4801E01800030000L,0x00000000000040A0L});
    public static final BitSet FOLLOW_instruction_in_block_instructions392 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_assign_in_instruction443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_in_instruction602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destroy_in_instruction626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_in_instruction649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_in_instruction675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign747 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_EEQUAL_in_assign751 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_assign753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt787 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_ite_stmt790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt792 = new BitSet(new long[]{0x4801E01800030000L,0x00000000000040A0L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt795 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt798 = new BitSet(new long[]{0x4801E01800030000L,0x00000000000040A0L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt801 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt831 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_while_stmt834 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_DO_in_while_stmt836 = new BitSet(new long[]{0x4801E01800030000L,0x00000000000040A0L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt839 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt866 = new BitSet(new long[]{0x0044082808000002L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_return_stmt869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read893 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_read896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write918 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000412L});
    public static final BitSet FOLLOW_expr_in_write922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create950 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_create953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_create955 = new BitSet(new long[]{0x1000000000000400L,0x0000000000000004L});
    public static final BitSet FOLLOW_obj_type_in_create958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_create960 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_create963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_create965 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_create968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_76_in_create971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_list_attributes_in_create974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_create978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTROY_in_destroy998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_destroy1001 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_destroy1004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_destroy1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_time_in_move1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_no_time_in_move1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_T_in_move_time1050 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_move_time1053 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_time_in_move_time1056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_move_time1058 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_move_time1061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_move_time1063 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_move_time1066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_move_time1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_move_no_time1087 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_move_no_time1090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_move_no_time1092 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_move_no_time1095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_move_no_time1097 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_move_no_time1100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_move_no_time1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_time_in_modify1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_no_time_in_modify1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODIFY_T_in_modify_time1146 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_modify_time1149 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_time_in_modify_time1151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_list_attributes_in_modify_time1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODIFY_in_modify_no_time1170 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_modify_no_time1173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_list_attributes_in_modify_no_time1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_list_attributes1193 = new BitSet(new long[]{0x0180000000000800L});
    public static final BitSet FOLLOW_attribute_in_list_attributes1195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_76_in_list_attributes1198 = new BitSet(new long[]{0x0180000000000800L});
    public static final BitSet FOLLOW_attribute_in_list_attributes1200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_list_attributes1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_name_color_in_attribute1234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_attribute1237 = new BitSet(new long[]{0xA000000080001180L,0x0000000000000041L});
    public static final BitSet FOLLOW_color_in_attribute1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_name_expr_in_attribute1258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_attribute1261 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_attribute1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLOR_in_attribute_name_color1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLORHEX_in_color1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RGB_in_color1393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_color1395 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_color1397 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_color1399 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_color1401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_color1403 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_color1405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_color1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RGBPRCTJ_in_color1433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_color1435 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_color1437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_color1439 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_color1441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_color1443 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_color1445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_color1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_color_keyword_in_color1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_time1550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_time1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr1568 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_OR_in_expr1571 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_boolterm_in_expr1574 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1594 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm1597 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1600 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1620 = new BitSet(new long[]{0x0008044142000002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact1624 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1629 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_LT_in_boolfact1634 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_LE_in_boolfact1639 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_GT_in_boolfact1644 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_GE_in_boolfact1649 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1673 = new BitSet(new long[]{0x0040080000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1678 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1683 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_term_in_num_expr1687 = new BitSet(new long[]{0x0040080000000002L});
    public static final BitSet FOLLOW_factor_in_term1711 = new BitSet(new long[]{0x0002100000040002L});
    public static final BitSet FOLLOW_MUL_in_term1716 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_DIV_in_term1721 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_MOD_in_term1726 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_factor_in_term1730 = new BitSet(new long[]{0x0002100000040002L});
    public static final BitSet FOLLOW_NOT_in_factor1753 = new BitSet(new long[]{0x0000002808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_PLUS_in_factor1758 = new BitSet(new long[]{0x0000002808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_MINUS_in_factor1763 = new BitSet(new long[]{0x0000002808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_atom_in_factor1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_atom1868 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_atom1871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_atom1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_funcall1896 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000C10L});
    public static final BitSet FOLLOW_expr_list_in_funcall1898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_funcall1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1934 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_expr_list1937 = new BitSet(new long[]{0x0044082808000000L,0x0000000000000410L});
    public static final BitSet FOLLOW_expr_in_expr_list1940 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});

}