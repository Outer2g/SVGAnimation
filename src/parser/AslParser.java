// $ANTLR 3.4 /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g 2016-05-09 09:37:30

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "BLACK", "BLUE", "BOOLEAN", "CIRCLE", "COLOR", "COLORHEX", "COLORINT", "COLORPRCTJ", "COMMENT", "CREATE", "DELAY", "DESTROY", "DIV", "DO", "EEQUAL", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GREEN", "GT", "HASHTAG", "HEXADIGIT", "HIDE", "HIDET", "ID", "IF", "INT", "LE", "LIST_ATTR", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MODIFY", "MODIFY_T", "MOVE", "MOVE_T", "MUL", "NOT", "NOT_EQUAL", "OR", "PARALLEL", "PARAMS", "PLUS", "POSX", "POSY", "PREF", "PVALUE", "READ", "RECTANGLE", "RED", "RETURN", "RGB", "RGBPRCTJ", "SHOW", "SHOWT", "STRING", "STROKE", "TEXT", "THEN", "TRUE", "WHILE", "WHITE", "WRITE", "WS", "'&'", "'('", "')'", "','", "':'", "';'", "'r'", "'s'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
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
    public static final int DELAY=17;
    public static final int DESTROY=18;
    public static final int DIV=19;
    public static final int DO=20;
    public static final int EEQUAL=21;
    public static final int ELSE=22;
    public static final int ENDFUNC=23;
    public static final int ENDIF=24;
    public static final int ENDWHILE=25;
    public static final int EQUAL=26;
    public static final int ESC_SEQ=27;
    public static final int FALSE=28;
    public static final int FUNC=29;
    public static final int FUNCALL=30;
    public static final int GE=31;
    public static final int GREEN=32;
    public static final int GT=33;
    public static final int HASHTAG=34;
    public static final int HEXADIGIT=35;
    public static final int HIDE=36;
    public static final int HIDET=37;
    public static final int ID=38;
    public static final int IF=39;
    public static final int INT=40;
    public static final int LE=41;
    public static final int LIST_ATTR=42;
    public static final int LIST_FUNCTIONS=43;
    public static final int LIST_INSTR=44;
    public static final int LT=45;
    public static final int MINUS=46;
    public static final int MOD=47;
    public static final int MODIFY=48;
    public static final int MODIFY_T=49;
    public static final int MOVE=50;
    public static final int MOVE_T=51;
    public static final int MUL=52;
    public static final int NOT=53;
    public static final int NOT_EQUAL=54;
    public static final int OR=55;
    public static final int PARALLEL=56;
    public static final int PARAMS=57;
    public static final int PLUS=58;
    public static final int POSX=59;
    public static final int POSY=60;
    public static final int PREF=61;
    public static final int PVALUE=62;
    public static final int READ=63;
    public static final int RECTANGLE=64;
    public static final int RED=65;
    public static final int RETURN=66;
    public static final int RGB=67;
    public static final int RGBPRCTJ=68;
    public static final int SHOW=69;
    public static final int SHOWT=70;
    public static final int STRING=71;
    public static final int STROKE=72;
    public static final int TEXT=73;
    public static final int THEN=74;
    public static final int TRUE=75;
    public static final int WHILE=76;
    public static final int WHITE=77;
    public static final int WRITE=78;
    public static final int WS=79;

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
    public String getGrammarFileName() { return "/home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:64:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
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
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:64:9: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:64:11: ( func )+ EOF
            {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:64:11: ( func )+
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
            	    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:64:11: func
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
                // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:64:24: ^( LIST_FUNCTIONS ( func )+ )
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:68:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
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
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:68:9: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:68:11: FUNC ^ ID params block_instructions ENDFUNC !
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:72:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:72:9: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:72:11: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,81,FOLLOW_81_in_params262);  
            stream_81.add(char_literal8);


            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:72:15: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==80) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:72:15: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params264);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,82,FOLLOW_82_in_params267);  
            stream_82.add(char_literal10);


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
                // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:72:33: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:72:42: ( paramlist )?
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:76:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:76:10: ( param ( ',' ! param )* )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:76:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist293);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:76:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==83) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:76:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,83,FOLLOW_83_in_paramlist296); 

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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:81:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal14=null;

        AslTree id_tree=null;
        AslTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:81:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==80) ) {
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
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:81:13: '&' id= ID
                    {
                    char_literal14=(Token)match(input,80,FOLLOW_80_in_param324);  
                    stream_80.add(char_literal14);


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
                        // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:81:26: ^( PREF[$id,$id.text] )
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
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:82:13: id= ID
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
                        // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:82:22: ^( PVALUE[$id,$id.text] )
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:89:1: block_instructions : ( instruction )+ -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.instruction_return instruction15 =null;


        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:90:9: ( ( instruction )+ -> ^( LIST_INSTR ( instruction )+ ) )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:90:14: ( instruction )+
            {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:90:14: ( instruction )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= CREATE && LA5_0 <= DESTROY)||(LA5_0 >= HIDE && LA5_0 <= IF)||(LA5_0 >= MODIFY && LA5_0 <= MOVE_T)||LA5_0==PARALLEL||LA5_0==READ||LA5_0==RETURN||(LA5_0 >= SHOW && LA5_0 <= SHOWT)||LA5_0==WHILE||LA5_0==WRITE||LA5_0==85) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:90:14: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_block_instructions390);
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
            // 91:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:91:16: ^( LIST_INSTR ( instruction )+ )
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:94:1: instruction : ( ( instruction_spc ';' !) | instructions_brack );
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal17=null;
        AslParser.instruction_spc_return instruction_spc16 =null;

        AslParser.instructions_brack_return instructions_brack18 =null;


        AslTree char_literal17_tree=null;

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:94:13: ( ( instruction_spc ';' !) | instructions_brack )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0 >= CREATE && LA6_0 <= DESTROY)||(LA6_0 >= HIDE && LA6_0 <= IF)||(LA6_0 >= MODIFY && LA6_0 <= MOVE_T)||LA6_0==READ||LA6_0==RETURN||(LA6_0 >= SHOW && LA6_0 <= SHOWT)||LA6_0==WHILE||LA6_0==WRITE||LA6_0==85) ) {
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
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:94:15: ( instruction_spc ';' !)
                    {
                    root_0 = (AslTree)adaptor.nil();


                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:94:15: ( instruction_spc ';' !)
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:94:16: instruction_spc ';' !
                    {
                    pushFollow(FOLLOW_instruction_spc_in_instruction431);
                    instruction_spc16=instruction_spc();

                    state._fsp--;

                    adaptor.addChild(root_0, instruction_spc16.getTree());

                    char_literal17=(Token)match(input,85,FOLLOW_85_in_instruction433); 

                    }


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:94:40: instructions_brack
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_instructions_brack_in_instruction439);
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:97:1: instruction_spc : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | create | destroy | move | modify | show | hide | delay |);
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
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:98:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | create | destroy | move | modify | show | hide | delay |)
            int alt7=15;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EEQUAL) ) {
                    alt7=1;
                }
                else if ( (LA7_1==81) ) {
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
            case SHOWT:
                {
                alt7=12;
                }
                break;
            case HIDE:
            case HIDET:
                {
                alt7=13;
                }
                break;
            case DELAY:
                {
                alt7=14;
                }
                break;
            case 85:
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
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:98:13: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction_spc458);
                    assign19=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign19.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:99:13: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction_spc482);
                    ite_stmt20=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt20.getTree());

                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:100:13: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction_spc504);
                    while_stmt21=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt21.getTree());

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:101:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction_spc524);
                    funcall22=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall22.getTree());

                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:102:13: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction_spc547);
                    return_stmt23=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt23.getTree());

                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:103:13: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction_spc566);
                    read24=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read24.getTree());

                    }
                    break;
                case 7 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:104:13: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction_spc592);
                    write25=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write25.getTree());

                    }
                    break;
                case 8 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:105:13: create
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_create_in_instruction_spc617);
                    create26=create();

                    state._fsp--;

                    adaptor.addChild(root_0, create26.getTree());

                    }
                    break;
                case 9 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:106:13: destroy
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_destroy_in_instruction_spc641);
                    destroy27=destroy();

                    state._fsp--;

                    adaptor.addChild(root_0, destroy27.getTree());

                    }
                    break;
                case 10 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:107:13: move
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_in_instruction_spc664);
                    move28=move();

                    state._fsp--;

                    adaptor.addChild(root_0, move28.getTree());

                    }
                    break;
                case 11 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:108:13: modify
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_in_instruction_spc690);
                    modify29=modify();

                    state._fsp--;

                    adaptor.addChild(root_0, modify29.getTree());

                    }
                    break;
                case 12 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:110:13: show
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_show_in_instruction_spc718);
                    show30=show();

                    state._fsp--;

                    adaptor.addChild(root_0, show30.getTree());

                    }
                    break;
                case 13 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:111:13: hide
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_hide_in_instruction_spc732);
                    hide31=hide();

                    state._fsp--;

                    adaptor.addChild(root_0, hide31.getTree());

                    }
                    break;
                case 14 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:112:13: delay
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_delay_in_instruction_spc746);
                    delay32=delay();

                    state._fsp--;

                    adaptor.addChild(root_0, delay32.getTree());

                    }
                    break;
                case 15 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:114:9: 
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:116:1: instructions_brack : parallel ;
    public final AslParser.instructions_brack_return instructions_brack() throws RecognitionException {
        AslParser.instructions_brack_return retval = new AslParser.instructions_brack_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.parallel_return parallel33 =null;



        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:116:20: ( parallel )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:116:22: parallel
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_parallel_in_instructions_brack792);
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:119:1: assign : ID eq= EEQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) ;
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
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:119:9: ( ID eq= EEQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:119:13: ID eq= EEQUAL expr
            {
            ID34=(Token)match(input,ID,FOLLOW_ID_in_assign804);  
            stream_ID.add(ID34);


            eq=(Token)match(input,EEQUAL,FOLLOW_EEQUAL_in_assign808);  
            stream_EEQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign810);
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
            // 119:31: -> ^( ASSIGN[$eq,\":=\"] ID expr )
            {
                // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:119:34: ^( ASSIGN[$eq,\":=\"] ID expr )
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:123:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
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
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:123:13: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:123:17: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF36=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt844); 
            IF36_tree = 
            (AslTree)adaptor.create(IF36)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF36_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt847);
            expr37=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr37.getTree());

            THEN38=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt849); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt852);
            block_instructions39=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions39.getTree());

            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:123:51: ( ELSE ! block_instructions )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ELSE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:123:52: ELSE ! block_instructions
                    {
                    ELSE40=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt855); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt858);
                    block_instructions41=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions41.getTree());

                    }
                    break;

            }


            ENDIF42=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt862); 

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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:127:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
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
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:127:13: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:127:17: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE43=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt888); 
            WHILE43_tree = 
            (AslTree)adaptor.create(WHILE43)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE43_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt891);
            expr44=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr44.getTree());

            DO45=(Token)match(input,DO,FOLLOW_DO_in_while_stmt893); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt896);
            block_instructions46=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions46.getTree());

            ENDWHILE47=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt898); 

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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:131:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN48=null;
        AslParser.expr_return expr49 =null;


        AslTree RETURN48_tree=null;

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:131:13: ( RETURN ^ ( expr )? )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:131:17: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN48=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt923); 
            RETURN48_tree = 
            (AslTree)adaptor.create(RETURN48)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN48_tree, root_0);


            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:131:25: ( expr )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==TRUE||LA9_0==81) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:131:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt926);
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:135:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ50=null;
        Token ID51=null;

        AslTree READ50_tree=null;
        AslTree ID51_tree=null;

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:135:9: ( READ ^ ID )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:135:13: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ50=(Token)match(input,READ,FOLLOW_READ_in_read950); 
            READ50_tree = 
            (AslTree)adaptor.create(READ50)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ50_tree, root_0);


            ID51=(Token)match(input,ID,FOLLOW_ID_in_read953); 
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:139:1: write : WRITE ^ ( expr | STRING ) ;
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
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:139:9: ( WRITE ^ ( expr | STRING ) )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:139:13: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE52=(Token)match(input,WRITE,FOLLOW_WRITE_in_write975); 
            WRITE52_tree = 
            (AslTree)adaptor.create(WRITE52)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE52_tree, root_0);


            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:139:20: ( expr | STRING )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==FALSE||LA10_0==ID||LA10_0==INT||LA10_0==MINUS||LA10_0==NOT||LA10_0==PLUS||LA10_0==TRUE||LA10_0==81) ) {
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
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:139:21: expr
                    {
                    pushFollow(FOLLOW_expr_in_write979);
                    expr53=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr53.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:139:28: STRING
                    {
                    STRING54=(Token)match(input,STRING,FOLLOW_STRING_in_write983); 
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:144:1: create : CREATE ^ ID '(' ! obj_type ',' ! expr ',' ! expr ( ',' ! list_attributes )? ')' !;
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
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:144:9: ( CREATE ^ ID '(' ! obj_type ',' ! expr ',' ! expr ( ',' ! list_attributes )? ')' !)
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:144:13: CREATE ^ ID '(' ! obj_type ',' ! expr ',' ! expr ( ',' ! list_attributes )? ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            CREATE55=(Token)match(input,CREATE,FOLLOW_CREATE_in_create1007); 
            CREATE55_tree = 
            (AslTree)adaptor.create(CREATE55)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(CREATE55_tree, root_0);


            ID56=(Token)match(input,ID,FOLLOW_ID_in_create1010); 
            ID56_tree = 
            (AslTree)adaptor.create(ID56)
            ;
            adaptor.addChild(root_0, ID56_tree);


            char_literal57=(Token)match(input,81,FOLLOW_81_in_create1012); 

            pushFollow(FOLLOW_obj_type_in_create1015);
            obj_type58=obj_type();

            state._fsp--;

            adaptor.addChild(root_0, obj_type58.getTree());

            char_literal59=(Token)match(input,83,FOLLOW_83_in_create1017); 

            pushFollow(FOLLOW_expr_in_create1020);
            expr60=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr60.getTree());

            char_literal61=(Token)match(input,83,FOLLOW_83_in_create1022); 

            pushFollow(FOLLOW_expr_in_create1025);
            expr62=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr62.getTree());

            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:144:58: ( ',' ! list_attributes )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==83) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:144:59: ',' ! list_attributes
                    {
                    char_literal63=(Token)match(input,83,FOLLOW_83_in_create1028); 

                    pushFollow(FOLLOW_list_attributes_in_create1031);
                    list_attributes64=list_attributes();

                    state._fsp--;

                    adaptor.addChild(root_0, list_attributes64.getTree());

                    }
                    break;

            }


            char_literal65=(Token)match(input,82,FOLLOW_82_in_create1035); 

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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:147:1: destroy : DESTROY ^ '(' ! ID ')' !;
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
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:147:9: ( DESTROY ^ '(' ! ID ')' !)
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:147:13: DESTROY ^ '(' ! ID ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            DESTROY66=(Token)match(input,DESTROY,FOLLOW_DESTROY_in_destroy1055); 
            DESTROY66_tree = 
            (AslTree)adaptor.create(DESTROY66)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(DESTROY66_tree, root_0);


            char_literal67=(Token)match(input,81,FOLLOW_81_in_destroy1058); 

            ID68=(Token)match(input,ID,FOLLOW_ID_in_destroy1061); 
            ID68_tree = 
            (AslTree)adaptor.create(ID68)
            ;
            adaptor.addChild(root_0, ID68_tree);


            char_literal69=(Token)match(input,82,FOLLOW_82_in_destroy1063); 

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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:150:1: move : ( move_time | move_no_time );
    public final AslParser.move_return move() throws RecognitionException {
        AslParser.move_return retval = new AslParser.move_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.move_time_return move_time70 =null;

        AslParser.move_no_time_return move_no_time71 =null;



        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:150:9: ( move_time | move_no_time )
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
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:150:13: move_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_time_in_move1086);
                    move_time70=move_time();

                    state._fsp--;

                    adaptor.addChild(root_0, move_time70.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:150:25: move_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_no_time_in_move1090);
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:153:1: move_time : MOVE_T ^ ID time '(' ! expr ',' ! expr ')' !;
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
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:153:11: ( MOVE_T ^ ID time '(' ! expr ',' ! expr ')' !)
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:153:13: MOVE_T ^ ID time '(' ! expr ',' ! expr ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            MOVE_T72=(Token)match(input,MOVE_T,FOLLOW_MOVE_T_in_move_time1107); 
            MOVE_T72_tree = 
            (AslTree)adaptor.create(MOVE_T72)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MOVE_T72_tree, root_0);


            ID73=(Token)match(input,ID,FOLLOW_ID_in_move_time1110); 
            ID73_tree = 
            (AslTree)adaptor.create(ID73)
            ;
            adaptor.addChild(root_0, ID73_tree);


            pushFollow(FOLLOW_time_in_move_time1113);
            time74=time();

            state._fsp--;

            adaptor.addChild(root_0, time74.getTree());

            char_literal75=(Token)match(input,81,FOLLOW_81_in_move_time1115); 

            pushFollow(FOLLOW_expr_in_move_time1118);
            expr76=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr76.getTree());

            char_literal77=(Token)match(input,83,FOLLOW_83_in_move_time1120); 

            pushFollow(FOLLOW_expr_in_move_time1123);
            expr78=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr78.getTree());

            char_literal79=(Token)match(input,82,FOLLOW_82_in_move_time1126); 

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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:156:1: move_no_time : MOVE ^ ID '(' ! expr ',' ! expr ')' !;
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
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:156:14: ( MOVE ^ ID '(' ! expr ',' ! expr ')' !)
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:156:16: MOVE ^ ID '(' ! expr ',' ! expr ')' !
            {
            root_0 = (AslTree)adaptor.nil();


            MOVE80=(Token)match(input,MOVE,FOLLOW_MOVE_in_move_no_time1144); 
            MOVE80_tree = 
            (AslTree)adaptor.create(MOVE80)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MOVE80_tree, root_0);


            ID81=(Token)match(input,ID,FOLLOW_ID_in_move_no_time1147); 
            ID81_tree = 
            (AslTree)adaptor.create(ID81)
            ;
            adaptor.addChild(root_0, ID81_tree);


            char_literal82=(Token)match(input,81,FOLLOW_81_in_move_no_time1149); 

            pushFollow(FOLLOW_expr_in_move_no_time1152);
            expr83=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr83.getTree());

            char_literal84=(Token)match(input,83,FOLLOW_83_in_move_no_time1154); 

            pushFollow(FOLLOW_expr_in_move_no_time1157);
            expr85=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr85.getTree());

            char_literal86=(Token)match(input,82,FOLLOW_82_in_move_no_time1159); 

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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:159:1: modify : ( modify_time | modify_no_time );
    public final AslParser.modify_return modify() throws RecognitionException {
        AslParser.modify_return retval = new AslParser.modify_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.modify_time_return modify_time87 =null;

        AslParser.modify_no_time_return modify_no_time88 =null;



        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:159:11: ( modify_time | modify_no_time )
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
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:159:15: modify_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_time_in_modify1182);
                    modify_time87=modify_time();

                    state._fsp--;

                    adaptor.addChild(root_0, modify_time87.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:159:29: modify_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_no_time_in_modify1186);
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:162:1: modify_time : MODIFY_T ^ ID time list_attributes ;
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
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:162:13: ( MODIFY_T ^ ID time list_attributes )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:162:15: MODIFY_T ^ ID time list_attributes
            {
            root_0 = (AslTree)adaptor.nil();


            MODIFY_T89=(Token)match(input,MODIFY_T,FOLLOW_MODIFY_T_in_modify_time1203); 
            MODIFY_T89_tree = 
            (AslTree)adaptor.create(MODIFY_T89)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MODIFY_T89_tree, root_0);


            ID90=(Token)match(input,ID,FOLLOW_ID_in_modify_time1206); 
            ID90_tree = 
            (AslTree)adaptor.create(ID90)
            ;
            adaptor.addChild(root_0, ID90_tree);


            pushFollow(FOLLOW_time_in_modify_time1208);
            time91=time();

            state._fsp--;

            adaptor.addChild(root_0, time91.getTree());

            pushFollow(FOLLOW_list_attributes_in_modify_time1210);
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:165:1: modify_no_time : MODIFY ^ ID list_attributes ;
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
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:165:16: ( MODIFY ^ ID list_attributes )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:165:18: MODIFY ^ ID list_attributes
            {
            root_0 = (AslTree)adaptor.nil();


            MODIFY93=(Token)match(input,MODIFY,FOLLOW_MODIFY_in_modify_no_time1227); 
            MODIFY93_tree = 
            (AslTree)adaptor.create(MODIFY93)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(MODIFY93_tree, root_0);


            ID94=(Token)match(input,ID,FOLLOW_ID_in_modify_no_time1230); 
            ID94_tree = 
            (AslTree)adaptor.create(ID94)
            ;
            adaptor.addChild(root_0, ID94_tree);


            pushFollow(FOLLOW_list_attributes_in_modify_no_time1232);
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:168:1: parallel : ( parallel_time | parallel_no_time );
    public final AslParser.parallel_return parallel() throws RecognitionException {
        AslParser.parallel_return retval = new AslParser.parallel_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.parallel_time_return parallel_time96 =null;

        AslParser.parallel_no_time_return parallel_no_time97 =null;



        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:168:10: ( parallel_time | parallel_no_time )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==PARALLEL) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==88) ) {
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
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:168:12: parallel_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_parallel_time_in_parallel1250);
                    parallel_time96=parallel_time();

                    state._fsp--;

                    adaptor.addChild(root_0, parallel_time96.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:168:28: parallel_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_parallel_no_time_in_parallel1254);
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:170:1: instructions_notime : ( move_no_time | modify_no_time | show_no_time | hide_no_time );
    public final AslParser.instructions_notime_return instructions_notime() throws RecognitionException {
        AslParser.instructions_notime_return retval = new AslParser.instructions_notime_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.move_no_time_return move_no_time98 =null;

        AslParser.modify_no_time_return modify_no_time99 =null;

        AslParser.show_no_time_return show_no_time100 =null;

        AslParser.hide_no_time_return hide_no_time101 =null;



        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:170:21: ( move_no_time | modify_no_time | show_no_time | hide_no_time )
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
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:170:23: move_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_no_time_in_instructions_notime1262);
                    move_no_time98=move_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, move_no_time98.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:170:38: modify_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_no_time_in_instructions_notime1266);
                    modify_no_time99=modify_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, modify_no_time99.getTree());

                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:170:55: show_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_show_no_time_in_instructions_notime1270);
                    show_no_time100=show_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, show_no_time100.getTree());

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:170:70: hide_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_hide_no_time_in_instructions_notime1274);
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:172:1: block_instructions_notime : instructions_notime ';' ( instructions_notime ';' )* -> ^( LIST_INSTR ( instructions_notime )+ ) ;
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
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_instructions_notime=new RewriteRuleSubtreeStream(adaptor,"rule instructions_notime");
        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:172:26: ( instructions_notime ';' ( instructions_notime ';' )* -> ^( LIST_INSTR ( instructions_notime )+ ) )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:172:28: instructions_notime ';' ( instructions_notime ';' )*
            {
            pushFollow(FOLLOW_instructions_notime_in_block_instructions_notime1281);
            instructions_notime102=instructions_notime();

            state._fsp--;

            stream_instructions_notime.add(instructions_notime102.getTree());

            char_literal103=(Token)match(input,85,FOLLOW_85_in_block_instructions_notime1282);  
            stream_85.add(char_literal103);


            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:172:51: ( instructions_notime ';' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==HIDE||LA16_0==MODIFY||LA16_0==MOVE||LA16_0==SHOW) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:172:53: instructions_notime ';'
            	    {
            	    pushFollow(FOLLOW_instructions_notime_in_block_instructions_notime1286);
            	    instructions_notime104=instructions_notime();

            	    state._fsp--;

            	    stream_instructions_notime.add(instructions_notime104.getTree());

            	    char_literal105=(Token)match(input,85,FOLLOW_85_in_block_instructions_notime1288);  
            	    stream_85.add(char_literal105);


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
            // 173:29: -> ^( LIST_INSTR ( instructions_notime )+ )
            {
                // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:173:32: ^( LIST_INSTR ( instructions_notime )+ )
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:175:1: parallel_time : PARALLEL ^ time '{' ! block_instructions_notime '}' !;
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
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:175:15: ( PARALLEL ^ time '{' ! block_instructions_notime '}' !)
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:175:17: PARALLEL ^ time '{' ! block_instructions_notime '}' !
            {
            root_0 = (AslTree)adaptor.nil();


            PARALLEL106=(Token)match(input,PARALLEL,FOLLOW_PARALLEL_in_parallel_time1335); 
            PARALLEL106_tree = 
            (AslTree)adaptor.create(PARALLEL106)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(PARALLEL106_tree, root_0);


            pushFollow(FOLLOW_time_in_parallel_time1338);
            time107=time();

            state._fsp--;

            adaptor.addChild(root_0, time107.getTree());

            char_literal108=(Token)match(input,88,FOLLOW_88_in_parallel_time1340); 

            pushFollow(FOLLOW_block_instructions_notime_in_parallel_time1343);
            block_instructions_notime109=block_instructions_notime();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions_notime109.getTree());

            char_literal110=(Token)match(input,89,FOLLOW_89_in_parallel_time1345); 

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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:177:1: instructions_time : ( move_time | modify_time | show_time | hide_time );
    public final AslParser.instructions_time_return instructions_time() throws RecognitionException {
        AslParser.instructions_time_return retval = new AslParser.instructions_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.move_time_return move_time111 =null;

        AslParser.modify_time_return modify_time112 =null;

        AslParser.show_time_return show_time113 =null;

        AslParser.hide_time_return hide_time114 =null;



        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:177:19: ( move_time | modify_time | show_time | hide_time )
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
            case SHOWT:
                {
                alt17=3;
                }
                break;
            case HIDET:
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
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:177:21: move_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_move_time_in_instructions_time1354);
                    move_time111=move_time();

                    state._fsp--;

                    adaptor.addChild(root_0, move_time111.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:177:33: modify_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_modify_time_in_instructions_time1358);
                    modify_time112=modify_time();

                    state._fsp--;

                    adaptor.addChild(root_0, modify_time112.getTree());

                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:177:47: show_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_show_time_in_instructions_time1362);
                    show_time113=show_time();

                    state._fsp--;

                    adaptor.addChild(root_0, show_time113.getTree());

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:177:59: hide_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_hide_time_in_instructions_time1366);
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:179:1: block_instructions_time : instructions_time ';' ( instructions_time ';' )* -> ^( LIST_INSTR ( instructions_time )+ ) ;
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
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_instructions_time=new RewriteRuleSubtreeStream(adaptor,"rule instructions_time");
        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:179:24: ( instructions_time ';' ( instructions_time ';' )* -> ^( LIST_INSTR ( instructions_time )+ ) )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:179:26: instructions_time ';' ( instructions_time ';' )*
            {
            pushFollow(FOLLOW_instructions_time_in_block_instructions_time1373);
            instructions_time115=instructions_time();

            state._fsp--;

            stream_instructions_time.add(instructions_time115.getTree());

            char_literal116=(Token)match(input,85,FOLLOW_85_in_block_instructions_time1375);  
            stream_85.add(char_literal116);


            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:179:48: ( instructions_time ';' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==HIDET||LA18_0==MODIFY_T||LA18_0==MOVE_T||LA18_0==SHOWT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:179:50: instructions_time ';'
            	    {
            	    pushFollow(FOLLOW_instructions_time_in_block_instructions_time1379);
            	    instructions_time117=instructions_time();

            	    state._fsp--;

            	    stream_instructions_time.add(instructions_time117.getTree());

            	    char_literal118=(Token)match(input,85,FOLLOW_85_in_block_instructions_time1380);  
            	    stream_85.add(char_literal118);


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
            // 180:29: -> ^( LIST_INSTR ( instructions_time )+ )
            {
                // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:180:32: ^( LIST_INSTR ( instructions_time )+ )
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:182:1: parallel_no_time : PARALLEL ^ '{' ! block_instructions_time '}' !;
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
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:182:18: ( PARALLEL ^ '{' ! block_instructions_time '}' !)
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:182:20: PARALLEL ^ '{' ! block_instructions_time '}' !
            {
            root_0 = (AslTree)adaptor.nil();


            PARALLEL119=(Token)match(input,PARALLEL,FOLLOW_PARALLEL_in_parallel_no_time1427); 
            PARALLEL119_tree = 
            (AslTree)adaptor.create(PARALLEL119)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(PARALLEL119_tree, root_0);


            char_literal120=(Token)match(input,88,FOLLOW_88_in_parallel_no_time1430); 

            pushFollow(FOLLOW_block_instructions_time_in_parallel_no_time1433);
            block_instructions_time121=block_instructions_time();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions_time121.getTree());

            char_literal122=(Token)match(input,89,FOLLOW_89_in_parallel_no_time1435); 

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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:184:1: list_attributes : '(' attribute ( ',' attribute )* ')' -> ^( LIST_ATTR ( attribute )+ ) ;
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
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:184:17: ( '(' attribute ( ',' attribute )* ')' -> ^( LIST_ATTR ( attribute )+ ) )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:184:19: '(' attribute ( ',' attribute )* ')'
            {
            char_literal123=(Token)match(input,81,FOLLOW_81_in_list_attributes1444);  
            stream_81.add(char_literal123);


            pushFollow(FOLLOW_attribute_in_list_attributes1446);
            attribute124=attribute();

            state._fsp--;

            stream_attribute.add(attribute124.getTree());

            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:184:33: ( ',' attribute )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==83) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:184:34: ',' attribute
            	    {
            	    char_literal125=(Token)match(input,83,FOLLOW_83_in_list_attributes1449);  
            	    stream_83.add(char_literal125);


            	    pushFollow(FOLLOW_attribute_in_list_attributes1451);
            	    attribute126=attribute();

            	    state._fsp--;

            	    stream_attribute.add(attribute126.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            char_literal127=(Token)match(input,82,FOLLOW_82_in_list_attributes1455);  
            stream_82.add(char_literal127);


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
            // 184:54: -> ^( LIST_ATTR ( attribute )+ )
            {
                // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:184:57: ^( LIST_ATTR ( attribute )+ )
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:187:1: attribute : ( attribute_name_color ^ ':' ! color | attribute_name_expr ^ ':' ! expr );
    public final AslParser.attribute_return attribute() throws RecognitionException {
        AslParser.attribute_return retval = new AslParser.attribute_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal129=null;
        Token char_literal132=null;
        AslParser.attribute_name_color_return attribute_name_color128 =null;

        AslParser.color_return color130 =null;

        AslParser.attribute_name_expr_return attribute_name_expr131 =null;

        AslParser.expr_return expr133 =null;


        AslTree char_literal129_tree=null;
        AslTree char_literal132_tree=null;

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:187:13: ( attribute_name_color ^ ':' ! color | attribute_name_expr ^ ':' ! expr )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==COLOR||LA20_0==STROKE) ) {
                alt20=1;
            }
            else if ( ((LA20_0 >= POSX && LA20_0 <= POSY)||LA20_0==86) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:187:17: attribute_name_color ^ ':' ! color
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_attribute_name_color_in_attribute1485);
                    attribute_name_color128=attribute_name_color();

                    state._fsp--;

                    root_0 = (AslTree)adaptor.becomeRoot(attribute_name_color128.getTree(), root_0);

                    char_literal129=(Token)match(input,84,FOLLOW_84_in_attribute1488); 

                    pushFollow(FOLLOW_color_in_attribute1491);
                    color130=color();

                    state._fsp--;

                    adaptor.addChild(root_0, color130.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:188:17: attribute_name_expr ^ ':' ! expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_attribute_name_expr_in_attribute1509);
                    attribute_name_expr131=attribute_name_expr();

                    state._fsp--;

                    root_0 = (AslTree)adaptor.becomeRoot(attribute_name_expr131.getTree(), root_0);

                    char_literal132=(Token)match(input,84,FOLLOW_84_in_attribute1512); 

                    pushFollow(FOLLOW_expr_in_attribute1515);
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


    public static class show_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "show"
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:191:1: show : ( show_time | show_no_time );
    public final AslParser.show_return show() throws RecognitionException {
        AslParser.show_return retval = new AslParser.show_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.show_time_return show_time134 =null;

        AslParser.show_no_time_return show_no_time135 =null;



        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:191:6: ( show_time | show_no_time )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==SHOWT) ) {
                alt21=1;
            }
            else if ( (LA21_0==SHOW) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:191:8: show_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_show_time_in_show1536);
                    show_time134=show_time();

                    state._fsp--;

                    adaptor.addChild(root_0, show_time134.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:191:20: show_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_show_no_time_in_show1540);
                    show_no_time135=show_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, show_no_time135.getTree());

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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:193:1: show_time : SHOWT ^ ID time ;
    public final AslParser.show_time_return show_time() throws RecognitionException {
        AslParser.show_time_return retval = new AslParser.show_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token SHOWT136=null;
        Token ID137=null;
        AslParser.time_return time138 =null;


        AslTree SHOWT136_tree=null;
        AslTree ID137_tree=null;

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:193:11: ( SHOWT ^ ID time )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:193:13: SHOWT ^ ID time
            {
            root_0 = (AslTree)adaptor.nil();


            SHOWT136=(Token)match(input,SHOWT,FOLLOW_SHOWT_in_show_time1548); 
            SHOWT136_tree = 
            (AslTree)adaptor.create(SHOWT136)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(SHOWT136_tree, root_0);


            ID137=(Token)match(input,ID,FOLLOW_ID_in_show_time1551); 
            ID137_tree = 
            (AslTree)adaptor.create(ID137)
            ;
            adaptor.addChild(root_0, ID137_tree);


            pushFollow(FOLLOW_time_in_show_time1553);
            time138=time();

            state._fsp--;

            adaptor.addChild(root_0, time138.getTree());

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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:195:1: show_no_time : SHOW ^ ID ;
    public final AslParser.show_no_time_return show_no_time() throws RecognitionException {
        AslParser.show_no_time_return retval = new AslParser.show_no_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token SHOW139=null;
        Token ID140=null;

        AslTree SHOW139_tree=null;
        AslTree ID140_tree=null;

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:195:14: ( SHOW ^ ID )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:195:17: SHOW ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            SHOW139=(Token)match(input,SHOW,FOLLOW_SHOW_in_show_no_time1562); 
            SHOW139_tree = 
            (AslTree)adaptor.create(SHOW139)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(SHOW139_tree, root_0);


            ID140=(Token)match(input,ID,FOLLOW_ID_in_show_no_time1565); 
            ID140_tree = 
            (AslTree)adaptor.create(ID140)
            ;
            adaptor.addChild(root_0, ID140_tree);


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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:197:1: hide : ( hide_time | hide_no_time );
    public final AslParser.hide_return hide() throws RecognitionException {
        AslParser.hide_return retval = new AslParser.hide_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.hide_time_return hide_time141 =null;

        AslParser.hide_no_time_return hide_no_time142 =null;



        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:197:6: ( hide_time | hide_no_time )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==HIDET) ) {
                alt22=1;
            }
            else if ( (LA22_0==HIDE) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:197:8: hide_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_hide_time_in_hide1573);
                    hide_time141=hide_time();

                    state._fsp--;

                    adaptor.addChild(root_0, hide_time141.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:197:20: hide_no_time
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_hide_no_time_in_hide1577);
                    hide_no_time142=hide_no_time();

                    state._fsp--;

                    adaptor.addChild(root_0, hide_no_time142.getTree());

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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:199:1: hide_time : HIDET ^ ID time ;
    public final AslParser.hide_time_return hide_time() throws RecognitionException {
        AslParser.hide_time_return retval = new AslParser.hide_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token HIDET143=null;
        Token ID144=null;
        AslParser.time_return time145 =null;


        AslTree HIDET143_tree=null;
        AslTree ID144_tree=null;

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:199:11: ( HIDET ^ ID time )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:199:13: HIDET ^ ID time
            {
            root_0 = (AslTree)adaptor.nil();


            HIDET143=(Token)match(input,HIDET,FOLLOW_HIDET_in_hide_time1585); 
            HIDET143_tree = 
            (AslTree)adaptor.create(HIDET143)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(HIDET143_tree, root_0);


            ID144=(Token)match(input,ID,FOLLOW_ID_in_hide_time1588); 
            ID144_tree = 
            (AslTree)adaptor.create(ID144)
            ;
            adaptor.addChild(root_0, ID144_tree);


            pushFollow(FOLLOW_time_in_hide_time1590);
            time145=time();

            state._fsp--;

            adaptor.addChild(root_0, time145.getTree());

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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:201:1: hide_no_time : HIDE ^ ID ;
    public final AslParser.hide_no_time_return hide_no_time() throws RecognitionException {
        AslParser.hide_no_time_return retval = new AslParser.hide_no_time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token HIDE146=null;
        Token ID147=null;

        AslTree HIDE146_tree=null;
        AslTree ID147_tree=null;

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:201:14: ( HIDE ^ ID )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:201:17: HIDE ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            HIDE146=(Token)match(input,HIDE,FOLLOW_HIDE_in_hide_no_time1599); 
            HIDE146_tree = 
            (AslTree)adaptor.create(HIDE146)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(HIDE146_tree, root_0);


            ID147=(Token)match(input,ID,FOLLOW_ID_in_hide_no_time1602); 
            ID147_tree = 
            (AslTree)adaptor.create(ID147)
            ;
            adaptor.addChild(root_0, ID147_tree);


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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:203:1: delay : DELAY ^ time ;
    public final AslParser.delay_return delay() throws RecognitionException {
        AslParser.delay_return retval = new AslParser.delay_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token DELAY148=null;
        AslParser.time_return time149 =null;


        AslTree DELAY148_tree=null;

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:203:6: ( DELAY ^ time )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:203:8: DELAY ^ time
            {
            root_0 = (AslTree)adaptor.nil();


            DELAY148=(Token)match(input,DELAY,FOLLOW_DELAY_in_delay1609); 
            DELAY148_tree = 
            (AslTree)adaptor.create(DELAY148)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(DELAY148_tree, root_0);


            pushFollow(FOLLOW_time_in_delay1612);
            time149=time();

            state._fsp--;

            adaptor.addChild(root_0, time149.getTree());

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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:205:1: attribute_name_color : ( COLOR | STROKE );
    public final AslParser.attribute_name_color_return attribute_name_color() throws RecognitionException {
        AslParser.attribute_name_color_return retval = new AslParser.attribute_name_color_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set150=null;

        AslTree set150_tree=null;

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:205:25: ( COLOR | STROKE )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set150=(Token)input.LT(1);

            if ( input.LA(1)==COLOR||input.LA(1)==STROKE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set150)
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:209:1: attribute_name_expr : ( POSX | POSY | 'r' );
    public final AslParser.attribute_name_expr_return attribute_name_expr() throws RecognitionException {
        AslParser.attribute_name_expr_return retval = new AslParser.attribute_name_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set151=null;

        AslTree set151_tree=null;

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:209:21: ( POSX | POSY | 'r' )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set151=(Token)input.LT(1);

            if ( (input.LA(1) >= POSX && input.LA(1) <= POSY)||input.LA(1)==86 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set151)
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:214:1: color : ( COLORHEX | RGB '(' expr ',' expr ',' expr ')' -> ^( COLORINT expr expr expr ) | RGBPRCTJ '(' expr ',' expr ',' expr ')' -> ^( COLORPRCTJ expr expr expr ) | color_keyword );
    public final AslParser.color_return color() throws RecognitionException {
        AslParser.color_return retval = new AslParser.color_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token COLORHEX152=null;
        Token RGB153=null;
        Token char_literal154=null;
        Token char_literal156=null;
        Token char_literal158=null;
        Token char_literal160=null;
        Token RGBPRCTJ161=null;
        Token char_literal162=null;
        Token char_literal164=null;
        Token char_literal166=null;
        Token char_literal168=null;
        AslParser.expr_return expr155 =null;

        AslParser.expr_return expr157 =null;

        AslParser.expr_return expr159 =null;

        AslParser.expr_return expr163 =null;

        AslParser.expr_return expr165 =null;

        AslParser.expr_return expr167 =null;

        AslParser.color_keyword_return color_keyword169 =null;


        AslTree COLORHEX152_tree=null;
        AslTree RGB153_tree=null;
        AslTree char_literal154_tree=null;
        AslTree char_literal156_tree=null;
        AslTree char_literal158_tree=null;
        AslTree char_literal160_tree=null;
        AslTree RGBPRCTJ161_tree=null;
        AslTree char_literal162_tree=null;
        AslTree char_literal164_tree=null;
        AslTree char_literal166_tree=null;
        AslTree char_literal168_tree=null;
        RewriteRuleTokenStream stream_RGBPRCTJ=new RewriteRuleTokenStream(adaptor,"token RGBPRCTJ");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_RGB=new RewriteRuleTokenStream(adaptor,"token RGB");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:214:9: ( COLORHEX | RGB '(' expr ',' expr ',' expr ')' -> ^( COLORINT expr expr expr ) | RGBPRCTJ '(' expr ',' expr ',' expr ')' -> ^( COLORPRCTJ expr expr expr ) | color_keyword )
            int alt23=4;
            switch ( input.LA(1) ) {
            case COLORHEX:
                {
                alt23=1;
                }
                break;
            case RGB:
                {
                alt23=2;
                }
                break;
            case RGBPRCTJ:
                {
                alt23=3;
                }
                break;
            case BLACK:
            case BLUE:
            case GREEN:
            case RED:
            case WHITE:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:214:13: COLORHEX
                    {
                    root_0 = (AslTree)adaptor.nil();


                    COLORHEX152=(Token)match(input,COLORHEX,FOLLOW_COLORHEX_in_color1747); 
                    COLORHEX152_tree = 
                    (AslTree)adaptor.create(COLORHEX152)
                    ;
                    adaptor.addChild(root_0, COLORHEX152_tree);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:215:13: RGB '(' expr ',' expr ',' expr ')'
                    {
                    RGB153=(Token)match(input,RGB,FOLLOW_RGB_in_color1762);  
                    stream_RGB.add(RGB153);


                    char_literal154=(Token)match(input,81,FOLLOW_81_in_color1764);  
                    stream_81.add(char_literal154);


                    pushFollow(FOLLOW_expr_in_color1766);
                    expr155=expr();

                    state._fsp--;

                    stream_expr.add(expr155.getTree());

                    char_literal156=(Token)match(input,83,FOLLOW_83_in_color1768);  
                    stream_83.add(char_literal156);


                    pushFollow(FOLLOW_expr_in_color1770);
                    expr157=expr();

                    state._fsp--;

                    stream_expr.add(expr157.getTree());

                    char_literal158=(Token)match(input,83,FOLLOW_83_in_color1772);  
                    stream_83.add(char_literal158);


                    pushFollow(FOLLOW_expr_in_color1774);
                    expr159=expr();

                    state._fsp--;

                    stream_expr.add(expr159.getTree());

                    char_literal160=(Token)match(input,82,FOLLOW_82_in_color1776);  
                    stream_82.add(char_literal160);


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
                    // 215:48: -> ^( COLORINT expr expr expr )
                    {
                        // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:215:51: ^( COLORINT expr expr expr )
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
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:216:13: RGBPRCTJ '(' expr ',' expr ',' expr ')'
                    {
                    RGBPRCTJ161=(Token)match(input,RGBPRCTJ,FOLLOW_RGBPRCTJ_in_color1802);  
                    stream_RGBPRCTJ.add(RGBPRCTJ161);


                    char_literal162=(Token)match(input,81,FOLLOW_81_in_color1804);  
                    stream_81.add(char_literal162);


                    pushFollow(FOLLOW_expr_in_color1806);
                    expr163=expr();

                    state._fsp--;

                    stream_expr.add(expr163.getTree());

                    char_literal164=(Token)match(input,83,FOLLOW_83_in_color1808);  
                    stream_83.add(char_literal164);


                    pushFollow(FOLLOW_expr_in_color1810);
                    expr165=expr();

                    state._fsp--;

                    stream_expr.add(expr165.getTree());

                    char_literal166=(Token)match(input,83,FOLLOW_83_in_color1812);  
                    stream_83.add(char_literal166);


                    pushFollow(FOLLOW_expr_in_color1814);
                    expr167=expr();

                    state._fsp--;

                    stream_expr.add(expr167.getTree());

                    char_literal168=(Token)match(input,82,FOLLOW_82_in_color1816);  
                    stream_82.add(char_literal168);


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
                    // 216:53: -> ^( COLORPRCTJ expr expr expr )
                    {
                        // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:216:56: ^( COLORPRCTJ expr expr expr )
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
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:217:13: color_keyword
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_color_keyword_in_color1842);
                    color_keyword169=color_keyword();

                    state._fsp--;

                    adaptor.addChild(root_0, color_keyword169.getTree());

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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:220:1: color_keyword : ( RED | WHITE | BLACK | BLUE | GREEN );
    public final AslParser.color_keyword_return color_keyword() throws RecognitionException {
        AslParser.color_keyword_return retval = new AslParser.color_keyword_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set170=null;

        AslTree set170_tree=null;

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:220:15: ( RED | WHITE | BLACK | BLUE | GREEN )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set170=(Token)input.LT(1);

            if ( (input.LA(1) >= BLACK && input.LA(1) <= BLUE)||input.LA(1)==GREEN||input.LA(1)==RED||input.LA(1)==WHITE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set170)
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:222:1: obj_type : ( CIRCLE | RECTANGLE | TEXT );
    public final AslParser.obj_type_return obj_type() throws RecognitionException {
        AslParser.obj_type_return retval = new AslParser.obj_type_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set171=null;

        AslTree set171_tree=null;

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:222:10: ( CIRCLE | RECTANGLE | TEXT )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set171=(Token)input.LT(1);

            if ( input.LA(1)==CIRCLE||input.LA(1)==RECTANGLE||input.LA(1)==TEXT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set171)
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:225:1: time : INT 's' ^;
    public final AslParser.time_return time() throws RecognitionException {
        AslParser.time_return retval = new AslParser.time_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token INT172=null;
        Token char_literal173=null;

        AslTree INT172_tree=null;
        AslTree char_literal173_tree=null;

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:225:6: ( INT 's' ^)
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:225:9: INT 's' ^
            {
            root_0 = (AslTree)adaptor.nil();


            INT172=(Token)match(input,INT,FOLLOW_INT_in_time1910); 
            INT172_tree = 
            (AslTree)adaptor.create(INT172)
            ;
            adaptor.addChild(root_0, INT172_tree);


            char_literal173=(Token)match(input,87,FOLLOW_87_in_time1912); 
            char_literal173_tree = 
            (AslTree)adaptor.create(char_literal173)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(char_literal173_tree, root_0);


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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:228:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR175=null;
        AslParser.boolterm_return boolterm174 =null;

        AslParser.boolterm_return boolterm176 =null;


        AslTree OR175_tree=null;

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:228:9: ( boolterm ( OR ^ boolterm )* )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:228:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr1928);
            boolterm174=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm174.getTree());

            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:228:22: ( OR ^ boolterm )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==OR) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:228:23: OR ^ boolterm
            	    {
            	    OR175=(Token)match(input,OR,FOLLOW_OR_in_expr1931); 
            	    OR175_tree = 
            	    (AslTree)adaptor.create(OR175)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR175_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr1934);
            	    boolterm176=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm176.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:231:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND178=null;
        AslParser.boolfact_return boolfact177 =null;

        AslParser.boolfact_return boolfact179 =null;


        AslTree AND178_tree=null;

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:231:9: ( boolfact ( AND ^ boolfact )* )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:231:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1954);
            boolfact177=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact177.getTree());

            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:231:22: ( AND ^ boolfact )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==AND) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:231:23: AND ^ boolfact
            	    {
            	    AND178=(Token)match(input,AND,FOLLOW_AND_in_boolterm1957); 
            	    AND178_tree = 
            	    (AslTree)adaptor.create(AND178)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND178_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1960);
            	    boolfact179=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact179.getTree());

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
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:234:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL181=null;
        Token NOT_EQUAL182=null;
        Token LT183=null;
        Token LE184=null;
        Token GT185=null;
        Token GE186=null;
        AslParser.num_expr_return num_expr180 =null;

        AslParser.num_expr_return num_expr187 =null;


        AslTree EQUAL181_tree=null;
        AslTree NOT_EQUAL182_tree=null;
        AslTree LT183_tree=null;
        AslTree LE184_tree=null;
        AslTree GT185_tree=null;
        AslTree GE186_tree=null;

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:234:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:234:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1980);
            num_expr180=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr180.getTree());

            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:234:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==EQUAL||LA27_0==GE||LA27_0==GT||LA27_0==LE||LA27_0==LT||LA27_0==NOT_EQUAL) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:234:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:234:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt26=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt26=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt26=2;
                        }
                        break;
                    case LT:
                        {
                        alt26=3;
                        }
                        break;
                    case LE:
                        {
                        alt26=4;
                        }
                        break;
                    case GT:
                        {
                        alt26=5;
                        }
                        break;
                    case GE:
                        {
                        alt26=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;

                    }

                    switch (alt26) {
                        case 1 :
                            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:234:24: EQUAL ^
                            {
                            EQUAL181=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact1984); 
                            EQUAL181_tree = 
                            (AslTree)adaptor.create(EQUAL181)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL181_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:234:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL182=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1989); 
                            NOT_EQUAL182_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL182)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL182_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:234:46: LT ^
                            {
                            LT183=(Token)match(input,LT,FOLLOW_LT_in_boolfact1994); 
                            LT183_tree = 
                            (AslTree)adaptor.create(LT183)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT183_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:234:52: LE ^
                            {
                            LE184=(Token)match(input,LE,FOLLOW_LE_in_boolfact1999); 
                            LE184_tree = 
                            (AslTree)adaptor.create(LE184)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE184_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:234:58: GT ^
                            {
                            GT185=(Token)match(input,GT,FOLLOW_GT_in_boolfact2004); 
                            GT185_tree = 
                            (AslTree)adaptor.create(GT185)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT185_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:234:64: GE ^
                            {
                            GE186=(Token)match(input,GE,FOLLOW_GE_in_boolfact2009); 
                            GE186_tree = 
                            (AslTree)adaptor.create(GE186)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE186_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact2013);
                    num_expr187=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr187.getTree());

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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:237:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS189=null;
        Token MINUS190=null;
        AslParser.term_return term188 =null;

        AslParser.term_return term191 =null;


        AslTree PLUS189_tree=null;
        AslTree MINUS190_tree=null;

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:237:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:237:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr2033);
            term188=term();

            state._fsp--;

            adaptor.addChild(root_0, term188.getTree());

            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:237:18: ( ( PLUS ^| MINUS ^) term )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==MINUS||LA29_0==PLUS) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:237:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:237:20: ( PLUS ^| MINUS ^)
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==PLUS) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==MINUS) ) {
            	        alt28=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:237:21: PLUS ^
            	            {
            	            PLUS189=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr2038); 
            	            PLUS189_tree = 
            	            (AslTree)adaptor.create(PLUS189)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS189_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:237:29: MINUS ^
            	            {
            	            MINUS190=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr2043); 
            	            MINUS190_tree = 
            	            (AslTree)adaptor.create(MINUS190)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS190_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr2047);
            	    term191=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term191.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:240:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL193=null;
        Token DIV194=null;
        Token MOD195=null;
        AslParser.factor_return factor192 =null;

        AslParser.factor_return factor196 =null;


        AslTree MUL193_tree=null;
        AslTree DIV194_tree=null;
        AslTree MOD195_tree=null;

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:240:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:240:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term2071);
            factor192=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor192.getTree());

            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:240:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==DIV||LA31_0==MOD||LA31_0==MUL) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:240:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:240:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt30=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt30=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt30=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt30=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt30) {
            	        case 1 :
            	            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:240:23: MUL ^
            	            {
            	            MUL193=(Token)match(input,MUL,FOLLOW_MUL_in_term2076); 
            	            MUL193_tree = 
            	            (AslTree)adaptor.create(MUL193)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL193_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:240:30: DIV ^
            	            {
            	            DIV194=(Token)match(input,DIV,FOLLOW_DIV_in_term2081); 
            	            DIV194_tree = 
            	            (AslTree)adaptor.create(DIV194)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV194_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:240:37: MOD ^
            	            {
            	            MOD195=(Token)match(input,MOD,FOLLOW_MOD_in_term2086); 
            	            MOD195_tree = 
            	            (AslTree)adaptor.create(MOD195)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD195_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term2090);
            	    factor196=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor196.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:243:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT197=null;
        Token PLUS198=null;
        Token MINUS199=null;
        AslParser.atom_return atom200 =null;


        AslTree NOT197_tree=null;
        AslTree PLUS198_tree=null;
        AslTree MINUS199_tree=null;

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:243:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:243:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:243:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt32=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt32=1;
                    }
                    break;
                case PLUS:
                    {
                    alt32=2;
                    }
                    break;
                case MINUS:
                    {
                    alt32=3;
                    }
                    break;
            }

            switch (alt32) {
                case 1 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:243:14: NOT ^
                    {
                    NOT197=(Token)match(input,NOT,FOLLOW_NOT_in_factor2113); 
                    NOT197_tree = 
                    (AslTree)adaptor.create(NOT197)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT197_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:243:21: PLUS ^
                    {
                    PLUS198=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor2118); 
                    PLUS198_tree = 
                    (AslTree)adaptor.create(PLUS198)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS198_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:243:29: MINUS ^
                    {
                    MINUS199=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor2123); 
                    MINUS199_tree = 
                    (AslTree)adaptor.create(MINUS199)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS199_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor2128);
            atom200=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom200.getTree());

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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:249:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID201=null;
        Token INT202=null;
        Token char_literal204=null;
        Token char_literal206=null;
        AslParser.funcall_return funcall203 =null;

        AslParser.expr_return expr205 =null;


        AslTree b_tree=null;
        AslTree ID201_tree=null;
        AslTree INT202_tree=null;
        AslTree char_literal204_tree=null;
        AslTree char_literal206_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:249:9: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt34=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==81) ) {
                    alt34=4;
                }
                else if ( (LA34_1==AND||(LA34_1 >= DIV && LA34_1 <= DO)||LA34_1==EQUAL||LA34_1==GE||LA34_1==GT||LA34_1==LE||(LA34_1 >= LT && LA34_1 <= MOD)||LA34_1==MUL||(LA34_1 >= NOT_EQUAL && LA34_1 <= OR)||LA34_1==PLUS||LA34_1==THEN||(LA34_1 >= 82 && LA34_1 <= 83)||LA34_1==85) ) {
                    alt34=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt34=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt34=3;
                }
                break;
            case 81:
                {
                alt34=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }

            switch (alt34) {
                case 1 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:249:13: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID201=(Token)match(input,ID,FOLLOW_ID_in_atom2153); 
                    ID201_tree = 
                    (AslTree)adaptor.create(ID201)
                    ;
                    adaptor.addChild(root_0, ID201_tree);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:250:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT202=(Token)match(input,INT,FOLLOW_INT_in_atom2168); 
                    INT202_tree = 
                    (AslTree)adaptor.create(INT202)
                    ;
                    adaptor.addChild(root_0, INT202_tree);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:251:13: (b= TRUE |b= FALSE )
                    {
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:251:13: (b= TRUE |b= FALSE )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==TRUE) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==FALSE) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;

                    }
                    switch (alt33) {
                        case 1 :
                            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:251:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom2185);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:251:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom2191);  
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
                    // 251:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:251:36: ^( BOOLEAN[$b,$b.text] )
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
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:252:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom2214);
                    funcall203=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall203.getTree());

                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:253:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal204=(Token)match(input,81,FOLLOW_81_in_atom2228); 

                    pushFollow(FOLLOW_expr_in_atom2231);
                    expr205=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr205.getTree());

                    char_literal206=(Token)match(input,82,FOLLOW_82_in_atom2233); 

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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:257:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID207=null;
        Token char_literal208=null;
        Token char_literal210=null;
        AslParser.expr_list_return expr_list209 =null;


        AslTree ID207_tree=null;
        AslTree char_literal208_tree=null;
        AslTree char_literal210_tree=null;
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:257:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:257:13: ID '(' ( expr_list )? ')'
            {
            ID207=(Token)match(input,ID,FOLLOW_ID_in_funcall2254);  
            stream_ID.add(ID207);


            char_literal208=(Token)match(input,81,FOLLOW_81_in_funcall2256);  
            stream_81.add(char_literal208);


            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:257:20: ( expr_list )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==FALSE||LA35_0==ID||LA35_0==INT||LA35_0==MINUS||LA35_0==NOT||LA35_0==PLUS||LA35_0==TRUE||LA35_0==81) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:257:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall2258);
                    expr_list209=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list209.getTree());

                    }
                    break;

            }


            char_literal210=(Token)match(input,82,FOLLOW_82_in_funcall2261);  
            stream_82.add(char_literal210);


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
            // 257:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:257:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:257:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:257:61: ( expr_list )?
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
    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:261:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal212=null;
        AslParser.expr_return expr211 =null;

        AslParser.expr_return expr213 =null;


        AslTree char_literal212_tree=null;

        try {
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:261:10: ( expr ( ',' ! expr )* )
            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:261:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list2294);
            expr211=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr211.getTree());

            // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:261:18: ( ',' ! expr )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==83) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /home2/users/alumnes/1181926/dades/linux/Q6/SVGAnimation/src/parser/Asl.g:261:19: ',' ! expr
            	    {
            	    char_literal212=(Token)match(input,83,FOLLOW_83_in_expr_list2297); 

            	    pushFollow(FOLLOW_expr_in_expr_list2300);
            	    expr213=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr213.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
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


 

    public static final BitSet FOLLOW_func_in_prog188 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_EOF_in_prog191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func233 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_func236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_params_in_func238 = new BitSet(new long[]{0x810F00F000070000L,0x0000000000205064L});
    public static final BitSet FOLLOW_block_instructions_in_func240 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_params262 = new BitSet(new long[]{0x0000004000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_paramlist_in_params264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_params267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist293 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_paramlist296 = new BitSet(new long[]{0x0000004000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_param_in_paramlist299 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_80_in_param324 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_param328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions390 = new BitSet(new long[]{0x810F00F000070002L,0x0000000000205064L});
    public static final BitSet FOLLOW_instruction_spc_in_instruction431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_instruction433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instructions_brack_in_instruction439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction_spc458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction_spc482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction_spc504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction_spc524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction_spc547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction_spc566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction_spc592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_in_instruction_spc617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destroy_in_instruction_spc641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_in_instruction_spc664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_in_instruction_spc690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_show_in_instruction_spc718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hide_in_instruction_spc732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delay_in_instruction_spc746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parallel_in_instructions_brack792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign804 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_EEQUAL_in_assign808 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_expr_in_assign810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt844 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_expr_in_ite_stmt847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt849 = new BitSet(new long[]{0x810F00F000070000L,0x0000000000205064L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt852 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt855 = new BitSet(new long[]{0x810F00F000070000L,0x0000000000205064L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt858 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt888 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_expr_in_while_stmt891 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DO_in_while_stmt893 = new BitSet(new long[]{0x810F00F000070000L,0x0000000000205064L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt896 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt923 = new BitSet(new long[]{0x0420414010000002L,0x0000000000020800L});
    public static final BitSet FOLLOW_expr_in_return_stmt926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read950 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_read953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write975 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020880L});
    public static final BitSet FOLLOW_expr_in_write979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create1007 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_create1010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_create1012 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000201L});
    public static final BitSet FOLLOW_obj_type_in_create1015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_create1017 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_expr_in_create1020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_create1022 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_expr_in_create1025 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_83_in_create1028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_list_attributes_in_create1031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_create1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTROY_in_destroy1055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_destroy1058 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_destroy1061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_destroy1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_time_in_move1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_no_time_in_move1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_T_in_move_time1107 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_move_time1110 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_time_in_move_time1113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_move_time1115 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_expr_in_move_time1118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_move_time1120 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_expr_in_move_time1123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_move_time1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_move_no_time1144 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_move_no_time1147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_move_no_time1149 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_expr_in_move_no_time1152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_move_no_time1154 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_expr_in_move_no_time1157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_move_no_time1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_time_in_modify1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_no_time_in_modify1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODIFY_T_in_modify_time1203 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_modify_time1206 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_time_in_modify_time1208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_list_attributes_in_modify_time1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODIFY_in_modify_no_time1227 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_modify_no_time1230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_list_attributes_in_modify_no_time1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parallel_time_in_parallel1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parallel_no_time_in_parallel1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_no_time_in_instructions_notime1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_no_time_in_instructions_notime1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_show_no_time_in_instructions_notime1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hide_no_time_in_instructions_notime1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instructions_notime_in_block_instructions_notime1281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_block_instructions_notime1282 = new BitSet(new long[]{0x0005001000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_instructions_notime_in_block_instructions_notime1286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_block_instructions_notime1288 = new BitSet(new long[]{0x0005001000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_PARALLEL_in_parallel_time1335 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_time_in_parallel_time1338 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_parallel_time1340 = new BitSet(new long[]{0x0005001000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_instructions_notime_in_parallel_time1343 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_parallel_time1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_time_in_instructions_time1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_time_in_instructions_time1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_show_time_in_instructions_time1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hide_time_in_instructions_time1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instructions_time_in_block_instructions_time1373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_block_instructions_time1375 = new BitSet(new long[]{0x000A002000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_instructions_time_in_block_instructions_time1379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_block_instructions_time1380 = new BitSet(new long[]{0x000A002000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_PARALLEL_in_parallel_no_time1427 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_parallel_no_time1430 = new BitSet(new long[]{0x000A002000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_block_instructions_time_in_parallel_no_time1433 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_parallel_no_time1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_list_attributes1444 = new BitSet(new long[]{0x1800000000000800L,0x0000000000400100L});
    public static final BitSet FOLLOW_attribute_in_list_attributes1446 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_83_in_list_attributes1449 = new BitSet(new long[]{0x1800000000000800L,0x0000000000400100L});
    public static final BitSet FOLLOW_attribute_in_list_attributes1451 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_82_in_list_attributes1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_name_color_in_attribute1485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_attribute1488 = new BitSet(new long[]{0x0000000100001180L,0x000000000000201AL});
    public static final BitSet FOLLOW_color_in_attribute1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_name_expr_in_attribute1509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_attribute1512 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_expr_in_attribute1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_show_time_in_show1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_show_no_time_in_show1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOWT_in_show_time1548 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_show_time1551 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_time_in_show_time1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHOW_in_show_no_time1562 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_show_no_time1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hide_time_in_hide1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hide_no_time_in_hide1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HIDET_in_hide_time1585 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_hide_time1588 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_time_in_hide_time1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HIDE_in_hide_no_time1599 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ID_in_hide_no_time1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELAY_in_delay1609 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_time_in_delay1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLORHEX_in_color1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RGB_in_color1762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_color1764 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_expr_in_color1766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_color1768 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_expr_in_color1770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_color1772 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_expr_in_color1774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_color1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RGBPRCTJ_in_color1802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_color1804 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_expr_in_color1806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_color1808 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_expr_in_color1810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_color1812 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_expr_in_color1814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_color1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_color_keyword_in_color1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_time1910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_time1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr1928 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_OR_in_expr1931 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_boolterm_in_expr1934 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1954 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm1957 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1960 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1980 = new BitSet(new long[]{0x0040220284000002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact1984 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1989 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_LT_in_boolfact1994 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_LE_in_boolfact1999 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_GT_in_boolfact2004 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_GE_in_boolfact2009 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_num_expr_in_boolfact2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr2033 = new BitSet(new long[]{0x0400400000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr2038 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_MINUS_in_num_expr2043 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_term_in_num_expr2047 = new BitSet(new long[]{0x0400400000000002L});
    public static final BitSet FOLLOW_factor_in_term2071 = new BitSet(new long[]{0x0010800000080002L});
    public static final BitSet FOLLOW_MUL_in_term2076 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_DIV_in_term2081 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_MOD_in_term2086 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_factor_in_term2090 = new BitSet(new long[]{0x0010800000080002L});
    public static final BitSet FOLLOW_NOT_in_factor2113 = new BitSet(new long[]{0x0000014010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_PLUS_in_factor2118 = new BitSet(new long[]{0x0000014010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_MINUS_in_factor2123 = new BitSet(new long[]{0x0000014010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_atom_in_factor2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_atom2228 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_expr_in_atom2231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_atom2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall2254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_funcall2256 = new BitSet(new long[]{0x0420414010000000L,0x0000000000060800L});
    public static final BitSet FOLLOW_expr_list_in_funcall2258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_funcall2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list2294 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_expr_list2297 = new BitSet(new long[]{0x0420414010000000L,0x0000000000020800L});
    public static final BitSet FOLLOW_expr_in_expr_list2300 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});

}