// $ANTLR 3.4 /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g 2016-05-26 11:40:24

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "ATTR", "BLACK", "BLOCK", "BLUE", "BOOLEAN", "CIRCLE", "COLOR", "COLORHEX", "COLORHEXA", "COLORINT", "COLORKEYWORD", "COLORPRCTJ", "COMMENT", "CREATE", "DELAY", "DESTROY", "DIV", "DO", "EEQUAL", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GREEN", "GT", "HASHTAG", "HEXADIGIT", "HIDE", "HIDE_T", "ID", "IF", "INT", "LE", "LIST_ATTR", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MODIFY", "MODIFY_T", "MOVE", "MOVE_T", "MUL", "NOT", "NOT_EQUAL", "OR", "PARALLEL", "PARAMS", "PLUS", "POSX", "POSY", "PREF", "PVALUE", "READ", "RECTANGLE", "RED", "RETURN", "RGB", "RGBPRCTJ", "SHOW", "SHOW_T", "STRING", "STROKE", "TEXT", "THEN", "TRUE", "WHILE", "WHITE", "WRITE", "WS", "'&'", "'('", "')'", "','", "'.'", "':'", "';'", "'ms'", "'r'", "'s'", "'{'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int T__95=95;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ASSIGN=6;
    public static final int ATTR=7;
    public static final int BLACK=8;
    public static final int BLOCK=9;
    public static final int BLUE=10;
    public static final int BOOLEAN=11;
    public static final int CIRCLE=12;
    public static final int COLOR=13;
    public static final int COLORHEX=14;
    public static final int COLORHEXA=15;
    public static final int COLORINT=16;
    public static final int COLORKEYWORD=17;
    public static final int COLORPRCTJ=18;
    public static final int COMMENT=19;
    public static final int CREATE=20;
    public static final int DELAY=21;
    public static final int DESTROY=22;
    public static final int DIV=23;
    public static final int DO=24;
    public static final int EEQUAL=25;
    public static final int ELSE=26;
    public static final int ENDFUNC=27;
    public static final int ENDIF=28;
    public static final int ENDWHILE=29;
    public static final int EQUAL=30;
    public static final int ESC_SEQ=31;
    public static final int FALSE=32;
    public static final int FUNC=33;
    public static final int FUNCALL=34;
    public static final int GE=35;
    public static final int GREEN=36;
    public static final int GT=37;
    public static final int HASHTAG=38;
    public static final int HEXADIGIT=39;
    public static final int HIDE=40;
    public static final int HIDE_T=41;
    public static final int ID=42;
    public static final int IF=43;
    public static final int INT=44;
    public static final int LE=45;
    public static final int LIST_ATTR=46;
    public static final int LIST_FUNCTIONS=47;
    public static final int LIST_INSTR=48;
    public static final int LT=49;
    public static final int MINUS=50;
    public static final int MOD=51;
    public static final int MODIFY=52;
    public static final int MODIFY_T=53;
    public static final int MOVE=54;
    public static final int MOVE_T=55;
    public static final int MUL=56;
    public static final int NOT=57;
    public static final int NOT_EQUAL=58;
    public static final int OR=59;
    public static final int PARALLEL=60;
    public static final int PARAMS=61;
    public static final int PLUS=62;
    public static final int POSX=63;
    public static final int POSY=64;
    public static final int PREF=65;
    public static final int PVALUE=66;
    public static final int READ=67;
    public static final int RECTANGLE=68;
    public static final int RED=69;
    public static final int RETURN=70;
    public static final int RGB=71;
    public static final int RGBPRCTJ=72;
    public static final int SHOW=73;
    public static final int SHOW_T=74;
    public static final int STRING=75;
    public static final int STROKE=76;
    public static final int TEXT=77;
    public static final int THEN=78;
    public static final int TRUE=79;
    public static final int WHILE=80;
    public static final int WHITE=81;
    public static final int WRITE=82;
    public static final int WS=83;

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
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:74:9: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:74:11: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,85,FOLLOW_85_in_params282);  
            stream_85.add(char_literal8);


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:74:15: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==84) ) {
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


            char_literal10=(Token)match(input,86,FOLLOW_86_in_params287);  
            stream_86.add(char_literal10);


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

                if ( (LA3_0==87) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:78:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,87,FOLLOW_87_in_paramlist316); 

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
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:83:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==84) ) {
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
                    char_literal14=(Token)match(input,84,FOLLOW_84_in_param344);  
                    stream_84.add(char_literal14);


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

                if ( (LA5_0==BLOCK||(LA5_0 >= CREATE && LA5_0 <= DESTROY)||(LA5_0 >= HIDE && LA5_0 <= IF)||(LA5_0 >= MODIFY && LA5_0 <= MOVE_T)||LA5_0==PARALLEL||LA5_0==READ||LA5_0==RETURN||(LA5_0 >= SHOW && LA5_0 <= SHOW_T)||LA5_0==WHILE||LA5_0==WRITE||LA5_0==90) ) {
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

            if ( ((LA6_0 >= CREATE && LA6_0 <= DESTROY)||(LA6_0 >= HIDE && LA6_0 <= IF)||(LA6_0 >= MODIFY && LA6_0 <= MOVE_T)||LA6_0==READ||LA6_0==RETURN||(LA6_0 >= SHOW && LA6_0 <= SHOW_T)||LA6_0==WHILE||LA6_0==WRITE||LA6_0==90) ) {
                alt6=1;
            }
            else if ( (LA6_0==BLOCK||LA6_0==PARALLEL) ) {
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

                    char_literal17=(Token)match(input,90,FOLLOW_90_in_instruction453); 

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
                else if ( (LA7_1==85) ) {
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
            case 90:
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:118:1: instructions_brack : ( parallel | block );
    public final AslParser.instructions_brack_return instructions_brack() throws RecognitionException {
        AslParser.instructions_brack_return retval = new AslParser.instructions_brack_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.parallel_return parallel33 =null;

        AslParser.block_return block34 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:118:20: ( parallel | block )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==PARALLEL) ) {
                alt8=1;
            }
            else if ( (LA8_0==BLOCK) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:118:22: parallel
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_parallel_in_instructions_brack812);
                    parallel33=parallel();

                    state._fsp--;

                    adaptor.addChild(root_0, parallel33.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:118:34: block
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_block_in_instructions_brack817);
                    block34=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block34.getTree());

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
        Token ID35=null;
        AslParser.expr_return expr36 =null;


        AslTree eq_tree=null;
        AslTree ID35_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EEQUAL=new RewriteRuleTokenStream(adaptor,"token EEQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:121:9: ( ID eq= EEQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:121:13: ID eq= EEQUAL expr
            {
            ID35=(Token)match(input,ID,FOLLOW_ID_in_assign829);  
            stream_ID.add(ID35);


            eq=(Token)match(input,EEQUAL,FOLLOW_EEQUAL_in_assign833);  
            stream_EEQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign835);
            expr36=expr();

            state._fsp--;

            stream_expr.add(expr36.getTree());

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

        Token IF37=null;
        Token THEN39=null;
        Token ELSE41=null;
        Token ENDIF43=null;
        AslParser.expr_return expr38 =null;

        AslParser.block_instructions_return block_instructions40 =null;

        AslParser.block_instructions_return block_instructions42 =null;


        AslTree IF37_tree=null;
        AslTree THEN39_tree=null;
        AslTree ELSE41_tree=null;
        AslTree ENDIF43_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:124:13: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:124:17: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF37=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt868); 
            IF37_tree = 
            (AslTree)adaptor.create(IF37)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF37_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt871);
            expr38=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr38.getTree());

            THEN39=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt873); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt876);
            block_instructions40=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions40.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:124:51: ( ELSE ! block_instructions )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ELSE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:124:52: ELSE ! block_instructions
                    {
                    ELSE41=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt879); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt882);
                    block_instructions42=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions42.getTree());

                    }
                    break;

            }


            ENDIF43=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt886); 

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

        Token WHILE44=null;
        Token DO46=null;
        Token ENDWHILE48=null;
        AslParser.expr_return expr45 =null;

        AslParser.block_instructions_return block_instructions47 =null;


        AslTree WHILE44_tree=null;
        AslTree DO46_tree=null;
        AslTree ENDWHILE48_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:128:13: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:128:17: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE44=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt912); 
            WHILE44_tree = 
            (AslTree)adaptor.create(WHILE44)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE44_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt915);
            expr45=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr45.getTree());

            DO46=(Token)match(input,DO,FOLLOW_DO_in_while_stmt917); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt920);
            block_instructions47=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions47.getTree());

            ENDWHILE48=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt922); 

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

        Token RETURN49=null;
        AslParser.expr_return expr50 =null;


        AslTree RETURN49_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:132:13: ( RETURN ^ ( expr )? )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:132:17: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN49=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt947); 
            RETURN49_tree = 
            (AslTree)adaptor.create(RETURN49)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN49_tree, root_0);


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:132:25: ( expr )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==FALSE||LA10_0==ID||LA10_0==INT||LA10_0==MINUS||LA10_0==NOT||LA10_0==PLUS||LA10_0==TRUE||LA10_0==85) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:132:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt950);
                    expr50=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr50.getTree());

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

        Token READ51=null;
        Token ID52=null;

        AslTree READ51_tree=null;
        AslTree ID52_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:136:9: ( READ ^ ID )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:136:13: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ51=(Token)match(input,READ,FOLLOW_READ_in_read974); 
            READ51_tree = 
            (AslTree)adaptor.create(READ51)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ51_tree, root_0);


            ID52=(Token)match(input,ID,FOLLOW_ID_in_read977); 
            ID52_tree = 
            (AslTree)adaptor.create(ID52)
            ;
            adaptor.addChild(root_0, ID52_tree);


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

        Token WRITE53=null;
        Token STRING55=null;
        AslParser.expr_return expr54 =null;


        AslTree WRITE53_tree=null;
        AslTree STRING55_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:140:9: ( WRITE ^ ( expr | STRING ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:140:13: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE53=(Token)match(input,WRITE,FOLLOW_WRITE_in_write999); 
            WRITE53_tree = 
            (AslTree)adaptor.create(WRITE53)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE53_tree, root_0);


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:140:20: ( expr | STRING )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==FALSE||LA11_0==ID||LA11_0==INT||LA11_0==MINUS||LA11_0==NOT||LA11_0==PLUS||LA11_0==TRUE||LA11_0==85) ) {
                alt11=1;
            }
            else if ( (LA11_0==STRING) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:140:21: expr
                    {
                    pushFollow(FOLLOW_expr_in_write1003);
                    expr54=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr54.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:140:28: STRING
                    {
                    STRING55=(Token)match(input,STRING,FOLLOW_STRING_in_write1007); 
                    STRING55_tree = 
                    (AslTree)adaptor.create(STRING55)
                    ;
                    adaptor.addChild(root_0, STRING55_tree);


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

        Token CREATE56=null;
        Token ID57=null;
        Token char_literal58=null;
        Token char_literal60=null;
        Token char_literal62=null;
        Token char_literal64=null;
        Token char_literal66=null;
        AslParser.obj_type_return obj_type59 =null;

        AslParser.expr_return expr61 =null;

        AslParser.expr_return expr63 =null;

        AslParser.list_attributes_return list_attributes65 =null;


        AslTree CREATE56_tree=null;
        AslTree ID57_tree=null;
        AslTree char_literal58_tree=null;
        AslTree char_literal60_tree=null;
        AslTree char_literal62_tree=null;
        AslTree char_literal64_tree=null;
        AslTree char_literal66_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:145:9: ( CREATE ^ ID '(' ! obj_type ',' ! expr ',' ! expr ( ',' ! list_attributes )? ')' !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:145:13: CREATE ^ ID '(' ! obj_type ',' ! expr ',' ! expr ( ',' ! list_attributes )? ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            CREATE56=(Token)match(input,CREATE,FOLLOW_CREATE_in_create1031); 
            CREATE56_tree = 
            (AslTree)adaptor.create(CREATE56)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(CREATE56_tree, root_0);


            ID57=(Token)match(input,ID,FOLLOW_ID_in_create1034); 
            ID57_tree = 
            (AslTree)adaptor.create(ID57)
            ;
            adaptor.addChild(root_0, ID57_tree);


            char_literal58=(Token)match(input,85,FOLLOW_85_in_create1036); 

            pushFollow(FOLLOW_obj_type_in_create1039);
            obj_type59=obj_type();

            state._fsp--;

            adaptor.addChild(root_0, obj_type59.getTree());

            char_literal60=(Token)match(input,87,FOLLOW_87_in_create1041); 

            pushFollow(FOLLOW_expr_in_create1044);
            expr61=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr61.getTree());

            char_literal62=(Token)match(input,87,FOLLOW_87_in_create1046); 

            pushFollow(FOLLOW_expr_in_create1049);
            expr63=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr63.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:145:58: ( ',' ! list_attributes )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==87) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:145:59: ',' ! list_attributes
                    {
                    char_literal64=(Token)match(input,87,FOLLOW_87_in_create1052); 

                    pushFollow(FOLLOW_list_attributes_in_create1055);
                    list_attributes65=list_attributes();

                    state._fsp--;

                    adaptor.addChild(root_0, list_attributes65.getTree());

                    }
                    break;

            }


            char_literal66=(Token)match(input,86,FOLLOW_86_in_create1059); 

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

        Token DESTROY67=null;
        Token char_literal68=null;
        Token ID69=null;
        Token char_literal70=null;

        AslTree DESTROY67_tree=null;
        AslTree char_literal68_tree=null;
        AslTree ID69_tree=null;
        AslTree char_literal70_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:148:9: ( DESTROY ^ '(' ! ID ')' !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:148:13: DESTROY ^ '(' ! ID ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            DESTROY67=(Token)match(input,DESTROY,FOLLOW_DESTROY_in_destroy1079); 
            DESTROY67_tree = 
            (AslTree)adaptor.create(DESTROY67)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(DESTROY67_tree, root_0);


            char_literal68=(Token)match(input,85,FOLLOW_85_in_destroy1082); 

            ID69=(Token)match(input,ID,FOLLOW_ID_in_destroy1085); 
            ID69_tree = 
            (AslTree)adaptor.create(ID69)
            ;
            adaptor.addChild(root_0, ID69_tree);


            char_literal70=(Token)match(input,86,FOLLOW_86_in_destroy1087); 

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

        AslParser.move_time_return move_time71 =null;

        AslParser.move_no_time_return move_no_time72 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:151:9: ( move_time | move_no_time )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==MOVE_T) ) {
                alt13=1;
            }
            else if ( (LA13_0==MOVE) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:151:13: move_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_time_in_move1110);
                    move_time71=move_time();

                    state._fsp--;

                    adaptor.addChild(root_0, move_time71.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:151:25: move_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_no_time_in_move1114);
                    move_no_time72=move_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, move_no_time72.getTree());

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

        Token MOVE_T73=null;
        Token ID74=null;
        Token char_literal76=null;
        Token char_literal78=null;
        Token char_literal80=null;
        AslParser.time_return time75 =null;

        AslParser.expr_return expr77 =null;

        AslParser.expr_return expr79 =null;


        AslTree MOVE_T73_tree=null;
        AslTree ID74_tree=null;
        AslTree char_literal76_tree=null;
        AslTree char_literal78_tree=null;
        AslTree char_literal80_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:154:11: ( MOVE_T ^ ID time '(' ! expr ',' ! expr ')' !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:154:13: MOVE_T ^ ID time '(' ! expr ',' ! expr ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            MOVE_T73=(Token)match(input,MOVE_T,FOLLOW_MOVE_T_in_move_time1131); 
            MOVE_T73_tree = 
            (AslTree)adaptor.create(MOVE_T73)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MOVE_T73_tree, root_0);


            ID74=(Token)match(input,ID,FOLLOW_ID_in_move_time1134); 
            ID74_tree = 
            (AslTree)adaptor.create(ID74)
            ;
            adaptor.addChild(root_0, ID74_tree);


            pushFollow(FOLLOW_time_in_move_time1137);
            time75=time();

            state._fsp--;

            adaptor.addChild(root_0, time75.getTree());

            char_literal76=(Token)match(input,85,FOLLOW_85_in_move_time1139); 

            pushFollow(FOLLOW_expr_in_move_time1142);
            expr77=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr77.getTree());

            char_literal78=(Token)match(input,87,FOLLOW_87_in_move_time1144); 

            pushFollow(FOLLOW_expr_in_move_time1147);
            expr79=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr79.getTree());

            char_literal80=(Token)match(input,86,FOLLOW_86_in_move_time1150); 

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

        Token MOVE81=null;
        Token ID82=null;
        Token char_literal83=null;
        Token char_literal85=null;
        Token char_literal87=null;
        AslParser.expr_return expr84 =null;

        AslParser.expr_return expr86 =null;


        AslTree MOVE81_tree=null;
        AslTree ID82_tree=null;
        AslTree char_literal83_tree=null;
        AslTree char_literal85_tree=null;
        AslTree char_literal87_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:157:14: ( MOVE ^ ID '(' ! expr ',' ! expr ')' !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:157:16: MOVE ^ ID '(' ! expr ',' ! expr ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            MOVE81=(Token)match(input,MOVE,FOLLOW_MOVE_in_move_no_time1168); 
            MOVE81_tree = 
            (AslTree)adaptor.create(MOVE81)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MOVE81_tree, root_0);


            ID82=(Token)match(input,ID,FOLLOW_ID_in_move_no_time1171); 
            ID82_tree = 
            (AslTree)adaptor.create(ID82)
            ;
            adaptor.addChild(root_0, ID82_tree);


            char_literal83=(Token)match(input,85,FOLLOW_85_in_move_no_time1173); 

            pushFollow(FOLLOW_expr_in_move_no_time1176);
            expr84=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr84.getTree());

            char_literal85=(Token)match(input,87,FOLLOW_87_in_move_no_time1178); 

            pushFollow(FOLLOW_expr_in_move_no_time1181);
            expr86=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr86.getTree());

            char_literal87=(Token)match(input,86,FOLLOW_86_in_move_no_time1183); 

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

        AslParser.modify_time_return modify_time88 =null;

        AslParser.modify_no_time_return modify_no_time89 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:160:11: ( modify_time | modify_no_time )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==MODIFY_T) ) {
                alt14=1;
            }
            else if ( (LA14_0==MODIFY) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:160:15: modify_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_time_in_modify1206);
                    modify_time88=modify_time();

                    state._fsp--;

                    adaptor.addChild(root_0, modify_time88.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:160:29: modify_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_no_time_in_modify1210);
                    modify_no_time89=modify_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, modify_no_time89.getTree());

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

        Token MODIFY_T90=null;
        Token ID91=null;
        AslParser.time_return time92 =null;

        AslParser.list_attributes_return list_attributes93 =null;


        AslTree MODIFY_T90_tree=null;
        AslTree ID91_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:163:13: ( MODIFY_T ^ ID time list_attributes )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:163:15: MODIFY_T ^ ID time list_attributes
            {
            root_0 = (AslTree)adaptor.nil();


            MODIFY_T90=(Token)match(input,MODIFY_T,FOLLOW_MODIFY_T_in_modify_time1227); 
            MODIFY_T90_tree = 
            (AslTree)adaptor.create(MODIFY_T90)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MODIFY_T90_tree, root_0);


            ID91=(Token)match(input,ID,FOLLOW_ID_in_modify_time1230); 
            ID91_tree = 
            (AslTree)adaptor.create(ID91)
            ;
            adaptor.addChild(root_0, ID91_tree);


            pushFollow(FOLLOW_time_in_modify_time1232);
            time92=time();

            state._fsp--;

            adaptor.addChild(root_0, time92.getTree());

            pushFollow(FOLLOW_list_attributes_in_modify_time1234);
            list_attributes93=list_attributes();

            state._fsp--;

            adaptor.addChild(root_0, list_attributes93.getTree());

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

        Token MODIFY94=null;
        Token ID95=null;
        AslParser.list_attributes_return list_attributes96 =null;


        AslTree MODIFY94_tree=null;
        AslTree ID95_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:166:16: ( MODIFY ^ ID list_attributes )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:166:18: MODIFY ^ ID list_attributes
            {
            root_0 = (AslTree)adaptor.nil();


            MODIFY94=(Token)match(input,MODIFY,FOLLOW_MODIFY_in_modify_no_time1251); 
            MODIFY94_tree = 
            (AslTree)adaptor.create(MODIFY94)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MODIFY94_tree, root_0);


            ID95=(Token)match(input,ID,FOLLOW_ID_in_modify_no_time1254); 
            ID95_tree = 
            (AslTree)adaptor.create(ID95)
            ;
            adaptor.addChild(root_0, ID95_tree);


            pushFollow(FOLLOW_list_attributes_in_modify_no_time1256);
            list_attributes96=list_attributes();

            state._fsp--;

            adaptor.addChild(root_0, list_attributes96.getTree());

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


    public static class block_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:169:1: block : BLOCK ^ ID '{' ! ( create ';' !)+ '}' !;
    public final AslParser.block_return block() throws RecognitionException {
        AslParser.block_return retval = new AslParser.block_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token BLOCK97=null;
        Token ID98=null;
        Token char_literal99=null;
        Token char_literal101=null;
        Token char_literal102=null;
        AslParser.create_return create100 =null;


        AslTree BLOCK97_tree=null;
        AslTree ID98_tree=null;
        AslTree char_literal99_tree=null;
        AslTree char_literal101_tree=null;
        AslTree char_literal102_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:169:7: ( BLOCK ^ ID '{' ! ( create ';' !)+ '}' !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:169:9: BLOCK ^ ID '{' ! ( create ';' !)+ '}' !
            {
            root_0 = (AslTree)adaptor.nil();


            BLOCK97=(Token)match(input,BLOCK,FOLLOW_BLOCK_in_block1274); 
            BLOCK97_tree = 
            (AslTree)adaptor.create(BLOCK97)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(BLOCK97_tree, root_0);


            ID98=(Token)match(input,ID,FOLLOW_ID_in_block1277); 
            ID98_tree = 
            (AslTree)adaptor.create(ID98)
            ;
            adaptor.addChild(root_0, ID98_tree);


            char_literal99=(Token)match(input,94,FOLLOW_94_in_block1279); 

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:169:24: ( create ';' !)+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==CREATE) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:169:25: create ';' !
            	    {
            	    pushFollow(FOLLOW_create_in_block1283);
            	    create100=create();

            	    state._fsp--;

            	    adaptor.addChild(root_0, create100.getTree());

            	    char_literal101=(Token)match(input,90,FOLLOW_90_in_block1285); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            char_literal102=(Token)match(input,95,FOLLOW_95_in_block1290); 

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
    // $ANTLR end "block"


    public static class parallel_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parallel"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:172:1: parallel : ( parallel_time | parallel_no_time );
    public final AslParser.parallel_return parallel() throws RecognitionException {
        AslParser.parallel_return retval = new AslParser.parallel_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.parallel_time_return parallel_time103 =null;

        AslParser.parallel_no_time_return parallel_no_time104 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:172:10: ( parallel_time | parallel_no_time )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==PARALLEL) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==94) ) {
                    alt16=2;
                }
                else if ( (LA16_1==INT) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:172:12: parallel_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_parallel_time_in_parallel1308);
                    parallel_time103=parallel_time();

                    state._fsp--;

                    adaptor.addChild(root_0, parallel_time103.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:172:28: parallel_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_parallel_no_time_in_parallel1312);
                    parallel_no_time104=parallel_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, parallel_no_time104.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:174:1: instructions_notime : ( move_no_time | modify_no_time | show_no_time | hide_no_time );
    public final AslParser.instructions_notime_return instructions_notime() throws RecognitionException {
        AslParser.instructions_notime_return retval = new AslParser.instructions_notime_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.move_no_time_return move_no_time105 =null;

        AslParser.modify_no_time_return modify_no_time106 =null;

        AslParser.show_no_time_return show_no_time107 =null;

        AslParser.hide_no_time_return hide_no_time108 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:174:21: ( move_no_time | modify_no_time | show_no_time | hide_no_time )
            int alt17=4;
            switch ( input.LA(1) ) {
            case MOVE:
                {
                alt17=1;
                }
                break;
            case MODIFY:
                {
                alt17=2;
                }
                break;
            case SHOW:
                {
                alt17=3;
                }
                break;
            case HIDE:
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:174:23: move_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_no_time_in_instructions_notime1320);
                    move_no_time105=move_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, move_no_time105.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:174:38: modify_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_no_time_in_instructions_notime1324);
                    modify_no_time106=modify_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, modify_no_time106.getTree());

                    }
                    break;
                case 3 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:174:55: show_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_show_no_time_in_instructions_notime1328);
                    show_no_time107=show_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, show_no_time107.getTree());

                    }
                    break;
                case 4 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:174:70: hide_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_hide_no_time_in_instructions_notime1332);
                    hide_no_time108=hide_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, hide_no_time108.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:176:1: block_instructions_notime : instructions_notime ';' ( instructions_notime ';' )* -> ^( LIST_INSTR ( instructions_notime )+ ) ;
    public final AslParser.block_instructions_notime_return block_instructions_notime() throws RecognitionException {
        AslParser.block_instructions_notime_return retval = new AslParser.block_instructions_notime_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal110=null;
        Token char_literal112=null;
        AslParser.instructions_notime_return instructions_notime109 =null;

        AslParser.instructions_notime_return instructions_notime111 =null;


        AslTree char_literal110_tree=null;
        AslTree char_literal112_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_instructions_notime=new RewriteRuleSubtreeStream(adaptor,"rule instructions_notime");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:176:26: ( instructions_notime ';' ( instructions_notime ';' )* -> ^( LIST_INSTR ( instructions_notime )+ ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:176:28: instructions_notime ';' ( instructions_notime ';' )*
            {
            pushFollow(FOLLOW_instructions_notime_in_block_instructions_notime1339);
            instructions_notime109=instructions_notime();

            state._fsp--;

            stream_instructions_notime.add(instructions_notime109.getTree());

            char_literal110=(Token)match(input,90,FOLLOW_90_in_block_instructions_notime1340);  
            stream_90.add(char_literal110);


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:176:51: ( instructions_notime ';' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==HIDE||LA18_0==MODIFY||LA18_0==MOVE||LA18_0==SHOW) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:176:53: instructions_notime ';'
            	    {
            	    pushFollow(FOLLOW_instructions_notime_in_block_instructions_notime1344);
            	    instructions_notime111=instructions_notime();

            	    state._fsp--;

            	    stream_instructions_notime.add(instructions_notime111.getTree());

            	    char_literal112=(Token)match(input,90,FOLLOW_90_in_block_instructions_notime1346);  
            	    stream_90.add(char_literal112);


            	    }
            	    break;

            	default :
            	    break loop18;
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
            // 177:29: -> ^( LIST_INSTR ( instructions_notime )+ )
            {
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:177:32: ^( LIST_INSTR ( instructions_notime )+ )
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:179:1: parallel_time : PARALLEL ^ time '{' ! block_instructions_notime '}' !;
    public final AslParser.parallel_time_return parallel_time() throws RecognitionException {
        AslParser.parallel_time_return retval = new AslParser.parallel_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PARALLEL113=null;
        Token char_literal115=null;
        Token char_literal117=null;
        AslParser.time_return time114 =null;

        AslParser.block_instructions_notime_return block_instructions_notime116 =null;


        AslTree PARALLEL113_tree=null;
        AslTree char_literal115_tree=null;
        AslTree char_literal117_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:179:15: ( PARALLEL ^ time '{' ! block_instructions_notime '}' !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:179:17: PARALLEL ^ time '{' ! block_instructions_notime '}' !
            {
            root_0 = (AslTree)adaptor.nil();


            PARALLEL113=(Token)match(input,PARALLEL,FOLLOW_PARALLEL_in_parallel_time1393); 
            PARALLEL113_tree = 
            (AslTree)adaptor.create(PARALLEL113)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(PARALLEL113_tree, root_0);


            pushFollow(FOLLOW_time_in_parallel_time1396);
            time114=time();

            state._fsp--;

            adaptor.addChild(root_0, time114.getTree());

            char_literal115=(Token)match(input,94,FOLLOW_94_in_parallel_time1398); 

            pushFollow(FOLLOW_block_instructions_notime_in_parallel_time1401);
            block_instructions_notime116=block_instructions_notime();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions_notime116.getTree());

            char_literal117=(Token)match(input,95,FOLLOW_95_in_parallel_time1403); 

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:181:1: instructions_time : ( move_time | modify_time | show_time | hide_time );
    public final AslParser.instructions_time_return instructions_time() throws RecognitionException {
        AslParser.instructions_time_return retval = new AslParser.instructions_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.move_time_return move_time118 =null;

        AslParser.modify_time_return modify_time119 =null;

        AslParser.show_time_return show_time120 =null;

        AslParser.hide_time_return hide_time121 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:181:19: ( move_time | modify_time | show_time | hide_time )
            int alt19=4;
            switch ( input.LA(1) ) {
            case MOVE_T:
                {
                alt19=1;
                }
                break;
            case MODIFY_T:
                {
                alt19=2;
                }
                break;
            case SHOW_T:
                {
                alt19=3;
                }
                break;
            case HIDE_T:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:181:21: move_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_time_in_instructions_time1412);
                    move_time118=move_time();

                    state._fsp--;

                    adaptor.addChild(root_0, move_time118.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:181:33: modify_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_time_in_instructions_time1416);
                    modify_time119=modify_time();

                    state._fsp--;

                    adaptor.addChild(root_0, modify_time119.getTree());

                    }
                    break;
                case 3 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:181:47: show_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_show_time_in_instructions_time1420);
                    show_time120=show_time();

                    state._fsp--;

                    adaptor.addChild(root_0, show_time120.getTree());

                    }
                    break;
                case 4 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:181:59: hide_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_hide_time_in_instructions_time1424);
                    hide_time121=hide_time();

                    state._fsp--;

                    adaptor.addChild(root_0, hide_time121.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:183:1: block_instructions_time : instructions_time ';' ( instructions_time ';' )* -> ^( LIST_INSTR ( instructions_time )+ ) ;
    public final AslParser.block_instructions_time_return block_instructions_time() throws RecognitionException {
        AslParser.block_instructions_time_return retval = new AslParser.block_instructions_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal123=null;
        Token char_literal125=null;
        AslParser.instructions_time_return instructions_time122 =null;

        AslParser.instructions_time_return instructions_time124 =null;


        AslTree char_literal123_tree=null;
        AslTree char_literal125_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_instructions_time=new RewriteRuleSubtreeStream(adaptor,"rule instructions_time");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:183:24: ( instructions_time ';' ( instructions_time ';' )* -> ^( LIST_INSTR ( instructions_time )+ ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:183:26: instructions_time ';' ( instructions_time ';' )*
            {
            pushFollow(FOLLOW_instructions_time_in_block_instructions_time1431);
            instructions_time122=instructions_time();

            state._fsp--;

            stream_instructions_time.add(instructions_time122.getTree());

            char_literal123=(Token)match(input,90,FOLLOW_90_in_block_instructions_time1433);  
            stream_90.add(char_literal123);


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:183:48: ( instructions_time ';' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==HIDE_T||LA20_0==MODIFY_T||LA20_0==MOVE_T||LA20_0==SHOW_T) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:183:50: instructions_time ';'
            	    {
            	    pushFollow(FOLLOW_instructions_time_in_block_instructions_time1437);
            	    instructions_time124=instructions_time();

            	    state._fsp--;

            	    stream_instructions_time.add(instructions_time124.getTree());

            	    char_literal125=(Token)match(input,90,FOLLOW_90_in_block_instructions_time1438);  
            	    stream_90.add(char_literal125);


            	    }
            	    break;

            	default :
            	    break loop20;
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
            // 184:29: -> ^( LIST_INSTR ( instructions_time )+ )
            {
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:184:32: ^( LIST_INSTR ( instructions_time )+ )
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:186:1: parallel_no_time : PARALLEL ^ '{' ! block_instructions_time '}' !;
    public final AslParser.parallel_no_time_return parallel_no_time() throws RecognitionException {
        AslParser.parallel_no_time_return retval = new AslParser.parallel_no_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PARALLEL126=null;
        Token char_literal127=null;
        Token char_literal129=null;
        AslParser.block_instructions_time_return block_instructions_time128 =null;


        AslTree PARALLEL126_tree=null;
        AslTree char_literal127_tree=null;
        AslTree char_literal129_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:186:18: ( PARALLEL ^ '{' ! block_instructions_time '}' !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:186:20: PARALLEL ^ '{' ! block_instructions_time '}' !
            {
            root_0 = (AslTree)adaptor.nil();


            PARALLEL126=(Token)match(input,PARALLEL,FOLLOW_PARALLEL_in_parallel_no_time1485); 
            PARALLEL126_tree = 
            (AslTree)adaptor.create(PARALLEL126)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(PARALLEL126_tree, root_0);


            char_literal127=(Token)match(input,94,FOLLOW_94_in_parallel_no_time1488); 

            pushFollow(FOLLOW_block_instructions_time_in_parallel_no_time1491);
            block_instructions_time128=block_instructions_time();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions_time128.getTree());

            char_literal129=(Token)match(input,95,FOLLOW_95_in_parallel_no_time1493); 

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:188:1: list_attributes : '(' attribute ( ',' attribute )* ')' -> ^( LIST_ATTR ( attribute )+ ) ;
    public final AslParser.list_attributes_return list_attributes() throws RecognitionException {
        AslParser.list_attributes_return retval = new AslParser.list_attributes_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal130=null;
        Token char_literal132=null;
        Token char_literal134=null;
        AslParser.attribute_return attribute131 =null;

        AslParser.attribute_return attribute133 =null;


        AslTree char_literal130_tree=null;
        AslTree char_literal132_tree=null;
        AslTree char_literal134_tree=null;
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:188:17: ( '(' attribute ( ',' attribute )* ')' -> ^( LIST_ATTR ( attribute )+ ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:188:19: '(' attribute ( ',' attribute )* ')'
            {
            char_literal130=(Token)match(input,85,FOLLOW_85_in_list_attributes1502);  
            stream_85.add(char_literal130);


            pushFollow(FOLLOW_attribute_in_list_attributes1504);
            attribute131=attribute();

            state._fsp--;

            stream_attribute.add(attribute131.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:188:33: ( ',' attribute )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==87) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:188:34: ',' attribute
            	    {
            	    char_literal132=(Token)match(input,87,FOLLOW_87_in_list_attributes1507);  
            	    stream_87.add(char_literal132);


            	    pushFollow(FOLLOW_attribute_in_list_attributes1509);
            	    attribute133=attribute();

            	    state._fsp--;

            	    stream_attribute.add(attribute133.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            char_literal134=(Token)match(input,86,FOLLOW_86_in_list_attributes1513);  
            stream_86.add(char_literal134);


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
            // 188:54: -> ^( LIST_ATTR ( attribute )+ )
            {
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:188:57: ^( LIST_ATTR ( attribute )+ )
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:191:1: attribute : ( attribute_name_color ^ ':' ! obj_attribute | attribute_name_expr ^ ':' ! expr );
    public final AslParser.attribute_return attribute() throws RecognitionException {
        AslParser.attribute_return retval = new AslParser.attribute_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal136=null;
        Token char_literal139=null;
        AslParser.attribute_name_color_return attribute_name_color135 =null;

        AslParser.obj_attribute_return obj_attribute137 =null;

        AslParser.attribute_name_expr_return attribute_name_expr138 =null;

        AslParser.expr_return expr140 =null;


        AslTree char_literal136_tree=null;
        AslTree char_literal139_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:191:13: ( attribute_name_color ^ ':' ! obj_attribute | attribute_name_expr ^ ':' ! expr )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==COLOR||LA22_0==STROKE) ) {
                alt22=1;
            }
            else if ( ((LA22_0 >= POSX && LA22_0 <= POSY)||LA22_0==92) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:191:17: attribute_name_color ^ ':' ! obj_attribute
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_attribute_name_color_in_attribute1543);
                    attribute_name_color135=attribute_name_color();

                    state._fsp--;

                    root_0 = (AslTree)adaptor.becomeRoot(attribute_name_color135.getTree(), root_0);

                    char_literal136=(Token)match(input,89,FOLLOW_89_in_attribute1546); 

                    pushFollow(FOLLOW_obj_attribute_in_attribute1549);
                    obj_attribute137=obj_attribute();

                    state._fsp--;

                    adaptor.addChild(root_0, obj_attribute137.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:192:17: attribute_name_expr ^ ':' ! expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_attribute_name_expr_in_attribute1567);
                    attribute_name_expr138=attribute_name_expr();

                    state._fsp--;

                    root_0 = (AslTree)adaptor.becomeRoot(attribute_name_expr138.getTree(), root_0);

                    char_literal139=(Token)match(input,89,FOLLOW_89_in_attribute1570); 

                    pushFollow(FOLLOW_expr_in_attribute1573);
                    expr140=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr140.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:194:1: obj_attribute : ( color | ID | ID '.' ( attribute_name_color ) -> ^( ATTR ID attribute_name_color ) );
    public final AslParser.obj_attribute_return obj_attribute() throws RecognitionException {
        AslParser.obj_attribute_return retval = new AslParser.obj_attribute_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID142=null;
        Token ID143=null;
        Token char_literal144=null;
        AslParser.color_return color141 =null;

        AslParser.attribute_name_color_return attribute_name_color145 =null;


        AslTree ID142_tree=null;
        AslTree ID143_tree=null;
        AslTree char_literal144_tree=null;
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_attribute_name_color=new RewriteRuleSubtreeStream(adaptor,"rule attribute_name_color");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:194:17: ( color | ID | ID '.' ( attribute_name_color ) -> ^( ATTR ID attribute_name_color ) )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==BLACK||LA23_0==BLUE||LA23_0==COLORHEX||LA23_0==GREEN||LA23_0==RED||(LA23_0 >= RGB && LA23_0 <= RGBPRCTJ)||LA23_0==WHITE) ) {
                alt23=1;
            }
            else if ( (LA23_0==ID) ) {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==88) ) {
                    alt23=3;
                }
                else if ( ((LA23_2 >= 86 && LA23_2 <= 87)) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:194:21: color
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_color_in_obj_attribute1597);
                    color141=color();

                    state._fsp--;

                    adaptor.addChild(root_0, color141.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:195:19: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID142=(Token)match(input,ID,FOLLOW_ID_in_obj_attribute1617); 
                    ID142_tree = 
                    (AslTree)adaptor.create(ID142)
                    ;
                    adaptor.addChild(root_0, ID142_tree);


                    }
                    break;
                case 3 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:196:21: ID '.' ( attribute_name_color )
                    {
                    ID143=(Token)match(input,ID,FOLLOW_ID_in_obj_attribute1639);  
                    stream_ID.add(ID143);


                    char_literal144=(Token)match(input,88,FOLLOW_88_in_obj_attribute1641);  
                    stream_88.add(char_literal144);


                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:196:28: ( attribute_name_color )
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:196:30: attribute_name_color
                    {
                    pushFollow(FOLLOW_attribute_name_color_in_obj_attribute1645);
                    attribute_name_color145=attribute_name_color();

                    state._fsp--;

                    stream_attribute_name_color.add(attribute_name_color145.getTree());

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
                    // 196:52: -> ^( ATTR ID attribute_name_color )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:196:55: ^( ATTR ID attribute_name_color )
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:199:1: show : ( show_time | show_no_time );
    public final AslParser.show_return show() throws RecognitionException {
        AslParser.show_return retval = new AslParser.show_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.show_time_return show_time146 =null;

        AslParser.show_no_time_return show_no_time147 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:199:6: ( show_time | show_no_time )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==SHOW_T) ) {
                alt24=1;
            }
            else if ( (LA24_0==SHOW) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:199:8: show_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_show_time_in_show1681);
                    show_time146=show_time();

                    state._fsp--;

                    adaptor.addChild(root_0, show_time146.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:199:20: show_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_show_no_time_in_show1685);
                    show_no_time147=show_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, show_no_time147.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:201:1: show_time : SHOW_T ^ ID time ;
    public final AslParser.show_time_return show_time() throws RecognitionException {
        AslParser.show_time_return retval = new AslParser.show_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token SHOW_T148=null;
        Token ID149=null;
        AslParser.time_return time150 =null;


        AslTree SHOW_T148_tree=null;
        AslTree ID149_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:201:11: ( SHOW_T ^ ID time )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:201:13: SHOW_T ^ ID time
            {
            root_0 = (AslTree)adaptor.nil();


            SHOW_T148=(Token)match(input,SHOW_T,FOLLOW_SHOW_T_in_show_time1693); 
            SHOW_T148_tree = 
            (AslTree)adaptor.create(SHOW_T148)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(SHOW_T148_tree, root_0);


            ID149=(Token)match(input,ID,FOLLOW_ID_in_show_time1696); 
            ID149_tree = 
            (AslTree)adaptor.create(ID149)
            ;
            adaptor.addChild(root_0, ID149_tree);


            pushFollow(FOLLOW_time_in_show_time1698);
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
    // $ANTLR end "show_time"


    public static class show_no_time_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "show_no_time"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:203:1: show_no_time : SHOW ^ ID ;
    public final AslParser.show_no_time_return show_no_time() throws RecognitionException {
        AslParser.show_no_time_return retval = new AslParser.show_no_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token SHOW151=null;
        Token ID152=null;

        AslTree SHOW151_tree=null;
        AslTree ID152_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:203:14: ( SHOW ^ ID )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:203:17: SHOW ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            SHOW151=(Token)match(input,SHOW,FOLLOW_SHOW_in_show_no_time1707); 
            SHOW151_tree = 
            (AslTree)adaptor.create(SHOW151)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(SHOW151_tree, root_0);


            ID152=(Token)match(input,ID,FOLLOW_ID_in_show_no_time1710); 
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
    // $ANTLR end "show_no_time"


    public static class hide_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hide"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:205:1: hide : ( hide_time | hide_no_time );
    public final AslParser.hide_return hide() throws RecognitionException {
        AslParser.hide_return retval = new AslParser.hide_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.hide_time_return hide_time153 =null;

        AslParser.hide_no_time_return hide_no_time154 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:205:6: ( hide_time | hide_no_time )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==HIDE_T) ) {
                alt25=1;
            }
            else if ( (LA25_0==HIDE) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:205:8: hide_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_hide_time_in_hide1718);
                    hide_time153=hide_time();

                    state._fsp--;

                    adaptor.addChild(root_0, hide_time153.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:205:20: hide_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_hide_no_time_in_hide1722);
                    hide_no_time154=hide_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, hide_no_time154.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:207:1: hide_time : HIDE_T ^ ID time ;
    public final AslParser.hide_time_return hide_time() throws RecognitionException {
        AslParser.hide_time_return retval = new AslParser.hide_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token HIDE_T155=null;
        Token ID156=null;
        AslParser.time_return time157 =null;


        AslTree HIDE_T155_tree=null;
        AslTree ID156_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:207:11: ( HIDE_T ^ ID time )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:207:13: HIDE_T ^ ID time
            {
            root_0 = (AslTree)adaptor.nil();


            HIDE_T155=(Token)match(input,HIDE_T,FOLLOW_HIDE_T_in_hide_time1730); 
            HIDE_T155_tree = 
            (AslTree)adaptor.create(HIDE_T155)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(HIDE_T155_tree, root_0);


            ID156=(Token)match(input,ID,FOLLOW_ID_in_hide_time1733); 
            ID156_tree = 
            (AslTree)adaptor.create(ID156)
            ;
            adaptor.addChild(root_0, ID156_tree);


            pushFollow(FOLLOW_time_in_hide_time1735);
            time157=time();

            state._fsp--;

            adaptor.addChild(root_0, time157.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:209:1: hide_no_time : HIDE ^ ID ;
    public final AslParser.hide_no_time_return hide_no_time() throws RecognitionException {
        AslParser.hide_no_time_return retval = new AslParser.hide_no_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token HIDE158=null;
        Token ID159=null;

        AslTree HIDE158_tree=null;
        AslTree ID159_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:209:14: ( HIDE ^ ID )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:209:17: HIDE ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            HIDE158=(Token)match(input,HIDE,FOLLOW_HIDE_in_hide_no_time1744); 
            HIDE158_tree = 
            (AslTree)adaptor.create(HIDE158)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(HIDE158_tree, root_0);


            ID159=(Token)match(input,ID,FOLLOW_ID_in_hide_no_time1747); 
            ID159_tree = 
            (AslTree)adaptor.create(ID159)
            ;
            adaptor.addChild(root_0, ID159_tree);


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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:211:1: delay : DELAY ^ time ;
    public final AslParser.delay_return delay() throws RecognitionException {
        AslParser.delay_return retval = new AslParser.delay_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token DELAY160=null;
        AslParser.time_return time161 =null;


        AslTree DELAY160_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:211:6: ( DELAY ^ time )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:211:8: DELAY ^ time
            {
            root_0 = (AslTree)adaptor.nil();


            DELAY160=(Token)match(input,DELAY,FOLLOW_DELAY_in_delay1754); 
            DELAY160_tree = 
            (AslTree)adaptor.create(DELAY160)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(DELAY160_tree, root_0);


            pushFollow(FOLLOW_time_in_delay1757);
            time161=time();

            state._fsp--;

            adaptor.addChild(root_0, time161.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:213:1: attribute_name_color : ( COLOR | STROKE );
    public final AslParser.attribute_name_color_return attribute_name_color() throws RecognitionException {
        AslParser.attribute_name_color_return retval = new AslParser.attribute_name_color_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set162=null;

        AslTree set162_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:213:25: ( COLOR | STROKE )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set162=(Token)input.LT(1);

            if ( input.LA(1)==COLOR||input.LA(1)==STROKE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set162)
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:217:1: attribute_name_expr : ( POSX | POSY | 'r' );
    public final AslParser.attribute_name_expr_return attribute_name_expr() throws RecognitionException {
        AslParser.attribute_name_expr_return retval = new AslParser.attribute_name_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set163=null;

        AslTree set163_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:217:21: ( POSX | POSY | 'r' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set163=(Token)input.LT(1);

            if ( (input.LA(1) >= POSX && input.LA(1) <= POSY)||input.LA(1)==92 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set163)
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:222:1: color : ( COLORHEX -> ^( COLORHEXA COLORHEX ) | RGB '(' expr ',' expr ',' expr ')' -> ^( COLORINT expr expr expr ) | RGBPRCTJ '(' expr ',' expr ',' expr ')' -> ^( COLORPRCTJ expr expr expr ) | color_keyword -> ^( COLORKEYWORD color_keyword ) );
    public final AslParser.color_return color() throws RecognitionException {
        AslParser.color_return retval = new AslParser.color_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token COLORHEX164=null;
        Token RGB165=null;
        Token char_literal166=null;
        Token char_literal168=null;
        Token char_literal170=null;
        Token char_literal172=null;
        Token RGBPRCTJ173=null;
        Token char_literal174=null;
        Token char_literal176=null;
        Token char_literal178=null;
        Token char_literal180=null;
        AslParser.expr_return expr167 =null;

        AslParser.expr_return expr169 =null;

        AslParser.expr_return expr171 =null;

        AslParser.expr_return expr175 =null;

        AslParser.expr_return expr177 =null;

        AslParser.expr_return expr179 =null;

        AslParser.color_keyword_return color_keyword181 =null;


        AslTree COLORHEX164_tree=null;
        AslTree RGB165_tree=null;
        AslTree char_literal166_tree=null;
        AslTree char_literal168_tree=null;
        AslTree char_literal170_tree=null;
        AslTree char_literal172_tree=null;
        AslTree RGBPRCTJ173_tree=null;
        AslTree char_literal174_tree=null;
        AslTree char_literal176_tree=null;
        AslTree char_literal178_tree=null;
        AslTree char_literal180_tree=null;
        RewriteRuleTokenStream stream_COLORHEX=new RewriteRuleTokenStream(adaptor,"token COLORHEX");
        RewriteRuleTokenStream stream_RGBPRCTJ=new RewriteRuleTokenStream(adaptor,"token RGBPRCTJ");
        RewriteRuleTokenStream stream_RGB=new RewriteRuleTokenStream(adaptor,"token RGB");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_color_keyword=new RewriteRuleSubtreeStream(adaptor,"rule color_keyword");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:222:9: ( COLORHEX -> ^( COLORHEXA COLORHEX ) | RGB '(' expr ',' expr ',' expr ')' -> ^( COLORINT expr expr expr ) | RGBPRCTJ '(' expr ',' expr ',' expr ')' -> ^( COLORPRCTJ expr expr expr ) | color_keyword -> ^( COLORKEYWORD color_keyword ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case COLORHEX:
                {
                alt26=1;
                }
                break;
            case RGB:
                {
                alt26=2;
                }
                break;
            case RGBPRCTJ:
                {
                alt26=3;
                }
                break;
            case BLACK:
            case BLUE:
            case GREEN:
            case RED:
            case WHITE:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:222:13: COLORHEX
                    {
                    COLORHEX164=(Token)match(input,COLORHEX,FOLLOW_COLORHEX_in_color1892);  
                    stream_COLORHEX.add(COLORHEX164);


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
                    // 222:22: -> ^( COLORHEXA COLORHEX )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:222:25: ^( COLORHEXA COLORHEX )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:223:13: RGB '(' expr ',' expr ',' expr ')'
                    {
                    RGB165=(Token)match(input,RGB,FOLLOW_RGB_in_color1914);  
                    stream_RGB.add(RGB165);


                    char_literal166=(Token)match(input,85,FOLLOW_85_in_color1916);  
                    stream_85.add(char_literal166);


                    pushFollow(FOLLOW_expr_in_color1918);
                    expr167=expr();

                    state._fsp--;

                    stream_expr.add(expr167.getTree());

                    char_literal168=(Token)match(input,87,FOLLOW_87_in_color1920);  
                    stream_87.add(char_literal168);


                    pushFollow(FOLLOW_expr_in_color1922);
                    expr169=expr();

                    state._fsp--;

                    stream_expr.add(expr169.getTree());

                    char_literal170=(Token)match(input,87,FOLLOW_87_in_color1924);  
                    stream_87.add(char_literal170);


                    pushFollow(FOLLOW_expr_in_color1926);
                    expr171=expr();

                    state._fsp--;

                    stream_expr.add(expr171.getTree());

                    char_literal172=(Token)match(input,86,FOLLOW_86_in_color1928);  
                    stream_86.add(char_literal172);


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
                    // 223:48: -> ^( COLORINT expr expr expr )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:223:51: ^( COLORINT expr expr expr )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:224:13: RGBPRCTJ '(' expr ',' expr ',' expr ')'
                    {
                    RGBPRCTJ173=(Token)match(input,RGBPRCTJ,FOLLOW_RGBPRCTJ_in_color1954);  
                    stream_RGBPRCTJ.add(RGBPRCTJ173);


                    char_literal174=(Token)match(input,85,FOLLOW_85_in_color1956);  
                    stream_85.add(char_literal174);


                    pushFollow(FOLLOW_expr_in_color1958);
                    expr175=expr();

                    state._fsp--;

                    stream_expr.add(expr175.getTree());

                    char_literal176=(Token)match(input,87,FOLLOW_87_in_color1960);  
                    stream_87.add(char_literal176);


                    pushFollow(FOLLOW_expr_in_color1962);
                    expr177=expr();

                    state._fsp--;

                    stream_expr.add(expr177.getTree());

                    char_literal178=(Token)match(input,87,FOLLOW_87_in_color1964);  
                    stream_87.add(char_literal178);


                    pushFollow(FOLLOW_expr_in_color1966);
                    expr179=expr();

                    state._fsp--;

                    stream_expr.add(expr179.getTree());

                    char_literal180=(Token)match(input,86,FOLLOW_86_in_color1968);  
                    stream_86.add(char_literal180);


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
                    // 224:53: -> ^( COLORPRCTJ expr expr expr )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:224:56: ^( COLORPRCTJ expr expr expr )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:225:13: color_keyword
                    {
                    pushFollow(FOLLOW_color_keyword_in_color1994);
                    color_keyword181=color_keyword();

                    state._fsp--;

                    stream_color_keyword.add(color_keyword181.getTree());

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
                    // 225:27: -> ^( COLORKEYWORD color_keyword )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:225:30: ^( COLORKEYWORD color_keyword )
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:228:1: color_keyword : ( RED | WHITE | BLACK | BLUE | GREEN );
    public final AslParser.color_keyword_return color_keyword() throws RecognitionException {
        AslParser.color_keyword_return retval = new AslParser.color_keyword_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set182=null;

        AslTree set182_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:228:15: ( RED | WHITE | BLACK | BLUE | GREEN )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set182=(Token)input.LT(1);

            if ( input.LA(1)==BLACK||input.LA(1)==BLUE||input.LA(1)==GREEN||input.LA(1)==RED||input.LA(1)==WHITE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set182)
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:230:1: obj_type : ( CIRCLE | RECTANGLE | TEXT );
    public final AslParser.obj_type_return obj_type() throws RecognitionException {
        AslParser.obj_type_return retval = new AslParser.obj_type_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set183=null;

        AslTree set183_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:230:10: ( CIRCLE | RECTANGLE | TEXT )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set183=(Token)input.LT(1);

            if ( input.LA(1)==CIRCLE||input.LA(1)==RECTANGLE||input.LA(1)==TEXT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set183)
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:233:1: time : INT ( 's' | 'ms' ) ^;
    public final AslParser.time_return time() throws RecognitionException {
        AslParser.time_return retval = new AslParser.time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token INT184=null;
        Token set185=null;

        AslTree INT184_tree=null;
        AslTree set185_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:233:6: ( INT ( 's' | 'ms' ) ^)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:233:9: INT ( 's' | 'ms' ) ^
            {
            root_0 = (AslTree)adaptor.nil();


            INT184=(Token)match(input,INT,FOLLOW_INT_in_time2070); 
            INT184_tree = 
            (AslTree)adaptor.create(INT184)
            ;
            adaptor.addChild(root_0, INT184_tree);


            set185=(Token)input.LT(1);

            set185=(Token)input.LT(1);

            if ( input.LA(1)==91||input.LA(1)==93 ) {
                input.consume();
                root_0 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(set185)
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:236:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR187=null;
        AslParser.boolterm_return boolterm186 =null;

        AslParser.boolterm_return boolterm188 =null;


        AslTree OR187_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:236:9: ( boolterm ( OR ^ boolterm )* )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:236:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr2092);
            boolterm186=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm186.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:236:22: ( OR ^ boolterm )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==OR) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:236:23: OR ^ boolterm
            	    {
            	    OR187=(Token)match(input,OR,FOLLOW_OR_in_expr2095); 
            	    OR187_tree = 
            	    (AslTree)adaptor.create(OR187)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR187_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr2098);
            	    boolterm188=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm188.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:239:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND190=null;
        AslParser.boolfact_return boolfact189 =null;

        AslParser.boolfact_return boolfact191 =null;


        AslTree AND190_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:239:9: ( boolfact ( AND ^ boolfact )* )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:239:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm2118);
            boolfact189=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact189.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:239:22: ( AND ^ boolfact )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==AND) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:239:23: AND ^ boolfact
            	    {
            	    AND190=(Token)match(input,AND,FOLLOW_AND_in_boolterm2121); 
            	    AND190_tree = 
            	    (AslTree)adaptor.create(AND190)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND190_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm2124);
            	    boolfact191=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact191.getTree());

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
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:242:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL193=null;
        Token NOT_EQUAL194=null;
        Token LT195=null;
        Token LE196=null;
        Token GT197=null;
        Token GE198=null;
        AslParser.num_expr_return num_expr192 =null;

        AslParser.num_expr_return num_expr199 =null;


        AslTree EQUAL193_tree=null;
        AslTree NOT_EQUAL194_tree=null;
        AslTree LT195_tree=null;
        AslTree LE196_tree=null;
        AslTree GT197_tree=null;
        AslTree GE198_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:242:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:242:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact2144);
            num_expr192=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr192.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:242:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==EQUAL||LA30_0==GE||LA30_0==GT||LA30_0==LE||LA30_0==LT||LA30_0==NOT_EQUAL) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:242:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:242:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt29=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt29=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt29=2;
                        }
                        break;
                    case LT:
                        {
                        alt29=3;
                        }
                        break;
                    case LE:
                        {
                        alt29=4;
                        }
                        break;
                    case GT:
                        {
                        alt29=5;
                        }
                        break;
                    case GE:
                        {
                        alt29=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;

                    }

                    switch (alt29) {
                        case 1 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:242:24: EQUAL ^
                            {
                            EQUAL193=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact2148); 
                            EQUAL193_tree = 
                            (AslTree)adaptor.create(EQUAL193)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL193_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:242:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL194=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact2153); 
                            NOT_EQUAL194_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL194)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL194_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:242:46: LT ^
                            {
                            LT195=(Token)match(input,LT,FOLLOW_LT_in_boolfact2158); 
                            LT195_tree = 
                            (AslTree)adaptor.create(LT195)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT195_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:242:52: LE ^
                            {
                            LE196=(Token)match(input,LE,FOLLOW_LE_in_boolfact2163); 
                            LE196_tree = 
                            (AslTree)adaptor.create(LE196)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE196_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:242:58: GT ^
                            {
                            GT197=(Token)match(input,GT,FOLLOW_GT_in_boolfact2168); 
                            GT197_tree = 
                            (AslTree)adaptor.create(GT197)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT197_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:242:64: GE ^
                            {
                            GE198=(Token)match(input,GE,FOLLOW_GE_in_boolfact2173); 
                            GE198_tree = 
                            (AslTree)adaptor.create(GE198)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE198_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact2177);
                    num_expr199=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr199.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:245:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS201=null;
        Token MINUS202=null;
        AslParser.term_return term200 =null;

        AslParser.term_return term203 =null;


        AslTree PLUS201_tree=null;
        AslTree MINUS202_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:245:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:245:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr2197);
            term200=term();

            state._fsp--;

            adaptor.addChild(root_0, term200.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:245:18: ( ( PLUS ^| MINUS ^) term )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==MINUS||LA32_0==PLUS) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:245:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:245:20: ( PLUS ^| MINUS ^)
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==PLUS) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==MINUS) ) {
            	        alt31=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:245:21: PLUS ^
            	            {
            	            PLUS201=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr2202); 
            	            PLUS201_tree = 
            	            (AslTree)adaptor.create(PLUS201)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS201_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:245:29: MINUS ^
            	            {
            	            MINUS202=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr2207); 
            	            MINUS202_tree = 
            	            (AslTree)adaptor.create(MINUS202)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS202_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr2211);
            	    term203=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term203.getTree());

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
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:248:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL205=null;
        Token DIV206=null;
        Token MOD207=null;
        AslParser.factor_return factor204 =null;

        AslParser.factor_return factor208 =null;


        AslTree MUL205_tree=null;
        AslTree DIV206_tree=null;
        AslTree MOD207_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:248:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:248:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term2235);
            factor204=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor204.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:248:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==DIV||LA34_0==MOD||LA34_0==MUL) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:248:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:248:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt33=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt33=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt33=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt33=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt33) {
            	        case 1 :
            	            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:248:23: MUL ^
            	            {
            	            MUL205=(Token)match(input,MUL,FOLLOW_MUL_in_term2240); 
            	            MUL205_tree = 
            	            (AslTree)adaptor.create(MUL205)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL205_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:248:30: DIV ^
            	            {
            	            DIV206=(Token)match(input,DIV,FOLLOW_DIV_in_term2245); 
            	            DIV206_tree = 
            	            (AslTree)adaptor.create(DIV206)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV206_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:248:37: MOD ^
            	            {
            	            MOD207=(Token)match(input,MOD,FOLLOW_MOD_in_term2250); 
            	            MOD207_tree = 
            	            (AslTree)adaptor.create(MOD207)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD207_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term2254);
            	    factor208=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor208.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:251:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT209=null;
        Token PLUS210=null;
        Token MINUS211=null;
        AslParser.atom_return atom212 =null;


        AslTree NOT209_tree=null;
        AslTree PLUS210_tree=null;
        AslTree MINUS211_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:251:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:251:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:251:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt35=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt35=1;
                    }
                    break;
                case PLUS:
                    {
                    alt35=2;
                    }
                    break;
                case MINUS:
                    {
                    alt35=3;
                    }
                    break;
            }

            switch (alt35) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:251:14: NOT ^
                    {
                    NOT209=(Token)match(input,NOT,FOLLOW_NOT_in_factor2277); 
                    NOT209_tree = 
                    (AslTree)adaptor.create(NOT209)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT209_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:251:21: PLUS ^
                    {
                    PLUS210=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor2282); 
                    PLUS210_tree = 
                    (AslTree)adaptor.create(PLUS210)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS210_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:251:29: MINUS ^
                    {
                    MINUS211=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor2287); 
                    MINUS211_tree = 
                    (AslTree)adaptor.create(MINUS211)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS211_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor2292);
            atom212=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom212.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:257:1: atom : ( ID | INT | ID '.' ( attribute_name_expr ) -> ^( ATTR ID attribute_name_expr ) | ID '.' ( attribute_name_color ) -> ^( ATTR ID attribute_name_color ) | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID213=null;
        Token INT214=null;
        Token ID215=null;
        Token char_literal216=null;
        Token ID218=null;
        Token char_literal219=null;
        Token char_literal222=null;
        Token char_literal224=null;
        AslParser.attribute_name_expr_return attribute_name_expr217 =null;

        AslParser.attribute_name_color_return attribute_name_color220 =null;

        AslParser.funcall_return funcall221 =null;

        AslParser.expr_return expr223 =null;


        AslTree b_tree=null;
        AslTree ID213_tree=null;
        AslTree INT214_tree=null;
        AslTree ID215_tree=null;
        AslTree char_literal216_tree=null;
        AslTree ID218_tree=null;
        AslTree char_literal219_tree=null;
        AslTree char_literal222_tree=null;
        AslTree char_literal224_tree=null;
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_attribute_name_expr=new RewriteRuleSubtreeStream(adaptor,"rule attribute_name_expr");
        RewriteRuleSubtreeStream stream_attribute_name_color=new RewriteRuleSubtreeStream(adaptor,"rule attribute_name_color");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:257:9: ( ID | INT | ID '.' ( attribute_name_expr ) -> ^( ATTR ID attribute_name_expr ) | ID '.' ( attribute_name_color ) -> ^( ATTR ID attribute_name_color ) | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt37=7;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 88:
                    {
                    int LA37_5 = input.LA(3);

                    if ( ((LA37_5 >= POSX && LA37_5 <= POSY)||LA37_5==92) ) {
                        alt37=3;
                    }
                    else if ( (LA37_5==COLOR||LA37_5==STROKE) ) {
                        alt37=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 5, input);

                        throw nvae;

                    }
                    }
                    break;
                case 85:
                    {
                    alt37=6;
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
                case 86:
                case 87:
                case 90:
                    {
                    alt37=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;

                }

                }
                break;
            case INT:
                {
                alt37=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt37=5;
                }
                break;
            case 85:
                {
                alt37=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }

            switch (alt37) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:257:13: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID213=(Token)match(input,ID,FOLLOW_ID_in_atom2317); 
                    ID213_tree = 
                    (AslTree)adaptor.create(ID213)
                    ;
                    adaptor.addChild(root_0, ID213_tree);


                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:258:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT214=(Token)match(input,INT,FOLLOW_INT_in_atom2332); 
                    INT214_tree = 
                    (AslTree)adaptor.create(INT214)
                    ;
                    adaptor.addChild(root_0, INT214_tree);


                    }
                    break;
                case 3 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:259:13: ID '.' ( attribute_name_expr )
                    {
                    ID215=(Token)match(input,ID,FOLLOW_ID_in_atom2346);  
                    stream_ID.add(ID215);


                    char_literal216=(Token)match(input,88,FOLLOW_88_in_atom2348);  
                    stream_88.add(char_literal216);


                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:259:20: ( attribute_name_expr )
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:259:21: attribute_name_expr
                    {
                    pushFollow(FOLLOW_attribute_name_expr_in_atom2351);
                    attribute_name_expr217=attribute_name_expr();

                    state._fsp--;

                    stream_attribute_name_expr.add(attribute_name_expr217.getTree());

                    }


                    // AST REWRITE
                    // elements: attribute_name_expr, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 259:42: -> ^( ATTR ID attribute_name_expr )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:259:45: ^( ATTR ID attribute_name_expr )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:260:13: ID '.' ( attribute_name_color )
                    {
                    ID218=(Token)match(input,ID,FOLLOW_ID_in_atom2377);  
                    stream_ID.add(ID218);


                    char_literal219=(Token)match(input,88,FOLLOW_88_in_atom2379);  
                    stream_88.add(char_literal219);


                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:260:20: ( attribute_name_color )
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:260:22: attribute_name_color
                    {
                    pushFollow(FOLLOW_attribute_name_color_in_atom2383);
                    attribute_name_color220=attribute_name_color();

                    state._fsp--;

                    stream_attribute_name_color.add(attribute_name_color220.getTree());

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
                    // 260:44: -> ^( ATTR ID attribute_name_color )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:260:47: ^( ATTR ID attribute_name_color )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:261:13: (b= TRUE |b= FALSE )
                    {
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:261:13: (b= TRUE |b= FALSE )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==TRUE) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==FALSE) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;

                    }
                    switch (alt36) {
                        case 1 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:261:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom2411);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:261:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom2417);  
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
                    // 261:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:261:36: ^( BOOLEAN[$b,$b.text] )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:262:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom2440);
                    funcall221=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall221.getTree());

                    }
                    break;
                case 7 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:263:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal222=(Token)match(input,85,FOLLOW_85_in_atom2454); 

                    pushFollow(FOLLOW_expr_in_atom2457);
                    expr223=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr223.getTree());

                    char_literal224=(Token)match(input,86,FOLLOW_86_in_atom2459); 

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:267:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID225=null;
        Token char_literal226=null;
        Token char_literal228=null;
        AslParser.expr_list_return expr_list227 =null;


        AslTree ID225_tree=null;
        AslTree char_literal226_tree=null;
        AslTree char_literal228_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:267:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:267:13: ID '(' ( expr_list )? ')'
            {
            ID225=(Token)match(input,ID,FOLLOW_ID_in_funcall2480);  
            stream_ID.add(ID225);


            char_literal226=(Token)match(input,85,FOLLOW_85_in_funcall2482);  
            stream_85.add(char_literal226);


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:267:20: ( expr_list )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==FALSE||LA38_0==ID||LA38_0==INT||LA38_0==MINUS||LA38_0==NOT||LA38_0==PLUS||LA38_0==TRUE||LA38_0==85) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:267:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall2484);
                    expr_list227=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list227.getTree());

                    }
                    break;

            }


            char_literal228=(Token)match(input,86,FOLLOW_86_in_funcall2487);  
            stream_86.add(char_literal228);


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
            // 267:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:267:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:267:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:267:61: ( expr_list )?
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:271:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal230=null;
        AslParser.expr_return expr229 =null;

        AslParser.expr_return expr231 =null;


        AslTree char_literal230_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:271:10: ( expr ( ',' ! expr )* )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:271:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list2520);
            expr229=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr229.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:271:18: ( ',' ! expr )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==87) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:271:19: ',' ! expr
            	    {
            	    char_literal230=(Token)match(input,87,FOLLOW_87_in_expr_list2523); 

            	    pushFollow(FOLLOW_expr_in_expr_list2526);
            	    expr231=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr231.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
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


 

    public static final BitSet FOLLOW_func_in_prog208 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_EOF_in_prog211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func253 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_func256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_params_in_func258 = new BitSet(new long[]{0x10F00F0000700200L,0x0000000004050648L});
    public static final BitSet FOLLOW_block_instructions_in_func260 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_params282 = new BitSet(new long[]{0x0000040000000000L,0x0000000000500000L});
    public static final BitSet FOLLOW_paramlist_in_params284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_params287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist313 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_paramlist316 = new BitSet(new long[]{0x0000040000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_param_in_paramlist319 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_84_in_param344 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_param348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions410 = new BitSet(new long[]{0x10F00F0000700202L,0x0000000004050648L});
    public static final BitSet FOLLOW_instruction_spc_in_instruction451 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_instruction453 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_block_in_instructions_brack817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign829 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EEQUAL_in_assign833 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_expr_in_assign835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt868 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt873 = new BitSet(new long[]{0x10F00F0000700200L,0x0000000004050648L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt876 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt879 = new BitSet(new long[]{0x10F00F0000700200L,0x0000000004050648L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt882 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt912 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_expr_in_while_stmt915 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DO_in_while_stmt917 = new BitSet(new long[]{0x10F00F0000700200L,0x0000000004050648L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt920 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt947 = new BitSet(new long[]{0x4204140100000002L,0x0000000000208000L});
    public static final BitSet FOLLOW_expr_in_return_stmt950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read974 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_read977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write999 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208800L});
    public static final BitSet FOLLOW_expr_in_write1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create1031 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_create1034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_create1036 = new BitSet(new long[]{0x0000000000001000L,0x0000000000002010L});
    public static final BitSet FOLLOW_obj_type_in_create1039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_create1041 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_expr_in_create1044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_create1046 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_expr_in_create1049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_87_in_create1052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_list_attributes_in_create1055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_create1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTROY_in_destroy1079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_destroy1082 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_destroy1085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_destroy1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_time_in_move1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_no_time_in_move1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_T_in_move_time1131 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_move_time1134 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_time_in_move_time1137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_move_time1139 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_expr_in_move_time1142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_move_time1144 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_expr_in_move_time1147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_move_time1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_move_no_time1168 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_move_no_time1171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_move_no_time1173 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_expr_in_move_no_time1176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_move_no_time1178 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_expr_in_move_no_time1181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_move_no_time1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_time_in_modify1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_no_time_in_modify1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODIFY_T_in_modify_time1227 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_modify_time1230 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_time_in_modify_time1232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_list_attributes_in_modify_time1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODIFY_in_modify_no_time1251 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_modify_no_time1254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_list_attributes_in_modify_no_time1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_block1274 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_block1277 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_block1279 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_create_in_block1283 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_block1285 = new BitSet(new long[]{0x0000000000100000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_block1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parallel_time_in_parallel1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parallel_no_time_in_parallel1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_no_time_in_instructions_notime1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_no_time_in_instructions_notime1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_show_no_time_in_instructions_notime1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hide_no_time_in_instructions_notime1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instructions_notime_in_block_instructions_notime1339 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_block_instructions_notime1340 = new BitSet(new long[]{0x0050010000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_instructions_notime_in_block_instructions_notime1344 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_block_instructions_notime1346 = new BitSet(new long[]{0x0050010000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_PARALLEL_in_parallel_time1393 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_time_in_parallel_time1396 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_parallel_time1398 = new BitSet(new long[]{0x0050010000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_block_instructions_notime_in_parallel_time1401 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_parallel_time1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_time_in_instructions_time1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_time_in_instructions_time1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_show_time_in_instructions_time1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hide_time_in_instructions_time1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instructions_time_in_block_instructions_time1431 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_block_instructions_time1433 = new BitSet(new long[]{0x00A0020000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_instructions_time_in_block_instructions_time1437 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_block_instructions_time1438 = new BitSet(new long[]{0x00A0020000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_PARALLEL_in_parallel_no_time1485 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_parallel_no_time1488 = new BitSet(new long[]{0x00A0020000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_block_instructions_time_in_parallel_no_time1491 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_parallel_no_time1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_list_attributes1502 = new BitSet(new long[]{0x8000000000002000L,0x0000000010001001L});
    public static final BitSet FOLLOW_attribute_in_list_attributes1504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_87_in_list_attributes1507 = new BitSet(new long[]{0x8000000000002000L,0x0000000010001001L});
    public static final BitSet FOLLOW_attribute_in_list_attributes1509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_86_in_list_attributes1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_name_color_in_attribute1543 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_attribute1546 = new BitSet(new long[]{0x0000041000004500L,0x00000000000201A0L});
    public static final BitSet FOLLOW_obj_attribute_in_attribute1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_name_expr_in_attribute1567 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_attribute1570 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_expr_in_attribute1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_color_in_obj_attribute1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_obj_attribute1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_obj_attribute1639 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_obj_attribute1641 = new BitSet(new long[]{0x0000000000002000L,0x0000000000001000L});
    public static final BitSet FOLLOW_attribute_name_color_in_obj_attribute1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_show_time_in_show1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_show_no_time_in_show1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_T_in_show_time1693 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_show_time1696 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_time_in_show_time1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_show_no_time1707 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_show_no_time1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hide_time_in_hide1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hide_no_time_in_hide1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HIDE_T_in_hide_time1730 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_hide_time1733 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_time_in_hide_time1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HIDE_in_hide_no_time1744 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_hide_no_time1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELAY_in_delay1754 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_time_in_delay1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLORHEX_in_color1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RGB_in_color1914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_color1916 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_expr_in_color1918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_color1920 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_expr_in_color1922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_color1924 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_expr_in_color1926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_color1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RGBPRCTJ_in_color1954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_color1956 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_expr_in_color1958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_color1960 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_expr_in_color1962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_color1964 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_expr_in_color1966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_color1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_color_keyword_in_color1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_time2070 = new BitSet(new long[]{0x0000000000000000L,0x0000000028000000L});
    public static final BitSet FOLLOW_set_in_time2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr2092 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_OR_in_expr2095 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_boolterm_in_expr2098 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm2118 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm2121 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm2124 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact2144 = new BitSet(new long[]{0x0402202840000002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact2148 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact2153 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_LT_in_boolfact2158 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_LE_in_boolfact2163 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_GT_in_boolfact2168 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_GE_in_boolfact2173 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr2197 = new BitSet(new long[]{0x4004000000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr2202 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr2207 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_term_in_num_expr2211 = new BitSet(new long[]{0x4004000000000002L});
    public static final BitSet FOLLOW_factor_in_term2235 = new BitSet(new long[]{0x0108000000800002L});
    public static final BitSet FOLLOW_MUL_in_term2240 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_DIV_in_term2245 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_MOD_in_term2250 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_factor_in_term2254 = new BitSet(new long[]{0x0108000000800002L});
    public static final BitSet FOLLOW_NOT_in_factor2277 = new BitSet(new long[]{0x0000140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_PLUS_in_factor2282 = new BitSet(new long[]{0x0000140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_MINUS_in_factor2287 = new BitSet(new long[]{0x0000140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_atom_in_factor2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom2346 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_atom2348 = new BitSet(new long[]{0x8000000000000000L,0x0000000010000001L});
    public static final BitSet FOLLOW_attribute_name_expr_in_atom2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom2377 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_atom2379 = new BitSet(new long[]{0x0000000000002000L,0x0000000000001000L});
    public static final BitSet FOLLOW_attribute_name_color_in_atom2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_atom2454 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_expr_in_atom2457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_atom2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall2480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_funcall2482 = new BitSet(new long[]{0x4204140100000000L,0x0000000000608000L});
    public static final BitSet FOLLOW_expr_list_in_funcall2484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_funcall2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list2520 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_expr_list2523 = new BitSet(new long[]{0x4204140100000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_expr_in_expr_list2526 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});

}