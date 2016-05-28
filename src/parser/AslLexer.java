// $ANTLR 3.4 /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g 2016-05-28 19:12:01

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
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

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
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
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
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
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
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
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
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
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:10:7: ( '.' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:10:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:11:7: ( ':' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:11:9: ':'
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
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:12:7: ( ';' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:12:9: ';'
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
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:13:7: ( 'ms' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:13:9: 'ms'
            {
            match("ms"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:14:7: ( 'r' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:14:9: 'r'
            {
            match('r'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:15:7: ( 's' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:15:9: 's'
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
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:16:7: ( '{' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:16:9: '{'
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
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:17:7: ( '}' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:17:9: '}'
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
    // $ANTLR end "T__95"

    // $ANTLR start "HASHTAG"
    public final void mHASHTAG() throws RecognitionException {
        try {
            int _type = HASHTAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:275:9: ( '#' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:275:11: '#'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:276:9: ( '=' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:276:11: '='
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:277:9: ( '==' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:277:11: '=='
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:278:10: ( '!=' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:278:12: '!='
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:279:9: ( '<' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:279:11: '<'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:280:9: ( '<=' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:280:11: '<='
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:281:9: ( '>' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:281:11: '>'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:282:9: ( '>=' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:282:11: '>='
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:283:9: ( '+' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:283:11: '+'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:284:9: ( '-' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:284:11: '-'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:285:9: ( '*' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:285:11: '*'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:286:9: ( '/' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:286:11: '/'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:287:9: ( '%' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:287:11: '%'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:288:9: ( 'not' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:288:11: 'not'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:289:9: ( 'and' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:289:11: 'and'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:290:9: ( 'or' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:290:11: 'or'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:291:9: ( 'if' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:291:11: 'if'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:292:9: ( 'then' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:292:11: 'then'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:293:9: ( 'else' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:293:11: 'else'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:294:9: ( 'endif' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:294:11: 'endif'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:295:9: ( 'while' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:295:11: 'while'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:296:9: ( 'do' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:296:11: 'do'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:297:9: ( 'endwhile' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:297:11: 'endwhile'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:298:9: ( 'func' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:298:11: 'func'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:299:9: ( 'endfunc' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:299:11: 'endfunc'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:300:9: ( 'return' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:300:11: 'return'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:301:9: ( 'read' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:301:11: 'read'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:302:9: ( 'write' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:302:11: 'write'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:303:9: ( 'true' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:303:11: 'true'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:304:9: ( 'false' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:304:11: 'false'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:306:9: ( 'create' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:306:11: 'create'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:307:9: ( 'destroy' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:307:11: 'destroy'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:308:9: ( 'movet' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:308:11: 'movet'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:309:9: ( 'move' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:309:11: 'move'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:310:9: ( 'modifyt' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:310:11: 'modifyt'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:311:9: ( 'modify' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:311:11: 'modify'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:312:9: ( 'rgbp' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:312:11: 'rgbp'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:313:9: ( 'rgb' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:313:11: 'rgb'
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

    // $ANTLR start "SHOW_T"
    public final void mSHOW_T() throws RecognitionException {
        try {
            int _type = SHOW_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:315:10: ( 'showt' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:315:12: 'showt'
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
    // $ANTLR end "SHOW_T"

    // $ANTLR start "SHOW"
    public final void mSHOW() throws RecognitionException {
        try {
            int _type = SHOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:316:9: ( 'show' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:316:11: 'show'
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

    // $ANTLR start "HIDE_T"
    public final void mHIDE_T() throws RecognitionException {
        try {
            int _type = HIDE_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:317:10: ( 'hidet' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:317:12: 'hidet'
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
    // $ANTLR end "HIDE_T"

    // $ANTLR start "HIDE"
    public final void mHIDE() throws RecognitionException {
        try {
            int _type = HIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:318:9: ( 'hide' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:318:11: 'hide'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:319:9: ( 'delay' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:319:11: 'delay'
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

    // $ANTLR start "BLOCK"
    public final void mBLOCK() throws RecognitionException {
        try {
            int _type = BLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:321:7: ( 'block' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:321:9: 'block'
            {
            match("block"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BLOCK"

    // $ANTLR start "PARALLEL"
    public final void mPARALLEL() throws RecognitionException {
        try {
            int _type = PARALLEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:322:9: ( 'parallel' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:322:11: 'parallel'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:324:9: ( 'color' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:324:11: 'color'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:325:9: ( 'white' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:325:11: 'white'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:326:9: ( 'black' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:326:11: 'black'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:327:9: ( 'blue' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:327:11: 'blue'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:328:9: ( 'red' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:328:11: 'red'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:329:9: ( 'green' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:329:11: 'green'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:330:9: ( 'x' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:330:11: 'x'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:331:9: ( 'y' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:331:11: 'y'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:332:9: ( 'circle' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:332:11: 'circle'
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

    // $ANTLR start "STROKE"
    public final void mSTROKE() throws RecognitionException {
        try {
            int _type = STROKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:333:8: ( 'stroke' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:333:10: 'stroke'
            {
            match("stroke"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STROKE"

    // $ANTLR start "RECTANGLE"
    public final void mRECTANGLE() throws RecognitionException {
        try {
            int _type = RECTANGLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:334:11: ( 'rectangle' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:334:13: 'rectangle'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:335:6: ( 'text' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:335:8: 'text'
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:338:9: ( ( '0' .. '9' )+ )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:338:13: ( '0' .. '9' )+
            {
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:338:13: ( '0' .. '9' )+
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:339:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:339:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:339:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:341:9: ( '#' HEXADIGIT HEXADIGIT HEXADIGIT ( HEXADIGIT HEXADIGIT HEXADIGIT )? )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:341:11: '#' HEXADIGIT HEXADIGIT HEXADIGIT ( HEXADIGIT HEXADIGIT HEXADIGIT )?
            {
            match('#'); 

            mHEXADIGIT(); 


            mHEXADIGIT(); 


            mHEXADIGIT(); 


            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:341:45: ( HEXADIGIT HEXADIGIT HEXADIGIT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'F')||(LA3_0 >= 'a' && LA3_0 <= 'f')) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:341:46: HEXADIGIT HEXADIGIT HEXADIGIT
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:344:10: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:346:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:346:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:346:16: (~ ( '\\n' | '\\r' ) )*
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


                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:346:30: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:346:30: '\\r'
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
                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:347:11: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:347:16: ( options {greedy=false; } : . )*
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
                    	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:347:44: .
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:351:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:351:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:351:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:351:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:351:28: ~ ( '\\\\' | '\"' )
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:357:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:357:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:360:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:360:11: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:8: ( T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | HASHTAG | EEQUAL | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | CREATE | DESTROY | MOVE_T | MOVE | MODIFY_T | MODIFY | RGBPRCTJ | RGB | SHOW_T | SHOW | HIDE_T | HIDE | DELAY | BLOCK | PARALLEL | COLOR | WHITE | BLACK | BLUE | RED | GREEN | POSX | POSY | CIRCLE | STROKE | RECTANGLE | TEXT | INT | ID | COLORHEX | COMMENT | STRING | WS )
        int alt9=75;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:10: T__84
                {
                mT__84(); 


                }
                break;
            case 2 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:16: T__85
                {
                mT__85(); 


                }
                break;
            case 3 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:22: T__86
                {
                mT__86(); 


                }
                break;
            case 4 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:28: T__87
                {
                mT__87(); 


                }
                break;
            case 5 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:34: T__88
                {
                mT__88(); 


                }
                break;
            case 6 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:40: T__89
                {
                mT__89(); 


                }
                break;
            case 7 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:46: T__90
                {
                mT__90(); 


                }
                break;
            case 8 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:52: T__91
                {
                mT__91(); 


                }
                break;
            case 9 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:58: T__92
                {
                mT__92(); 


                }
                break;
            case 10 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:64: T__93
                {
                mT__93(); 


                }
                break;
            case 11 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:70: T__94
                {
                mT__94(); 


                }
                break;
            case 12 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:76: T__95
                {
                mT__95(); 


                }
                break;
            case 13 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:82: HASHTAG
                {
                mHASHTAG(); 


                }
                break;
            case 14 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:90: EEQUAL
                {
                mEEQUAL(); 


                }
                break;
            case 15 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:97: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 16 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:103: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 17 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:113: LT
                {
                mLT(); 


                }
                break;
            case 18 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:116: LE
                {
                mLE(); 


                }
                break;
            case 19 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:119: GT
                {
                mGT(); 


                }
                break;
            case 20 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:122: GE
                {
                mGE(); 


                }
                break;
            case 21 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:125: PLUS
                {
                mPLUS(); 


                }
                break;
            case 22 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:130: MINUS
                {
                mMINUS(); 


                }
                break;
            case 23 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:136: MUL
                {
                mMUL(); 


                }
                break;
            case 24 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:140: DIV
                {
                mDIV(); 


                }
                break;
            case 25 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:144: MOD
                {
                mMOD(); 


                }
                break;
            case 26 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:148: NOT
                {
                mNOT(); 


                }
                break;
            case 27 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:152: AND
                {
                mAND(); 


                }
                break;
            case 28 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:156: OR
                {
                mOR(); 


                }
                break;
            case 29 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:159: IF
                {
                mIF(); 


                }
                break;
            case 30 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:162: THEN
                {
                mTHEN(); 


                }
                break;
            case 31 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:167: ELSE
                {
                mELSE(); 


                }
                break;
            case 32 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:172: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 33 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:178: WHILE
                {
                mWHILE(); 


                }
                break;
            case 34 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:184: DO
                {
                mDO(); 


                }
                break;
            case 35 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:187: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 36 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:196: FUNC
                {
                mFUNC(); 


                }
                break;
            case 37 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:201: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 38 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:209: RETURN
                {
                mRETURN(); 


                }
                break;
            case 39 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:216: READ
                {
                mREAD(); 


                }
                break;
            case 40 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:221: WRITE
                {
                mWRITE(); 


                }
                break;
            case 41 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:227: TRUE
                {
                mTRUE(); 


                }
                break;
            case 42 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:232: FALSE
                {
                mFALSE(); 


                }
                break;
            case 43 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:238: CREATE
                {
                mCREATE(); 


                }
                break;
            case 44 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:245: DESTROY
                {
                mDESTROY(); 


                }
                break;
            case 45 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:253: MOVE_T
                {
                mMOVE_T(); 


                }
                break;
            case 46 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:260: MOVE
                {
                mMOVE(); 


                }
                break;
            case 47 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:265: MODIFY_T
                {
                mMODIFY_T(); 


                }
                break;
            case 48 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:274: MODIFY
                {
                mMODIFY(); 


                }
                break;
            case 49 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:281: RGBPRCTJ
                {
                mRGBPRCTJ(); 


                }
                break;
            case 50 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:290: RGB
                {
                mRGB(); 


                }
                break;
            case 51 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:294: SHOW_T
                {
                mSHOW_T(); 


                }
                break;
            case 52 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:301: SHOW
                {
                mSHOW(); 


                }
                break;
            case 53 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:306: HIDE_T
                {
                mHIDE_T(); 


                }
                break;
            case 54 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:313: HIDE
                {
                mHIDE(); 


                }
                break;
            case 55 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:318: DELAY
                {
                mDELAY(); 


                }
                break;
            case 56 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:324: BLOCK
                {
                mBLOCK(); 


                }
                break;
            case 57 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:330: PARALLEL
                {
                mPARALLEL(); 


                }
                break;
            case 58 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:339: COLOR
                {
                mCOLOR(); 


                }
                break;
            case 59 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:345: WHITE
                {
                mWHITE(); 


                }
                break;
            case 60 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:351: BLACK
                {
                mBLACK(); 


                }
                break;
            case 61 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:357: BLUE
                {
                mBLUE(); 


                }
                break;
            case 62 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:362: RED
                {
                mRED(); 


                }
                break;
            case 63 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:366: GREEN
                {
                mGREEN(); 


                }
                break;
            case 64 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:372: POSX
                {
                mPOSX(); 


                }
                break;
            case 65 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:377: POSY
                {
                mPOSY(); 


                }
                break;
            case 66 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:382: CIRCLE
                {
                mCIRCLE(); 


                }
                break;
            case 67 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:389: STROKE
                {
                mSTROKE(); 


                }
                break;
            case 68 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:396: RECTANGLE
                {
                mRECTANGLE(); 


                }
                break;
            case 69 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:406: TEXT
                {
                mTEXT(); 


                }
                break;
            case 70 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:411: INT
                {
                mINT(); 


                }
                break;
            case 71 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:415: ID
                {
                mID(); 


                }
                break;
            case 72 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:418: COLORHEX
                {
                mCOLORHEX(); 


                }
                break;
            case 73 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:427: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 74 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:435: STRING
                {
                mSTRING(); 


                }
                break;
            case 75 :
                // /home/outer2g/Documentos/FIB/Q6/SVGAnimation/src/parser/Asl.g:1:442: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\10\uffff\1\50\1\57\1\62\2\uffff\1\63\1\66\1\uffff\1\70\1\72\3\uffff"+
        "\1\74\1\uffff\16\50\1\123\1\124\4\uffff\1\125\3\50\1\uffff\2\50"+
        "\13\uffff\2\50\1\141\1\142\7\50\1\152\12\50\3\uffff\4\50\1\174\1"+
        "\50\1\177\2\50\1\u0082\1\u0083\2\uffff\7\50\1\uffff\15\50\1\u009c"+
        "\2\50\1\u009f\1\uffff\1\50\1\u00a1\1\uffff\1\u00a3\1\50\2\uffff"+
        "\1\u00a5\1\u00a6\1\u00a7\1\u00a8\10\50\1\u00b1\4\50\1\u00b7\2\50"+
        "\1\u00ba\2\50\1\u00bd\1\uffff\2\50\1\uffff\1\50\1\uffff\1\u00c1"+
        "\1\uffff\1\50\4\uffff\1\u00c3\2\50\1\u00c6\1\u00c7\1\u00c8\1\50"+
        "\1\u00ca\1\uffff\1\u00cb\1\50\1\u00cd\1\50\1\u00cf\1\uffff\1\u00d0"+
        "\1\u00d1\1\uffff\1\50\1\u00d3\1\uffff\1\u00d5\1\u00d6\1\50\1\uffff"+
        "\1\u00d8\1\uffff\2\50\3\uffff\1\50\2\uffff\1\u00dc\1\uffff\1\u00dd"+
        "\3\uffff\1\50\1\uffff\1\u00df\2\uffff\1\50\1\uffff\1\50\1\u00e2"+
        "\1\u00e3\2\uffff\1\50\1\uffff\1\50\1\u00e6\2\uffff\1\u00e7\1\u00e8"+
        "\3\uffff";
    static final String DFA9_eofS =
        "\u00e9\uffff";
    static final String DFA9_minS =
        "\1\11\7\uffff\1\157\2\60\2\uffff\1\60\1\75\1\uffff\2\75\3\uffff"+
        "\1\52\1\uffff\1\157\1\156\1\162\1\146\1\145\1\154\1\150\1\145\1"+
        "\141\2\151\1\154\1\141\1\162\2\60\4\uffff\1\60\1\144\1\141\1\142"+
        "\1\uffff\1\157\1\162\13\uffff\1\164\1\144\2\60\1\145\1\165\1\170"+
        "\1\163\1\144\2\151\1\60\1\154\1\156\1\154\1\145\1\154\1\162\1\144"+
        "\1\141\1\162\1\145\3\uffff\1\145\1\151\1\165\1\144\1\60\1\164\1"+
        "\60\1\167\1\157\2\60\2\uffff\1\156\1\145\1\164\1\145\1\146\1\154"+
        "\1\164\1\uffff\1\164\1\141\1\143\1\163\1\141\1\157\1\143\1\145\2"+
        "\143\1\145\1\141\1\145\1\60\1\146\1\162\1\60\1\uffff\1\141\1\60"+
        "\1\uffff\1\60\1\153\2\uffff\4\60\1\146\1\150\1\165\3\145\1\162\1"+
        "\171\1\60\1\145\1\164\1\162\1\154\1\60\2\153\1\60\1\154\1\156\1"+
        "\60\1\uffff\1\171\1\156\1\uffff\1\156\1\uffff\1\60\1\uffff\1\145"+
        "\4\uffff\1\60\1\151\1\156\3\60\1\157\1\60\1\uffff\1\60\1\145\1\60"+
        "\1\145\1\60\1\uffff\2\60\1\uffff\1\154\1\60\1\uffff\2\60\1\147\1"+
        "\uffff\1\60\1\uffff\1\154\1\143\3\uffff\1\171\2\uffff\1\60\1\uffff"+
        "\1\60\3\uffff\1\145\1\uffff\1\60\2\uffff\1\154\1\uffff\1\145\2\60"+
        "\2\uffff\1\154\1\uffff\1\145\1\60\2\uffff\2\60\3\uffff";
    static final String DFA9_maxS =
        "\1\175\7\uffff\1\163\2\172\2\uffff\1\146\1\75\1\uffff\2\75\3\uffff"+
        "\1\57\1\uffff\1\157\1\156\1\162\1\146\1\162\1\156\1\162\1\157\1"+
        "\165\1\162\1\151\1\154\1\141\1\162\2\172\4\uffff\1\172\1\166\1\164"+
        "\1\142\1\uffff\1\157\1\162\13\uffff\1\164\1\144\2\172\1\145\1\165"+
        "\1\170\1\163\1\144\2\151\1\172\1\163\1\156\1\154\1\145\1\154\1\162"+
        "\1\144\1\165\1\162\1\145\3\uffff\1\145\1\151\1\165\1\144\1\172\1"+
        "\164\1\172\1\167\1\157\2\172\2\uffff\1\156\1\145\1\164\1\145\1\167"+
        "\2\164\1\uffff\1\164\1\141\1\143\1\163\1\141\1\157\1\143\1\145\2"+
        "\143\1\145\1\141\1\145\1\172\1\146\1\162\1\172\1\uffff\1\141\1\172"+
        "\1\uffff\1\172\1\153\2\uffff\4\172\1\146\1\150\1\165\3\145\1\162"+
        "\1\171\1\172\1\145\1\164\1\162\1\154\1\172\2\153\1\172\1\154\1\156"+
        "\1\172\1\uffff\1\171\1\156\1\uffff\1\156\1\uffff\1\172\1\uffff\1"+
        "\145\4\uffff\1\172\1\151\1\156\3\172\1\157\1\172\1\uffff\1\172\1"+
        "\145\1\172\1\145\1\172\1\uffff\2\172\1\uffff\1\154\1\172\1\uffff"+
        "\2\172\1\147\1\uffff\1\172\1\uffff\1\154\1\143\3\uffff\1\171\2\uffff"+
        "\1\172\1\uffff\1\172\3\uffff\1\145\1\uffff\1\172\2\uffff\1\154\1"+
        "\uffff\1\145\2\172\2\uffff\1\154\1\uffff\1\145\1\172\2\uffff\2\172"+
        "\3\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff\1\13\1\14\2\uffff\1"+
        "\20\2\uffff\1\25\1\26\1\27\1\uffff\1\31\20\uffff\1\106\1\107\1\112"+
        "\1\113\4\uffff\1\11\2\uffff\1\12\1\15\1\110\1\17\1\16\1\22\1\21"+
        "\1\24\1\23\1\111\1\30\26\uffff\1\100\1\101\1\10\13\uffff\1\34\1"+
        "\35\7\uffff\1\42\21\uffff\1\76\2\uffff\1\62\2\uffff\1\32\1\33\30"+
        "\uffff\1\56\2\uffff\1\47\1\uffff\1\61\1\uffff\1\64\1\uffff\1\36"+
        "\1\51\1\105\1\37\10\uffff\1\44\5\uffff\1\66\2\uffff\1\75\2\uffff"+
        "\1\55\3\uffff\1\63\1\uffff\1\40\2\uffff\1\41\1\73\1\50\1\uffff\1"+
        "\67\1\52\1\uffff\1\72\1\uffff\1\65\1\70\1\74\1\uffff\1\77\1\uffff"+
        "\1\60\1\46\1\uffff\1\103\3\uffff\1\53\1\102\1\uffff\1\57\2\uffff"+
        "\1\45\1\54\2\uffff\1\43\1\71\1\104";
    static final String DFA9_specialS =
        "\u00e9\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\52\2\uffff\1\52\22\uffff\1\52\1\17\1\51\1\15\1\uffff\1\26"+
            "\1\1\1\uffff\1\2\1\3\1\24\1\22\1\4\1\23\1\5\1\25\12\47\1\6\1"+
            "\7\1\20\1\16\1\21\2\uffff\32\50\4\uffff\1\50\1\uffff\1\30\1"+
            "\42\1\40\1\36\1\34\1\37\1\44\1\41\1\32\3\50\1\10\1\27\1\31\1"+
            "\43\1\50\1\11\1\12\1\33\2\50\1\35\1\45\1\46\1\50\1\13\1\uffff"+
            "\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\54\3\uffff\1\53",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\55\1\50\1"+
            "\56\23\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\7\50\1\60\13\50\1"+
            "\61\6\50",
            "",
            "",
            "\12\64\7\uffff\6\64\32\uffff\6\64",
            "\1\65",
            "",
            "\1\67",
            "\1\71",
            "",
            "",
            "",
            "\1\73\4\uffff\1\73",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\103\2\uffff\1\101\11\uffff\1\102",
            "\1\104\1\uffff\1\105",
            "\1\106\11\uffff\1\107",
            "\1\111\11\uffff\1\110",
            "\1\113\23\uffff\1\112",
            "\1\116\5\uffff\1\115\2\uffff\1\114",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\127\21\uffff\1\126",
            "\1\131\1\uffff\1\133\1\132\17\uffff\1\130",
            "\1\134",
            "",
            "\1\135",
            "\1\136",
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
            "\1\137",
            "\1\140",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\154\6\uffff\1\153",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\164\15\uffff\1\163\5\uffff\1\165",
            "\1\166",
            "\1\167",
            "",
            "",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\175",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\17\50\1\176\12\50",
            "\1\u0080",
            "\1\u0081",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u008a\2\uffff\1\u0088\15\uffff\1\u0089",
            "\1\u008b\7\uffff\1\u008c",
            "\1\u008d",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\u009b\6\50",
            "\1\u009d",
            "\1\u009e",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00a0",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\u00a2\6\50",
            "\1\u00a4",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\u00b6\6\50",
            "\1\u00b8",
            "\1\u00b9",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00bb",
            "\1\u00bc",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00c2",
            "",
            "",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00c4",
            "\1\u00c5",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00c9",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00cc",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ce",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00d2",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\u00d4\6\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d7",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00d9",
            "\1\u00da",
            "",
            "",
            "",
            "\1\u00db",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "\1\u00de",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u00e0",
            "",
            "\1\u00e1",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
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
            return "1:1: Tokens : ( T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | HASHTAG | EEQUAL | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | CREATE | DESTROY | MOVE_T | MOVE | MODIFY_T | MODIFY | RGBPRCTJ | RGB | SHOW_T | SHOW | HIDE_T | HIDE | DELAY | BLOCK | PARALLEL | COLOR | WHITE | BLACK | BLUE | RED | GREEN | POSX | POSY | CIRCLE | STROKE | RECTANGLE | TEXT | INT | ID | COLORHEX | COMMENT | STRING | WS );";
        }
    }
 

}