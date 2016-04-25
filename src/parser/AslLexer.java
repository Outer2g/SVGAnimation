// $ANTLR 3.4 /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g 2016-04-25 10:02:21

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
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
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
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
    public static final int ID=34;
    public static final int IF=35;
    public static final int INT=36;
    public static final int LE=37;
    public static final int LIST_ATTR=38;
    public static final int LIST_FUNCTIONS=39;
    public static final int LIST_INSTR=40;
    public static final int LT=41;
    public static final int MINUS=42;
    public static final int MOD=43;
    public static final int MODIFY=44;
    public static final int MODIFY_T=45;
    public static final int MOVE=46;
    public static final int MOVE_T=47;
    public static final int MUL=48;
    public static final int NOT=49;
    public static final int NOT_EQUAL=50;
    public static final int OR=51;
    public static final int PARAMS=52;
    public static final int PLUS=53;
    public static final int POSX=54;
    public static final int POSY=55;
    public static final int PREF=56;
    public static final int PVALUE=57;
    public static final int READ=58;
    public static final int RECTANGLE=59;
    public static final int RED=60;
    public static final int RETURN=61;
    public static final int RGB=62;
    public static final int RGBPRCTJ=63;
    public static final int STRING=64;
    public static final int TEXT=65;
    public static final int THEN=66;
    public static final int TRUE=67;
    public static final int WHILE=68;
    public static final int WHITE=69;
    public static final int WRITE=70;
    public static final int WS=71;

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

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
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
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
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
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
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
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
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
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:10:7: ( '0' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:10:9: '0'
            {
            match('0'); 

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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:11:7: ( '1' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:11:9: '1'
            {
            match('1'); 

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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:12:7: ( '2' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:12:9: '2'
            {
            match('2'); 

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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:13:7: ( '3' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:13:9: '3'
            {
            match('3'); 

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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:14:7: ( '4' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:14:9: '4'
            {
            match('4'); 

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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:15:7: ( '5' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:15:9: '5'
            {
            match('5'); 

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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:16:7: ( '6' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:16:9: '6'
            {
            match('6'); 

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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:17:7: ( '7' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:17:9: '7'
            {
            match('7'); 

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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:18:7: ( '8' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:18:9: '8'
            {
            match('8'); 

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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:19:7: ( '9' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:19:9: '9'
            {
            match('9'); 

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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:20:7: ( ':' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:20:9: ':'
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
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:21:7: ( ';' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:21:9: ';'
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
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:22:7: ( 'A' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:22:9: 'A'
            {
            match('A'); 

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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:23:7: ( 'B' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:23:9: 'B'
            {
            match('B'); 

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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:24:7: ( 'C' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:24:9: 'C'
            {
            match('C'); 

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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:25:7: ( 'D' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:25:9: 'D'
            {
            match('D'); 

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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:26:7: ( 'E' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:26:9: 'E'
            {
            match('E'); 

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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:27:7: ( 'F' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:27:9: 'F'
            {
            match('F'); 

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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:28:7: ( 'a' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:28:9: 'a'
            {
            match('a'); 

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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:29:7: ( 'b' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:29:9: 'b'
            {
            match('b'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:30:7: ( 'c' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:30:9: 'c'
            {
            match('c'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:31:7: ( 'd' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:31:9: 'd'
            {
            match('d'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:32:7: ( 'e' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:32:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:33:7: ( 'f' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:33:9: 'f'
            {
            match('f'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:34:8: ( 's' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:34:10: 's'
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
    // $ANTLR end "T__100"

    // $ANTLR start "HASHTAG"
    public final void mHASHTAG() throws RecognitionException {
        try {
            int _type = HASHTAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:232:9: ( '#' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:232:11: '#'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:233:9: ( '=' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:233:11: '='
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:234:9: ( '==' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:234:11: '=='
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:235:10: ( '!=' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:235:12: '!='
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:236:9: ( '<' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:236:11: '<'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:237:9: ( '<=' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:237:11: '<='
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:238:9: ( '>' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:238:11: '>'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:239:9: ( '>=' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:239:11: '>='
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:240:9: ( '+' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:240:11: '+'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:241:9: ( '-' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:241:11: '-'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:242:9: ( '*' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:242:11: '*'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:243:9: ( '/' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:243:11: '/'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:244:9: ( '%' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:244:11: '%'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:245:9: ( 'not' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:245:11: 'not'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:246:9: ( 'and' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:246:11: 'and'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:247:9: ( 'or' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:247:11: 'or'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:248:9: ( 'if' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:248:11: 'if'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:249:9: ( 'then' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:249:11: 'then'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:250:9: ( 'else' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:250:11: 'else'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:251:9: ( 'endif' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:251:11: 'endif'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:252:9: ( 'while' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:252:11: 'while'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:253:9: ( 'do' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:253:11: 'do'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:254:9: ( 'endwhile' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:254:11: 'endwhile'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:255:9: ( 'func' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:255:11: 'func'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:256:9: ( 'endfunc' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:256:11: 'endfunc'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:257:9: ( 'return' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:257:11: 'return'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:258:9: ( 'read' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:258:11: 'read'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:259:9: ( 'write' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:259:11: 'write'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:260:9: ( 'true' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:260:11: 'true'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:261:9: ( 'false' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:261:11: 'false'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:263:9: ( 'create' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:263:11: 'create'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:264:9: ( 'destroy' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:264:11: 'destroy'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:265:9: ( 'movet' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:265:11: 'movet'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:266:9: ( 'move' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:266:11: 'move'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:267:9: ( 'modifyt' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:267:11: 'modifyt'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:268:9: ( 'modify' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:268:11: 'modify'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:269:9: ( 'rgbp' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:269:11: 'rgbp'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:270:9: ( 'rgb' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:270:11: 'rgb'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:272:9: ( 'color' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:272:11: 'color'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:273:9: ( 'white' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:273:11: 'white'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:274:9: ( 'black' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:274:11: 'black'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:275:9: ( 'blue' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:275:11: 'blue'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:276:9: ( 'red' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:276:11: 'red'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:277:9: ( 'green' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:277:11: 'green'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:278:9: ( 'x' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:278:11: 'x'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:279:9: ( 'y' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:279:11: 'y'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:280:9: ( 'circle' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:280:11: 'circle'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:281:11: ( 'rectangle' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:281:13: 'rectangle'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:282:6: ( 'text' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:282:8: 'text'
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:284:9: ( ( '0' .. '9' )+ )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:284:13: ( '0' .. '9' )+
            {
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:284:13: ( '0' .. '9' )+
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:285:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:285:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:285:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:288:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='/') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='/') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='*') ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:288:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:288:16: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
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
                    	    break loop3;
                        }
                    } while (true);


                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:288:30: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:288:30: '\\r'
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
                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:289:11: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:289:16: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:289:44: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:293:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:293:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:293:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:293:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:293:28: ~ ( '\\\\' | '\"' )
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
            	    break loop7;
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:299:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:299:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:302:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:302:11: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:8: ( T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | HASHTAG | EEQUAL | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | CREATE | DESTROY | MOVE_T | MOVE | MODIFY_T | MODIFY | RGBPRCTJ | RGB | COLOR | WHITE | BLACK | BLUE | RED | GREEN | POSX | POSY | CIRCLE | RECTANGLE | TEXT | INT | ID | COMMENT | STRING | WS )
        int alt8=83;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:10: T__72
                {
                mT__72(); 


                }
                break;
            case 2 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:16: T__73
                {
                mT__73(); 


                }
                break;
            case 3 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:22: T__74
                {
                mT__74(); 


                }
                break;
            case 4 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:28: T__75
                {
                mT__75(); 


                }
                break;
            case 5 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:34: T__76
                {
                mT__76(); 


                }
                break;
            case 6 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:40: T__77
                {
                mT__77(); 


                }
                break;
            case 7 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:46: T__78
                {
                mT__78(); 


                }
                break;
            case 8 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:52: T__79
                {
                mT__79(); 


                }
                break;
            case 9 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:58: T__80
                {
                mT__80(); 


                }
                break;
            case 10 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:64: T__81
                {
                mT__81(); 


                }
                break;
            case 11 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:70: T__82
                {
                mT__82(); 


                }
                break;
            case 12 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:76: T__83
                {
                mT__83(); 


                }
                break;
            case 13 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:82: T__84
                {
                mT__84(); 


                }
                break;
            case 14 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:88: T__85
                {
                mT__85(); 


                }
                break;
            case 15 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:94: T__86
                {
                mT__86(); 


                }
                break;
            case 16 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:100: T__87
                {
                mT__87(); 


                }
                break;
            case 17 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:106: T__88
                {
                mT__88(); 


                }
                break;
            case 18 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:112: T__89
                {
                mT__89(); 


                }
                break;
            case 19 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:118: T__90
                {
                mT__90(); 


                }
                break;
            case 20 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:124: T__91
                {
                mT__91(); 


                }
                break;
            case 21 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:130: T__92
                {
                mT__92(); 


                }
                break;
            case 22 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:136: T__93
                {
                mT__93(); 


                }
                break;
            case 23 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:142: T__94
                {
                mT__94(); 


                }
                break;
            case 24 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:148: T__95
                {
                mT__95(); 


                }
                break;
            case 25 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:154: T__96
                {
                mT__96(); 


                }
                break;
            case 26 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:160: T__97
                {
                mT__97(); 


                }
                break;
            case 27 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:166: T__98
                {
                mT__98(); 


                }
                break;
            case 28 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:172: T__99
                {
                mT__99(); 


                }
                break;
            case 29 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:178: T__100
                {
                mT__100(); 


                }
                break;
            case 30 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:185: HASHTAG
                {
                mHASHTAG(); 


                }
                break;
            case 31 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:193: EEQUAL
                {
                mEEQUAL(); 


                }
                break;
            case 32 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:200: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 33 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:206: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 34 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:216: LT
                {
                mLT(); 


                }
                break;
            case 35 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:219: LE
                {
                mLE(); 


                }
                break;
            case 36 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:222: GT
                {
                mGT(); 


                }
                break;
            case 37 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:225: GE
                {
                mGE(); 


                }
                break;
            case 38 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:228: PLUS
                {
                mPLUS(); 


                }
                break;
            case 39 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:233: MINUS
                {
                mMINUS(); 


                }
                break;
            case 40 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:239: MUL
                {
                mMUL(); 


                }
                break;
            case 41 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:243: DIV
                {
                mDIV(); 


                }
                break;
            case 42 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:247: MOD
                {
                mMOD(); 


                }
                break;
            case 43 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:251: NOT
                {
                mNOT(); 


                }
                break;
            case 44 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:255: AND
                {
                mAND(); 


                }
                break;
            case 45 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:259: OR
                {
                mOR(); 


                }
                break;
            case 46 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:262: IF
                {
                mIF(); 


                }
                break;
            case 47 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:265: THEN
                {
                mTHEN(); 


                }
                break;
            case 48 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:270: ELSE
                {
                mELSE(); 


                }
                break;
            case 49 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:275: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 50 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:281: WHILE
                {
                mWHILE(); 


                }
                break;
            case 51 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:287: DO
                {
                mDO(); 


                }
                break;
            case 52 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:290: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 53 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:299: FUNC
                {
                mFUNC(); 


                }
                break;
            case 54 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:304: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 55 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:312: RETURN
                {
                mRETURN(); 


                }
                break;
            case 56 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:319: READ
                {
                mREAD(); 


                }
                break;
            case 57 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:324: WRITE
                {
                mWRITE(); 


                }
                break;
            case 58 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:330: TRUE
                {
                mTRUE(); 


                }
                break;
            case 59 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:335: FALSE
                {
                mFALSE(); 


                }
                break;
            case 60 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:341: CREATE
                {
                mCREATE(); 


                }
                break;
            case 61 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:348: DESTROY
                {
                mDESTROY(); 


                }
                break;
            case 62 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:356: MOVE_T
                {
                mMOVE_T(); 


                }
                break;
            case 63 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:363: MOVE
                {
                mMOVE(); 


                }
                break;
            case 64 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:368: MODIFY_T
                {
                mMODIFY_T(); 


                }
                break;
            case 65 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:377: MODIFY
                {
                mMODIFY(); 


                }
                break;
            case 66 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:384: RGBPRCTJ
                {
                mRGBPRCTJ(); 


                }
                break;
            case 67 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:393: RGB
                {
                mRGB(); 


                }
                break;
            case 68 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:397: COLOR
                {
                mCOLOR(); 


                }
                break;
            case 69 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:403: WHITE
                {
                mWHITE(); 


                }
                break;
            case 70 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:409: BLACK
                {
                mBLACK(); 


                }
                break;
            case 71 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:415: BLUE
                {
                mBLUE(); 


                }
                break;
            case 72 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:420: RED
                {
                mRED(); 


                }
                break;
            case 73 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:424: GREEN
                {
                mGREEN(); 


                }
                break;
            case 74 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:430: POSX
                {
                mPOSX(); 


                }
                break;
            case 75 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:435: POSY
                {
                mPOSY(); 


                }
                break;
            case 76 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:440: CIRCLE
                {
                mCIRCLE(); 


                }
                break;
            case 77 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:447: RECTANGLE
                {
                mRECTANGLE(); 


                }
                break;
            case 78 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:457: TEXT
                {
                mTEXT(); 


                }
                break;
            case 79 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:462: INT
                {
                mINT(); 


                }
                break;
            case 80 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:466: ID
                {
                mID(); 


                }
                break;
            case 81 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:469: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 82 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:477: STRING
                {
                mSTRING(); 


                }
                break;
            case 83 :
                // /home/pinkii/Documents/Compilers/Asl/src/parser/Asl.g:1:484: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\5\uffff\1\65\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\2\uffff"+
        "\1\100\1\101\1\102\1\103\1\104\1\105\1\107\1\111\1\115\1\120\1\123"+
        "\1\126\1\127\1\uffff\1\131\1\uffff\1\133\1\135\3\uffff\1\137\1\uffff"+
        "\10\62\1\154\1\155\24\uffff\1\62\1\uffff\1\62\1\uffff\3\62\1\uffff"+
        "\1\164\1\62\1\uffff\2\62\1\uffff\2\62\12\uffff\1\62\1\173\1\174"+
        "\11\62\2\uffff\1\u008a\5\62\1\uffff\5\62\1\u0097\2\uffff\7\62\1"+
        "\u00a0\1\62\1\u00a3\3\62\1\uffff\1\62\1\u00a8\4\62\1\u00ad\3\62"+
        "\1\u00b1\1\62\1\uffff\1\u00b3\1\u00b4\1\u00b5\4\62\1\u00ba\1\uffff"+
        "\1\62\1\u00bc\1\uffff\1\u00be\2\62\1\u00c1\1\uffff\1\62\1\u00c3"+
        "\2\62\1\uffff\1\u00c6\2\62\1\uffff\1\u00c9\3\uffff\1\u00ca\1\u00cb"+
        "\1\u00cc\1\62\1\uffff\1\62\1\uffff\1\u00cf\1\uffff\1\62\1\u00d1"+
        "\1\uffff\1\u00d2\1\uffff\1\u00d3\1\62\1\uffff\2\62\4\uffff\1\u00d7"+
        "\1\62\1\uffff\1\u00da\3\uffff\1\u00db\1\62\1\u00dd\1\uffff\1\62"+
        "\1\u00df\2\uffff\1\u00e0\1\uffff\1\62\2\uffff\1\u00e2\1\uffff";
    static final String DFA8_eofS =
        "\u00e3\uffff";
    static final String DFA8_minS =
        "\1\11\4\uffff\12\60\2\uffff\15\60\1\uffff\1\75\1\uffff\2\75\3\uffff"+
        "\1\52\1\uffff\1\157\1\162\1\146\1\145\1\150\1\145\1\157\1\162\2"+
        "\60\24\uffff\1\144\1\uffff\1\141\1\uffff\1\145\1\154\1\162\1\uffff"+
        "\1\60\1\163\1\uffff\1\163\1\144\1\uffff\1\156\1\154\12\uffff\1\164"+
        "\2\60\1\145\1\165\1\170\2\151\1\141\1\142\1\144\1\145\2\uffff\1"+
        "\60\1\143\1\145\1\141\1\157\1\143\1\uffff\1\164\1\145\1\146\1\143"+
        "\1\163\1\60\2\uffff\1\156\1\145\1\164\1\154\1\164\1\165\1\144\1"+
        "\60\1\164\1\60\1\145\1\151\1\145\1\uffff\1\153\1\60\1\164\1\162"+
        "\1\154\1\162\1\60\1\146\1\150\1\165\1\60\1\145\1\uffff\3\60\3\145"+
        "\1\162\1\60\1\uffff\1\141\1\60\1\uffff\1\60\1\146\1\156\1\60\1\uffff"+
        "\1\145\1\60\1\145\1\157\1\uffff\1\60\1\151\1\156\1\uffff\1\60\3"+
        "\uffff\3\60\1\156\1\uffff\1\156\1\uffff\1\60\1\uffff\1\171\1\60"+
        "\1\uffff\1\60\1\uffff\1\60\1\171\1\uffff\1\154\1\143\4\uffff\1\60"+
        "\1\147\1\uffff\1\60\3\uffff\1\60\1\145\1\60\1\uffff\1\154\1\60\2"+
        "\uffff\1\60\1\uffff\1\145\2\uffff\1\60\1\uffff";
    static final String DFA8_maxS =
        "\1\172\4\uffff\12\71\2\uffff\15\172\1\uffff\1\75\1\uffff\2\75\3"+
        "\uffff\1\57\1\uffff\1\157\1\162\1\146\2\162\1\147\1\157\1\162\2"+
        "\172\24\uffff\1\144\1\uffff\1\165\1\uffff\1\145\1\154\1\162\1\uffff"+
        "\1\172\1\163\1\uffff\1\163\1\144\1\uffff\1\156\1\154\12\uffff\1"+
        "\164\2\172\1\145\1\165\1\170\2\151\1\164\1\142\1\166\1\145\2\uffff"+
        "\1\172\1\143\1\145\1\141\1\157\1\143\1\uffff\1\164\1\145\1\167\1"+
        "\143\1\163\1\172\2\uffff\1\156\1\145\3\164\1\165\1\144\1\172\1\164"+
        "\1\172\1\145\1\151\1\145\1\uffff\1\153\1\172\1\164\1\162\1\154\1"+
        "\162\1\172\1\146\1\150\1\165\1\172\1\145\1\uffff\3\172\3\145\1\162"+
        "\1\172\1\uffff\1\141\1\172\1\uffff\1\172\1\146\1\156\1\172\1\uffff"+
        "\1\145\1\172\1\145\1\157\1\uffff\1\172\1\151\1\156\1\uffff\1\172"+
        "\3\uffff\3\172\1\156\1\uffff\1\156\1\uffff\1\172\1\uffff\1\171\1"+
        "\172\1\uffff\1\172\1\uffff\1\172\1\171\1\uffff\1\154\1\143\4\uffff"+
        "\1\172\1\147\1\uffff\1\172\3\uffff\1\172\1\145\1\172\1\uffff\1\154"+
        "\1\172\2\uffff\1\172\1\uffff\1\145\2\uffff\1\172\1\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\12\uffff\1\17\1\20\15\uffff\1\36\1\uffff"+
        "\1\41\2\uffff\1\46\1\47\1\50\1\uffff\1\52\12\uffff\1\120\1\122\1"+
        "\123\1\5\1\117\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\21\1"+
        "\22\1\23\1\24\1\25\1\26\1\uffff\1\27\1\uffff\1\30\3\uffff\1\31\2"+
        "\uffff\1\32\2\uffff\1\33\2\uffff\1\34\1\35\1\40\1\37\1\43\1\42\1"+
        "\45\1\44\1\121\1\51\14\uffff\1\112\1\113\6\uffff\1\63\6\uffff\1"+
        "\55\1\56\15\uffff\1\54\14\uffff\1\53\10\uffff\1\110\2\uffff\1\103"+
        "\4\uffff\1\107\4\uffff\1\60\3\uffff\1\65\1\uffff\1\57\1\72\1\116"+
        "\4\uffff\1\70\1\uffff\1\102\1\uffff\1\77\2\uffff\1\106\1\uffff\1"+
        "\104\2\uffff\1\61\2\uffff\1\73\1\62\1\105\1\71\2\uffff\1\76\1\uffff"+
        "\1\111\1\74\1\114\3\uffff\1\67\2\uffff\1\101\1\75\1\uffff\1\66\1"+
        "\uffff\1\100\1\64\1\uffff\1\115";
    static final String DFA8_specialS =
        "\u00e3\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\64\2\uffff\1\64\22\uffff\1\64\1\40\1\63\1\36\1\uffff\1\47"+
            "\1\1\1\uffff\1\2\1\3\1\45\1\43\1\4\1\44\1\uffff\1\46\1\5\1\6"+
            "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\41\1\37"+
            "\1\42\2\uffff\1\21\1\22\1\23\1\24\1\25\1\26\24\62\4\uffff\1"+
            "\62\1\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\57\1\62\1\52\3\62"+
            "\1\56\1\50\1\51\2\62\1\55\1\35\1\53\2\62\1\54\1\60\1\61\1\62",
            "",
            "",
            "",
            "",
            "\12\66",
            "\12\66",
            "\12\66",
            "\12\66",
            "\12\66",
            "\12\66",
            "\12\66",
            "\12\66",
            "\12\66",
            "\12\66",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\106\14\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\110\16\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\114\5\62"+
            "\1\113\2\62\1\112\10\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\117\11\62"+
            "\1\116\13\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\121\1\62"+
            "\1\122\14\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\125\23\62\1\124"+
            "\5\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\130",
            "",
            "\1\132",
            "\1\134",
            "",
            "",
            "",
            "\1\136\4\uffff\1\136",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\145\2\uffff\1\143\11\uffff\1\144",
            "\1\146\11\uffff\1\147",
            "\1\150\1\uffff\1\151",
            "\1\152",
            "\1\153",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
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
            "",
            "",
            "",
            "",
            "",
            "\1\156",
            "",
            "\1\157\23\uffff\1\160",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\165",
            "",
            "\1\166",
            "\1\167",
            "",
            "\1\170",
            "\1\171",
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
            "\1\172",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0083\1\uffff\1\u0085\1\u0084\17\uffff\1\u0082",
            "\1\u0086",
            "\1\u0088\21\uffff\1\u0087",
            "\1\u0089",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0094\2\uffff\1\u0092\15\uffff\1\u0093",
            "\1\u0095",
            "\1\u0096",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b\7\uffff\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00a1",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u00a2\12"+
            "\62",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "\1\u00a7",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00b2",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u00bb",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00bd\6\62",
            "\1\u00bf",
            "\1\u00c0",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u00c2",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00c4",
            "\1\u00c5",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00c7",
            "\1\u00c8",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u00d0",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00d8",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00d9\6\62",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00dc",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u00de",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u00e1",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | HASHTAG | EEQUAL | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | CREATE | DESTROY | MOVE_T | MOVE | MODIFY_T | MODIFY | RGBPRCTJ | RGB | COLOR | WHITE | BLACK | BLUE | RED | GREEN | POSX | POSY | CIRCLE | RECTANGLE | TEXT | INT | ID | COMMENT | STRING | WS );";
        }
    }
 

}