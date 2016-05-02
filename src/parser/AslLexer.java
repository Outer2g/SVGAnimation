// $ANTLR 3.4 /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g 2016-05-02 08:17:40

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
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
    public String getGrammarFileName() { return "/home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g"; }

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:6:7: ( '&' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:6:9: '&'
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
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:7:7: ( '(' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:7:9: '('
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
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:8:7: ( ')' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:8:9: ')'
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
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:9:7: ( ',' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:9:9: ','
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
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:10:7: ( ':' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:10:9: ':'
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
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:11:7: ( ';' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:11:9: ';'
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
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:12:7: ( 's' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:12:9: 's'
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
    // $ANTLR end "T__79"

    // $ANTLR start "HASHTAG"
    public final void mHASHTAG() throws RecognitionException {
        try {
            int _type = HASHTAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:236:9: ( '#' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:236:11: '#'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:237:9: ( '=' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:237:11: '='
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:238:9: ( '==' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:238:11: '=='
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:239:10: ( '!=' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:239:12: '!='
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:240:9: ( '<' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:240:11: '<'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:241:9: ( '<=' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:241:11: '<='
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:242:9: ( '>' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:242:11: '>'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:243:9: ( '>=' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:243:11: '>='
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:244:9: ( '+' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:244:11: '+'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:245:9: ( '-' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:245:11: '-'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:246:9: ( '*' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:246:11: '*'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:247:9: ( '/' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:247:11: '/'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:248:9: ( '%' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:248:11: '%'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:249:9: ( 'not' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:249:11: 'not'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:250:9: ( 'and' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:250:11: 'and'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:251:9: ( 'or' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:251:11: 'or'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:252:9: ( 'if' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:252:11: 'if'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:253:9: ( 'then' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:253:11: 'then'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:254:9: ( 'else' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:254:11: 'else'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:255:9: ( 'endif' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:255:11: 'endif'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:256:9: ( 'while' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:256:11: 'while'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:257:9: ( 'do' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:257:11: 'do'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:258:9: ( 'endwhile' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:258:11: 'endwhile'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:259:9: ( 'func' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:259:11: 'func'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:260:9: ( 'endfunc' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:260:11: 'endfunc'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:261:9: ( 'return' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:261:11: 'return'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:262:9: ( 'read' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:262:11: 'read'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:263:9: ( 'write' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:263:11: 'write'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:264:9: ( 'true' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:264:11: 'true'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:265:9: ( 'false' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:265:11: 'false'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:267:9: ( 'create' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:267:11: 'create'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:268:9: ( 'destroy' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:268:11: 'destroy'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:269:9: ( 'movet' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:269:11: 'movet'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:270:9: ( 'move' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:270:11: 'move'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:271:9: ( 'modifyt' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:271:11: 'modifyt'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:272:9: ( 'modify' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:272:11: 'modify'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:273:9: ( 'rgbp' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:273:11: 'rgbp'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:274:9: ( 'rgb' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:274:11: 'rgb'
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

    // $ANTLR start "COLOR"
    public final void mCOLOR() throws RecognitionException {
        try {
            int _type = COLOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:276:9: ( 'color' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:276:11: 'color'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:277:9: ( 'white' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:277:11: 'white'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:278:9: ( 'black' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:278:11: 'black'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:279:9: ( 'blue' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:279:11: 'blue'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:280:9: ( 'red' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:280:11: 'red'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:281:9: ( 'green' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:281:11: 'green'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:282:9: ( 'x' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:282:11: 'x'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:283:9: ( 'y' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:283:11: 'y'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:284:9: ( 'circle' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:284:11: 'circle'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:285:11: ( 'rectangle' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:285:13: 'rectangle'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:286:6: ( 'text' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:286:8: 'text'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:289:9: ( ( '0' .. '9' )+ )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:289:13: ( '0' .. '9' )+
            {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:289:13: ( '0' .. '9' )+
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
            	    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:290:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:290:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:290:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:292:9: ( '#' HEXADIGIT HEXADIGIT HEXADIGIT ( HEXADIGIT HEXADIGIT HEXADIGIT )? )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:292:11: '#' HEXADIGIT HEXADIGIT HEXADIGIT ( HEXADIGIT HEXADIGIT HEXADIGIT )?
            {
            match('#'); 

            mHEXADIGIT(); 


            mHEXADIGIT(); 


            mHEXADIGIT(); 


            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:292:45: ( HEXADIGIT HEXADIGIT HEXADIGIT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'F')||(LA3_0 >= 'a' && LA3_0 <= 'f')) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:292:46: HEXADIGIT HEXADIGIT HEXADIGIT
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:295:10: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:297:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:297:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:297:16: (~ ( '\\n' | '\\r' ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:
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


                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:297:30: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:297:30: '\\r'
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
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:298:11: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:298:16: ( options {greedy=false; } : . )*
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
                    	    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:298:44: .
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:302:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:302:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:302:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
            	    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:302:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:302:28: ~ ( '\\\\' | '\"' )
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:308:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:308:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:311:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:311:11: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:8: ( T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | HASHTAG | EEQUAL | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | CREATE | DESTROY | MOVE_T | MOVE | MODIFY_T | MODIFY | RGBPRCTJ | RGB | COLOR | WHITE | BLACK | BLUE | RED | GREEN | POSX | POSY | CIRCLE | RECTANGLE | TEXT | INT | ID | COLORHEX | COMMENT | STRING | WS )
        int alt9=62;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:10: T__73
                {
                mT__73(); 


                }
                break;
            case 2 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:16: T__74
                {
                mT__74(); 


                }
                break;
            case 3 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:22: T__75
                {
                mT__75(); 


                }
                break;
            case 4 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:28: T__76
                {
                mT__76(); 


                }
                break;
            case 5 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:34: T__77
                {
                mT__77(); 


                }
                break;
            case 6 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:40: T__78
                {
                mT__78(); 


                }
                break;
            case 7 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:46: T__79
                {
                mT__79(); 


                }
                break;
            case 8 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:52: HASHTAG
                {
                mHASHTAG(); 


                }
                break;
            case 9 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:60: EEQUAL
                {
                mEEQUAL(); 


                }
                break;
            case 10 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:67: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 11 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:73: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 12 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:83: LT
                {
                mLT(); 


                }
                break;
            case 13 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:86: LE
                {
                mLE(); 


                }
                break;
            case 14 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:89: GT
                {
                mGT(); 


                }
                break;
            case 15 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:92: GE
                {
                mGE(); 


                }
                break;
            case 16 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:95: PLUS
                {
                mPLUS(); 


                }
                break;
            case 17 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:100: MINUS
                {
                mMINUS(); 


                }
                break;
            case 18 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:106: MUL
                {
                mMUL(); 


                }
                break;
            case 19 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:110: DIV
                {
                mDIV(); 


                }
                break;
            case 20 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:114: MOD
                {
                mMOD(); 


                }
                break;
            case 21 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:118: NOT
                {
                mNOT(); 


                }
                break;
            case 22 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:122: AND
                {
                mAND(); 


                }
                break;
            case 23 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:126: OR
                {
                mOR(); 


                }
                break;
            case 24 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:129: IF
                {
                mIF(); 


                }
                break;
            case 25 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:132: THEN
                {
                mTHEN(); 


                }
                break;
            case 26 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:137: ELSE
                {
                mELSE(); 


                }
                break;
            case 27 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:142: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 28 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:148: WHILE
                {
                mWHILE(); 


                }
                break;
            case 29 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:154: DO
                {
                mDO(); 


                }
                break;
            case 30 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:157: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 31 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:166: FUNC
                {
                mFUNC(); 


                }
                break;
            case 32 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:171: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 33 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:179: RETURN
                {
                mRETURN(); 


                }
                break;
            case 34 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:186: READ
                {
                mREAD(); 


                }
                break;
            case 35 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:191: WRITE
                {
                mWRITE(); 


                }
                break;
            case 36 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:197: TRUE
                {
                mTRUE(); 


                }
                break;
            case 37 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:202: FALSE
                {
                mFALSE(); 


                }
                break;
            case 38 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:208: CREATE
                {
                mCREATE(); 


                }
                break;
            case 39 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:215: DESTROY
                {
                mDESTROY(); 


                }
                break;
            case 40 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:223: MOVE_T
                {
                mMOVE_T(); 


                }
                break;
            case 41 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:230: MOVE
                {
                mMOVE(); 


                }
                break;
            case 42 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:235: MODIFY_T
                {
                mMODIFY_T(); 


                }
                break;
            case 43 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:244: MODIFY
                {
                mMODIFY(); 


                }
                break;
            case 44 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:251: RGBPRCTJ
                {
                mRGBPRCTJ(); 


                }
                break;
            case 45 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:260: RGB
                {
                mRGB(); 


                }
                break;
            case 46 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:264: COLOR
                {
                mCOLOR(); 


                }
                break;
            case 47 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:270: WHITE
                {
                mWHITE(); 


                }
                break;
            case 48 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:276: BLACK
                {
                mBLACK(); 


                }
                break;
            case 49 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:282: BLUE
                {
                mBLUE(); 


                }
                break;
            case 50 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:287: RED
                {
                mRED(); 


                }
                break;
            case 51 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:291: GREEN
                {
                mGREEN(); 


                }
                break;
            case 52 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:297: POSX
                {
                mPOSX(); 


                }
                break;
            case 53 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:302: POSY
                {
                mPOSY(); 


                }
                break;
            case 54 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:307: CIRCLE
                {
                mCIRCLE(); 


                }
                break;
            case 55 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:314: RECTANGLE
                {
                mRECTANGLE(); 


                }
                break;
            case 56 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:324: TEXT
                {
                mTEXT(); 


                }
                break;
            case 57 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:329: INT
                {
                mINT(); 


                }
                break;
            case 58 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:333: ID
                {
                mID(); 


                }
                break;
            case 59 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:336: COLORHEX
                {
                mCOLORHEX(); 


                }
                break;
            case 60 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:345: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 61 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:353: STRING
                {
                mSTRING(); 


                }
                break;
            case 62 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:360: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\7\uffff\1\46\1\47\1\52\1\uffff\1\54\1\56\3\uffff\1\60\1\uffff\16"+
        "\43\1\110\1\111\17\uffff\2\43\1\114\1\115\7\43\1\125\13\43\2\uffff"+
        "\1\146\1\147\2\uffff\7\43\1\uffff\5\43\1\167\1\43\1\172\10\43\2"+
        "\uffff\1\u0083\1\u0084\1\u0085\1\u0086\7\43\1\u008e\2\43\1\u0091"+
        "\1\uffff\1\43\1\u0093\1\uffff\3\43\1\u0098\2\43\1\u009b\1\43\4\uffff"+
        "\1\u009d\2\43\1\u00a0\1\u00a1\1\u00a2\1\43\1\uffff\1\u00a4\1\43"+
        "\1\uffff\1\43\1\uffff\1\43\1\u00a8\1\43\1\u00aa\1\uffff\1\43\1\u00ac"+
        "\1\uffff\1\u00ad\1\uffff\2\43\3\uffff\1\43\1\uffff\1\u00b1\1\43"+
        "\1\u00b3\1\uffff\1\u00b4\1\uffff\1\u00b6\2\uffff\1\43\1\u00b8\1"+
        "\u00b9\1\uffff\1\43\2\uffff\1\u00bb\1\uffff\1\u00bc\2\uffff\1\43"+
        "\2\uffff\1\u00be\1\uffff";
    static final String DFA9_eofS =
        "\u00bf\uffff";
    static final String DFA9_minS =
        "\1\11\6\uffff\2\60\1\75\1\uffff\2\75\3\uffff\1\52\1\uffff\1\157"+
        "\1\156\1\162\1\146\1\145\1\154\1\150\1\145\1\141\1\145\1\151\1\157"+
        "\1\154\1\162\2\60\17\uffff\1\164\1\144\2\60\1\145\1\165\1\170\1"+
        "\163\1\144\2\151\1\60\1\163\1\156\1\154\1\141\1\142\1\145\1\154"+
        "\1\162\1\144\1\141\1\145\2\uffff\2\60\2\uffff\1\156\1\145\1\164"+
        "\1\145\1\146\1\154\1\164\1\uffff\1\164\1\143\1\163\1\165\1\144\1"+
        "\60\1\164\1\60\1\141\1\157\1\143\1\145\1\151\1\143\2\145\2\uffff"+
        "\4\60\1\146\1\150\1\165\3\145\1\162\1\60\1\145\1\162\1\60\1\uffff"+
        "\1\141\1\60\1\uffff\1\164\1\162\1\154\1\60\1\146\1\153\1\60\1\156"+
        "\4\uffff\1\60\1\151\1\156\3\60\1\157\1\uffff\1\60\1\156\1\uffff"+
        "\1\156\1\uffff\1\145\1\60\1\145\1\60\1\uffff\1\171\1\60\1\uffff"+
        "\1\60\1\uffff\1\154\1\143\3\uffff\1\171\1\uffff\1\60\1\147\1\60"+
        "\1\uffff\1\60\1\uffff\1\60\2\uffff\1\145\2\60\1\uffff\1\154\2\uffff"+
        "\1\60\1\uffff\1\60\2\uffff\1\145\2\uffff\1\60\1\uffff";
    static final String DFA9_maxS =
        "\1\172\6\uffff\1\172\1\146\1\75\1\uffff\2\75\3\uffff\1\57\1\uffff"+
        "\1\157\1\156\1\162\1\146\1\162\1\156\1\162\1\157\1\165\1\147\1\162"+
        "\1\157\1\154\1\162\2\172\17\uffff\1\164\1\144\2\172\1\145\1\165"+
        "\1\170\1\163\1\144\2\151\1\172\1\163\1\156\1\154\1\164\1\142\1\145"+
        "\1\154\1\162\1\166\1\165\1\145\2\uffff\2\172\2\uffff\1\156\1\145"+
        "\1\164\1\145\1\167\2\164\1\uffff\1\164\1\143\1\163\1\165\1\144\1"+
        "\172\1\164\1\172\1\141\1\157\1\143\1\145\1\151\1\143\2\145\2\uffff"+
        "\4\172\1\146\1\150\1\165\3\145\1\162\1\172\1\145\1\162\1\172\1\uffff"+
        "\1\141\1\172\1\uffff\1\164\1\162\1\154\1\172\1\146\1\153\1\172\1"+
        "\156\4\uffff\1\172\1\151\1\156\3\172\1\157\1\uffff\1\172\1\156\1"+
        "\uffff\1\156\1\uffff\1\145\1\172\1\145\1\172\1\uffff\1\171\1\172"+
        "\1\uffff\1\172\1\uffff\1\154\1\143\3\uffff\1\171\1\uffff\1\172\1"+
        "\147\1\172\1\uffff\1\172\1\uffff\1\172\2\uffff\1\145\2\172\1\uffff"+
        "\1\154\2\uffff\1\172\1\uffff\1\172\2\uffff\1\145\2\uffff\1\172\1"+
        "\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff\1\13\2\uffff\1\20\1\21"+
        "\1\22\1\uffff\1\24\20\uffff\1\71\1\72\1\75\1\76\1\7\1\10\1\73\1"+
        "\12\1\11\1\15\1\14\1\17\1\16\1\74\1\23\27\uffff\1\64\1\65\2\uffff"+
        "\1\27\1\30\7\uffff\1\35\20\uffff\1\25\1\26\17\uffff\1\62\2\uffff"+
        "\1\55\10\uffff\1\31\1\44\1\70\1\32\7\uffff\1\37\2\uffff\1\42\1\uffff"+
        "\1\54\4\uffff\1\51\2\uffff\1\61\1\uffff\1\33\2\uffff\1\34\1\57\1"+
        "\43\1\uffff\1\45\3\uffff\1\56\1\uffff\1\50\1\uffff\1\60\1\63\3\uffff"+
        "\1\41\1\uffff\1\46\1\66\1\uffff\1\53\1\uffff\1\40\1\47\1\uffff\1"+
        "\52\1\36\1\uffff\1\67";
    static final String DFA9_specialS =
        "\u00bf\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\45\2\uffff\1\45\22\uffff\1\45\1\12\1\44\1\10\1\uffff\1\21"+
            "\1\1\1\uffff\1\2\1\3\1\17\1\15\1\4\1\16\1\uffff\1\20\12\42\1"+
            "\5\1\6\1\13\1\11\1\14\2\uffff\32\43\4\uffff\1\43\1\uffff\1\23"+
            "\1\36\1\34\1\31\1\27\1\32\1\37\1\43\1\25\3\43\1\35\1\22\1\24"+
            "\2\43\1\33\1\7\1\26\2\43\1\30\1\40\1\41\1\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\50\7\uffff\6\50\32\uffff\6\50",
            "\1\51",
            "",
            "\1\53",
            "\1\55",
            "",
            "",
            "",
            "\1\57\4\uffff\1\57",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\67\2\uffff\1\65\11\uffff\1\66",
            "\1\70\1\uffff\1\71",
            "\1\72\11\uffff\1\73",
            "\1\75\11\uffff\1\74",
            "\1\77\23\uffff\1\76",
            "\1\100\1\uffff\1\101",
            "\1\104\5\uffff\1\103\2\uffff\1\102",
            "\1\105",
            "\1\106",
            "\1\107",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
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
            "",
            "",
            "",
            "",
            "\1\112",
            "\1\113",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\132\1\uffff\1\134\1\133\17\uffff\1\131",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\142\21\uffff\1\141",
            "\1\143\23\uffff\1\144",
            "\1\145",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\156\2\uffff\1\154\15\uffff\1\155",
            "\1\157\7\uffff\1\160",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\170",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\17\43\1\171\12\43",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u008f",
            "\1\u0090",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u0092",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u0097\6\43",
            "\1\u0099",
            "\1\u009a",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u009c",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u009e",
            "\1\u009f",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00a3",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "",
            "\1\u00a7",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00a9",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u00ab",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u00ae",
            "\1\u00af",
            "",
            "",
            "",
            "\1\u00b0",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00b2",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u00b5\6\43",
            "",
            "",
            "\1\u00b7",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u00ba",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\u00bd",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
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
            return "1:1: Tokens : ( T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | HASHTAG | EEQUAL | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | CREATE | DESTROY | MOVE_T | MOVE | MODIFY_T | MODIFY | RGBPRCTJ | RGB | COLOR | WHITE | BLACK | BLUE | RED | GREEN | POSX | POSY | CIRCLE | RECTANGLE | TEXT | INT | ID | COLORHEX | COMMENT | STRING | WS );";
        }
    }
 

}