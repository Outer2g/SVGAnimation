// $ANTLR 3.4 /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g 2016-05-05 12:02:22

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
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
    public static final int TEXT=72;
    public static final int THEN=73;
    public static final int TRUE=74;
    public static final int WHILE=75;
    public static final int WHITE=76;
    public static final int WRITE=77;
    public static final int WS=78;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AslLexer() {} 
    public AslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g"; }

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:6:7: ( '&' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:6:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:7:7: ( '(' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:7:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:8:7: ( ')' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:8:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:9:7: ( ',' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:10:7: ( ':' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:10:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:11:7: ( ';' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:12:7: ( 's' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:12:9: 's'
            {
            match('s'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:13:7: ( '{' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:13:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:14:7: ( '}' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:14:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "HASHTAG"
    public final void mHASHTAG() throws RecognitionException {
        try {
            int _type = HASHTAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:263:9: ( '#' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:263:11: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HASHTAG"

    // $ANTLR start "EEQUAL"
    public final void mEEQUAL() throws RecognitionException {
        try {
            int _type = EEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:264:9: ( '=' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:264:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EEQUAL"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:265:9: ( '==' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:265:11: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:266:10: ( '!=' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:266:12: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:267:9: ( '<' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:267:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:268:9: ( '<=' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:268:11: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:269:9: ( '>' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:269:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:270:9: ( '>=' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:270:11: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:271:9: ( '+' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:271:11: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:272:9: ( '-' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:272:11: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:273:9: ( '*' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:273:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:274:9: ( '/' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:274:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:275:9: ( '%' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:275:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:276:9: ( 'not' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:276:11: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:277:9: ( 'and' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:277:11: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:278:9: ( 'or' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:278:11: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:279:9: ( 'if' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:279:11: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:280:9: ( 'then' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:280:11: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:281:9: ( 'else' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:281:11: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENDIF"
    public final void mENDIF() throws RecognitionException {
        try {
            int _type = ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:282:9: ( 'endif' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:282:11: 'endif'
            {
            match("endif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDIF"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:283:9: ( 'while' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:283:11: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:284:9: ( 'do' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:284:11: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "ENDWHILE"
    public final void mENDWHILE() throws RecognitionException {
        try {
            int _type = ENDWHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:285:9: ( 'endwhile' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:285:11: 'endwhile'
            {
            match("endwhile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDWHILE"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:286:9: ( 'func' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:286:11: 'func'
            {
            match("func"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "ENDFUNC"
    public final void mENDFUNC() throws RecognitionException {
        try {
            int _type = ENDFUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:287:9: ( 'endfunc' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:287:11: 'endfunc'
            {
            match("endfunc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDFUNC"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:288:9: ( 'return' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:288:11: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:289:9: ( 'read' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:289:11: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:290:9: ( 'write' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:290:11: 'write'
            {
            match("write"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:291:9: ( 'true' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:291:11: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:292:9: ( 'false' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:292:11: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:294:9: ( 'create' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:294:11: 'create'
            {
            match("create"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "DESTROY"
    public final void mDESTROY() throws RecognitionException {
        try {
            int _type = DESTROY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:295:9: ( 'destroy' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:295:11: 'destroy'
            {
            match("destroy"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DESTROY"

    // $ANTLR start "MOVE_T"
    public final void mMOVE_T() throws RecognitionException {
        try {
            int _type = MOVE_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:296:9: ( 'movet' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:296:11: 'movet'
            {
            match("movet"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOVE_T"

    // $ANTLR start "MOVE"
    public final void mMOVE() throws RecognitionException {
        try {
            int _type = MOVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:297:9: ( 'move' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:297:11: 'move'
            {
            match("move"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOVE"

    // $ANTLR start "MODIFY_T"
    public final void mMODIFY_T() throws RecognitionException {
        try {
            int _type = MODIFY_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:298:9: ( 'modifyt' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:298:11: 'modifyt'
            {
            match("modifyt"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MODIFY_T"

    // $ANTLR start "MODIFY"
    public final void mMODIFY() throws RecognitionException {
        try {
            int _type = MODIFY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:299:9: ( 'modify' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:299:11: 'modify'
            {
            match("modify"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MODIFY"

    // $ANTLR start "RGBPRCTJ"
    public final void mRGBPRCTJ() throws RecognitionException {
        try {
            int _type = RGBPRCTJ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:300:9: ( 'rgbp' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:300:11: 'rgbp'
            {
            match("rgbp"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RGBPRCTJ"

    // $ANTLR start "RGB"
    public final void mRGB() throws RecognitionException {
        try {
            int _type = RGB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:301:9: ( 'rgb' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:301:11: 'rgb'
            {
            match("rgb"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RGB"

    // $ANTLR start "SHOWT"
    public final void mSHOWT() throws RecognitionException {
        try {
            int _type = SHOWT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:303:9: ( 'showt' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:303:11: 'showt'
            {
            match("showt"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHOWT"

    // $ANTLR start "SHOW"
    public final void mSHOW() throws RecognitionException {
        try {
            int _type = SHOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:304:9: ( 'show' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:304:11: 'show'
            {
            match("show"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHOW"

    // $ANTLR start "HIDET"
    public final void mHIDET() throws RecognitionException {
        try {
            int _type = HIDET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:305:9: ( 'hidet' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:305:11: 'hidet'
            {
            match("hidet"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HIDET"

    // $ANTLR start "HIDE"
    public final void mHIDE() throws RecognitionException {
        try {
            int _type = HIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:306:9: ( 'hide' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:306:11: 'hide'
            {
            match("hide"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HIDE"

    // $ANTLR start "DELAY"
    public final void mDELAY() throws RecognitionException {
        try {
            int _type = DELAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:307:9: ( 'delay' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:307:11: 'delay'
            {
            match("delay"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DELAY"

    // $ANTLR start "PARALLEL"
    public final void mPARALLEL() throws RecognitionException {
        try {
            int _type = PARALLEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:309:9: ( 'parallel' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:309:11: 'parallel'
            {
            match("parallel"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PARALLEL"

    // $ANTLR start "COLOR"
    public final void mCOLOR() throws RecognitionException {
        try {
            int _type = COLOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:311:9: ( 'color' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:311:11: 'color'
            {
            match("color"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLOR"

    // $ANTLR start "WHITE"
    public final void mWHITE() throws RecognitionException {
        try {
            int _type = WHITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:312:9: ( 'white' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:312:11: 'white'
            {
            match("white"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITE"

    // $ANTLR start "BLACK"
    public final void mBLACK() throws RecognitionException {
        try {
            int _type = BLACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:313:9: ( 'black' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:313:11: 'black'
            {
            match("black"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BLACK"

    // $ANTLR start "BLUE"
    public final void mBLUE() throws RecognitionException {
        try {
            int _type = BLUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:314:9: ( 'blue' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:314:11: 'blue'
            {
            match("blue"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BLUE"

    // $ANTLR start "RED"
    public final void mRED() throws RecognitionException {
        try {
            int _type = RED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:315:9: ( 'red' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:315:11: 'red'
            {
            match("red"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RED"

    // $ANTLR start "GREEN"
    public final void mGREEN() throws RecognitionException {
        try {
            int _type = GREEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:316:9: ( 'green' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:316:11: 'green'
            {
            match("green"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREEN"

    // $ANTLR start "POSX"
    public final void mPOSX() throws RecognitionException {
        try {
            int _type = POSX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:317:9: ( 'x' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:317:11: 'x'
            {
            match('x'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POSX"

    // $ANTLR start "POSY"
    public final void mPOSY() throws RecognitionException {
        try {
            int _type = POSY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:318:9: ( 'y' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:318:11: 'y'
            {
            match('y'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POSY"

    // $ANTLR start "CIRCLE"
    public final void mCIRCLE() throws RecognitionException {
        try {
            int _type = CIRCLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:319:9: ( 'circle' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:319:11: 'circle'
            {
            match("circle"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CIRCLE"

    // $ANTLR start "RECTANGLE"
    public final void mRECTANGLE() throws RecognitionException {
        try {
            int _type = RECTANGLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:320:11: ( 'rectangle' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:320:13: 'rectangle'
            {
            match("rectangle"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RECTANGLE"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:321:6: ( 'text' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:321:8: 'text'
            {
            match("text"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:324:9: ( ( '0' .. '9' )+ )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:324:13: ( '0' .. '9' )+
            {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:324:13: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:325:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:325:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:325:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "COLORHEX"
    public final void mCOLORHEX() throws RecognitionException {
        try {
            int _type = COLORHEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:327:9: ( '#' HEXADIGIT HEXADIGIT HEXADIGIT ( HEXADIGIT HEXADIGIT HEXADIGIT )? )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:327:11: '#' HEXADIGIT HEXADIGIT HEXADIGIT ( HEXADIGIT HEXADIGIT HEXADIGIT )?
            {
            match('#'); 

            mHEXADIGIT(); 


            mHEXADIGIT(); 


            mHEXADIGIT(); 


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:327:45: ( HEXADIGIT HEXADIGIT HEXADIGIT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'F')||(LA3_0 >= 'a' && LA3_0 <= 'f')) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:327:46: HEXADIGIT HEXADIGIT HEXADIGIT
                    {
                    mHEXADIGIT(); 


                    mHEXADIGIT(); 


                    mHEXADIGIT(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLORHEX"

    // $ANTLR start "HEXADIGIT"
    public final void mHEXADIGIT() throws RecognitionException {
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:330:10: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEXADIGIT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:332:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='/') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='/') ) {
                    alt7=1;
                }
                else if ( (LA7_1=='*') ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:332:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:332:16: (~ ( '\\n' | '\\r' ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:332:30: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:332:30: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:333:11: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:333:16: ( options {greedy=false; } : . )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='*') ) {
                            int LA6_1 = input.LA(2);

                            if ( (LA6_1=='/') ) {
                                alt6=2;
                            }
                            else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
                                alt6=1;
                            }


                        }
                        else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:333:44: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:337:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:337:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:337:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\\') ) {
                    alt8=1;
                }
                else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '!')||(LA8_0 >= '#' && LA8_0 <= '[')||(LA8_0 >= ']' && LA8_0 <= '\uFFFF')) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:337:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:337:28: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:343:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:343:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:346:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:346:11: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:8: ( T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | HASHTAG | EEQUAL | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | CREATE | DESTROY | MOVE_T | MOVE | MODIFY_T | MODIFY | RGBPRCTJ | RGB | SHOWT | SHOW | HIDET | HIDE | DELAY | PARALLEL | COLOR | WHITE | BLACK | BLUE | RED | GREEN | POSX | POSY | CIRCLE | RECTANGLE | TEXT | INT | ID | COLORHEX | COMMENT | STRING | WS )
        int alt9=70;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:10: T__79
                {
                mT__79(); 


                }
                break;
            case 2 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:16: T__80
                {
                mT__80(); 


                }
                break;
            case 3 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:22: T__81
                {
                mT__81(); 


                }
                break;
            case 4 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:28: T__82
                {
                mT__82(); 


                }
                break;
            case 5 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:34: T__83
                {
                mT__83(); 


                }
                break;
            case 6 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:40: T__84
                {
                mT__84(); 


                }
                break;
            case 7 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:46: T__85
                {
                mT__85(); 


                }
                break;
            case 8 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:52: T__86
                {
                mT__86(); 


                }
                break;
            case 9 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:58: T__87
                {
                mT__87(); 


                }
                break;
            case 10 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:64: HASHTAG
                {
                mHASHTAG(); 


                }
                break;
            case 11 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:72: EEQUAL
                {
                mEEQUAL(); 


                }
                break;
            case 12 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:79: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 13 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:85: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 14 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:95: LT
                {
                mLT(); 


                }
                break;
            case 15 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:98: LE
                {
                mLE(); 


                }
                break;
            case 16 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:101: GT
                {
                mGT(); 


                }
                break;
            case 17 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:104: GE
                {
                mGE(); 


                }
                break;
            case 18 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:107: PLUS
                {
                mPLUS(); 


                }
                break;
            case 19 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:112: MINUS
                {
                mMINUS(); 


                }
                break;
            case 20 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:118: MUL
                {
                mMUL(); 


                }
                break;
            case 21 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:122: DIV
                {
                mDIV(); 


                }
                break;
            case 22 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:126: MOD
                {
                mMOD(); 


                }
                break;
            case 23 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:130: NOT
                {
                mNOT(); 


                }
                break;
            case 24 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:134: AND
                {
                mAND(); 


                }
                break;
            case 25 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:138: OR
                {
                mOR(); 


                }
                break;
            case 26 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:141: IF
                {
                mIF(); 


                }
                break;
            case 27 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:144: THEN
                {
                mTHEN(); 


                }
                break;
            case 28 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:149: ELSE
                {
                mELSE(); 


                }
                break;
            case 29 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:154: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 30 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:160: WHILE
                {
                mWHILE(); 


                }
                break;
            case 31 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:166: DO
                {
                mDO(); 


                }
                break;
            case 32 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:169: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 33 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:178: FUNC
                {
                mFUNC(); 


                }
                break;
            case 34 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:183: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 35 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:191: RETURN
                {
                mRETURN(); 


                }
                break;
            case 36 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:198: READ
                {
                mREAD(); 


                }
                break;
            case 37 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:203: WRITE
                {
                mWRITE(); 


                }
                break;
            case 38 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:209: TRUE
                {
                mTRUE(); 


                }
                break;
            case 39 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:214: FALSE
                {
                mFALSE(); 


                }
                break;
            case 40 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:220: CREATE
                {
                mCREATE(); 


                }
                break;
            case 41 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:227: DESTROY
                {
                mDESTROY(); 


                }
                break;
            case 42 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:235: MOVE_T
                {
                mMOVE_T(); 


                }
                break;
            case 43 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:242: MOVE
                {
                mMOVE(); 


                }
                break;
            case 44 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:247: MODIFY_T
                {
                mMODIFY_T(); 


                }
                break;
            case 45 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:256: MODIFY
                {
                mMODIFY(); 


                }
                break;
            case 46 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:263: RGBPRCTJ
                {
                mRGBPRCTJ(); 


                }
                break;
            case 47 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:272: RGB
                {
                mRGB(); 


                }
                break;
            case 48 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:276: SHOWT
                {
                mSHOWT(); 


                }
                break;
            case 49 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:282: SHOW
                {
                mSHOW(); 


                }
                break;
            case 50 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:287: HIDET
                {
                mHIDET(); 


                }
                break;
            case 51 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:293: HIDE
                {
                mHIDE(); 


                }
                break;
            case 52 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:298: DELAY
                {
                mDELAY(); 


                }
                break;
            case 53 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:304: PARALLEL
                {
                mPARALLEL(); 


                }
                break;
            case 54 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:313: COLOR
                {
                mCOLOR(); 


                }
                break;
            case 55 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:319: WHITE
                {
                mWHITE(); 


                }
                break;
            case 56 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:325: BLACK
                {
                mBLACK(); 


                }
                break;
            case 57 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:331: BLUE
                {
                mBLUE(); 


                }
                break;
            case 58 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:336: RED
                {
                mRED(); 


                }
                break;
            case 59 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:340: GREEN
                {
                mGREEN(); 


                }
                break;
            case 60 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:346: POSX
                {
                mPOSX(); 


                }
                break;
            case 61 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:351: POSY
                {
                mPOSY(); 


                }
                break;
            case 62 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:356: CIRCLE
                {
                mCIRCLE(); 


                }
                break;
            case 63 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:363: RECTANGLE
                {
                mRECTANGLE(); 


                }
                break;
            case 64 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:373: TEXT
                {
                mTEXT(); 


                }
                break;
            case 65 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:378: INT
                {
                mINT(); 


                }
                break;
            case 66 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:382: ID
                {
                mID(); 


                }
                break;
            case 67 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:385: COLORHEX
                {
                mCOLORHEX(); 


                }
                break;
            case 68 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:394: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 69 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:402: STRING
                {
                mSTRING(); 


                }
                break;
            case 70 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:409: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\7\uffff\1\53\2\uffff\1\54\1\57\1\uffff\1\61\1\63\3\uffff\1\65\1"+
        "\uffff\20\47\1\117\1\120\4\uffff\1\47\13\uffff\2\47\1\124\1\125"+
        "\7\47\1\135\15\47\2\uffff\1\47\1\162\1\163\2\uffff\7\47\1\uffff"+
        "\6\47\1\u0084\1\47\1\u0087\12\47\1\u0093\2\uffff\1\u0094\1\u0095"+
        "\1\u0096\1\u0097\10\47\1\u00a0\2\47\1\u00a3\1\uffff\1\47\1\u00a5"+
        "\1\uffff\3\47\1\u00aa\1\47\1\u00ad\2\47\1\u00b0\1\47\1\u00b2\5\uffff"+
        "\1\u00b3\2\47\1\u00b6\1\u00b7\1\u00b8\1\47\1\u00ba\1\uffff\1\u00bb"+
        "\1\47\1\uffff\1\47\1\uffff\1\47\1\u00bf\1\47\1\u00c1\1\uffff\1\47"+
        "\1\u00c3\1\uffff\1\47\1\u00c5\1\uffff\1\u00c6\2\uffff\2\47\3\uffff"+
        "\1\47\2\uffff\1\u00ca\1\47\1\u00cc\1\uffff\1\u00cd\1\uffff\1\u00cf"+
        "\1\uffff\1\47\2\uffff\1\47\1\u00d2\1\u00d3\1\uffff\1\47\2\uffff"+
        "\1\u00d5\1\uffff\1\47\1\u00d7\2\uffff\1\47\1\uffff\1\u00d9\1\uffff"+
        "\1\u00da\2\uffff";
    static final String DFA9_eofS =
        "\u00db\uffff";
    static final String DFA9_minS =
        "\1\11\6\uffff\1\60\2\uffff\1\60\1\75\1\uffff\2\75\3\uffff\1\52\1"+
        "\uffff\1\157\1\156\1\162\1\146\1\145\1\154\1\150\1\145\1\141\1\145"+
        "\1\151\1\157\1\151\1\141\1\154\1\162\2\60\4\uffff\1\157\13\uffff"+
        "\1\164\1\144\2\60\1\145\1\165\1\170\1\163\1\144\2\151\1\60\1\154"+
        "\1\156\1\154\1\141\1\142\1\145\1\154\1\162\2\144\1\162\1\141\1\145"+
        "\2\uffff\1\167\2\60\2\uffff\1\156\1\145\1\164\1\145\1\146\1\154"+
        "\1\164\1\uffff\1\164\1\141\1\143\1\163\1\165\1\144\1\60\1\164\1"+
        "\60\1\141\1\157\1\143\1\145\1\151\1\145\1\141\1\143\2\145\1\60\2"+
        "\uffff\4\60\1\146\1\150\1\165\3\145\1\162\1\171\1\60\1\145\1\162"+
        "\1\60\1\uffff\1\141\1\60\1\uffff\1\164\1\162\1\154\1\60\1\146\1"+
        "\60\1\154\1\153\1\60\1\156\1\60\5\uffff\1\60\1\151\1\156\3\60\1"+
        "\157\1\60\1\uffff\1\60\1\156\1\uffff\1\156\1\uffff\1\145\1\60\1"+
        "\145\1\60\1\uffff\1\171\1\60\1\uffff\1\154\1\60\1\uffff\1\60\2\uffff"+
        "\1\154\1\143\3\uffff\1\171\2\uffff\1\60\1\147\1\60\1\uffff\1\60"+
        "\1\uffff\1\60\1\uffff\1\145\2\uffff\1\145\2\60\1\uffff\1\154\2\uffff"+
        "\1\60\1\uffff\1\154\1\60\2\uffff\1\145\1\uffff\1\60\1\uffff\1\60"+
        "\2\uffff";
    static final String DFA9_maxS =
        "\1\175\6\uffff\1\172\2\uffff\1\146\1\75\1\uffff\2\75\3\uffff\1\57"+
        "\1\uffff\1\157\1\156\1\162\1\146\1\162\1\156\1\162\1\157\1\165\1"+
        "\147\1\162\1\157\1\151\1\141\1\154\1\162\2\172\4\uffff\1\157\13"+
        "\uffff\1\164\1\144\2\172\1\145\1\165\1\170\1\163\1\144\2\151\1\172"+
        "\1\163\1\156\1\154\1\164\1\142\1\145\1\154\1\162\1\166\1\144\1\162"+
        "\1\165\1\145\2\uffff\1\167\2\172\2\uffff\1\156\1\145\1\164\1\145"+
        "\1\167\2\164\1\uffff\1\164\1\141\1\143\1\163\1\165\1\144\1\172\1"+
        "\164\1\172\1\141\1\157\1\143\1\145\1\151\1\145\1\141\1\143\2\145"+
        "\1\172\2\uffff\4\172\1\146\1\150\1\165\3\145\1\162\1\171\1\172\1"+
        "\145\1\162\1\172\1\uffff\1\141\1\172\1\uffff\1\164\1\162\1\154\1"+
        "\172\1\146\1\172\1\154\1\153\1\172\1\156\1\172\5\uffff\1\172\1\151"+
        "\1\156\3\172\1\157\1\172\1\uffff\1\172\1\156\1\uffff\1\156\1\uffff"+
        "\1\145\1\172\1\145\1\172\1\uffff\1\171\1\172\1\uffff\1\154\1\172"+
        "\1\uffff\1\172\2\uffff\1\154\1\143\3\uffff\1\171\2\uffff\1\172\1"+
        "\147\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\145\2\uffff\1\145"+
        "\2\172\1\uffff\1\154\2\uffff\1\172\1\uffff\1\154\1\172\2\uffff\1"+
        "\145\1\uffff\1\172\1\uffff\1\172\2\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\2\uffff\1\15"+
        "\2\uffff\1\22\1\23\1\24\1\uffff\1\26\22\uffff\1\101\1\102\1\105"+
        "\1\106\1\uffff\1\7\1\12\1\103\1\14\1\13\1\17\1\16\1\21\1\20\1\104"+
        "\1\25\31\uffff\1\74\1\75\3\uffff\1\31\1\32\7\uffff\1\37\24\uffff"+
        "\1\27\1\30\20\uffff\1\72\2\uffff\1\57\13\uffff\1\61\1\33\1\46\1"+
        "\100\1\34\10\uffff\1\41\2\uffff\1\44\1\uffff\1\56\4\uffff\1\53\2"+
        "\uffff\1\63\2\uffff\1\71\1\uffff\1\60\1\35\2\uffff\1\36\1\67\1\45"+
        "\1\uffff\1\64\1\47\3\uffff\1\66\1\uffff\1\52\1\uffff\1\62\1\uffff"+
        "\1\70\1\73\3\uffff\1\43\1\uffff\1\50\1\76\1\uffff\1\55\2\uffff\1"+
        "\42\1\51\1\uffff\1\54\1\uffff\1\40\1\uffff\1\65\1\77";
    static final String DFA9_specialS =
        "\u00db\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\51\2\uffff\1\51\22\uffff\1\51\1\14\1\50\1\12\1\uffff\1\23"+
            "\1\1\1\uffff\1\2\1\3\1\21\1\17\1\4\1\20\1\uffff\1\22\12\46\1"+
            "\5\1\6\1\15\1\13\1\16\2\uffff\32\47\4\uffff\1\47\1\uffff\1\25"+
            "\1\42\1\36\1\33\1\31\1\34\1\43\1\40\1\27\3\47\1\37\1\24\1\26"+
            "\1\41\1\47\1\35\1\7\1\30\2\47\1\32\1\44\1\45\1\47\1\10\1\uffff"+
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\7\47\1\52\22\47",
            "",
            "",
            "\12\55\7\uffff\6\55\32\uffff\6\55",
            "\1\56",
            "",
            "\1\60",
            "\1\62",
            "",
            "",
            "",
            "\1\64\4\uffff\1\64",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\74\2\uffff\1\72\11\uffff\1\73",
            "\1\75\1\uffff\1\76",
            "\1\77\11\uffff\1\100",
            "\1\102\11\uffff\1\101",
            "\1\104\23\uffff\1\103",
            "\1\105\1\uffff\1\106",
            "\1\111\5\uffff\1\110\2\uffff\1\107",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "\1\121",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\122",
            "\1\123",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\137\6\uffff\1\136",
            "\1\140",
            "\1\141",
            "\1\143\1\uffff\1\145\1\144\17\uffff\1\142",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\153\21\uffff\1\152",
            "\1\154",
            "\1\155",
            "\1\156\23\uffff\1\157",
            "\1\160",
            "",
            "",
            "\1\161",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\172\2\uffff\1\170\15\uffff\1\171",
            "\1\173\7\uffff\1\174",
            "\1\175",
            "",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0085",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\u0086\12"+
            "\47",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0092\6\47",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00a1",
            "\1\u00a2",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00a4",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00a9\6\47",
            "\1\u00ab",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00ac\6\47",
            "\1\u00ae",
            "\1\u00af",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00b1",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00b4",
            "\1\u00b5",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00b9",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00bc",
            "",
            "\1\u00bd",
            "",
            "\1\u00be",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00c0",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00c2",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00c4",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "",
            "",
            "",
            "\1\u00c9",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00cb",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00ce\6\47",
            "",
            "\1\u00d0",
            "",
            "",
            "\1\u00d1",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00d4",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00d6",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\1\u00d8",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | HASHTAG | EEQUAL | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | CREATE | DESTROY | MOVE_T | MOVE | MODIFY_T | MODIFY | RGBPRCTJ | RGB | SHOWT | SHOW | HIDET | HIDE | DELAY | PARALLEL | COLOR | WHITE | BLACK | BLUE | RED | GREEN | POSX | POSY | CIRCLE | RECTANGLE | TEXT | INT | ID | COLORHEX | COMMENT | STRING | WS );";
        }
    }
 

}