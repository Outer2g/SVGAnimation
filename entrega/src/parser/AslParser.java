// $ANTLR 3.4 /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g 2016-06-01 22:08:15

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "ATTR", "BLACK", "BLOCK", "BLUE", "BOOLEAN", "CIRCLE", "COLOR", "COLORHEX", "COLORHEXA", "COLORINT", "COLORKEYWORD", "COLORPRCTJ", "COMMENT", "CREATE", "DELAY", "DESTROY", "DIV", "DO", "EEQUAL", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GREEN", "GT", "HASHTAG", "HEIGHT", "HEXADIGIT", "HIDE", "HIDE_T", "ID", "IF", "INT", "LE", "LIST_ATTR", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MODIFY", "MODIFY_T", "MOVE", "MOVE_T", "MUL", "NOT", "NOT_EQUAL", "OR", "PARALLEL", "PARAMS", "PLUS", "POSX", "POSY", "PREF", "PVALUE", "READ", "RECALC", "RECTANGLE", "RED", "RETURN", "RGB", "RGBPRCTJ", "SHOW", "SHOW_T", "STRING", "STROKE", "TEXT", "THEN", "TRUE", "WHILE", "WHITE", "WIDTH", "WRITE", "WS", "'&'", "'('", "')'", "','", "'.'", "':'", "';'", "'ms'", "'r'", "'s'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
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
    public static final int HEIGHT=39;
    public static final int HEXADIGIT=40;
    public static final int HIDE=41;
    public static final int HIDE_T=42;
    public static final int ID=43;
    public static final int IF=44;
    public static final int INT=45;
    public static final int LE=46;
    public static final int LIST_ATTR=47;
    public static final int LIST_FUNCTIONS=48;
    public static final int LIST_INSTR=49;
    public static final int LT=50;
    public static final int MINUS=51;
    public static final int MOD=52;
    public static final int MODIFY=53;
    public static final int MODIFY_T=54;
    public static final int MOVE=55;
    public static final int MOVE_T=56;
    public static final int MUL=57;
    public static final int NOT=58;
    public static final int NOT_EQUAL=59;
    public static final int OR=60;
    public static final int PARALLEL=61;
    public static final int PARAMS=62;
    public static final int PLUS=63;
    public static final int POSX=64;
    public static final int POSY=65;
    public static final int PREF=66;
    public static final int PVALUE=67;
    public static final int READ=68;
    public static final int RECALC=69;
    public static final int RECTANGLE=70;
    public static final int RED=71;
    public static final int RETURN=72;
    public static final int RGB=73;
    public static final int RGBPRCTJ=74;
    public static final int SHOW=75;
    public static final int SHOW_T=76;
    public static final int STRING=77;
    public static final int STROKE=78;
    public static final int TEXT=79;
    public static final int THEN=80;
    public static final int TRUE=81;
    public static final int WHILE=82;
    public static final int WHITE=83;
    public static final int WIDTH=84;
    public static final int WRITE=85;
    public static final int WS=86;

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
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:74:9: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:74:11: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,88,FOLLOW_88_in_params282);  
            stream_88.add(char_literal8);


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:74:15: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==87) ) {
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


            char_literal10=(Token)match(input,89,FOLLOW_89_in_params287);  
            stream_89.add(char_literal10);


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

                if ( (LA3_0==90) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:78:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,90,FOLLOW_90_in_paramlist316); 

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
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:83:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==87) ) {
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
                    char_literal14=(Token)match(input,87,FOLLOW_87_in_param344);  
                    stream_87.add(char_literal14);


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

                if ( (LA5_0==BLOCK||(LA5_0 >= CREATE && LA5_0 <= DESTROY)||(LA5_0 >= HIDE && LA5_0 <= IF)||(LA5_0 >= MODIFY && LA5_0 <= MOVE_T)||LA5_0==PARALLEL||(LA5_0 >= READ && LA5_0 <= RECALC)||LA5_0==RETURN||(LA5_0 >= SHOW && LA5_0 <= SHOW_T)||LA5_0==WHILE||LA5_0==WRITE||LA5_0==93) ) {
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

            if ( ((LA6_0 >= CREATE && LA6_0 <= DESTROY)||(LA6_0 >= HIDE && LA6_0 <= IF)||(LA6_0 >= MODIFY && LA6_0 <= MOVE_T)||(LA6_0 >= READ && LA6_0 <= RECALC)||LA6_0==RETURN||(LA6_0 >= SHOW && LA6_0 <= SHOW_T)||LA6_0==WHILE||LA6_0==WRITE||LA6_0==93) ) {
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

                    char_literal17=(Token)match(input,93,FOLLOW_93_in_instruction453); 

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:99:1: instruction_spc : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | create | destroy | move | modify | show | hide | delay | recalcCentro |);
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

        AslParser.recalcCentro_return recalcCentro33 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:100:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | create | destroy | move | modify | show | hide | delay | recalcCentro |)
            int alt7=16;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EEQUAL) ) {
                    alt7=1;
                }
                else if ( (LA7_1==88) ) {
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
            case RECALC:
                {
                alt7=15;
                }
                break;
            case 93:
                {
                alt7=16;
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:115:13: recalcCentro
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_recalcCentro_in_instruction_spc780);
                    recalcCentro33=recalcCentro();

                    state._fsp--;

                    adaptor.addChild(root_0, recalcCentro33.getTree());

                    }
                    break;
                case 16 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:117:9: 
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:119:1: instructions_brack : ( parallel | block );
    public final AslParser.instructions_brack_return instructions_brack() throws RecognitionException {
        AslParser.instructions_brack_return retval = new AslParser.instructions_brack_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.parallel_return parallel34 =null;

        AslParser.block_return block35 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:119:20: ( parallel | block )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:119:22: parallel
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_parallel_in_instructions_brack826);
                    parallel34=parallel();

                    state._fsp--;

                    adaptor.addChild(root_0, parallel34.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:119:34: block
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_block_in_instructions_brack831);
                    block35=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block35.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:122:1: assign : ID eq= EEQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID36=null;
        AslParser.expr_return expr37 =null;


        AslTree eq_tree=null;
        AslTree ID36_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EEQUAL=new RewriteRuleTokenStream(adaptor,"token EEQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:122:9: ( ID eq= EEQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:122:13: ID eq= EEQUAL expr
            {
            ID36=(Token)match(input,ID,FOLLOW_ID_in_assign843);  
            stream_ID.add(ID36);


            eq=(Token)match(input,EEQUAL,FOLLOW_EEQUAL_in_assign847);  
            stream_EEQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign849);
            expr37=expr();

            state._fsp--;

            stream_expr.add(expr37.getTree());

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
            // 122:31: -> ^( ASSIGN[$eq,\":=\"] ID expr )
            {
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:122:34: ^( ASSIGN[$eq,\":=\"] ID expr )
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:125:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF38=null;
        Token THEN40=null;
        Token ELSE42=null;
        Token ENDIF44=null;
        AslParser.expr_return expr39 =null;

        AslParser.block_instructions_return block_instructions41 =null;

        AslParser.block_instructions_return block_instructions43 =null;


        AslTree IF38_tree=null;
        AslTree THEN40_tree=null;
        AslTree ELSE42_tree=null;
        AslTree ENDIF44_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:125:13: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:125:17: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF38=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt882); 
            IF38_tree = 
            (AslTree)adaptor.create(IF38)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF38_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt885);
            expr39=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr39.getTree());

            THEN40=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt887); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt890);
            block_instructions41=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions41.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:125:51: ( ELSE ! block_instructions )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ELSE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:125:52: ELSE ! block_instructions
                    {
                    ELSE42=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt893); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt896);
                    block_instructions43=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions43.getTree());

                    }
                    break;

            }


            ENDIF44=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt900); 

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:129:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE45=null;
        Token DO47=null;
        Token ENDWHILE49=null;
        AslParser.expr_return expr46 =null;

        AslParser.block_instructions_return block_instructions48 =null;


        AslTree WHILE45_tree=null;
        AslTree DO47_tree=null;
        AslTree ENDWHILE49_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:129:13: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:129:17: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE45=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt926); 
            WHILE45_tree = 
            (AslTree)adaptor.create(WHILE45)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE45_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt929);
            expr46=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr46.getTree());

            DO47=(Token)match(input,DO,FOLLOW_DO_in_while_stmt931); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt934);
            block_instructions48=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions48.getTree());

            ENDWHILE49=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt936); 

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:133:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN50=null;
        AslParser.expr_return expr51 =null;


        AslTree RETURN50_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:133:13: ( RETURN ^ ( expr )? )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:133:17: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN50=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt961); 
            RETURN50_tree = 
            (AslTree)adaptor.create(RETURN50)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN50_tree, root_0);


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:133:25: ( expr )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==FALSE||LA10_0==ID||LA10_0==INT||LA10_0==MINUS||LA10_0==NOT||LA10_0==PLUS||LA10_0==TRUE||LA10_0==88) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:133:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt964);
                    expr51=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr51.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:137:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ52=null;
        Token ID53=null;

        AslTree READ52_tree=null;
        AslTree ID53_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:137:9: ( READ ^ ID )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:137:13: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ52=(Token)match(input,READ,FOLLOW_READ_in_read988); 
            READ52_tree = 
            (AslTree)adaptor.create(READ52)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ52_tree, root_0);


            ID53=(Token)match(input,ID,FOLLOW_ID_in_read991); 
            ID53_tree = 
            (AslTree)adaptor.create(ID53)
            ;
            adaptor.addChild(root_0, ID53_tree);


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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:141:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE54=null;
        Token STRING56=null;
        AslParser.expr_return expr55 =null;


        AslTree WRITE54_tree=null;
        AslTree STRING56_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:141:9: ( WRITE ^ ( expr | STRING ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:141:13: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE54=(Token)match(input,WRITE,FOLLOW_WRITE_in_write1013); 
            WRITE54_tree = 
            (AslTree)adaptor.create(WRITE54)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE54_tree, root_0);


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:141:20: ( expr | STRING )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==FALSE||LA11_0==ID||LA11_0==INT||LA11_0==MINUS||LA11_0==NOT||LA11_0==PLUS||LA11_0==TRUE||LA11_0==88) ) {
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:141:21: expr
                    {
                    pushFollow(FOLLOW_expr_in_write1017);
                    expr55=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr55.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:141:28: STRING
                    {
                    STRING56=(Token)match(input,STRING,FOLLOW_STRING_in_write1021); 
                    STRING56_tree = 
                    (AslTree)adaptor.create(STRING56)
                    ;
                    adaptor.addChild(root_0, STRING56_tree);


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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:146:1: create : CREATE ^ ID '(' ! obj_type ',' ! expr ',' ! expr ( ',' ! list_attributes )? ')' !;
    public final AslParser.create_return create() throws RecognitionException {
        AslParser.create_return retval = new AslParser.create_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token CREATE57=null;
        Token ID58=null;
        Token char_literal59=null;
        Token char_literal61=null;
        Token char_literal63=null;
        Token char_literal65=null;
        Token char_literal67=null;
        AslParser.obj_type_return obj_type60 =null;

        AslParser.expr_return expr62 =null;

        AslParser.expr_return expr64 =null;

        AslParser.list_attributes_return list_attributes66 =null;


        AslTree CREATE57_tree=null;
        AslTree ID58_tree=null;
        AslTree char_literal59_tree=null;
        AslTree char_literal61_tree=null;
        AslTree char_literal63_tree=null;
        AslTree char_literal65_tree=null;
        AslTree char_literal67_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:146:9: ( CREATE ^ ID '(' ! obj_type ',' ! expr ',' ! expr ( ',' ! list_attributes )? ')' !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:146:13: CREATE ^ ID '(' ! obj_type ',' ! expr ',' ! expr ( ',' ! list_attributes )? ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            CREATE57=(Token)match(input,CREATE,FOLLOW_CREATE_in_create1045); 
            CREATE57_tree = 
            (AslTree)adaptor.create(CREATE57)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(CREATE57_tree, root_0);


            ID58=(Token)match(input,ID,FOLLOW_ID_in_create1048); 
            ID58_tree = 
            (AslTree)adaptor.create(ID58)
            ;
            adaptor.addChild(root_0, ID58_tree);


            char_literal59=(Token)match(input,88,FOLLOW_88_in_create1050); 

            pushFollow(FOLLOW_obj_type_in_create1053);
            obj_type60=obj_type();

            state._fsp--;

            adaptor.addChild(root_0, obj_type60.getTree());

            char_literal61=(Token)match(input,90,FOLLOW_90_in_create1055); 

            pushFollow(FOLLOW_expr_in_create1058);
            expr62=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr62.getTree());

            char_literal63=(Token)match(input,90,FOLLOW_90_in_create1060); 

            pushFollow(FOLLOW_expr_in_create1063);
            expr64=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr64.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:146:58: ( ',' ! list_attributes )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==90) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:146:59: ',' ! list_attributes
                    {
                    char_literal65=(Token)match(input,90,FOLLOW_90_in_create1066); 

                    pushFollow(FOLLOW_list_attributes_in_create1069);
                    list_attributes66=list_attributes();

                    state._fsp--;

                    adaptor.addChild(root_0, list_attributes66.getTree());

                    }
                    break;

            }


            char_literal67=(Token)match(input,89,FOLLOW_89_in_create1073); 

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:149:1: destroy : DESTROY ^ '(' ! ID ')' !;
    public final AslParser.destroy_return destroy() throws RecognitionException {
        AslParser.destroy_return retval = new AslParser.destroy_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token DESTROY68=null;
        Token char_literal69=null;
        Token ID70=null;
        Token char_literal71=null;

        AslTree DESTROY68_tree=null;
        AslTree char_literal69_tree=null;
        AslTree ID70_tree=null;
        AslTree char_literal71_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:149:9: ( DESTROY ^ '(' ! ID ')' !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:149:13: DESTROY ^ '(' ! ID ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            DESTROY68=(Token)match(input,DESTROY,FOLLOW_DESTROY_in_destroy1093); 
            DESTROY68_tree = 
            (AslTree)adaptor.create(DESTROY68)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(DESTROY68_tree, root_0);


            char_literal69=(Token)match(input,88,FOLLOW_88_in_destroy1096); 

            ID70=(Token)match(input,ID,FOLLOW_ID_in_destroy1099); 
            ID70_tree = 
            (AslTree)adaptor.create(ID70)
            ;
            adaptor.addChild(root_0, ID70_tree);


            char_literal71=(Token)match(input,89,FOLLOW_89_in_destroy1101); 

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:152:1: move : ( move_time | move_no_time );
    public final AslParser.move_return move() throws RecognitionException {
        AslParser.move_return retval = new AslParser.move_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.move_time_return move_time72 =null;

        AslParser.move_no_time_return move_no_time73 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:152:9: ( move_time | move_no_time )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:152:13: move_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_time_in_move1124);
                    move_time72=move_time();

                    state._fsp--;

                    adaptor.addChild(root_0, move_time72.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:152:25: move_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_no_time_in_move1128);
                    move_no_time73=move_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, move_no_time73.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:155:1: move_time : MOVE_T ^ ID time '(' ! expr ',' ! expr ')' !;
    public final AslParser.move_time_return move_time() throws RecognitionException {
        AslParser.move_time_return retval = new AslParser.move_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MOVE_T74=null;
        Token ID75=null;
        Token char_literal77=null;
        Token char_literal79=null;
        Token char_literal81=null;
        AslParser.time_return time76 =null;

        AslParser.expr_return expr78 =null;

        AslParser.expr_return expr80 =null;


        AslTree MOVE_T74_tree=null;
        AslTree ID75_tree=null;
        AslTree char_literal77_tree=null;
        AslTree char_literal79_tree=null;
        AslTree char_literal81_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:155:11: ( MOVE_T ^ ID time '(' ! expr ',' ! expr ')' !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:155:13: MOVE_T ^ ID time '(' ! expr ',' ! expr ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            MOVE_T74=(Token)match(input,MOVE_T,FOLLOW_MOVE_T_in_move_time1145); 
            MOVE_T74_tree = 
            (AslTree)adaptor.create(MOVE_T74)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MOVE_T74_tree, root_0);


            ID75=(Token)match(input,ID,FOLLOW_ID_in_move_time1148); 
            ID75_tree = 
            (AslTree)adaptor.create(ID75)
            ;
            adaptor.addChild(root_0, ID75_tree);


            pushFollow(FOLLOW_time_in_move_time1151);
            time76=time();

            state._fsp--;

            adaptor.addChild(root_0, time76.getTree());

            char_literal77=(Token)match(input,88,FOLLOW_88_in_move_time1153); 

            pushFollow(FOLLOW_expr_in_move_time1156);
            expr78=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr78.getTree());

            char_literal79=(Token)match(input,90,FOLLOW_90_in_move_time1158); 

            pushFollow(FOLLOW_expr_in_move_time1161);
            expr80=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr80.getTree());

            char_literal81=(Token)match(input,89,FOLLOW_89_in_move_time1164); 

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:158:1: move_no_time : MOVE ^ ID '(' ! expr ',' ! expr ')' !;
    public final AslParser.move_no_time_return move_no_time() throws RecognitionException {
        AslParser.move_no_time_return retval = new AslParser.move_no_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MOVE82=null;
        Token ID83=null;
        Token char_literal84=null;
        Token char_literal86=null;
        Token char_literal88=null;
        AslParser.expr_return expr85 =null;

        AslParser.expr_return expr87 =null;


        AslTree MOVE82_tree=null;
        AslTree ID83_tree=null;
        AslTree char_literal84_tree=null;
        AslTree char_literal86_tree=null;
        AslTree char_literal88_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:158:14: ( MOVE ^ ID '(' ! expr ',' ! expr ')' !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:158:16: MOVE ^ ID '(' ! expr ',' ! expr ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            MOVE82=(Token)match(input,MOVE,FOLLOW_MOVE_in_move_no_time1182); 
            MOVE82_tree = 
            (AslTree)adaptor.create(MOVE82)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MOVE82_tree, root_0);


            ID83=(Token)match(input,ID,FOLLOW_ID_in_move_no_time1185); 
            ID83_tree = 
            (AslTree)adaptor.create(ID83)
            ;
            adaptor.addChild(root_0, ID83_tree);


            char_literal84=(Token)match(input,88,FOLLOW_88_in_move_no_time1187); 

            pushFollow(FOLLOW_expr_in_move_no_time1190);
            expr85=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr85.getTree());

            char_literal86=(Token)match(input,90,FOLLOW_90_in_move_no_time1192); 

            pushFollow(FOLLOW_expr_in_move_no_time1195);
            expr87=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr87.getTree());

            char_literal88=(Token)match(input,89,FOLLOW_89_in_move_no_time1197); 

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:161:1: modify : ( modify_time | modify_no_time );
    public final AslParser.modify_return modify() throws RecognitionException {
        AslParser.modify_return retval = new AslParser.modify_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.modify_time_return modify_time89 =null;

        AslParser.modify_no_time_return modify_no_time90 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:161:11: ( modify_time | modify_no_time )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:161:15: modify_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_time_in_modify1220);
                    modify_time89=modify_time();

                    state._fsp--;

                    adaptor.addChild(root_0, modify_time89.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:161:29: modify_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_no_time_in_modify1224);
                    modify_no_time90=modify_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, modify_no_time90.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:164:1: modify_time : MODIFY_T ^ ID time list_attributes ;
    public final AslParser.modify_time_return modify_time() throws RecognitionException {
        AslParser.modify_time_return retval = new AslParser.modify_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MODIFY_T91=null;
        Token ID92=null;
        AslParser.time_return time93 =null;

        AslParser.list_attributes_return list_attributes94 =null;


        AslTree MODIFY_T91_tree=null;
        AslTree ID92_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:164:13: ( MODIFY_T ^ ID time list_attributes )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:164:15: MODIFY_T ^ ID time list_attributes
            {
            root_0 = (AslTree)adaptor.nil();


            MODIFY_T91=(Token)match(input,MODIFY_T,FOLLOW_MODIFY_T_in_modify_time1241); 
            MODIFY_T91_tree = 
            (AslTree)adaptor.create(MODIFY_T91)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MODIFY_T91_tree, root_0);


            ID92=(Token)match(input,ID,FOLLOW_ID_in_modify_time1244); 
            ID92_tree = 
            (AslTree)adaptor.create(ID92)
            ;
            adaptor.addChild(root_0, ID92_tree);


            pushFollow(FOLLOW_time_in_modify_time1246);
            time93=time();

            state._fsp--;

            adaptor.addChild(root_0, time93.getTree());

            pushFollow(FOLLOW_list_attributes_in_modify_time1248);
            list_attributes94=list_attributes();

            state._fsp--;

            adaptor.addChild(root_0, list_attributes94.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:167:1: modify_no_time : MODIFY ^ ID list_attributes ;
    public final AslParser.modify_no_time_return modify_no_time() throws RecognitionException {
        AslParser.modify_no_time_return retval = new AslParser.modify_no_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MODIFY95=null;
        Token ID96=null;
        AslParser.list_attributes_return list_attributes97 =null;


        AslTree MODIFY95_tree=null;
        AslTree ID96_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:167:16: ( MODIFY ^ ID list_attributes )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:167:18: MODIFY ^ ID list_attributes
            {
            root_0 = (AslTree)adaptor.nil();


            MODIFY95=(Token)match(input,MODIFY,FOLLOW_MODIFY_in_modify_no_time1265); 
            MODIFY95_tree = 
            (AslTree)adaptor.create(MODIFY95)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MODIFY95_tree, root_0);


            ID96=(Token)match(input,ID,FOLLOW_ID_in_modify_no_time1268); 
            ID96_tree = 
            (AslTree)adaptor.create(ID96)
            ;
            adaptor.addChild(root_0, ID96_tree);


            pushFollow(FOLLOW_list_attributes_in_modify_no_time1270);
            list_attributes97=list_attributes();

            state._fsp--;

            adaptor.addChild(root_0, list_attributes97.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:170:1: block : BLOCK ^ ID '{' ! ( create ';' !)+ '}' !;
    public final AslParser.block_return block() throws RecognitionException {
        AslParser.block_return retval = new AslParser.block_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token BLOCK98=null;
        Token ID99=null;
        Token char_literal100=null;
        Token char_literal102=null;
        Token char_literal103=null;
        AslParser.create_return create101 =null;


        AslTree BLOCK98_tree=null;
        AslTree ID99_tree=null;
        AslTree char_literal100_tree=null;
        AslTree char_literal102_tree=null;
        AslTree char_literal103_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:170:7: ( BLOCK ^ ID '{' ! ( create ';' !)+ '}' !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:170:9: BLOCK ^ ID '{' ! ( create ';' !)+ '}' !
            {
            root_0 = (AslTree)adaptor.nil();


            BLOCK98=(Token)match(input,BLOCK,FOLLOW_BLOCK_in_block1288); 
            BLOCK98_tree = 
            (AslTree)adaptor.create(BLOCK98)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(BLOCK98_tree, root_0);


            ID99=(Token)match(input,ID,FOLLOW_ID_in_block1291); 
            ID99_tree = 
            (AslTree)adaptor.create(ID99)
            ;
            adaptor.addChild(root_0, ID99_tree);


            char_literal100=(Token)match(input,97,FOLLOW_97_in_block1293); 

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:170:24: ( create ';' !)+
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
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:170:25: create ';' !
            	    {
            	    pushFollow(FOLLOW_create_in_block1297);
            	    create101=create();

            	    state._fsp--;

            	    adaptor.addChild(root_0, create101.getTree());

            	    char_literal102=(Token)match(input,93,FOLLOW_93_in_block1299); 

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


            char_literal103=(Token)match(input,98,FOLLOW_98_in_block1304); 

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


    public static class recalcCentro_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "recalcCentro"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:172:1: recalcCentro : RECALC ^ ID ;
    public final AslParser.recalcCentro_return recalcCentro() throws RecognitionException {
        AslParser.recalcCentro_return retval = new AslParser.recalcCentro_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RECALC104=null;
        Token ID105=null;

        AslTree RECALC104_tree=null;
        AslTree ID105_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:172:14: ( RECALC ^ ID )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:172:17: RECALC ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            RECALC104=(Token)match(input,RECALC,FOLLOW_RECALC_in_recalcCentro1322); 
            RECALC104_tree = 
            (AslTree)adaptor.create(RECALC104)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RECALC104_tree, root_0);


            ID105=(Token)match(input,ID,FOLLOW_ID_in_recalcCentro1325); 
            ID105_tree = 
            (AslTree)adaptor.create(ID105)
            ;
            adaptor.addChild(root_0, ID105_tree);


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
    // $ANTLR end "recalcCentro"


    public static class parallel_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parallel"
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:174:1: parallel : ( parallel_time | parallel_no_time );
    public final AslParser.parallel_return parallel() throws RecognitionException {
        AslParser.parallel_return retval = new AslParser.parallel_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.parallel_time_return parallel_time106 =null;

        AslParser.parallel_no_time_return parallel_no_time107 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:174:10: ( parallel_time | parallel_no_time )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==PARALLEL) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==97) ) {
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:174:12: parallel_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_parallel_time_in_parallel1342);
                    parallel_time106=parallel_time();

                    state._fsp--;

                    adaptor.addChild(root_0, parallel_time106.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:174:28: parallel_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_parallel_no_time_in_parallel1346);
                    parallel_no_time107=parallel_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, parallel_no_time107.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:176:1: instructions_notime : ( move_no_time | modify_no_time | show_no_time | hide_no_time );
    public final AslParser.instructions_notime_return instructions_notime() throws RecognitionException {
        AslParser.instructions_notime_return retval = new AslParser.instructions_notime_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.move_no_time_return move_no_time108 =null;

        AslParser.modify_no_time_return modify_no_time109 =null;

        AslParser.show_no_time_return show_no_time110 =null;

        AslParser.hide_no_time_return hide_no_time111 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:176:21: ( move_no_time | modify_no_time | show_no_time | hide_no_time )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:176:23: move_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_no_time_in_instructions_notime1354);
                    move_no_time108=move_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, move_no_time108.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:176:38: modify_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_no_time_in_instructions_notime1358);
                    modify_no_time109=modify_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, modify_no_time109.getTree());

                    }
                    break;
                case 3 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:176:55: show_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_show_no_time_in_instructions_notime1362);
                    show_no_time110=show_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, show_no_time110.getTree());

                    }
                    break;
                case 4 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:176:70: hide_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_hide_no_time_in_instructions_notime1366);
                    hide_no_time111=hide_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, hide_no_time111.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:178:1: block_instructions_notime : instructions_notime ';' ( instructions_notime ';' )* -> ^( LIST_INSTR ( instructions_notime )+ ) ;
    public final AslParser.block_instructions_notime_return block_instructions_notime() throws RecognitionException {
        AslParser.block_instructions_notime_return retval = new AslParser.block_instructions_notime_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal113=null;
        Token char_literal115=null;
        AslParser.instructions_notime_return instructions_notime112 =null;

        AslParser.instructions_notime_return instructions_notime114 =null;


        AslTree char_literal113_tree=null;
        AslTree char_literal115_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_instructions_notime=new RewriteRuleSubtreeStream(adaptor,"rule instructions_notime");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:178:26: ( instructions_notime ';' ( instructions_notime ';' )* -> ^( LIST_INSTR ( instructions_notime )+ ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:178:28: instructions_notime ';' ( instructions_notime ';' )*
            {
            pushFollow(FOLLOW_instructions_notime_in_block_instructions_notime1373);
            instructions_notime112=instructions_notime();

            state._fsp--;

            stream_instructions_notime.add(instructions_notime112.getTree());

            char_literal113=(Token)match(input,93,FOLLOW_93_in_block_instructions_notime1374);  
            stream_93.add(char_literal113);


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:178:51: ( instructions_notime ';' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==HIDE||LA18_0==MODIFY||LA18_0==MOVE||LA18_0==SHOW) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:178:53: instructions_notime ';'
            	    {
            	    pushFollow(FOLLOW_instructions_notime_in_block_instructions_notime1378);
            	    instructions_notime114=instructions_notime();

            	    state._fsp--;

            	    stream_instructions_notime.add(instructions_notime114.getTree());

            	    char_literal115=(Token)match(input,93,FOLLOW_93_in_block_instructions_notime1380);  
            	    stream_93.add(char_literal115);


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
            // 179:29: -> ^( LIST_INSTR ( instructions_notime )+ )
            {
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:179:32: ^( LIST_INSTR ( instructions_notime )+ )
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:181:1: parallel_time : PARALLEL ^ time '{' ! block_instructions_notime '}' !;
    public final AslParser.parallel_time_return parallel_time() throws RecognitionException {
        AslParser.parallel_time_return retval = new AslParser.parallel_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PARALLEL116=null;
        Token char_literal118=null;
        Token char_literal120=null;
        AslParser.time_return time117 =null;

        AslParser.block_instructions_notime_return block_instructions_notime119 =null;


        AslTree PARALLEL116_tree=null;
        AslTree char_literal118_tree=null;
        AslTree char_literal120_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:181:15: ( PARALLEL ^ time '{' ! block_instructions_notime '}' !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:181:17: PARALLEL ^ time '{' ! block_instructions_notime '}' !
            {
            root_0 = (AslTree)adaptor.nil();


            PARALLEL116=(Token)match(input,PARALLEL,FOLLOW_PARALLEL_in_parallel_time1427); 
            PARALLEL116_tree = 
            (AslTree)adaptor.create(PARALLEL116)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(PARALLEL116_tree, root_0);


            pushFollow(FOLLOW_time_in_parallel_time1430);
            time117=time();

            state._fsp--;

            adaptor.addChild(root_0, time117.getTree());

            char_literal118=(Token)match(input,97,FOLLOW_97_in_parallel_time1432); 

            pushFollow(FOLLOW_block_instructions_notime_in_parallel_time1435);
            block_instructions_notime119=block_instructions_notime();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions_notime119.getTree());

            char_literal120=(Token)match(input,98,FOLLOW_98_in_parallel_time1437); 

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:183:1: instructions_time : ( move_time | modify_time | show_time | hide_time );
    public final AslParser.instructions_time_return instructions_time() throws RecognitionException {
        AslParser.instructions_time_return retval = new AslParser.instructions_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.move_time_return move_time121 =null;

        AslParser.modify_time_return modify_time122 =null;

        AslParser.show_time_return show_time123 =null;

        AslParser.hide_time_return hide_time124 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:183:19: ( move_time | modify_time | show_time | hide_time )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:183:21: move_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_time_in_instructions_time1446);
                    move_time121=move_time();

                    state._fsp--;

                    adaptor.addChild(root_0, move_time121.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:183:33: modify_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_time_in_instructions_time1450);
                    modify_time122=modify_time();

                    state._fsp--;

                    adaptor.addChild(root_0, modify_time122.getTree());

                    }
                    break;
                case 3 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:183:47: show_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_show_time_in_instructions_time1454);
                    show_time123=show_time();

                    state._fsp--;

                    adaptor.addChild(root_0, show_time123.getTree());

                    }
                    break;
                case 4 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:183:59: hide_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_hide_time_in_instructions_time1458);
                    hide_time124=hide_time();

                    state._fsp--;

                    adaptor.addChild(root_0, hide_time124.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:185:1: block_instructions_time : instructions_time ';' ( instructions_time ';' )* -> ^( LIST_INSTR ( instructions_time )+ ) ;
    public final AslParser.block_instructions_time_return block_instructions_time() throws RecognitionException {
        AslParser.block_instructions_time_return retval = new AslParser.block_instructions_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal126=null;
        Token char_literal128=null;
        AslParser.instructions_time_return instructions_time125 =null;

        AslParser.instructions_time_return instructions_time127 =null;


        AslTree char_literal126_tree=null;
        AslTree char_literal128_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_instructions_time=new RewriteRuleSubtreeStream(adaptor,"rule instructions_time");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:185:24: ( instructions_time ';' ( instructions_time ';' )* -> ^( LIST_INSTR ( instructions_time )+ ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:185:26: instructions_time ';' ( instructions_time ';' )*
            {
            pushFollow(FOLLOW_instructions_time_in_block_instructions_time1465);
            instructions_time125=instructions_time();

            state._fsp--;

            stream_instructions_time.add(instructions_time125.getTree());

            char_literal126=(Token)match(input,93,FOLLOW_93_in_block_instructions_time1467);  
            stream_93.add(char_literal126);


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:185:48: ( instructions_time ';' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==HIDE_T||LA20_0==MODIFY_T||LA20_0==MOVE_T||LA20_0==SHOW_T) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:185:50: instructions_time ';'
            	    {
            	    pushFollow(FOLLOW_instructions_time_in_block_instructions_time1471);
            	    instructions_time127=instructions_time();

            	    state._fsp--;

            	    stream_instructions_time.add(instructions_time127.getTree());

            	    char_literal128=(Token)match(input,93,FOLLOW_93_in_block_instructions_time1472);  
            	    stream_93.add(char_literal128);


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
            // 186:29: -> ^( LIST_INSTR ( instructions_time )+ )
            {
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:186:32: ^( LIST_INSTR ( instructions_time )+ )
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:188:1: parallel_no_time : PARALLEL ^ '{' ! block_instructions_time '}' !;
    public final AslParser.parallel_no_time_return parallel_no_time() throws RecognitionException {
        AslParser.parallel_no_time_return retval = new AslParser.parallel_no_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PARALLEL129=null;
        Token char_literal130=null;
        Token char_literal132=null;
        AslParser.block_instructions_time_return block_instructions_time131 =null;


        AslTree PARALLEL129_tree=null;
        AslTree char_literal130_tree=null;
        AslTree char_literal132_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:188:18: ( PARALLEL ^ '{' ! block_instructions_time '}' !)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:188:20: PARALLEL ^ '{' ! block_instructions_time '}' !
            {
            root_0 = (AslTree)adaptor.nil();


            PARALLEL129=(Token)match(input,PARALLEL,FOLLOW_PARALLEL_in_parallel_no_time1519); 
            PARALLEL129_tree = 
            (AslTree)adaptor.create(PARALLEL129)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(PARALLEL129_tree, root_0);


            char_literal130=(Token)match(input,97,FOLLOW_97_in_parallel_no_time1522); 

            pushFollow(FOLLOW_block_instructions_time_in_parallel_no_time1525);
            block_instructions_time131=block_instructions_time();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions_time131.getTree());

            char_literal132=(Token)match(input,98,FOLLOW_98_in_parallel_no_time1527); 

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:190:1: list_attributes : '(' attribute ( ',' attribute )* ')' -> ^( LIST_ATTR ( attribute )+ ) ;
    public final AslParser.list_attributes_return list_attributes() throws RecognitionException {
        AslParser.list_attributes_return retval = new AslParser.list_attributes_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal133=null;
        Token char_literal135=null;
        Token char_literal137=null;
        AslParser.attribute_return attribute134 =null;

        AslParser.attribute_return attribute136 =null;


        AslTree char_literal133_tree=null;
        AslTree char_literal135_tree=null;
        AslTree char_literal137_tree=null;
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:190:17: ( '(' attribute ( ',' attribute )* ')' -> ^( LIST_ATTR ( attribute )+ ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:190:19: '(' attribute ( ',' attribute )* ')'
            {
            char_literal133=(Token)match(input,88,FOLLOW_88_in_list_attributes1536);  
            stream_88.add(char_literal133);


            pushFollow(FOLLOW_attribute_in_list_attributes1538);
            attribute134=attribute();

            state._fsp--;

            stream_attribute.add(attribute134.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:190:33: ( ',' attribute )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==90) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:190:34: ',' attribute
            	    {
            	    char_literal135=(Token)match(input,90,FOLLOW_90_in_list_attributes1541);  
            	    stream_90.add(char_literal135);


            	    pushFollow(FOLLOW_attribute_in_list_attributes1543);
            	    attribute136=attribute();

            	    state._fsp--;

            	    stream_attribute.add(attribute136.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            char_literal137=(Token)match(input,89,FOLLOW_89_in_list_attributes1547);  
            stream_89.add(char_literal137);


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
            // 190:54: -> ^( LIST_ATTR ( attribute )+ )
            {
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:190:57: ^( LIST_ATTR ( attribute )+ )
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:193:1: attribute : ( attribute_name_color ^ ':' ! obj_attribute | attribute_name_expr ^ ':' ! expr );
    public final AslParser.attribute_return attribute() throws RecognitionException {
        AslParser.attribute_return retval = new AslParser.attribute_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal139=null;
        Token char_literal142=null;
        AslParser.attribute_name_color_return attribute_name_color138 =null;

        AslParser.obj_attribute_return obj_attribute140 =null;

        AslParser.attribute_name_expr_return attribute_name_expr141 =null;

        AslParser.expr_return expr143 =null;


        AslTree char_literal139_tree=null;
        AslTree char_literal142_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:193:13: ( attribute_name_color ^ ':' ! obj_attribute | attribute_name_expr ^ ':' ! expr )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==COLOR||LA22_0==STROKE) ) {
                alt22=1;
            }
            else if ( (LA22_0==HEIGHT||(LA22_0 >= POSX && LA22_0 <= POSY)||LA22_0==WIDTH||LA22_0==95) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:193:17: attribute_name_color ^ ':' ! obj_attribute
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_attribute_name_color_in_attribute1577);
                    attribute_name_color138=attribute_name_color();

                    state._fsp--;

                    root_0 = (AslTree)adaptor.becomeRoot(attribute_name_color138.getTree(), root_0);

                    char_literal139=(Token)match(input,92,FOLLOW_92_in_attribute1580); 

                    pushFollow(FOLLOW_obj_attribute_in_attribute1583);
                    obj_attribute140=obj_attribute();

                    state._fsp--;

                    adaptor.addChild(root_0, obj_attribute140.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:194:17: attribute_name_expr ^ ':' ! expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_attribute_name_expr_in_attribute1601);
                    attribute_name_expr141=attribute_name_expr();

                    state._fsp--;

                    root_0 = (AslTree)adaptor.becomeRoot(attribute_name_expr141.getTree(), root_0);

                    char_literal142=(Token)match(input,92,FOLLOW_92_in_attribute1604); 

                    pushFollow(FOLLOW_expr_in_attribute1607);
                    expr143=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr143.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:196:1: obj_attribute : ( color | ID | ID '.' ( attribute_name_color ) -> ^( ATTR ID attribute_name_color ) );
    public final AslParser.obj_attribute_return obj_attribute() throws RecognitionException {
        AslParser.obj_attribute_return retval = new AslParser.obj_attribute_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID145=null;
        Token ID146=null;
        Token char_literal147=null;
        AslParser.color_return color144 =null;

        AslParser.attribute_name_color_return attribute_name_color148 =null;


        AslTree ID145_tree=null;
        AslTree ID146_tree=null;
        AslTree char_literal147_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_attribute_name_color=new RewriteRuleSubtreeStream(adaptor,"rule attribute_name_color");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:196:17: ( color | ID | ID '.' ( attribute_name_color ) -> ^( ATTR ID attribute_name_color ) )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==BLACK||LA23_0==BLUE||LA23_0==COLORHEX||LA23_0==GREEN||LA23_0==RED||(LA23_0 >= RGB && LA23_0 <= RGBPRCTJ)||LA23_0==WHITE) ) {
                alt23=1;
            }
            else if ( (LA23_0==ID) ) {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==91) ) {
                    alt23=3;
                }
                else if ( ((LA23_2 >= 89 && LA23_2 <= 90)) ) {
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:196:21: color
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_color_in_obj_attribute1631);
                    color144=color();

                    state._fsp--;

                    adaptor.addChild(root_0, color144.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:197:19: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID145=(Token)match(input,ID,FOLLOW_ID_in_obj_attribute1651); 
                    ID145_tree = 
                    (AslTree)adaptor.create(ID145)
                    ;
                    adaptor.addChild(root_0, ID145_tree);


                    }
                    break;
                case 3 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:198:21: ID '.' ( attribute_name_color )
                    {
                    ID146=(Token)match(input,ID,FOLLOW_ID_in_obj_attribute1673);  
                    stream_ID.add(ID146);


                    char_literal147=(Token)match(input,91,FOLLOW_91_in_obj_attribute1675);  
                    stream_91.add(char_literal147);


                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:198:28: ( attribute_name_color )
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:198:30: attribute_name_color
                    {
                    pushFollow(FOLLOW_attribute_name_color_in_obj_attribute1679);
                    attribute_name_color148=attribute_name_color();

                    state._fsp--;

                    stream_attribute_name_color.add(attribute_name_color148.getTree());

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
                    // 198:52: -> ^( ATTR ID attribute_name_color )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:198:55: ^( ATTR ID attribute_name_color )
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:201:1: show : ( show_time | show_no_time );
    public final AslParser.show_return show() throws RecognitionException {
        AslParser.show_return retval = new AslParser.show_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.show_time_return show_time149 =null;

        AslParser.show_no_time_return show_no_time150 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:201:6: ( show_time | show_no_time )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:201:8: show_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_show_time_in_show1715);
                    show_time149=show_time();

                    state._fsp--;

                    adaptor.addChild(root_0, show_time149.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:201:20: show_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_show_no_time_in_show1719);
                    show_no_time150=show_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, show_no_time150.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:203:1: show_time : SHOW_T ^ ID time ;
    public final AslParser.show_time_return show_time() throws RecognitionException {
        AslParser.show_time_return retval = new AslParser.show_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token SHOW_T151=null;
        Token ID152=null;
        AslParser.time_return time153 =null;


        AslTree SHOW_T151_tree=null;
        AslTree ID152_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:203:11: ( SHOW_T ^ ID time )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:203:13: SHOW_T ^ ID time
            {
            root_0 = (AslTree)adaptor.nil();


            SHOW_T151=(Token)match(input,SHOW_T,FOLLOW_SHOW_T_in_show_time1727); 
            SHOW_T151_tree = 
            (AslTree)adaptor.create(SHOW_T151)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(SHOW_T151_tree, root_0);


            ID152=(Token)match(input,ID,FOLLOW_ID_in_show_time1730); 
            ID152_tree = 
            (AslTree)adaptor.create(ID152)
            ;
            adaptor.addChild(root_0, ID152_tree);


            pushFollow(FOLLOW_time_in_show_time1732);
            time153=time();

            state._fsp--;

            adaptor.addChild(root_0, time153.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:205:1: show_no_time : SHOW ^ ID ;
    public final AslParser.show_no_time_return show_no_time() throws RecognitionException {
        AslParser.show_no_time_return retval = new AslParser.show_no_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token SHOW154=null;
        Token ID155=null;

        AslTree SHOW154_tree=null;
        AslTree ID155_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:205:14: ( SHOW ^ ID )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:205:17: SHOW ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            SHOW154=(Token)match(input,SHOW,FOLLOW_SHOW_in_show_no_time1741); 
            SHOW154_tree = 
            (AslTree)adaptor.create(SHOW154)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(SHOW154_tree, root_0);


            ID155=(Token)match(input,ID,FOLLOW_ID_in_show_no_time1744); 
            ID155_tree = 
            (AslTree)adaptor.create(ID155)
            ;
            adaptor.addChild(root_0, ID155_tree);


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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:207:1: hide : ( hide_time | hide_no_time );
    public final AslParser.hide_return hide() throws RecognitionException {
        AslParser.hide_return retval = new AslParser.hide_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.hide_time_return hide_time156 =null;

        AslParser.hide_no_time_return hide_no_time157 =null;



        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:207:6: ( hide_time | hide_no_time )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:207:8: hide_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_hide_time_in_hide1752);
                    hide_time156=hide_time();

                    state._fsp--;

                    adaptor.addChild(root_0, hide_time156.getTree());

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:207:20: hide_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_hide_no_time_in_hide1756);
                    hide_no_time157=hide_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, hide_no_time157.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:209:1: hide_time : HIDE_T ^ ID time ;
    public final AslParser.hide_time_return hide_time() throws RecognitionException {
        AslParser.hide_time_return retval = new AslParser.hide_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token HIDE_T158=null;
        Token ID159=null;
        AslParser.time_return time160 =null;


        AslTree HIDE_T158_tree=null;
        AslTree ID159_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:209:11: ( HIDE_T ^ ID time )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:209:13: HIDE_T ^ ID time
            {
            root_0 = (AslTree)adaptor.nil();


            HIDE_T158=(Token)match(input,HIDE_T,FOLLOW_HIDE_T_in_hide_time1764); 
            HIDE_T158_tree = 
            (AslTree)adaptor.create(HIDE_T158)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(HIDE_T158_tree, root_0);


            ID159=(Token)match(input,ID,FOLLOW_ID_in_hide_time1767); 
            ID159_tree = 
            (AslTree)adaptor.create(ID159)
            ;
            adaptor.addChild(root_0, ID159_tree);


            pushFollow(FOLLOW_time_in_hide_time1769);
            time160=time();

            state._fsp--;

            adaptor.addChild(root_0, time160.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:211:1: hide_no_time : HIDE ^ ID ;
    public final AslParser.hide_no_time_return hide_no_time() throws RecognitionException {
        AslParser.hide_no_time_return retval = new AslParser.hide_no_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token HIDE161=null;
        Token ID162=null;

        AslTree HIDE161_tree=null;
        AslTree ID162_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:211:14: ( HIDE ^ ID )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:211:17: HIDE ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            HIDE161=(Token)match(input,HIDE,FOLLOW_HIDE_in_hide_no_time1778); 
            HIDE161_tree = 
            (AslTree)adaptor.create(HIDE161)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(HIDE161_tree, root_0);


            ID162=(Token)match(input,ID,FOLLOW_ID_in_hide_no_time1781); 
            ID162_tree = 
            (AslTree)adaptor.create(ID162)
            ;
            adaptor.addChild(root_0, ID162_tree);


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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:213:1: delay : DELAY ^ time ;
    public final AslParser.delay_return delay() throws RecognitionException {
        AslParser.delay_return retval = new AslParser.delay_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token DELAY163=null;
        AslParser.time_return time164 =null;


        AslTree DELAY163_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:213:6: ( DELAY ^ time )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:213:8: DELAY ^ time
            {
            root_0 = (AslTree)adaptor.nil();


            DELAY163=(Token)match(input,DELAY,FOLLOW_DELAY_in_delay1788); 
            DELAY163_tree = 
            (AslTree)adaptor.create(DELAY163)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(DELAY163_tree, root_0);


            pushFollow(FOLLOW_time_in_delay1791);
            time164=time();

            state._fsp--;

            adaptor.addChild(root_0, time164.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:215:1: attribute_name_color : ( COLOR | STROKE );
    public final AslParser.attribute_name_color_return attribute_name_color() throws RecognitionException {
        AslParser.attribute_name_color_return retval = new AslParser.attribute_name_color_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set165=null;

        AslTree set165_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:215:25: ( COLOR | STROKE )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set165=(Token)input.LT(1);

            if ( input.LA(1)==COLOR||input.LA(1)==STROKE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set165)
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:219:1: attribute_name_expr : ( POSX | POSY | WIDTH | HEIGHT | 'r' );
    public final AslParser.attribute_name_expr_return attribute_name_expr() throws RecognitionException {
        AslParser.attribute_name_expr_return retval = new AslParser.attribute_name_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set166=null;

        AslTree set166_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:219:21: ( POSX | POSY | WIDTH | HEIGHT | 'r' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set166=(Token)input.LT(1);

            if ( input.LA(1)==HEIGHT||(input.LA(1) >= POSX && input.LA(1) <= POSY)||input.LA(1)==WIDTH||input.LA(1)==95 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set166)
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:226:1: color : ( COLORHEX -> ^( COLORHEXA COLORHEX ) | RGB '(' expr ',' expr ',' expr ')' -> ^( COLORINT expr expr expr ) | RGBPRCTJ '(' expr ',' expr ',' expr ')' -> ^( COLORPRCTJ expr expr expr ) | color_keyword -> ^( COLORKEYWORD color_keyword ) );
    public final AslParser.color_return color() throws RecognitionException {
        AslParser.color_return retval = new AslParser.color_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token COLORHEX167=null;
        Token RGB168=null;
        Token char_literal169=null;
        Token char_literal171=null;
        Token char_literal173=null;
        Token char_literal175=null;
        Token RGBPRCTJ176=null;
        Token char_literal177=null;
        Token char_literal179=null;
        Token char_literal181=null;
        Token char_literal183=null;
        AslParser.expr_return expr170 =null;

        AslParser.expr_return expr172 =null;

        AslParser.expr_return expr174 =null;

        AslParser.expr_return expr178 =null;

        AslParser.expr_return expr180 =null;

        AslParser.expr_return expr182 =null;

        AslParser.color_keyword_return color_keyword184 =null;


        AslTree COLORHEX167_tree=null;
        AslTree RGB168_tree=null;
        AslTree char_literal169_tree=null;
        AslTree char_literal171_tree=null;
        AslTree char_literal173_tree=null;
        AslTree char_literal175_tree=null;
        AslTree RGBPRCTJ176_tree=null;
        AslTree char_literal177_tree=null;
        AslTree char_literal179_tree=null;
        AslTree char_literal181_tree=null;
        AslTree char_literal183_tree=null;
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleTokenStream stream_COLORHEX=new RewriteRuleTokenStream(adaptor,"token COLORHEX");
        RewriteRuleTokenStream stream_RGBPRCTJ=new RewriteRuleTokenStream(adaptor,"token RGBPRCTJ");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_RGB=new RewriteRuleTokenStream(adaptor,"token RGB");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_color_keyword=new RewriteRuleSubtreeStream(adaptor,"rule color_keyword");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:226:9: ( COLORHEX -> ^( COLORHEXA COLORHEX ) | RGB '(' expr ',' expr ',' expr ')' -> ^( COLORINT expr expr expr ) | RGBPRCTJ '(' expr ',' expr ',' expr ')' -> ^( COLORPRCTJ expr expr expr ) | color_keyword -> ^( COLORKEYWORD color_keyword ) )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:226:13: COLORHEX
                    {
                    COLORHEX167=(Token)match(input,COLORHEX,FOLLOW_COLORHEX_in_color1974);  
                    stream_COLORHEX.add(COLORHEX167);


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
                    // 226:22: -> ^( COLORHEXA COLORHEX )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:226:25: ^( COLORHEXA COLORHEX )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:227:13: RGB '(' expr ',' expr ',' expr ')'
                    {
                    RGB168=(Token)match(input,RGB,FOLLOW_RGB_in_color1996);  
                    stream_RGB.add(RGB168);


                    char_literal169=(Token)match(input,88,FOLLOW_88_in_color1998);  
                    stream_88.add(char_literal169);


                    pushFollow(FOLLOW_expr_in_color2000);
                    expr170=expr();

                    state._fsp--;

                    stream_expr.add(expr170.getTree());

                    char_literal171=(Token)match(input,90,FOLLOW_90_in_color2002);  
                    stream_90.add(char_literal171);


                    pushFollow(FOLLOW_expr_in_color2004);
                    expr172=expr();

                    state._fsp--;

                    stream_expr.add(expr172.getTree());

                    char_literal173=(Token)match(input,90,FOLLOW_90_in_color2006);  
                    stream_90.add(char_literal173);


                    pushFollow(FOLLOW_expr_in_color2008);
                    expr174=expr();

                    state._fsp--;

                    stream_expr.add(expr174.getTree());

                    char_literal175=(Token)match(input,89,FOLLOW_89_in_color2010);  
                    stream_89.add(char_literal175);


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
                    // 227:48: -> ^( COLORINT expr expr expr )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:227:51: ^( COLORINT expr expr expr )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:228:13: RGBPRCTJ '(' expr ',' expr ',' expr ')'
                    {
                    RGBPRCTJ176=(Token)match(input,RGBPRCTJ,FOLLOW_RGBPRCTJ_in_color2036);  
                    stream_RGBPRCTJ.add(RGBPRCTJ176);


                    char_literal177=(Token)match(input,88,FOLLOW_88_in_color2038);  
                    stream_88.add(char_literal177);


                    pushFollow(FOLLOW_expr_in_color2040);
                    expr178=expr();

                    state._fsp--;

                    stream_expr.add(expr178.getTree());

                    char_literal179=(Token)match(input,90,FOLLOW_90_in_color2042);  
                    stream_90.add(char_literal179);


                    pushFollow(FOLLOW_expr_in_color2044);
                    expr180=expr();

                    state._fsp--;

                    stream_expr.add(expr180.getTree());

                    char_literal181=(Token)match(input,90,FOLLOW_90_in_color2046);  
                    stream_90.add(char_literal181);


                    pushFollow(FOLLOW_expr_in_color2048);
                    expr182=expr();

                    state._fsp--;

                    stream_expr.add(expr182.getTree());

                    char_literal183=(Token)match(input,89,FOLLOW_89_in_color2050);  
                    stream_89.add(char_literal183);


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
                    // 228:53: -> ^( COLORPRCTJ expr expr expr )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:228:56: ^( COLORPRCTJ expr expr expr )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:229:13: color_keyword
                    {
                    pushFollow(FOLLOW_color_keyword_in_color2076);
                    color_keyword184=color_keyword();

                    state._fsp--;

                    stream_color_keyword.add(color_keyword184.getTree());

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
                    // 229:27: -> ^( COLORKEYWORD color_keyword )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:229:30: ^( COLORKEYWORD color_keyword )
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:232:1: color_keyword : ( RED | WHITE | BLACK | BLUE | GREEN );
    public final AslParser.color_keyword_return color_keyword() throws RecognitionException {
        AslParser.color_keyword_return retval = new AslParser.color_keyword_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set185=null;

        AslTree set185_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:232:15: ( RED | WHITE | BLACK | BLUE | GREEN )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set185=(Token)input.LT(1);

            if ( input.LA(1)==BLACK||input.LA(1)==BLUE||input.LA(1)==GREEN||input.LA(1)==RED||input.LA(1)==WHITE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set185)
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:234:1: obj_type : ( CIRCLE | RECTANGLE | TEXT );
    public final AslParser.obj_type_return obj_type() throws RecognitionException {
        AslParser.obj_type_return retval = new AslParser.obj_type_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set186=null;

        AslTree set186_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:234:10: ( CIRCLE | RECTANGLE | TEXT )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set186=(Token)input.LT(1);

            if ( input.LA(1)==CIRCLE||input.LA(1)==RECTANGLE||input.LA(1)==TEXT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set186)
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:237:1: time : INT ( 's' | 'ms' ) ^;
    public final AslParser.time_return time() throws RecognitionException {
        AslParser.time_return retval = new AslParser.time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token INT187=null;
        Token set188=null;

        AslTree INT187_tree=null;
        AslTree set188_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:237:6: ( INT ( 's' | 'ms' ) ^)
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:237:9: INT ( 's' | 'ms' ) ^
            {
            root_0 = (AslTree)adaptor.nil();


            INT187=(Token)match(input,INT,FOLLOW_INT_in_time2152); 
            INT187_tree = 
            (AslTree)adaptor.create(INT187)
            ;
            adaptor.addChild(root_0, INT187_tree);


            set188=(Token)input.LT(1);

            set188=(Token)input.LT(1);

            if ( input.LA(1)==94||input.LA(1)==96 ) {
                input.consume();
                root_0 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(set188)
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:240:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR190=null;
        AslParser.boolterm_return boolterm189 =null;

        AslParser.boolterm_return boolterm191 =null;


        AslTree OR190_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:240:9: ( boolterm ( OR ^ boolterm )* )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:240:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr2174);
            boolterm189=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm189.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:240:22: ( OR ^ boolterm )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==OR) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:240:23: OR ^ boolterm
            	    {
            	    OR190=(Token)match(input,OR,FOLLOW_OR_in_expr2177); 
            	    OR190_tree = 
            	    (AslTree)adaptor.create(OR190)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR190_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr2180);
            	    boolterm191=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm191.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:243:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND193=null;
        AslParser.boolfact_return boolfact192 =null;

        AslParser.boolfact_return boolfact194 =null;


        AslTree AND193_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:243:9: ( boolfact ( AND ^ boolfact )* )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:243:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm2200);
            boolfact192=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact192.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:243:22: ( AND ^ boolfact )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==AND) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:243:23: AND ^ boolfact
            	    {
            	    AND193=(Token)match(input,AND,FOLLOW_AND_in_boolterm2203); 
            	    AND193_tree = 
            	    (AslTree)adaptor.create(AND193)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND193_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm2206);
            	    boolfact194=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact194.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:246:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL196=null;
        Token NOT_EQUAL197=null;
        Token LT198=null;
        Token LE199=null;
        Token GT200=null;
        Token GE201=null;
        AslParser.num_expr_return num_expr195 =null;

        AslParser.num_expr_return num_expr202 =null;


        AslTree EQUAL196_tree=null;
        AslTree NOT_EQUAL197_tree=null;
        AslTree LT198_tree=null;
        AslTree LE199_tree=null;
        AslTree GT200_tree=null;
        AslTree GE201_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:246:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:246:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact2226);
            num_expr195=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr195.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:246:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==EQUAL||LA30_0==GE||LA30_0==GT||LA30_0==LE||LA30_0==LT||LA30_0==NOT_EQUAL) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:246:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:246:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
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
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:246:24: EQUAL ^
                            {
                            EQUAL196=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact2230); 
                            EQUAL196_tree = 
                            (AslTree)adaptor.create(EQUAL196)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL196_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:246:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL197=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact2235); 
                            NOT_EQUAL197_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL197)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL197_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:246:46: LT ^
                            {
                            LT198=(Token)match(input,LT,FOLLOW_LT_in_boolfact2240); 
                            LT198_tree = 
                            (AslTree)adaptor.create(LT198)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT198_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:246:52: LE ^
                            {
                            LE199=(Token)match(input,LE,FOLLOW_LE_in_boolfact2245); 
                            LE199_tree = 
                            (AslTree)adaptor.create(LE199)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE199_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:246:58: GT ^
                            {
                            GT200=(Token)match(input,GT,FOLLOW_GT_in_boolfact2250); 
                            GT200_tree = 
                            (AslTree)adaptor.create(GT200)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT200_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:246:64: GE ^
                            {
                            GE201=(Token)match(input,GE,FOLLOW_GE_in_boolfact2255); 
                            GE201_tree = 
                            (AslTree)adaptor.create(GE201)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE201_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact2259);
                    num_expr202=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr202.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:249:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS204=null;
        Token MINUS205=null;
        AslParser.term_return term203 =null;

        AslParser.term_return term206 =null;


        AslTree PLUS204_tree=null;
        AslTree MINUS205_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:249:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:249:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr2279);
            term203=term();

            state._fsp--;

            adaptor.addChild(root_0, term203.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:249:18: ( ( PLUS ^| MINUS ^) term )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==MINUS||LA32_0==PLUS) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:249:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:249:20: ( PLUS ^| MINUS ^)
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
            	            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:249:21: PLUS ^
            	            {
            	            PLUS204=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr2284); 
            	            PLUS204_tree = 
            	            (AslTree)adaptor.create(PLUS204)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS204_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:249:29: MINUS ^
            	            {
            	            MINUS205=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr2289); 
            	            MINUS205_tree = 
            	            (AslTree)adaptor.create(MINUS205)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS205_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr2293);
            	    term206=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term206.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:252:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL208=null;
        Token DIV209=null;
        Token MOD210=null;
        AslParser.factor_return factor207 =null;

        AslParser.factor_return factor211 =null;


        AslTree MUL208_tree=null;
        AslTree DIV209_tree=null;
        AslTree MOD210_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:252:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:252:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term2317);
            factor207=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor207.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:252:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==DIV||LA34_0==MOD||LA34_0==MUL) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:252:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:252:22: ( MUL ^| DIV ^| MOD ^)
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
            	            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:252:23: MUL ^
            	            {
            	            MUL208=(Token)match(input,MUL,FOLLOW_MUL_in_term2322); 
            	            MUL208_tree = 
            	            (AslTree)adaptor.create(MUL208)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL208_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:252:30: DIV ^
            	            {
            	            DIV209=(Token)match(input,DIV,FOLLOW_DIV_in_term2327); 
            	            DIV209_tree = 
            	            (AslTree)adaptor.create(DIV209)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV209_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:252:37: MOD ^
            	            {
            	            MOD210=(Token)match(input,MOD,FOLLOW_MOD_in_term2332); 
            	            MOD210_tree = 
            	            (AslTree)adaptor.create(MOD210)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD210_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term2336);
            	    factor211=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor211.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:255:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT212=null;
        Token PLUS213=null;
        Token MINUS214=null;
        AslParser.atom_return atom215 =null;


        AslTree NOT212_tree=null;
        AslTree PLUS213_tree=null;
        AslTree MINUS214_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:255:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:255:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:255:13: ( NOT ^| PLUS ^| MINUS ^)?
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:255:14: NOT ^
                    {
                    NOT212=(Token)match(input,NOT,FOLLOW_NOT_in_factor2359); 
                    NOT212_tree = 
                    (AslTree)adaptor.create(NOT212)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT212_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:255:21: PLUS ^
                    {
                    PLUS213=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor2364); 
                    PLUS213_tree = 
                    (AslTree)adaptor.create(PLUS213)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS213_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:255:29: MINUS ^
                    {
                    MINUS214=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor2369); 
                    MINUS214_tree = 
                    (AslTree)adaptor.create(MINUS214)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS214_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor2374);
            atom215=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom215.getTree());

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:261:1: atom : ( ID | INT | ID '.' ( attribute_name_expr ) -> ^( ATTR ID attribute_name_expr ) | ID '.' ( attribute_name_color ) -> ^( ATTR ID attribute_name_color ) | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID216=null;
        Token INT217=null;
        Token ID218=null;
        Token char_literal219=null;
        Token ID221=null;
        Token char_literal222=null;
        Token char_literal225=null;
        Token char_literal227=null;
        AslParser.attribute_name_expr_return attribute_name_expr220 =null;

        AslParser.attribute_name_color_return attribute_name_color223 =null;

        AslParser.funcall_return funcall224 =null;

        AslParser.expr_return expr226 =null;


        AslTree b_tree=null;
        AslTree ID216_tree=null;
        AslTree INT217_tree=null;
        AslTree ID218_tree=null;
        AslTree char_literal219_tree=null;
        AslTree ID221_tree=null;
        AslTree char_literal222_tree=null;
        AslTree char_literal225_tree=null;
        AslTree char_literal227_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_attribute_name_expr=new RewriteRuleSubtreeStream(adaptor,"rule attribute_name_expr");
        RewriteRuleSubtreeStream stream_attribute_name_color=new RewriteRuleSubtreeStream(adaptor,"rule attribute_name_color");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:261:9: ( ID | INT | ID '.' ( attribute_name_expr ) -> ^( ATTR ID attribute_name_expr ) | ID '.' ( attribute_name_color ) -> ^( ATTR ID attribute_name_color ) | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt37=7;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 91:
                    {
                    int LA37_5 = input.LA(3);

                    if ( (LA37_5==HEIGHT||(LA37_5 >= POSX && LA37_5 <= POSY)||LA37_5==WIDTH||LA37_5==95) ) {
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
                case 88:
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
                case 89:
                case 90:
                case 93:
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
            case 88:
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:261:13: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID216=(Token)match(input,ID,FOLLOW_ID_in_atom2399); 
                    ID216_tree = 
                    (AslTree)adaptor.create(ID216)
                    ;
                    adaptor.addChild(root_0, ID216_tree);


                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:262:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT217=(Token)match(input,INT,FOLLOW_INT_in_atom2414); 
                    INT217_tree = 
                    (AslTree)adaptor.create(INT217)
                    ;
                    adaptor.addChild(root_0, INT217_tree);


                    }
                    break;
                case 3 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:263:13: ID '.' ( attribute_name_expr )
                    {
                    ID218=(Token)match(input,ID,FOLLOW_ID_in_atom2428);  
                    stream_ID.add(ID218);


                    char_literal219=(Token)match(input,91,FOLLOW_91_in_atom2430);  
                    stream_91.add(char_literal219);


                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:263:20: ( attribute_name_expr )
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:263:21: attribute_name_expr
                    {
                    pushFollow(FOLLOW_attribute_name_expr_in_atom2433);
                    attribute_name_expr220=attribute_name_expr();

                    state._fsp--;

                    stream_attribute_name_expr.add(attribute_name_expr220.getTree());

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
                    // 263:42: -> ^( ATTR ID attribute_name_expr )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:263:45: ^( ATTR ID attribute_name_expr )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:264:13: ID '.' ( attribute_name_color )
                    {
                    ID221=(Token)match(input,ID,FOLLOW_ID_in_atom2459);  
                    stream_ID.add(ID221);


                    char_literal222=(Token)match(input,91,FOLLOW_91_in_atom2461);  
                    stream_91.add(char_literal222);


                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:264:20: ( attribute_name_color )
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:264:22: attribute_name_color
                    {
                    pushFollow(FOLLOW_attribute_name_color_in_atom2465);
                    attribute_name_color223=attribute_name_color();

                    state._fsp--;

                    stream_attribute_name_color.add(attribute_name_color223.getTree());

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
                    // 264:44: -> ^( ATTR ID attribute_name_color )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:264:47: ^( ATTR ID attribute_name_color )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:265:13: (b= TRUE |b= FALSE )
                    {
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:265:13: (b= TRUE |b= FALSE )
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
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:265:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom2493);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:265:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom2499);  
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
                    // 265:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:265:36: ^( BOOLEAN[$b,$b.text] )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:266:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom2522);
                    funcall224=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall224.getTree());

                    }
                    break;
                case 7 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:267:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal225=(Token)match(input,88,FOLLOW_88_in_atom2536); 

                    pushFollow(FOLLOW_expr_in_atom2539);
                    expr226=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr226.getTree());

                    char_literal227=(Token)match(input,89,FOLLOW_89_in_atom2541); 

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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:271:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID228=null;
        Token char_literal229=null;
        Token char_literal231=null;
        AslParser.expr_list_return expr_list230 =null;


        AslTree ID228_tree=null;
        AslTree char_literal229_tree=null;
        AslTree char_literal231_tree=null;
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:271:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:271:13: ID '(' ( expr_list )? ')'
            {
            ID228=(Token)match(input,ID,FOLLOW_ID_in_funcall2562);  
            stream_ID.add(ID228);


            char_literal229=(Token)match(input,88,FOLLOW_88_in_funcall2564);  
            stream_88.add(char_literal229);


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:271:20: ( expr_list )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==FALSE||LA38_0==ID||LA38_0==INT||LA38_0==MINUS||LA38_0==NOT||LA38_0==PLUS||LA38_0==TRUE||LA38_0==88) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:271:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall2566);
                    expr_list230=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list230.getTree());

                    }
                    break;

            }


            char_literal231=(Token)match(input,89,FOLLOW_89_in_funcall2569);  
            stream_89.add(char_literal231);


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
            // 271:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:271:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:271:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:271:61: ( expr_list )?
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
    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:275:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal233=null;
        AslParser.expr_return expr232 =null;

        AslParser.expr_return expr234 =null;


        AslTree char_literal233_tree=null;

        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:275:10: ( expr ( ',' ! expr )* )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:275:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list2602);
            expr232=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr232.getTree());

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:275:18: ( ',' ! expr )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==90) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:275:19: ',' ! expr
            	    {
            	    char_literal233=(Token)match(input,90,FOLLOW_90_in_expr_list2605); 

            	    pushFollow(FOLLOW_expr_in_expr_list2608);
            	    expr234=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr234.getTree());

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
    public static final BitSet FOLLOW_FUNC_in_func253 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ID_in_func256 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_params_in_func258 = new BitSet(new long[]{0x21E01E0000700200L,0x0000000020241930L});
    public static final BitSet FOLLOW_block_instructions_in_func260 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_params282 = new BitSet(new long[]{0x0000080000000000L,0x0000000002800000L});
    public static final BitSet FOLLOW_paramlist_in_params284 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_params287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist313 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_paramlist316 = new BitSet(new long[]{0x0000080000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_param_in_paramlist319 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_87_in_param344 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ID_in_param348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions410 = new BitSet(new long[]{0x21E01E0000700202L,0x0000000020241930L});
    public static final BitSet FOLLOW_instruction_spc_in_instruction451 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_instruction453 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_recalcCentro_in_instruction_spc780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parallel_in_instructions_brack826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_instructions_brack831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign843 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EEQUAL_in_assign847 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_expr_in_assign849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt882 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt887 = new BitSet(new long[]{0x21E01E0000700200L,0x0000000020241930L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt890 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt893 = new BitSet(new long[]{0x21E01E0000700200L,0x0000000020241930L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt896 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt926 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_expr_in_while_stmt929 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DO_in_while_stmt931 = new BitSet(new long[]{0x21E01E0000700200L,0x0000000020241930L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt934 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt961 = new BitSet(new long[]{0x8408280100000002L,0x0000000001020000L});
    public static final BitSet FOLLOW_expr_in_return_stmt964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read988 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ID_in_read991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write1013 = new BitSet(new long[]{0x8408280100000000L,0x0000000001022000L});
    public static final BitSet FOLLOW_expr_in_write1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create1045 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ID_in_create1048 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_create1050 = new BitSet(new long[]{0x0000000000001000L,0x0000000000008040L});
    public static final BitSet FOLLOW_obj_type_in_create1053 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_create1055 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_expr_in_create1058 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_create1060 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_expr_in_create1063 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_90_in_create1066 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_list_attributes_in_create1069 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_create1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTROY_in_destroy1093 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_destroy1096 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ID_in_destroy1099 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_destroy1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_time_in_move1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_no_time_in_move1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_T_in_move_time1145 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ID_in_move_time1148 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_time_in_move_time1151 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_move_time1153 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_expr_in_move_time1156 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_move_time1158 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_expr_in_move_time1161 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_move_time1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_move_no_time1182 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ID_in_move_no_time1185 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_move_no_time1187 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_expr_in_move_no_time1190 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_move_no_time1192 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_expr_in_move_no_time1195 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_move_no_time1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_time_in_modify1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_no_time_in_modify1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODIFY_T_in_modify_time1241 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ID_in_modify_time1244 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_time_in_modify_time1246 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_list_attributes_in_modify_time1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODIFY_in_modify_no_time1265 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ID_in_modify_no_time1268 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_list_attributes_in_modify_no_time1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_block1288 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ID_in_block1291 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_block1293 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_create_in_block1297 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_block1299 = new BitSet(new long[]{0x0000000000100000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_block1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECALC_in_recalcCentro1322 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ID_in_recalcCentro1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parallel_time_in_parallel1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parallel_no_time_in_parallel1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_no_time_in_instructions_notime1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_no_time_in_instructions_notime1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_show_no_time_in_instructions_notime1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hide_no_time_in_instructions_notime1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instructions_notime_in_block_instructions_notime1373 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_block_instructions_notime1374 = new BitSet(new long[]{0x00A0020000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_instructions_notime_in_block_instructions_notime1378 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_block_instructions_notime1380 = new BitSet(new long[]{0x00A0020000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_PARALLEL_in_parallel_time1427 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_time_in_parallel_time1430 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_parallel_time1432 = new BitSet(new long[]{0x00A0020000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_block_instructions_notime_in_parallel_time1435 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_parallel_time1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_time_in_instructions_time1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_time_in_instructions_time1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_show_time_in_instructions_time1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hide_time_in_instructions_time1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instructions_time_in_block_instructions_time1465 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_block_instructions_time1467 = new BitSet(new long[]{0x0140040000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_instructions_time_in_block_instructions_time1471 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_block_instructions_time1472 = new BitSet(new long[]{0x0140040000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_PARALLEL_in_parallel_no_time1519 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_parallel_no_time1522 = new BitSet(new long[]{0x0140040000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_block_instructions_time_in_parallel_no_time1525 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_parallel_no_time1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_list_attributes1536 = new BitSet(new long[]{0x0000008000002000L,0x0000000080104003L});
    public static final BitSet FOLLOW_attribute_in_list_attributes1538 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_90_in_list_attributes1541 = new BitSet(new long[]{0x0000008000002000L,0x0000000080104003L});
    public static final BitSet FOLLOW_attribute_in_list_attributes1543 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_89_in_list_attributes1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_name_color_in_attribute1577 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_attribute1580 = new BitSet(new long[]{0x0000081000004500L,0x0000000000080680L});
    public static final BitSet FOLLOW_obj_attribute_in_attribute1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_name_expr_in_attribute1601 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_attribute1604 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_expr_in_attribute1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_color_in_obj_attribute1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_obj_attribute1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_obj_attribute1673 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_obj_attribute1675 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L});
    public static final BitSet FOLLOW_attribute_name_color_in_obj_attribute1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_show_time_in_show1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_show_no_time_in_show1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_T_in_show_time1727 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ID_in_show_time1730 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_time_in_show_time1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_show_no_time1741 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ID_in_show_no_time1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hide_time_in_hide1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hide_no_time_in_hide1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HIDE_T_in_hide_time1764 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ID_in_hide_time1767 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_time_in_hide_time1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HIDE_in_hide_no_time1778 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ID_in_hide_no_time1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELAY_in_delay1788 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_time_in_delay1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLORHEX_in_color1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RGB_in_color1996 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_color1998 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_expr_in_color2000 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_color2002 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_expr_in_color2004 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_color2006 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_expr_in_color2008 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_color2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RGBPRCTJ_in_color2036 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_color2038 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_expr_in_color2040 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_color2042 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_expr_in_color2044 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_color2046 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_expr_in_color2048 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_color2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_color_keyword_in_color2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_time2152 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L});
    public static final BitSet FOLLOW_set_in_time2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr2174 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_OR_in_expr2177 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_boolterm_in_expr2180 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm2200 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm2203 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm2206 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact2226 = new BitSet(new long[]{0x0804402840000002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact2230 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact2235 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_LT_in_boolfact2240 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_LE_in_boolfact2245 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_GT_in_boolfact2250 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_GE_in_boolfact2255 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr2279 = new BitSet(new long[]{0x8008000000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr2284 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr2289 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_term_in_num_expr2293 = new BitSet(new long[]{0x8008000000000002L});
    public static final BitSet FOLLOW_factor_in_term2317 = new BitSet(new long[]{0x0210000000800002L});
    public static final BitSet FOLLOW_MUL_in_term2322 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_DIV_in_term2327 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_MOD_in_term2332 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_factor_in_term2336 = new BitSet(new long[]{0x0210000000800002L});
    public static final BitSet FOLLOW_NOT_in_factor2359 = new BitSet(new long[]{0x0000280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_PLUS_in_factor2364 = new BitSet(new long[]{0x0000280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_MINUS_in_factor2369 = new BitSet(new long[]{0x0000280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_atom_in_factor2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom2428 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_atom2430 = new BitSet(new long[]{0x0000008000000000L,0x0000000080100003L});
    public static final BitSet FOLLOW_attribute_name_expr_in_atom2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom2459 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_atom2461 = new BitSet(new long[]{0x0000000000002000L,0x0000000000004000L});
    public static final BitSet FOLLOW_attribute_name_color_in_atom2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_atom2536 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_expr_in_atom2539 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_atom2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall2562 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_funcall2564 = new BitSet(new long[]{0x8408280100000000L,0x0000000003020000L});
    public static final BitSet FOLLOW_expr_list_in_funcall2566 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_funcall2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list2602 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_expr_list2605 = new BitSet(new long[]{0x8408280100000000L,0x0000000001020000L});
    public static final BitSet FOLLOW_expr_in_expr_list2608 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});

}