// $ANTLR 3.4 /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g 2016-05-24 19:09:58

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "ATTR", "BLACK", "BLUE", "BOOLEAN", "CIRCLE", "COLOR", "COLORHEX", "COLORHEXA", "COLORINT", "COLORKEYWORD", "COLORPRCTJ", "COMMENT", "CREATE", "DELAY", "DESTROY", "DIV", "DO", "EEQUAL", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GREEN", "GT", "HASHTAG", "HEXADIGIT", "HIDE", "HIDE_T", "ID", "IF", "INT", "LE", "LIST_ATTR", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MODIFY", "MODIFY_T", "MOVE", "MOVE_T", "MUL", "NOT", "NOT_EQUAL", "OR", "PARALLEL", "PARAMS", "PLUS", "POSX", "POSY", "PREF", "PVALUE", "READ", "RECTANGLE", "RED", "RETURN", "RGB", "RGBPRCTJ", "SHOW", "SHOW_T", "STRING", "STROKE", "TEXT", "THEN", "TRUE", "WHILE", "WHITE", "WRITE", "WS", "'&'", "'('", "')'", "','", "'.'", "':'", "';'", "'ms'", "'r'", "'s'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ASSIGN=6;
    public static final int ATTR=7;
    public static final int BLACK=8;
    public static final int BLUE=9;
    public static final int BOOLEAN=10;
    public static final int CIRCLE=11;
    public static final int COLOR=12;
    public static final int COLORHEX=13;
    public static final int COLORHEXA=14;
    public static final int COLORINT=15;
    public static final int COLORKEYWORD=16;
    public static final int COLORPRCTJ=17;
    public static final int COMMENT=18;
    public static final int CREATE=19;
    public static final int DELAY=20;
    public static final int DESTROY=21;
    public static final int DIV=22;
    public static final int DO=23;
    public static final int EEQUAL=24;
    public static final int ELSE=25;
    public static final int ENDFUNC=26;
    public static final int ENDIF=27;
    public static final int ENDWHILE=28;
    public static final int EQUAL=29;
    public static final int ESC_SEQ=30;
    public static final int FALSE=31;
    public static final int FUNC=32;
    public static final int FUNCALL=33;
    public static final int GE=34;
    public static final int GREEN=35;
    public static final int GT=36;
    public static final int HASHTAG=37;
    public static final int HEXADIGIT=38;
    public static final int HIDE=39;
    public static final int HIDE_T=40;
    public static final int ID=41;
    public static final int IF=42;
    public static final int INT=43;
    public static final int LE=44;
    public static final int LIST_ATTR=45;
    public static final int LIST_FUNCTIONS=46;
    public static final int LIST_INSTR=47;
    public static final int LT=48;
    public static final int MINUS=49;
    public static final int MOD=50;
    public static final int MODIFY=51;
    public static final int MODIFY_T=52;
    public static final int MOVE=53;
    public static final int MOVE_T=54;
    public static final int MUL=55;
    public static final int NOT=56;
    public static final int NOT_EQUAL=57;
    public static final int OR=58;
    public static final int PARALLEL=59;
    public static final int PARAMS=60;
    public static final int PLUS=61;
    public static final int POSX=62;
    public static final int POSY=63;
    public static final int PREF=64;
    public static final int PVALUE=65;
    public static final int READ=66;
    public static final int RECTANGLE=67;
    public static final int RED=68;
    public static final int RETURN=69;
    public static final int RGB=70;
    public static final int RGBPRCTJ=71;
    public static final int SHOW=72;
    public static final int SHOW_T=73;
    public static final int STRING=74;
    public static final int STROKE=75;
    public static final int TEXT=76;
    public static final int THEN=77;
    public static final int TRUE=78;
    public static final int WHILE=79;
    public static final int WHITE=80;
    public static final int WRITE=81;
    public static final int WS=82;

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
    public String getGrammarFileName() { return "/home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:66:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:66:9: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:66:11: ( func )+ EOF
            {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:66:11: ( func )+
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
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:66:11: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog208);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog211);  
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
            // 66:21: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:66:24: ^( LIST_FUNCTIONS ( func )+ )
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:70:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:70:9: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:70:11: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func253); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func256); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func258);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func260);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func262); 

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:74:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:74:9: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:74:11: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,84,FOLLOW_84_in_params282);  
            stream_84.add(char_literal8);


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:74:15: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==83) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:74:15: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params284);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,85,FOLLOW_85_in_params287);  
            stream_85.add(char_literal10);


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
            // 74:30: -> ^( PARAMS ( paramlist )? )
            {
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:74:33: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:74:42: ( paramlist )?
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:78:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:78:10: ( param ( ',' ! param )* )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:78:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist313);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:78:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==86) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:78:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,86,FOLLOW_86_in_paramlist316); 

            	    pushFollow(FOLLOW_param_in_paramlist319);
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:83:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal14=null;

        AslTree id_tree=null;
        AslTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:83:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==83) ) {
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:83:13: '&' id= ID
                    {
                    char_literal14=(Token)match(input,83,FOLLOW_83_in_param344);  
                    stream_83.add(char_literal14);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param348);  
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
                    // 83:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:83:26: ^( PREF[$id,$id.text] )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:84:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param371);  
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
                    // 84:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:84:22: ^( PVALUE[$id,$id.text] )
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:91:1: block_instructions : ( instruction )+ -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.instruction_return instruction15 =null;


        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:92:9: ( ( instruction )+ -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:92:14: ( instruction )+
            {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:92:14: ( instruction )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= CREATE && LA5_0 <= DESTROY)||(LA5_0 >= HIDE && LA5_0 <= IF)||(LA5_0 >= MODIFY && LA5_0 <= MOVE_T)||LA5_0==PARALLEL||LA5_0==READ||LA5_0==RETURN||(LA5_0 >= SHOW && LA5_0 <= SHOW_T)||LA5_0==WHILE||LA5_0==WRITE||LA5_0==89) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:92:14: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_block_instructions410);
            	    instruction15=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction15.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // 93:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:93:16: ^( LIST_INSTR ( instruction )+ )
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:96:1: instruction : ( ( instruction_spc ';' !) | instructions_brack );
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal17=null;
        AslParser.instruction_spc_return instruction_spc16 =null;

        AslParser.instructions_brack_return instructions_brack18 =null;


        AslTree char_literal17_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:96:13: ( ( instruction_spc ';' !) | instructions_brack )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0 >= CREATE && LA6_0 <= DESTROY)||(LA6_0 >= HIDE && LA6_0 <= IF)||(LA6_0 >= MODIFY && LA6_0 <= MOVE_T)||LA6_0==READ||LA6_0==RETURN||(LA6_0 >= SHOW && LA6_0 <= SHOW_T)||LA6_0==WHILE||LA6_0==WRITE||LA6_0==89) ) {
                alt6=1;
            }
            else if ( (LA6_0==PARALLEL) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:96:15: ( instruction_spc ';' !)
                    {
                    root_0 = (AslTree)adaptor.nil();


                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:96:15: ( instruction_spc ';' !)
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:96:16: instruction_spc ';' !
                    {
                    pushFollow(FOLLOW_instruction_spc_in_instruction451);
                    instruction_spc16=instruction_spc();

                    state._fsp--;

                    adaptor.addChild(root_0, instruction_spc16.getTree());

                    char_literal17=(Token)match(input,89,FOLLOW_89_in_instruction453); 

                    }


                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:96:40: instructions_brack
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_instructions_brack_in_instruction459);
                    instructions_brack18=instructions_brack();

                    state._fsp--;

                    adaptor.addChild(root_0, instructions_brack18.getTree());

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


    public static class instruction_spc_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction_spc"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:99:1: instruction_spc : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | create | destroy | move | modify | show | hide | delay |);
    public final AslParser.instruction_spc_return instruction_spc() throws RecognitionException {
        AslParser.instruction_spc_return retval = new AslParser.instruction_spc_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign19 =null;

        AslParser.ite_stmt_return ite_stmt20 =null;

        AslParser.while_stmt_return while_stmt21 =null;

        AslParser.funcall_return funcall22 =null;

        AslParser.return_stmt_return return_stmt23 =null;

        AslParser.read_return read24 =null;

        AslParser.write_return write25 =null;

        AslParser.create_return create26 =null;

        AslParser.destroy_return destroy27 =null;

        AslParser.move_return move28 =null;

        AslParser.modify_return modify29 =null;

        AslParser.show_return show30 =null;

        AslParser.hide_return hide31 =null;

        AslParser.delay_return delay32 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:100:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | create | destroy | move | modify | show | hide | delay |)
            int alt7=15;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EEQUAL) ) {
                    alt7=1;
                }
                else if ( (LA7_1==84) ) {
                    alt7=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt7=2;
                }
                break;
            case WHILE:
                {
                alt7=3;
                }
                break;
            case RETURN:
                {
                alt7=5;
                }
                break;
            case READ:
                {
                alt7=6;
                }
                break;
            case WRITE:
                {
                alt7=7;
                }
                break;
            case CREATE:
                {
                alt7=8;
                }
                break;
            case DESTROY:
                {
                alt7=9;
                }
                break;
            case MOVE:
            case MOVE_T:
                {
                alt7=10;
                }
                break;
            case MODIFY:
            case MODIFY_T:
                {
                alt7=11;
                }
                break;
            case SHOW:
            case SHOW_T:
                {
                alt7=12;
                }
                break;
            case HIDE:
            case HIDE_T:
                {
                alt7=13;
                }
                break;
            case DELAY:
                {
                alt7=14;
                }
                break;
            case 89:
                {
                alt7=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:100:13: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction_spc478);
                    assign19=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign19.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:101:13: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction_spc502);
                    ite_stmt20=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt20.getTree());

                    }
                    break;
                case 3 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:102:13: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction_spc524);
                    while_stmt21=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt21.getTree());

                    }
                    break;
                case 4 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:103:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction_spc544);
                    funcall22=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall22.getTree());

                    }
                    break;
                case 5 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:104:13: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction_spc567);
                    return_stmt23=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt23.getTree());

                    }
                    break;
                case 6 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:105:13: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction_spc586);
                    read24=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read24.getTree());

                    }
                    break;
                case 7 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:106:13: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction_spc612);
                    write25=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write25.getTree());

                    }
                    break;
                case 8 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:107:13: create
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_create_in_instruction_spc637);
                    create26=create();

                    state._fsp--;

                    adaptor.addChild(root_0, create26.getTree());

                    }
                    break;
                case 9 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:108:13: destroy
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_destroy_in_instruction_spc661);
                    destroy27=destroy();

                    state._fsp--;

                    adaptor.addChild(root_0, destroy27.getTree());

                    }
                    break;
                case 10 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:109:13: move
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_in_instruction_spc684);
                    move28=move();

                    state._fsp--;

                    adaptor.addChild(root_0, move28.getTree());

                    }
                    break;
                case 11 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:110:13: modify
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_in_instruction_spc710);
                    modify29=modify();

                    state._fsp--;

                    adaptor.addChild(root_0, modify29.getTree());

                    }
                    break;
                case 12 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:112:13: show
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_show_in_instruction_spc738);
                    show30=show();

                    state._fsp--;

                    adaptor.addChild(root_0, show30.getTree());

                    }
                    break;
                case 13 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:113:13: hide
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_hide_in_instruction_spc752);
                    hide31=hide();

                    state._fsp--;

                    adaptor.addChild(root_0, hide31.getTree());

                    }
                    break;
                case 14 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:114:13: delay
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_delay_in_instruction_spc766);
                    delay32=delay();

                    state._fsp--;

                    adaptor.addChild(root_0, delay32.getTree());

                    }
                    break;
                case 15 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:116:9: 
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
    // $ANTLR end "instruction_spc"


    public static class instructions_brack_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instructions_brack"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:118:1: instructions_brack : parallel ;
    public final AslParser.instructions_brack_return instructions_brack() throws RecognitionException {
        AslParser.instructions_brack_return retval = new AslParser.instructions_brack_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.parallel_return parallel33 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:118:20: ( parallel )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:118:22: parallel
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_parallel_in_instructions_brack812);
            parallel33=parallel();

            state._fsp--;

            adaptor.addChild(root_0, parallel33.getTree());

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
    // $ANTLR end "instructions_brack"


    public static class assign_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:121:1: assign : ID eq= EEQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID34=null;
        AslParser.expr_return expr35 =null;


        AslTree eq_tree=null;
        AslTree ID34_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EEQUAL=new RewriteRuleTokenStream(adaptor,"token EEQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:121:9: ( ID eq= EEQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:121:13: ID eq= EEQUAL expr
            {
            ID34=(Token)match(input,ID,FOLLOW_ID_in_assign824);  
            stream_ID.add(ID34);


            eq=(Token)match(input,EEQUAL,FOLLOW_EEQUAL_in_assign828);  
            stream_EEQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign830);
            expr35=expr();

            state._fsp--;

            stream_expr.add(expr35.getTree());

            // AST REWRITE
            // elements: ID, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 121:31: -> ^( ASSIGN[$eq,\":=\"] ID expr )
            {
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:121:34: ^( ASSIGN[$eq,\":=\"] ID expr )
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:124:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF36=null;
        Token THEN38=null;
        Token ELSE40=null;
        Token ENDIF42=null;
        AslParser.expr_return expr37 =null;

        AslParser.block_instructions_return block_instructions39 =null;

        AslParser.block_instructions_return block_instructions41 =null;


        AslTree IF36_tree=null;
        AslTree THEN38_tree=null;
        AslTree ELSE40_tree=null;
        AslTree ENDIF42_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:124:13: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:124:17: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF36=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt863); 
            IF36_tree = 
            (AslTree)adaptor.create(IF36)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF36_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt866);
            expr37=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr37.getTree());

            THEN38=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt868); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt871);
            block_instructions39=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions39.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:124:51: ( ELSE ! block_instructions )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ELSE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:124:52: ELSE ! block_instructions
                    {
                    ELSE40=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt874); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt877);
                    block_instructions41=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions41.getTree());

                    }
                    break;

            }


            ENDIF42=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt881); 

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:128:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE43=null;
        Token DO45=null;
        Token ENDWHILE47=null;
        AslParser.expr_return expr44 =null;

        AslParser.block_instructions_return block_instructions46 =null;


        AslTree WHILE43_tree=null;
        AslTree DO45_tree=null;
        AslTree ENDWHILE47_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:128:13: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:128:17: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE43=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt907); 
            WHILE43_tree = 
            (AslTree)adaptor.create(WHILE43)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE43_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt910);
            expr44=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr44.getTree());

            DO45=(Token)match(input,DO,FOLLOW_DO_in_while_stmt912); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt915);
            block_instructions46=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions46.getTree());

            ENDWHILE47=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt917); 

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:132:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN48=null;
        AslParser.expr_return expr49 =null;


        AslTree RETURN48_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:132:13: ( RETURN ^ ( expr )? )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:132:17: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN48=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt942); 
            RETURN48_tree = 
            (AslTree)adaptor.create(RETURN48)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN48_tree, root_0);


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:132:25: ( expr )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==TRUE||LA9_0==84) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:132:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt945);
                    expr49=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr49.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:136:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ50=null;
        Token ID51=null;

        AslTree READ50_tree=null;
        AslTree ID51_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:136:9: ( READ ^ ID )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:136:13: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ50=(Token)match(input,READ,FOLLOW_READ_in_read969); 
            READ50_tree = 
            (AslTree)adaptor.create(READ50)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ50_tree, root_0);


            ID51=(Token)match(input,ID,FOLLOW_ID_in_read972); 
            ID51_tree = 
            (AslTree)adaptor.create(ID51)
            ;
            adaptor.addChild(root_0, ID51_tree);


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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:140:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE52=null;
        Token STRING54=null;
        AslParser.expr_return expr53 =null;


        AslTree WRITE52_tree=null;
        AslTree STRING54_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:140:9: ( WRITE ^ ( expr | STRING ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:140:13: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE52=(Token)match(input,WRITE,FOLLOW_WRITE_in_write994); 
            WRITE52_tree = 
            (AslTree)adaptor.create(WRITE52)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE52_tree, root_0);


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:140:20: ( expr | STRING )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==FALSE||LA10_0==ID||LA10_0==INT||LA10_0==MINUS||LA10_0==NOT||LA10_0==PLUS||LA10_0==TRUE||LA10_0==84) ) {
                alt10=1;
            }
            else if ( (LA10_0==STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:140:21: expr
                    {
                    pushFollow(FOLLOW_expr_in_write998);
                    expr53=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr53.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:140:28: STRING
                    {
                    STRING54=(Token)match(input,STRING,FOLLOW_STRING_in_write1002); 
                    STRING54_tree = 
                    (AslTree)adaptor.create(STRING54)
                    ;
                    adaptor.addChild(root_0, STRING54_tree);


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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:145:1: create : CREATE ^ ID '(' ! obj_type ',' ! expr ',' ! expr ( ',' ! list_attributes )? ')' !;
    public final AslParser.create_return create() throws RecognitionException {
        AslParser.create_return retval = new AslParser.create_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token CREATE55=null;
        Token ID56=null;
        Token char_literal57=null;
        Token char_literal59=null;
        Token char_literal61=null;
        Token char_literal63=null;
        Token char_literal65=null;
        AslParser.obj_type_return obj_type58 =null;

        AslParser.expr_return expr60 =null;

        AslParser.expr_return expr62 =null;

        AslParser.list_attributes_return list_attributes64 =null;


        AslTree CREATE55_tree=null;
        AslTree ID56_tree=null;
        AslTree char_literal57_tree=null;
        AslTree char_literal59_tree=null;
        AslTree char_literal61_tree=null;
        AslTree char_literal63_tree=null;
        AslTree char_literal65_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:145:9: ( CREATE ^ ID '(' ! obj_type ',' ! expr ',' ! expr ( ',' ! list_attributes )? ')' !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:145:13: CREATE ^ ID '(' ! obj_type ',' ! expr ',' ! expr ( ',' ! list_attributes )? ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            CREATE55=(Token)match(input,CREATE,FOLLOW_CREATE_in_create1026); 
            CREATE55_tree = 
            (AslTree)adaptor.create(CREATE55)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(CREATE55_tree, root_0);


            ID56=(Token)match(input,ID,FOLLOW_ID_in_create1029); 
            ID56_tree = 
            (AslTree)adaptor.create(ID56)
            ;
            adaptor.addChild(root_0, ID56_tree);


            char_literal57=(Token)match(input,84,FOLLOW_84_in_create1031); 

            pushFollow(FOLLOW_obj_type_in_create1034);
            obj_type58=obj_type();

            state._fsp--;

            adaptor.addChild(root_0, obj_type58.getTree());

            char_literal59=(Token)match(input,86,FOLLOW_86_in_create1036); 

            pushFollow(FOLLOW_expr_in_create1039);
            expr60=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr60.getTree());

            char_literal61=(Token)match(input,86,FOLLOW_86_in_create1041); 

            pushFollow(FOLLOW_expr_in_create1044);
            expr62=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr62.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:145:58: ( ',' ! list_attributes )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==86) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:145:59: ',' ! list_attributes
                    {
                    char_literal63=(Token)match(input,86,FOLLOW_86_in_create1047); 

                    pushFollow(FOLLOW_list_attributes_in_create1050);
                    list_attributes64=list_attributes();

                    state._fsp--;

                    adaptor.addChild(root_0, list_attributes64.getTree());

                    }
                    break;

            }


            char_literal65=(Token)match(input,85,FOLLOW_85_in_create1054); 

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:148:1: destroy : DESTROY ^ '(' ! ID ')' !;
    public final AslParser.destroy_return destroy() throws RecognitionException {
        AslParser.destroy_return retval = new AslParser.destroy_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token DESTROY66=null;
        Token char_literal67=null;
        Token ID68=null;
        Token char_literal69=null;

        AslTree DESTROY66_tree=null;
        AslTree char_literal67_tree=null;
        AslTree ID68_tree=null;
        AslTree char_literal69_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:148:9: ( DESTROY ^ '(' ! ID ')' !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:148:13: DESTROY ^ '(' ! ID ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            DESTROY66=(Token)match(input,DESTROY,FOLLOW_DESTROY_in_destroy1074); 
            DESTROY66_tree = 
            (AslTree)adaptor.create(DESTROY66)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(DESTROY66_tree, root_0);


            char_literal67=(Token)match(input,84,FOLLOW_84_in_destroy1077); 

            ID68=(Token)match(input,ID,FOLLOW_ID_in_destroy1080); 
            ID68_tree = 
            (AslTree)adaptor.create(ID68)
            ;
            adaptor.addChild(root_0, ID68_tree);


            char_literal69=(Token)match(input,85,FOLLOW_85_in_destroy1082); 

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:151:1: move : ( move_time | move_no_time );
    public final AslParser.move_return move() throws RecognitionException {
        AslParser.move_return retval = new AslParser.move_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.move_time_return move_time70 =null;

        AslParser.move_no_time_return move_no_time71 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:151:9: ( move_time | move_no_time )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==MOVE_T) ) {
                alt12=1;
            }
            else if ( (LA12_0==MOVE) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:151:13: move_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_time_in_move1105);
                    move_time70=move_time();

                    state._fsp--;

                    adaptor.addChild(root_0, move_time70.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:151:25: move_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_no_time_in_move1109);
                    move_no_time71=move_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, move_no_time71.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:154:1: move_time : MOVE_T ^ ID time '(' ! expr ',' ! expr ')' !;
    public final AslParser.move_time_return move_time() throws RecognitionException {
        AslParser.move_time_return retval = new AslParser.move_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MOVE_T72=null;
        Token ID73=null;
        Token char_literal75=null;
        Token char_literal77=null;
        Token char_literal79=null;
        AslParser.time_return time74 =null;

        AslParser.expr_return expr76 =null;

        AslParser.expr_return expr78 =null;


        AslTree MOVE_T72_tree=null;
        AslTree ID73_tree=null;
        AslTree char_literal75_tree=null;
        AslTree char_literal77_tree=null;
        AslTree char_literal79_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:154:11: ( MOVE_T ^ ID time '(' ! expr ',' ! expr ')' !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:154:13: MOVE_T ^ ID time '(' ! expr ',' ! expr ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            MOVE_T72=(Token)match(input,MOVE_T,FOLLOW_MOVE_T_in_move_time1126); 
            MOVE_T72_tree = 
            (AslTree)adaptor.create(MOVE_T72)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MOVE_T72_tree, root_0);


            ID73=(Token)match(input,ID,FOLLOW_ID_in_move_time1129); 
            ID73_tree = 
            (AslTree)adaptor.create(ID73)
            ;
            adaptor.addChild(root_0, ID73_tree);


            pushFollow(FOLLOW_time_in_move_time1132);
            time74=time();

            state._fsp--;

            adaptor.addChild(root_0, time74.getTree());

            char_literal75=(Token)match(input,84,FOLLOW_84_in_move_time1134); 

            pushFollow(FOLLOW_expr_in_move_time1137);
            expr76=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr76.getTree());

            char_literal77=(Token)match(input,86,FOLLOW_86_in_move_time1139); 

            pushFollow(FOLLOW_expr_in_move_time1142);
            expr78=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr78.getTree());

            char_literal79=(Token)match(input,85,FOLLOW_85_in_move_time1145); 

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:157:1: move_no_time : MOVE ^ ID '(' ! expr ',' ! expr ')' !;
    public final AslParser.move_no_time_return move_no_time() throws RecognitionException {
        AslParser.move_no_time_return retval = new AslParser.move_no_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MOVE80=null;
        Token ID81=null;
        Token char_literal82=null;
        Token char_literal84=null;
        Token char_literal86=null;
        AslParser.expr_return expr83 =null;

        AslParser.expr_return expr85 =null;


        AslTree MOVE80_tree=null;
        AslTree ID81_tree=null;
        AslTree char_literal82_tree=null;
        AslTree char_literal84_tree=null;
        AslTree char_literal86_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:157:14: ( MOVE ^ ID '(' ! expr ',' ! expr ')' !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:157:16: MOVE ^ ID '(' ! expr ',' ! expr ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            MOVE80=(Token)match(input,MOVE,FOLLOW_MOVE_in_move_no_time1163); 
            MOVE80_tree = 
            (AslTree)adaptor.create(MOVE80)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MOVE80_tree, root_0);


            ID81=(Token)match(input,ID,FOLLOW_ID_in_move_no_time1166); 
            ID81_tree = 
            (AslTree)adaptor.create(ID81)
            ;
            adaptor.addChild(root_0, ID81_tree);


            char_literal82=(Token)match(input,84,FOLLOW_84_in_move_no_time1168); 

            pushFollow(FOLLOW_expr_in_move_no_time1171);
            expr83=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr83.getTree());

            char_literal84=(Token)match(input,86,FOLLOW_86_in_move_no_time1173); 

            pushFollow(FOLLOW_expr_in_move_no_time1176);
            expr85=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr85.getTree());

            char_literal86=(Token)match(input,85,FOLLOW_85_in_move_no_time1178); 

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:160:1: modify : ( modify_time | modify_no_time );
    public final AslParser.modify_return modify() throws RecognitionException {
        AslParser.modify_return retval = new AslParser.modify_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.modify_time_return modify_time87 =null;

        AslParser.modify_no_time_return modify_no_time88 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:160:11: ( modify_time | modify_no_time )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==MODIFY_T) ) {
                alt13=1;
            }
            else if ( (LA13_0==MODIFY) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:160:15: modify_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_time_in_modify1201);
                    modify_time87=modify_time();

                    state._fsp--;

                    adaptor.addChild(root_0, modify_time87.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:160:29: modify_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_no_time_in_modify1205);
                    modify_no_time88=modify_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, modify_no_time88.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:163:1: modify_time : MODIFY_T ^ ID time list_attributes ;
    public final AslParser.modify_time_return modify_time() throws RecognitionException {
        AslParser.modify_time_return retval = new AslParser.modify_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MODIFY_T89=null;
        Token ID90=null;
        AslParser.time_return time91 =null;

        AslParser.list_attributes_return list_attributes92 =null;


        AslTree MODIFY_T89_tree=null;
        AslTree ID90_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:163:13: ( MODIFY_T ^ ID time list_attributes )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:163:15: MODIFY_T ^ ID time list_attributes
            {
            root_0 = (AslTree)adaptor.nil();


            MODIFY_T89=(Token)match(input,MODIFY_T,FOLLOW_MODIFY_T_in_modify_time1222); 
            MODIFY_T89_tree = 
            (AslTree)adaptor.create(MODIFY_T89)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MODIFY_T89_tree, root_0);


            ID90=(Token)match(input,ID,FOLLOW_ID_in_modify_time1225); 
            ID90_tree = 
            (AslTree)adaptor.create(ID90)
            ;
            adaptor.addChild(root_0, ID90_tree);


            pushFollow(FOLLOW_time_in_modify_time1227);
            time91=time();

            state._fsp--;

            adaptor.addChild(root_0, time91.getTree());

            pushFollow(FOLLOW_list_attributes_in_modify_time1229);
            list_attributes92=list_attributes();

            state._fsp--;

            adaptor.addChild(root_0, list_attributes92.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:166:1: modify_no_time : MODIFY ^ ID list_attributes ;
    public final AslParser.modify_no_time_return modify_no_time() throws RecognitionException {
        AslParser.modify_no_time_return retval = new AslParser.modify_no_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MODIFY93=null;
        Token ID94=null;
        AslParser.list_attributes_return list_attributes95 =null;


        AslTree MODIFY93_tree=null;
        AslTree ID94_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:166:16: ( MODIFY ^ ID list_attributes )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:166:18: MODIFY ^ ID list_attributes
            {
            root_0 = (AslTree)adaptor.nil();


            MODIFY93=(Token)match(input,MODIFY,FOLLOW_MODIFY_in_modify_no_time1246); 
            MODIFY93_tree = 
            (AslTree)adaptor.create(MODIFY93)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MODIFY93_tree, root_0);


            ID94=(Token)match(input,ID,FOLLOW_ID_in_modify_no_time1249); 
            ID94_tree = 
            (AslTree)adaptor.create(ID94)
            ;
            adaptor.addChild(root_0, ID94_tree);


            pushFollow(FOLLOW_list_attributes_in_modify_no_time1251);
            list_attributes95=list_attributes();

            state._fsp--;

            adaptor.addChild(root_0, list_attributes95.getTree());

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


    public static class parallel_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parallel"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:169:1: parallel : ( parallel_time | parallel_no_time );
    public final AslParser.parallel_return parallel() throws RecognitionException {
        AslParser.parallel_return retval = new AslParser.parallel_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.parallel_time_return parallel_time96 =null;

        AslParser.parallel_no_time_return parallel_no_time97 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:169:10: ( parallel_time | parallel_no_time )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==PARALLEL) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==93) ) {
                    alt14=2;
                }
                else if ( (LA14_1==INT) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:169:12: parallel_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_parallel_time_in_parallel1269);
                    parallel_time96=parallel_time();

                    state._fsp--;

                    adaptor.addChild(root_0, parallel_time96.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:169:28: parallel_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_parallel_no_time_in_parallel1273);
                    parallel_no_time97=parallel_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, parallel_no_time97.getTree());

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
    // $ANTLR end "parallel"


    public static class instructions_notime_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instructions_notime"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:171:1: instructions_notime : ( move_no_time | modify_no_time | show_no_time | hide_no_time );
    public final AslParser.instructions_notime_return instructions_notime() throws RecognitionException {
        AslParser.instructions_notime_return retval = new AslParser.instructions_notime_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.move_no_time_return move_no_time98 =null;

        AslParser.modify_no_time_return modify_no_time99 =null;

        AslParser.show_no_time_return show_no_time100 =null;

        AslParser.hide_no_time_return hide_no_time101 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:171:21: ( move_no_time | modify_no_time | show_no_time | hide_no_time )
            int alt15=4;
            switch ( input.LA(1) ) {
            case MOVE:
                {
                alt15=1;
                }
                break;
            case MODIFY:
                {
                alt15=2;
                }
                break;
            case SHOW:
                {
                alt15=3;
                }
                break;
            case HIDE:
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:171:23: move_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_no_time_in_instructions_notime1281);
                    move_no_time98=move_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, move_no_time98.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:171:38: modify_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_no_time_in_instructions_notime1285);
                    modify_no_time99=modify_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, modify_no_time99.getTree());

                    }
                    break;
                case 3 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:171:55: show_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_show_no_time_in_instructions_notime1289);
                    show_no_time100=show_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, show_no_time100.getTree());

                    }
                    break;
                case 4 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:171:70: hide_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_hide_no_time_in_instructions_notime1293);
                    hide_no_time101=hide_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, hide_no_time101.getTree());

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
    // $ANTLR end "instructions_notime"


    public static class block_instructions_notime_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_instructions_notime"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:173:1: block_instructions_notime : instructions_notime ';' ( instructions_notime ';' )* -> ^( LIST_INSTR ( instructions_notime )+ ) ;
    public final AslParser.block_instructions_notime_return block_instructions_notime() throws RecognitionException {
        AslParser.block_instructions_notime_return retval = new AslParser.block_instructions_notime_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal103=null;
        Token char_literal105=null;
        AslParser.instructions_notime_return instructions_notime102 =null;

        AslParser.instructions_notime_return instructions_notime104 =null;


        AslTree char_literal103_tree=null;
        AslTree char_literal105_tree=null;
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_instructions_notime=new RewriteRuleSubtreeStream(adaptor,"rule instructions_notime");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:173:26: ( instructions_notime ';' ( instructions_notime ';' )* -> ^( LIST_INSTR ( instructions_notime )+ ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:173:28: instructions_notime ';' ( instructions_notime ';' )*
            {
            pushFollow(FOLLOW_instructions_notime_in_block_instructions_notime1300);
            instructions_notime102=instructions_notime();

            state._fsp--;

            stream_instructions_notime.add(instructions_notime102.getTree());

            char_literal103=(Token)match(input,89,FOLLOW_89_in_block_instructions_notime1301);  
            stream_89.add(char_literal103);


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:173:51: ( instructions_notime ';' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==HIDE||LA16_0==MODIFY||LA16_0==MOVE||LA16_0==SHOW) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:173:53: instructions_notime ';'
            	    {
            	    pushFollow(FOLLOW_instructions_notime_in_block_instructions_notime1305);
            	    instructions_notime104=instructions_notime();

            	    state._fsp--;

            	    stream_instructions_notime.add(instructions_notime104.getTree());

            	    char_literal105=(Token)match(input,89,FOLLOW_89_in_block_instructions_notime1307);  
            	    stream_89.add(char_literal105);


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            // AST REWRITE
            // elements: instructions_notime
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 174:29: -> ^( LIST_INSTR ( instructions_notime )+ )
            {
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:174:32: ^( LIST_INSTR ( instructions_notime )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_INSTR, "LIST_INSTR")
                , root_1);

                if ( !(stream_instructions_notime.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instructions_notime.hasNext() ) {
                    adaptor.addChild(root_1, stream_instructions_notime.nextTree());

                }
                stream_instructions_notime.reset();

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
    // $ANTLR end "block_instructions_notime"


    public static class parallel_time_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parallel_time"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:176:1: parallel_time : PARALLEL ^ time '{' ! block_instructions_notime '}' !;
    public final AslParser.parallel_time_return parallel_time() throws RecognitionException {
        AslParser.parallel_time_return retval = new AslParser.parallel_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PARALLEL106=null;
        Token char_literal108=null;
        Token char_literal110=null;
        AslParser.time_return time107 =null;

        AslParser.block_instructions_notime_return block_instructions_notime109 =null;


        AslTree PARALLEL106_tree=null;
        AslTree char_literal108_tree=null;
        AslTree char_literal110_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:176:15: ( PARALLEL ^ time '{' ! block_instructions_notime '}' !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:176:17: PARALLEL ^ time '{' ! block_instructions_notime '}' !
            {
            root_0 = (AslTree)adaptor.nil();


            PARALLEL106=(Token)match(input,PARALLEL,FOLLOW_PARALLEL_in_parallel_time1354); 
            PARALLEL106_tree = 
            (AslTree)adaptor.create(PARALLEL106)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(PARALLEL106_tree, root_0);


            pushFollow(FOLLOW_time_in_parallel_time1357);
            time107=time();

            state._fsp--;

            adaptor.addChild(root_0, time107.getTree());

            char_literal108=(Token)match(input,93,FOLLOW_93_in_parallel_time1359); 

            pushFollow(FOLLOW_block_instructions_notime_in_parallel_time1362);
            block_instructions_notime109=block_instructions_notime();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions_notime109.getTree());

            char_literal110=(Token)match(input,94,FOLLOW_94_in_parallel_time1364); 

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
    // $ANTLR end "parallel_time"


    public static class instructions_time_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instructions_time"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:178:1: instructions_time : ( move_time | modify_time | show_time | hide_time );
    public final AslParser.instructions_time_return instructions_time() throws RecognitionException {
        AslParser.instructions_time_return retval = new AslParser.instructions_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.move_time_return move_time111 =null;

        AslParser.modify_time_return modify_time112 =null;

        AslParser.show_time_return show_time113 =null;

        AslParser.hide_time_return hide_time114 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:178:19: ( move_time | modify_time | show_time | hide_time )
            int alt17=4;
            switch ( input.LA(1) ) {
            case MOVE_T:
                {
                alt17=1;
                }
                break;
            case MODIFY_T:
                {
                alt17=2;
                }
                break;
            case SHOW_T:
                {
                alt17=3;
                }
                break;
            case HIDE_T:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:178:21: move_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_time_in_instructions_time1373);
                    move_time111=move_time();

                    state._fsp--;

                    adaptor.addChild(root_0, move_time111.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:178:33: modify_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_time_in_instructions_time1377);
                    modify_time112=modify_time();

                    state._fsp--;

                    adaptor.addChild(root_0, modify_time112.getTree());

                    }
                    break;
                case 3 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:178:47: show_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_show_time_in_instructions_time1381);
                    show_time113=show_time();

                    state._fsp--;

                    adaptor.addChild(root_0, show_time113.getTree());

                    }
                    break;
                case 4 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:178:59: hide_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_hide_time_in_instructions_time1385);
                    hide_time114=hide_time();

                    state._fsp--;

                    adaptor.addChild(root_0, hide_time114.getTree());

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
    // $ANTLR end "instructions_time"


    public static class block_instructions_time_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_instructions_time"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:180:1: block_instructions_time : instructions_time ';' ( instructions_time ';' )* -> ^( LIST_INSTR ( instructions_time )+ ) ;
    public final AslParser.block_instructions_time_return block_instructions_time() throws RecognitionException {
        AslParser.block_instructions_time_return retval = new AslParser.block_instructions_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal116=null;
        Token char_literal118=null;
        AslParser.instructions_time_return instructions_time115 =null;

        AslParser.instructions_time_return instructions_time117 =null;


        AslTree char_literal116_tree=null;
        AslTree char_literal118_tree=null;
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_instructions_time=new RewriteRuleSubtreeStream(adaptor,"rule instructions_time");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:180:24: ( instructions_time ';' ( instructions_time ';' )* -> ^( LIST_INSTR ( instructions_time )+ ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:180:26: instructions_time ';' ( instructions_time ';' )*
            {
            pushFollow(FOLLOW_instructions_time_in_block_instructions_time1392);
            instructions_time115=instructions_time();

            state._fsp--;

            stream_instructions_time.add(instructions_time115.getTree());

            char_literal116=(Token)match(input,89,FOLLOW_89_in_block_instructions_time1394);  
            stream_89.add(char_literal116);


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:180:48: ( instructions_time ';' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==HIDE_T||LA18_0==MODIFY_T||LA18_0==MOVE_T||LA18_0==SHOW_T) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:180:50: instructions_time ';'
            	    {
            	    pushFollow(FOLLOW_instructions_time_in_block_instructions_time1398);
            	    instructions_time117=instructions_time();

            	    state._fsp--;

            	    stream_instructions_time.add(instructions_time117.getTree());

            	    char_literal118=(Token)match(input,89,FOLLOW_89_in_block_instructions_time1399);  
            	    stream_89.add(char_literal118);


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            // AST REWRITE
            // elements: instructions_time
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 181:29: -> ^( LIST_INSTR ( instructions_time )+ )
            {
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:181:32: ^( LIST_INSTR ( instructions_time )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_INSTR, "LIST_INSTR")
                , root_1);

                if ( !(stream_instructions_time.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instructions_time.hasNext() ) {
                    adaptor.addChild(root_1, stream_instructions_time.nextTree());

                }
                stream_instructions_time.reset();

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
    // $ANTLR end "block_instructions_time"


    public static class parallel_no_time_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parallel_no_time"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:183:1: parallel_no_time : PARALLEL ^ '{' ! block_instructions_time '}' !;
    public final AslParser.parallel_no_time_return parallel_no_time() throws RecognitionException {
        AslParser.parallel_no_time_return retval = new AslParser.parallel_no_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PARALLEL119=null;
        Token char_literal120=null;
        Token char_literal122=null;
        AslParser.block_instructions_time_return block_instructions_time121 =null;


        AslTree PARALLEL119_tree=null;
        AslTree char_literal120_tree=null;
        AslTree char_literal122_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:183:18: ( PARALLEL ^ '{' ! block_instructions_time '}' !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:183:20: PARALLEL ^ '{' ! block_instructions_time '}' !
            {
            root_0 = (AslTree)adaptor.nil();


            PARALLEL119=(Token)match(input,PARALLEL,FOLLOW_PARALLEL_in_parallel_no_time1446); 
            PARALLEL119_tree = 
            (AslTree)adaptor.create(PARALLEL119)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(PARALLEL119_tree, root_0);


            char_literal120=(Token)match(input,93,FOLLOW_93_in_parallel_no_time1449); 

            pushFollow(FOLLOW_block_instructions_time_in_parallel_no_time1452);
            block_instructions_time121=block_instructions_time();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions_time121.getTree());

            char_literal122=(Token)match(input,94,FOLLOW_94_in_parallel_no_time1454); 

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
    // $ANTLR end "parallel_no_time"


    public static class list_attributes_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_attributes"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:185:1: list_attributes : '(' attribute ( ',' attribute )* ')' -> ^( LIST_ATTR ( attribute )+ ) ;
    public final AslParser.list_attributes_return list_attributes() throws RecognitionException {
        AslParser.list_attributes_return retval = new AslParser.list_attributes_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal123=null;
        Token char_literal125=null;
        Token char_literal127=null;
        AslParser.attribute_return attribute124 =null;

        AslParser.attribute_return attribute126 =null;


        AslTree char_literal123_tree=null;
        AslTree char_literal125_tree=null;
        AslTree char_literal127_tree=null;
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:185:17: ( '(' attribute ( ',' attribute )* ')' -> ^( LIST_ATTR ( attribute )+ ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:185:19: '(' attribute ( ',' attribute )* ')'
            {
            char_literal123=(Token)match(input,84,FOLLOW_84_in_list_attributes1463);  
            stream_84.add(char_literal123);


            pushFollow(FOLLOW_attribute_in_list_attributes1465);
            attribute124=attribute();

            state._fsp--;

            stream_attribute.add(attribute124.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:185:33: ( ',' attribute )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==86) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:185:34: ',' attribute
            	    {
            	    char_literal125=(Token)match(input,86,FOLLOW_86_in_list_attributes1468);  
            	    stream_86.add(char_literal125);


            	    pushFollow(FOLLOW_attribute_in_list_attributes1470);
            	    attribute126=attribute();

            	    state._fsp--;

            	    stream_attribute.add(attribute126.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            char_literal127=(Token)match(input,85,FOLLOW_85_in_list_attributes1474);  
            stream_85.add(char_literal127);


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
            // 185:54: -> ^( LIST_ATTR ( attribute )+ )
            {
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:185:57: ^( LIST_ATTR ( attribute )+ )
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:188:1: attribute : ( attribute_name_color ^ ':' ! obj_attribute | attribute_name_expr ^ ':' ! expr );
    public final AslParser.attribute_return attribute() throws RecognitionException {
        AslParser.attribute_return retval = new AslParser.attribute_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal129=null;
        Token char_literal132=null;
        AslParser.attribute_name_color_return attribute_name_color128 =null;

        AslParser.obj_attribute_return obj_attribute130 =null;

        AslParser.attribute_name_expr_return attribute_name_expr131 =null;

        AslParser.expr_return expr133 =null;


        AslTree char_literal129_tree=null;
        AslTree char_literal132_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:188:13: ( attribute_name_color ^ ':' ! obj_attribute | attribute_name_expr ^ ':' ! expr )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==COLOR||LA20_0==STROKE) ) {
                alt20=1;
            }
            else if ( ((LA20_0 >= POSX && LA20_0 <= POSY)||LA20_0==91) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:188:17: attribute_name_color ^ ':' ! obj_attribute
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_attribute_name_color_in_attribute1504);
                    attribute_name_color128=attribute_name_color();

                    state._fsp--;

                    root_0 = (AslTree)adaptor.becomeRoot(attribute_name_color128.getTree(), root_0);

                    char_literal129=(Token)match(input,88,FOLLOW_88_in_attribute1507); 

                    pushFollow(FOLLOW_obj_attribute_in_attribute1510);
                    obj_attribute130=obj_attribute();

                    state._fsp--;

                    adaptor.addChild(root_0, obj_attribute130.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:189:17: attribute_name_expr ^ ':' ! expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_attribute_name_expr_in_attribute1528);
                    attribute_name_expr131=attribute_name_expr();

                    state._fsp--;

                    root_0 = (AslTree)adaptor.becomeRoot(attribute_name_expr131.getTree(), root_0);

                    char_literal132=(Token)match(input,88,FOLLOW_88_in_attribute1531); 

                    pushFollow(FOLLOW_expr_in_attribute1534);
                    expr133=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr133.getTree());

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


    public static class obj_attribute_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "obj_attribute"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:191:1: obj_attribute : ( color | ID | ID '.' ( attribute_name_color ) -> ^( ATTR ID attribute_name_color ) );
    public final AslParser.obj_attribute_return obj_attribute() throws RecognitionException {
        AslParser.obj_attribute_return retval = new AslParser.obj_attribute_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID135=null;
        Token ID136=null;
        Token char_literal137=null;
        AslParser.color_return color134 =null;

        AslParser.attribute_name_color_return attribute_name_color138 =null;


        AslTree ID135_tree=null;
        AslTree ID136_tree=null;
        AslTree char_literal137_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_attribute_name_color=new RewriteRuleSubtreeStream(adaptor,"rule attribute_name_color");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:191:17: ( color | ID | ID '.' ( attribute_name_color ) -> ^( ATTR ID attribute_name_color ) )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0 >= BLACK && LA21_0 <= BLUE)||LA21_0==COLORHEX||LA21_0==GREEN||LA21_0==RED||(LA21_0 >= RGB && LA21_0 <= RGBPRCTJ)||LA21_0==WHITE) ) {
                alt21=1;
            }
            else if ( (LA21_0==ID) ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==87) ) {
                    alt21=3;
                }
                else if ( ((LA21_2 >= 85 && LA21_2 <= 86)) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:191:21: color
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_color_in_obj_attribute1558);
                    color134=color();

                    state._fsp--;

                    adaptor.addChild(root_0, color134.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:192:19: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID135=(Token)match(input,ID,FOLLOW_ID_in_obj_attribute1578); 
                    ID135_tree = 
                    (AslTree)adaptor.create(ID135)
                    ;
                    adaptor.addChild(root_0, ID135_tree);


                    }
                    break;
                case 3 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:193:21: ID '.' ( attribute_name_color )
                    {
                    ID136=(Token)match(input,ID,FOLLOW_ID_in_obj_attribute1600);  
                    stream_ID.add(ID136);


                    char_literal137=(Token)match(input,87,FOLLOW_87_in_obj_attribute1602);  
                    stream_87.add(char_literal137);


                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:193:28: ( attribute_name_color )
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:193:30: attribute_name_color
                    {
                    pushFollow(FOLLOW_attribute_name_color_in_obj_attribute1606);
                    attribute_name_color138=attribute_name_color();

                    state._fsp--;

                    stream_attribute_name_color.add(attribute_name_color138.getTree());

                    }


                    // AST REWRITE
                    // elements: ID, attribute_name_color
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 193:52: -> ^( ATTR ID attribute_name_color )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:193:55: ^( ATTR ID attribute_name_color )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(ATTR, "ATTR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_attribute_name_color.nextTree());

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
    // $ANTLR end "obj_attribute"


    public static class show_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "show"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:196:1: show : ( show_time | show_no_time );
    public final AslParser.show_return show() throws RecognitionException {
        AslParser.show_return retval = new AslParser.show_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.show_time_return show_time139 =null;

        AslParser.show_no_time_return show_no_time140 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:196:6: ( show_time | show_no_time )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==SHOW_T) ) {
                alt22=1;
            }
            else if ( (LA22_0==SHOW) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:196:8: show_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_show_time_in_show1642);
                    show_time139=show_time();

                    state._fsp--;

                    adaptor.addChild(root_0, show_time139.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:196:20: show_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_show_no_time_in_show1646);
                    show_no_time140=show_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, show_no_time140.getTree());

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
    // $ANTLR end "show"


    public static class show_time_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "show_time"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:198:1: show_time : SHOW_T ^ ID time ;
    public final AslParser.show_time_return show_time() throws RecognitionException {
        AslParser.show_time_return retval = new AslParser.show_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token SHOW_T141=null;
        Token ID142=null;
        AslParser.time_return time143 =null;


        AslTree SHOW_T141_tree=null;
        AslTree ID142_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:198:11: ( SHOW_T ^ ID time )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:198:13: SHOW_T ^ ID time
            {
            root_0 = (AslTree)adaptor.nil();


            SHOW_T141=(Token)match(input,SHOW_T,FOLLOW_SHOW_T_in_show_time1654); 
            SHOW_T141_tree = 
            (AslTree)adaptor.create(SHOW_T141)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(SHOW_T141_tree, root_0);


            ID142=(Token)match(input,ID,FOLLOW_ID_in_show_time1657); 
            ID142_tree = 
            (AslTree)adaptor.create(ID142)
            ;
            adaptor.addChild(root_0, ID142_tree);


            pushFollow(FOLLOW_time_in_show_time1659);
            time143=time();

            state._fsp--;

            adaptor.addChild(root_0, time143.getTree());

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
    // $ANTLR end "show_time"


    public static class show_no_time_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "show_no_time"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:200:1: show_no_time : SHOW ^ ID ;
    public final AslParser.show_no_time_return show_no_time() throws RecognitionException {
        AslParser.show_no_time_return retval = new AslParser.show_no_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token SHOW144=null;
        Token ID145=null;

        AslTree SHOW144_tree=null;
        AslTree ID145_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:200:14: ( SHOW ^ ID )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:200:17: SHOW ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            SHOW144=(Token)match(input,SHOW,FOLLOW_SHOW_in_show_no_time1668); 
            SHOW144_tree = 
            (AslTree)adaptor.create(SHOW144)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(SHOW144_tree, root_0);


            ID145=(Token)match(input,ID,FOLLOW_ID_in_show_no_time1671); 
            ID145_tree = 
            (AslTree)adaptor.create(ID145)
            ;
            adaptor.addChild(root_0, ID145_tree);


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
    // $ANTLR end "show_no_time"


    public static class hide_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hide"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:202:1: hide : ( hide_time | hide_no_time );
    public final AslParser.hide_return hide() throws RecognitionException {
        AslParser.hide_return retval = new AslParser.hide_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.hide_time_return hide_time146 =null;

        AslParser.hide_no_time_return hide_no_time147 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:202:6: ( hide_time | hide_no_time )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==HIDE_T) ) {
                alt23=1;
            }
            else if ( (LA23_0==HIDE) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:202:8: hide_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_hide_time_in_hide1679);
                    hide_time146=hide_time();

                    state._fsp--;

                    adaptor.addChild(root_0, hide_time146.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:202:20: hide_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_hide_no_time_in_hide1683);
                    hide_no_time147=hide_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, hide_no_time147.getTree());

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
    // $ANTLR end "hide"


    public static class hide_time_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hide_time"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:204:1: hide_time : HIDE_T ^ ID time ;
    public final AslParser.hide_time_return hide_time() throws RecognitionException {
        AslParser.hide_time_return retval = new AslParser.hide_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token HIDE_T148=null;
        Token ID149=null;
        AslParser.time_return time150 =null;


        AslTree HIDE_T148_tree=null;
        AslTree ID149_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:204:11: ( HIDE_T ^ ID time )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:204:13: HIDE_T ^ ID time
            {
            root_0 = (AslTree)adaptor.nil();


            HIDE_T148=(Token)match(input,HIDE_T,FOLLOW_HIDE_T_in_hide_time1691); 
            HIDE_T148_tree = 
            (AslTree)adaptor.create(HIDE_T148)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(HIDE_T148_tree, root_0);


            ID149=(Token)match(input,ID,FOLLOW_ID_in_hide_time1694); 
            ID149_tree = 
            (AslTree)adaptor.create(ID149)
            ;
            adaptor.addChild(root_0, ID149_tree);


            pushFollow(FOLLOW_time_in_hide_time1696);
            time150=time();

            state._fsp--;

            adaptor.addChild(root_0, time150.getTree());

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
    // $ANTLR end "hide_time"


    public static class hide_no_time_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hide_no_time"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:206:1: hide_no_time : HIDE ^ ID ;
    public final AslParser.hide_no_time_return hide_no_time() throws RecognitionException {
        AslParser.hide_no_time_return retval = new AslParser.hide_no_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token HIDE151=null;
        Token ID152=null;

        AslTree HIDE151_tree=null;
        AslTree ID152_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:206:14: ( HIDE ^ ID )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:206:17: HIDE ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            HIDE151=(Token)match(input,HIDE,FOLLOW_HIDE_in_hide_no_time1705); 
            HIDE151_tree = 
            (AslTree)adaptor.create(HIDE151)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(HIDE151_tree, root_0);


            ID152=(Token)match(input,ID,FOLLOW_ID_in_hide_no_time1708); 
            ID152_tree = 
            (AslTree)adaptor.create(ID152)
            ;
            adaptor.addChild(root_0, ID152_tree);


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
    // $ANTLR end "hide_no_time"


    public static class delay_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "delay"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:208:1: delay : DELAY ^ time ;
    public final AslParser.delay_return delay() throws RecognitionException {
        AslParser.delay_return retval = new AslParser.delay_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token DELAY153=null;
        AslParser.time_return time154 =null;


        AslTree DELAY153_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:208:6: ( DELAY ^ time )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:208:8: DELAY ^ time
            {
            root_0 = (AslTree)adaptor.nil();


            DELAY153=(Token)match(input,DELAY,FOLLOW_DELAY_in_delay1715); 
            DELAY153_tree = 
            (AslTree)adaptor.create(DELAY153)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(DELAY153_tree, root_0);


            pushFollow(FOLLOW_time_in_delay1718);
            time154=time();

            state._fsp--;

            adaptor.addChild(root_0, time154.getTree());

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
    // $ANTLR end "delay"


    public static class attribute_name_color_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute_name_color"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:210:1: attribute_name_color : ( COLOR | STROKE );
    public final AslParser.attribute_name_color_return attribute_name_color() throws RecognitionException {
        AslParser.attribute_name_color_return retval = new AslParser.attribute_name_color_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set155=null;

        AslTree set155_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:210:25: ( COLOR | STROKE )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set155=(Token)input.LT(1);

            if ( input.LA(1)==COLOR||input.LA(1)==STROKE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set155)
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
    // $ANTLR end "attribute_name_color"


    public static class attribute_name_expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute_name_expr"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:214:1: attribute_name_expr : ( POSX | POSY | 'r' );
    public final AslParser.attribute_name_expr_return attribute_name_expr() throws RecognitionException {
        AslParser.attribute_name_expr_return retval = new AslParser.attribute_name_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set156=null;

        AslTree set156_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:214:21: ( POSX | POSY | 'r' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set156=(Token)input.LT(1);

            if ( (input.LA(1) >= POSX && input.LA(1) <= POSY)||input.LA(1)==91 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set156)
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:219:1: color : ( COLORHEX -> ^( COLORHEXA COLORHEX ) | RGB '(' expr ',' expr ',' expr ')' -> ^( COLORINT expr expr expr ) | RGBPRCTJ '(' expr ',' expr ',' expr ')' -> ^( COLORPRCTJ expr expr expr ) | color_keyword -> ^( COLORKEYWORD color_keyword ) );
    public final AslParser.color_return color() throws RecognitionException {
        AslParser.color_return retval = new AslParser.color_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token COLORHEX157=null;
        Token RGB158=null;
        Token char_literal159=null;
        Token char_literal161=null;
        Token char_literal163=null;
        Token char_literal165=null;
        Token RGBPRCTJ166=null;
        Token char_literal167=null;
        Token char_literal169=null;
        Token char_literal171=null;
        Token char_literal173=null;
        AslParser.expr_return expr160 =null;

        AslParser.expr_return expr162 =null;

        AslParser.expr_return expr164 =null;

        AslParser.expr_return expr168 =null;

        AslParser.expr_return expr170 =null;

        AslParser.expr_return expr172 =null;

        AslParser.color_keyword_return color_keyword174 =null;


        AslTree COLORHEX157_tree=null;
        AslTree RGB158_tree=null;
        AslTree char_literal159_tree=null;
        AslTree char_literal161_tree=null;
        AslTree char_literal163_tree=null;
        AslTree char_literal165_tree=null;
        AslTree RGBPRCTJ166_tree=null;
        AslTree char_literal167_tree=null;
        AslTree char_literal169_tree=null;
        AslTree char_literal171_tree=null;
        AslTree char_literal173_tree=null;
        RewriteRuleTokenStream stream_COLORHEX=new RewriteRuleTokenStream(adaptor,"token COLORHEX");
        RewriteRuleTokenStream stream_RGBPRCTJ=new RewriteRuleTokenStream(adaptor,"token RGBPRCTJ");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_RGB=new RewriteRuleTokenStream(adaptor,"token RGB");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_color_keyword=new RewriteRuleSubtreeStream(adaptor,"rule color_keyword");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:219:9: ( COLORHEX -> ^( COLORHEXA COLORHEX ) | RGB '(' expr ',' expr ',' expr ')' -> ^( COLORINT expr expr expr ) | RGBPRCTJ '(' expr ',' expr ',' expr ')' -> ^( COLORPRCTJ expr expr expr ) | color_keyword -> ^( COLORKEYWORD color_keyword ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case COLORHEX:
                {
                alt24=1;
                }
                break;
            case RGB:
                {
                alt24=2;
                }
                break;
            case RGBPRCTJ:
                {
                alt24=3;
                }
                break;
            case BLACK:
            case BLUE:
            case GREEN:
            case RED:
            case WHITE:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:219:13: COLORHEX
                    {
                    COLORHEX157=(Token)match(input,COLORHEX,FOLLOW_COLORHEX_in_color1853);  
                    stream_COLORHEX.add(COLORHEX157);


                    // AST REWRITE
                    // elements: COLORHEX
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 219:22: -> ^( COLORHEXA COLORHEX )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:219:25: ^( COLORHEXA COLORHEX )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(COLORHEXA, "COLORHEXA")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_COLORHEX.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:220:13: RGB '(' expr ',' expr ',' expr ')'
                    {
                    RGB158=(Token)match(input,RGB,FOLLOW_RGB_in_color1875);  
                    stream_RGB.add(RGB158);


                    char_literal159=(Token)match(input,84,FOLLOW_84_in_color1877);  
                    stream_84.add(char_literal159);


                    pushFollow(FOLLOW_expr_in_color1879);
                    expr160=expr();

                    state._fsp--;

                    stream_expr.add(expr160.getTree());

                    char_literal161=(Token)match(input,86,FOLLOW_86_in_color1881);  
                    stream_86.add(char_literal161);


                    pushFollow(FOLLOW_expr_in_color1883);
                    expr162=expr();

                    state._fsp--;

                    stream_expr.add(expr162.getTree());

                    char_literal163=(Token)match(input,86,FOLLOW_86_in_color1885);  
                    stream_86.add(char_literal163);


                    pushFollow(FOLLOW_expr_in_color1887);
                    expr164=expr();

                    state._fsp--;

                    stream_expr.add(expr164.getTree());

                    char_literal165=(Token)match(input,85,FOLLOW_85_in_color1889);  
                    stream_85.add(char_literal165);


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
                    // 220:48: -> ^( COLORINT expr expr expr )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:220:51: ^( COLORINT expr expr expr )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:221:13: RGBPRCTJ '(' expr ',' expr ',' expr ')'
                    {
                    RGBPRCTJ166=(Token)match(input,RGBPRCTJ,FOLLOW_RGBPRCTJ_in_color1915);  
                    stream_RGBPRCTJ.add(RGBPRCTJ166);


                    char_literal167=(Token)match(input,84,FOLLOW_84_in_color1917);  
                    stream_84.add(char_literal167);


                    pushFollow(FOLLOW_expr_in_color1919);
                    expr168=expr();

                    state._fsp--;

                    stream_expr.add(expr168.getTree());

                    char_literal169=(Token)match(input,86,FOLLOW_86_in_color1921);  
                    stream_86.add(char_literal169);


                    pushFollow(FOLLOW_expr_in_color1923);
                    expr170=expr();

                    state._fsp--;

                    stream_expr.add(expr170.getTree());

                    char_literal171=(Token)match(input,86,FOLLOW_86_in_color1925);  
                    stream_86.add(char_literal171);


                    pushFollow(FOLLOW_expr_in_color1927);
                    expr172=expr();

                    state._fsp--;

                    stream_expr.add(expr172.getTree());

                    char_literal173=(Token)match(input,85,FOLLOW_85_in_color1929);  
                    stream_85.add(char_literal173);


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
                    // 221:53: -> ^( COLORPRCTJ expr expr expr )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:221:56: ^( COLORPRCTJ expr expr expr )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:222:13: color_keyword
                    {
                    pushFollow(FOLLOW_color_keyword_in_color1955);
                    color_keyword174=color_keyword();

                    state._fsp--;

                    stream_color_keyword.add(color_keyword174.getTree());

                    // AST REWRITE
                    // elements: color_keyword
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 222:27: -> ^( COLORKEYWORD color_keyword )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:222:30: ^( COLORKEYWORD color_keyword )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(COLORKEYWORD, "COLORKEYWORD")
                        , root_1);

                        adaptor.addChild(root_1, stream_color_keyword.nextTree());

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
    // $ANTLR end "color"


    public static class color_keyword_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "color_keyword"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:225:1: color_keyword : ( RED | WHITE | BLACK | BLUE | GREEN );
    public final AslParser.color_keyword_return color_keyword() throws RecognitionException {
        AslParser.color_keyword_return retval = new AslParser.color_keyword_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set175=null;

        AslTree set175_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:225:15: ( RED | WHITE | BLACK | BLUE | GREEN )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set175=(Token)input.LT(1);

            if ( (input.LA(1) >= BLACK && input.LA(1) <= BLUE)||input.LA(1)==GREEN||input.LA(1)==RED||input.LA(1)==WHITE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set175)
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:227:1: obj_type : ( CIRCLE | RECTANGLE | TEXT );
    public final AslParser.obj_type_return obj_type() throws RecognitionException {
        AslParser.obj_type_return retval = new AslParser.obj_type_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set176=null;

        AslTree set176_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:227:10: ( CIRCLE | RECTANGLE | TEXT )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set176=(Token)input.LT(1);

            if ( input.LA(1)==CIRCLE||input.LA(1)==RECTANGLE||input.LA(1)==TEXT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set176)
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:230:1: time : INT ( 's' | 'ms' ) ^;
    public final AslParser.time_return time() throws RecognitionException {
        AslParser.time_return retval = new AslParser.time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token INT177=null;
        Token set178=null;

        AslTree INT177_tree=null;
        AslTree set178_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:230:6: ( INT ( 's' | 'ms' ) ^)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:230:9: INT ( 's' | 'ms' ) ^
            {
            root_0 = (AslTree)adaptor.nil();


            INT177=(Token)match(input,INT,FOLLOW_INT_in_time2031); 
            INT177_tree = 
            (AslTree)adaptor.create(INT177)
            ;
            adaptor.addChild(root_0, INT177_tree);


            set178=(Token)input.LT(1);

            set178=(Token)input.LT(1);

            if ( input.LA(1)==90||input.LA(1)==92 ) {
                input.consume();
                root_0 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(set178)
                , root_0);
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
    // $ANTLR end "time"


    public static class expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:233:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR180=null;
        AslParser.boolterm_return boolterm179 =null;

        AslParser.boolterm_return boolterm181 =null;


        AslTree OR180_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:233:9: ( boolterm ( OR ^ boolterm )* )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:233:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr2053);
            boolterm179=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm179.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:233:22: ( OR ^ boolterm )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==OR) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:233:23: OR ^ boolterm
            	    {
            	    OR180=(Token)match(input,OR,FOLLOW_OR_in_expr2056); 
            	    OR180_tree = 
            	    (AslTree)adaptor.create(OR180)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR180_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr2059);
            	    boolterm181=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm181.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:236:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND183=null;
        AslParser.boolfact_return boolfact182 =null;

        AslParser.boolfact_return boolfact184 =null;


        AslTree AND183_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:236:9: ( boolfact ( AND ^ boolfact )* )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:236:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm2079);
            boolfact182=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact182.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:236:22: ( AND ^ boolfact )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==AND) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:236:23: AND ^ boolfact
            	    {
            	    AND183=(Token)match(input,AND,FOLLOW_AND_in_boolterm2082); 
            	    AND183_tree = 
            	    (AslTree)adaptor.create(AND183)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND183_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm2085);
            	    boolfact184=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact184.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:239:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL186=null;
        Token NOT_EQUAL187=null;
        Token LT188=null;
        Token LE189=null;
        Token GT190=null;
        Token GE191=null;
        AslParser.num_expr_return num_expr185 =null;

        AslParser.num_expr_return num_expr192 =null;


        AslTree EQUAL186_tree=null;
        AslTree NOT_EQUAL187_tree=null;
        AslTree LT188_tree=null;
        AslTree LE189_tree=null;
        AslTree GT190_tree=null;
        AslTree GE191_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:239:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:239:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact2105);
            num_expr185=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr185.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:239:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==EQUAL||LA28_0==GE||LA28_0==GT||LA28_0==LE||LA28_0==LT||LA28_0==NOT_EQUAL) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:239:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:239:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt27=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt27=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt27=2;
                        }
                        break;
                    case LT:
                        {
                        alt27=3;
                        }
                        break;
                    case LE:
                        {
                        alt27=4;
                        }
                        break;
                    case GT:
                        {
                        alt27=5;
                        }
                        break;
                    case GE:
                        {
                        alt27=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;

                    }

                    switch (alt27) {
                        case 1 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:239:24: EQUAL ^
                            {
                            EQUAL186=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact2109); 
                            EQUAL186_tree = 
                            (AslTree)adaptor.create(EQUAL186)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL186_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:239:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL187=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact2114); 
                            NOT_EQUAL187_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL187)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL187_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:239:46: LT ^
                            {
                            LT188=(Token)match(input,LT,FOLLOW_LT_in_boolfact2119); 
                            LT188_tree = 
                            (AslTree)adaptor.create(LT188)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT188_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:239:52: LE ^
                            {
                            LE189=(Token)match(input,LE,FOLLOW_LE_in_boolfact2124); 
                            LE189_tree = 
                            (AslTree)adaptor.create(LE189)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE189_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:239:58: GT ^
                            {
                            GT190=(Token)match(input,GT,FOLLOW_GT_in_boolfact2129); 
                            GT190_tree = 
                            (AslTree)adaptor.create(GT190)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT190_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:239:64: GE ^
                            {
                            GE191=(Token)match(input,GE,FOLLOW_GE_in_boolfact2134); 
                            GE191_tree = 
                            (AslTree)adaptor.create(GE191)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE191_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact2138);
                    num_expr192=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr192.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:242:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS194=null;
        Token MINUS195=null;
        AslParser.term_return term193 =null;

        AslParser.term_return term196 =null;


        AslTree PLUS194_tree=null;
        AslTree MINUS195_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:242:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:242:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr2158);
            term193=term();

            state._fsp--;

            adaptor.addChild(root_0, term193.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:242:18: ( ( PLUS ^| MINUS ^) term )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==MINUS||LA30_0==PLUS) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:242:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:242:20: ( PLUS ^| MINUS ^)
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==PLUS) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==MINUS) ) {
            	        alt29=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:242:21: PLUS ^
            	            {
            	            PLUS194=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr2163); 
            	            PLUS194_tree = 
            	            (AslTree)adaptor.create(PLUS194)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS194_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:242:29: MINUS ^
            	            {
            	            MINUS195=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr2168); 
            	            MINUS195_tree = 
            	            (AslTree)adaptor.create(MINUS195)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS195_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr2172);
            	    term196=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term196.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:245:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL198=null;
        Token DIV199=null;
        Token MOD200=null;
        AslParser.factor_return factor197 =null;

        AslParser.factor_return factor201 =null;


        AslTree MUL198_tree=null;
        AslTree DIV199_tree=null;
        AslTree MOD200_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:245:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:245:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term2196);
            factor197=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor197.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:245:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==DIV||LA32_0==MOD||LA32_0==MUL) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:245:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:245:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt31=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt31=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt31=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt31=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt31) {
            	        case 1 :
            	            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:245:23: MUL ^
            	            {
            	            MUL198=(Token)match(input,MUL,FOLLOW_MUL_in_term2201); 
            	            MUL198_tree = 
            	            (AslTree)adaptor.create(MUL198)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL198_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:245:30: DIV ^
            	            {
            	            DIV199=(Token)match(input,DIV,FOLLOW_DIV_in_term2206); 
            	            DIV199_tree = 
            	            (AslTree)adaptor.create(DIV199)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV199_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:245:37: MOD ^
            	            {
            	            MOD200=(Token)match(input,MOD,FOLLOW_MOD_in_term2211); 
            	            MOD200_tree = 
            	            (AslTree)adaptor.create(MOD200)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD200_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term2215);
            	    factor201=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor201.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:248:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT202=null;
        Token PLUS203=null;
        Token MINUS204=null;
        AslParser.atom_return atom205 =null;


        AslTree NOT202_tree=null;
        AslTree PLUS203_tree=null;
        AslTree MINUS204_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:248:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:248:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:248:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt33=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt33=1;
                    }
                    break;
                case PLUS:
                    {
                    alt33=2;
                    }
                    break;
                case MINUS:
                    {
                    alt33=3;
                    }
                    break;
            }

            switch (alt33) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:248:14: NOT ^
                    {
                    NOT202=(Token)match(input,NOT,FOLLOW_NOT_in_factor2238); 
                    NOT202_tree = 
                    (AslTree)adaptor.create(NOT202)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT202_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:248:21: PLUS ^
                    {
                    PLUS203=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor2243); 
                    PLUS203_tree = 
                    (AslTree)adaptor.create(PLUS203)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS203_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:248:29: MINUS ^
                    {
                    MINUS204=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor2248); 
                    MINUS204_tree = 
                    (AslTree)adaptor.create(MINUS204)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS204_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor2253);
            atom205=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom205.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:254:1: atom : ( ID | INT | ID '.' ( attribute_name_expr ) -> ^( ATTR ID attribute_name_expr ) | ID '.' ( attribute_name_color ) -> ^( ATTR ID attribute_name_color ) | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID206=null;
        Token INT207=null;
        Token ID208=null;
        Token char_literal209=null;
        Token ID211=null;
        Token char_literal212=null;
        Token char_literal215=null;
        Token char_literal217=null;
        AslParser.attribute_name_expr_return attribute_name_expr210 =null;

        AslParser.attribute_name_color_return attribute_name_color213 =null;

        AslParser.funcall_return funcall214 =null;

        AslParser.expr_return expr216 =null;


        AslTree b_tree=null;
        AslTree ID206_tree=null;
        AslTree INT207_tree=null;
        AslTree ID208_tree=null;
        AslTree char_literal209_tree=null;
        AslTree ID211_tree=null;
        AslTree char_literal212_tree=null;
        AslTree char_literal215_tree=null;
        AslTree char_literal217_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_attribute_name_expr=new RewriteRuleSubtreeStream(adaptor,"rule attribute_name_expr");
        RewriteRuleSubtreeStream stream_attribute_name_color=new RewriteRuleSubtreeStream(adaptor,"rule attribute_name_color");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:254:9: ( ID | INT | ID '.' ( attribute_name_expr ) -> ^( ATTR ID attribute_name_expr ) | ID '.' ( attribute_name_color ) -> ^( ATTR ID attribute_name_color ) | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt35=7;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 87:
                    {
                    int LA35_5 = input.LA(3);

                    if ( ((LA35_5 >= POSX && LA35_5 <= POSY)||LA35_5==91) ) {
                        alt35=3;
                    }
                    else if ( (LA35_5==COLOR||LA35_5==STROKE) ) {
                        alt35=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 5, input);

                        throw nvae;

                    }
                    }
                    break;
                case 84:
                    {
                    alt35=6;
                    }
                    break;
                case AND:
                case DIV:
                case DO:
                case EQUAL:
                case GE:
                case GT:
                case LE:
                case LT:
                case MINUS:
                case MOD:
                case MUL:
                case NOT_EQUAL:
                case OR:
                case PLUS:
                case THEN:
                case 85:
                case 86:
                case 89:
                    {
                    alt35=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;

                }

                }
                break;
            case INT:
                {
                alt35=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt35=5;
                }
                break;
            case 84:
                {
                alt35=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }

            switch (alt35) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:254:13: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID206=(Token)match(input,ID,FOLLOW_ID_in_atom2278); 
                    ID206_tree = 
                    (AslTree)adaptor.create(ID206)
                    ;
                    adaptor.addChild(root_0, ID206_tree);


                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:255:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT207=(Token)match(input,INT,FOLLOW_INT_in_atom2293); 
                    INT207_tree = 
                    (AslTree)adaptor.create(INT207)
                    ;
                    adaptor.addChild(root_0, INT207_tree);


                    }
                    break;
                case 3 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:256:13: ID '.' ( attribute_name_expr )
                    {
                    ID208=(Token)match(input,ID,FOLLOW_ID_in_atom2307);  
                    stream_ID.add(ID208);


                    char_literal209=(Token)match(input,87,FOLLOW_87_in_atom2309);  
                    stream_87.add(char_literal209);


                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:256:20: ( attribute_name_expr )
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:256:21: attribute_name_expr
                    {
                    pushFollow(FOLLOW_attribute_name_expr_in_atom2312);
                    attribute_name_expr210=attribute_name_expr();

                    state._fsp--;

                    stream_attribute_name_expr.add(attribute_name_expr210.getTree());

                    }


                    // AST REWRITE
                    // elements: ID, attribute_name_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 256:42: -> ^( ATTR ID attribute_name_expr )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:256:45: ^( ATTR ID attribute_name_expr )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(ATTR, "ATTR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_attribute_name_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:257:13: ID '.' ( attribute_name_color )
                    {
                    ID211=(Token)match(input,ID,FOLLOW_ID_in_atom2338);  
                    stream_ID.add(ID211);


                    char_literal212=(Token)match(input,87,FOLLOW_87_in_atom2340);  
                    stream_87.add(char_literal212);


                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:257:20: ( attribute_name_color )
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:257:22: attribute_name_color
                    {
                    pushFollow(FOLLOW_attribute_name_color_in_atom2344);
                    attribute_name_color213=attribute_name_color();

                    state._fsp--;

                    stream_attribute_name_color.add(attribute_name_color213.getTree());

                    }


                    // AST REWRITE
                    // elements: attribute_name_color, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 257:44: -> ^( ATTR ID attribute_name_color )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:257:47: ^( ATTR ID attribute_name_color )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(ATTR, "ATTR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_attribute_name_color.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:258:13: (b= TRUE |b= FALSE )
                    {
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:258:13: (b= TRUE |b= FALSE )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==TRUE) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==FALSE) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;

                    }
                    switch (alt34) {
                        case 1 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:258:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom2372);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:258:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom2378);  
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
                    // 258:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:258:36: ^( BOOLEAN[$b,$b.text] )
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
                case 6 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:259:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom2401);
                    funcall214=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall214.getTree());

                    }
                    break;
                case 7 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:260:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal215=(Token)match(input,84,FOLLOW_84_in_atom2415); 

                    pushFollow(FOLLOW_expr_in_atom2418);
                    expr216=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr216.getTree());

                    char_literal217=(Token)match(input,85,FOLLOW_85_in_atom2420); 

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:264:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID218=null;
        Token char_literal219=null;
        Token char_literal221=null;
        AslParser.expr_list_return expr_list220 =null;


        AslTree ID218_tree=null;
        AslTree char_literal219_tree=null;
        AslTree char_literal221_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:264:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:264:13: ID '(' ( expr_list )? ')'
            {
            ID218=(Token)match(input,ID,FOLLOW_ID_in_funcall2441);  
            stream_ID.add(ID218);


            char_literal219=(Token)match(input,84,FOLLOW_84_in_funcall2443);  
            stream_84.add(char_literal219);


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:264:20: ( expr_list )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==FALSE||LA36_0==ID||LA36_0==INT||LA36_0==MINUS||LA36_0==NOT||LA36_0==PLUS||LA36_0==TRUE||LA36_0==84) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:264:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall2445);
                    expr_list220=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list220.getTree());

                    }
                    break;

            }


            char_literal221=(Token)match(input,85,FOLLOW_85_in_funcall2448);  
            stream_85.add(char_literal221);


            // AST REWRITE
            // elements: ID, expr_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 264:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:264:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:264:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:264:61: ( expr_list )?
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:268:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal223=null;
        AslParser.expr_return expr222 =null;

        AslParser.expr_return expr224 =null;


        AslTree char_literal223_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:268:10: ( expr ( ',' ! expr )* )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:268:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list2481);
            expr222=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr222.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:268:18: ( ',' ! expr )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==86) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:268:19: ',' ! expr
            	    {
            	    char_literal223=(Token)match(input,86,FOLLOW_86_in_expr_list2484); 

            	    pushFollow(FOLLOW_expr_in_expr_list2487);
            	    expr224=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr224.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
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


 

    public static final BitSet FOLLOW_func_in_prog208 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_EOF_in_prog211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func253 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_func256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_params_in_func258 = new BitSet(new long[]{0x0878078000380000L,0x0000000002028324L});
    public static final BitSet FOLLOW_block_instructions_in_func260 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_params282 = new BitSet(new long[]{0x0000020000000000L,0x0000000000280000L});
    public static final BitSet FOLLOW_paramlist_in_params284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_params287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist313 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_paramlist316 = new BitSet(new long[]{0x0000020000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_param_in_paramlist319 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_83_in_param344 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_param348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions410 = new BitSet(new long[]{0x0878078000380002L,0x0000000002028324L});
    public static final BitSet FOLLOW_instruction_spc_in_instruction451 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_instruction453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instructions_brack_in_instruction459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction_spc478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction_spc502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction_spc524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction_spc544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction_spc567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction_spc586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction_spc612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_in_instruction_spc637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destroy_in_instruction_spc661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_in_instruction_spc684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_in_instruction_spc710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_show_in_instruction_spc738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hide_in_instruction_spc752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delay_in_instruction_spc766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parallel_in_instructions_brack812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign824 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EEQUAL_in_assign828 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_expr_in_assign830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt863 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt868 = new BitSet(new long[]{0x0878078000380000L,0x0000000002028324L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt871 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt874 = new BitSet(new long[]{0x0878078000380000L,0x0000000002028324L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt877 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt907 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_expr_in_while_stmt910 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_DO_in_while_stmt912 = new BitSet(new long[]{0x0878078000380000L,0x0000000002028324L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt915 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt942 = new BitSet(new long[]{0x21020A0080000002L,0x0000000000104000L});
    public static final BitSet FOLLOW_expr_in_return_stmt945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read969 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_read972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write994 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104400L});
    public static final BitSet FOLLOW_expr_in_write998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create1026 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_create1029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_create1031 = new BitSet(new long[]{0x0000000000000800L,0x0000000000001008L});
    public static final BitSet FOLLOW_obj_type_in_create1034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_create1036 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_expr_in_create1039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_create1041 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_expr_in_create1044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_86_in_create1047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_list_attributes_in_create1050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_create1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTROY_in_destroy1074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_destroy1077 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_destroy1080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_destroy1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_time_in_move1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_no_time_in_move1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_T_in_move_time1126 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_move_time1129 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_time_in_move_time1132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_move_time1134 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_expr_in_move_time1137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_move_time1139 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_expr_in_move_time1142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_move_time1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_move_no_time1163 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_move_no_time1166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_move_no_time1168 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_expr_in_move_no_time1171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_move_no_time1173 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_expr_in_move_no_time1176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_move_no_time1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_time_in_modify1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_no_time_in_modify1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODIFY_T_in_modify_time1222 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_modify_time1225 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_time_in_modify_time1227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_list_attributes_in_modify_time1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODIFY_in_modify_no_time1246 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_modify_no_time1249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_list_attributes_in_modify_no_time1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parallel_time_in_parallel1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parallel_no_time_in_parallel1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_no_time_in_instructions_notime1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_no_time_in_instructions_notime1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_show_no_time_in_instructions_notime1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hide_no_time_in_instructions_notime1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instructions_notime_in_block_instructions_notime1300 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_block_instructions_notime1301 = new BitSet(new long[]{0x0028008000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_instructions_notime_in_block_instructions_notime1305 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_block_instructions_notime1307 = new BitSet(new long[]{0x0028008000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_PARALLEL_in_parallel_time1354 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_time_in_parallel_time1357 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_parallel_time1359 = new BitSet(new long[]{0x0028008000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_block_instructions_notime_in_parallel_time1362 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_parallel_time1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_time_in_instructions_time1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_time_in_instructions_time1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_show_time_in_instructions_time1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hide_time_in_instructions_time1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instructions_time_in_block_instructions_time1392 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_block_instructions_time1394 = new BitSet(new long[]{0x0050010000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_instructions_time_in_block_instructions_time1398 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_block_instructions_time1399 = new BitSet(new long[]{0x0050010000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_PARALLEL_in_parallel_no_time1446 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_parallel_no_time1449 = new BitSet(new long[]{0x0050010000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_block_instructions_time_in_parallel_no_time1452 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_parallel_no_time1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_list_attributes1463 = new BitSet(new long[]{0xC000000000001000L,0x0000000008000800L});
    public static final BitSet FOLLOW_attribute_in_list_attributes1465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_86_in_list_attributes1468 = new BitSet(new long[]{0xC000000000001000L,0x0000000008000800L});
    public static final BitSet FOLLOW_attribute_in_list_attributes1470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_85_in_list_attributes1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_name_color_in_attribute1504 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_attribute1507 = new BitSet(new long[]{0x0000020800002300L,0x00000000000100D0L});
    public static final BitSet FOLLOW_obj_attribute_in_attribute1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_name_expr_in_attribute1528 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_attribute1531 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_expr_in_attribute1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_color_in_obj_attribute1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_obj_attribute1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_obj_attribute1600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_obj_attribute1602 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000800L});
    public static final BitSet FOLLOW_attribute_name_color_in_obj_attribute1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_show_time_in_show1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_show_no_time_in_show1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_T_in_show_time1654 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_show_time1657 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_time_in_show_time1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_show_no_time1668 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_show_no_time1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hide_time_in_hide1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hide_no_time_in_hide1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HIDE_T_in_hide_time1691 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_hide_time1694 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_time_in_hide_time1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HIDE_in_hide_no_time1705 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_hide_no_time1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELAY_in_delay1715 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_time_in_delay1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLORHEX_in_color1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RGB_in_color1875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_color1877 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_expr_in_color1879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_color1881 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_expr_in_color1883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_color1885 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_expr_in_color1887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_color1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RGBPRCTJ_in_color1915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_color1917 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_expr_in_color1919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_color1921 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_expr_in_color1923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_color1925 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_expr_in_color1927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_color1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_color_keyword_in_color1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_time2031 = new BitSet(new long[]{0x0000000000000000L,0x0000000014000000L});
    public static final BitSet FOLLOW_set_in_time2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr2053 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_OR_in_expr2056 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_boolterm_in_expr2059 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm2079 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm2082 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm2085 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact2105 = new BitSet(new long[]{0x0201101420000002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact2109 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact2114 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_LT_in_boolfact2119 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_LE_in_boolfact2124 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_GT_in_boolfact2129 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_GE_in_boolfact2134 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr2158 = new BitSet(new long[]{0x2002000000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr2163 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr2168 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_term_in_num_expr2172 = new BitSet(new long[]{0x2002000000000002L});
    public static final BitSet FOLLOW_factor_in_term2196 = new BitSet(new long[]{0x0084000000400002L});
    public static final BitSet FOLLOW_MUL_in_term2201 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_DIV_in_term2206 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_MOD_in_term2211 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_factor_in_term2215 = new BitSet(new long[]{0x0084000000400002L});
    public static final BitSet FOLLOW_NOT_in_factor2238 = new BitSet(new long[]{0x00000A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_PLUS_in_factor2243 = new BitSet(new long[]{0x00000A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_MINUS_in_factor2248 = new BitSet(new long[]{0x00000A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_atom_in_factor2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom2307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_atom2309 = new BitSet(new long[]{0xC000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_attribute_name_expr_in_atom2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom2338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_atom2340 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000800L});
    public static final BitSet FOLLOW_attribute_name_color_in_atom2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_atom2415 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_expr_in_atom2418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_atom2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall2441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_funcall2443 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000304000L});
    public static final BitSet FOLLOW_expr_list_in_funcall2445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_funcall2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list2481 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_expr_list2484 = new BitSet(new long[]{0x21020A0080000000L,0x0000000000104000L});
    public static final BitSet FOLLOW_expr_in_expr_list2487 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});

}