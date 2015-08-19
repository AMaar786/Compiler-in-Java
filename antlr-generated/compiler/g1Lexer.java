// $ANTLR 3.5.2 D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g 2015-06-08 15:59:01

  package compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class g1Lexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int CONSTANT=4;
	public static final int DATATYPE=5;
	public static final int VARIABLE=6;
	public static final int WS=7;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public g1Lexer() {} 
	public g1Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public g1Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g"; }

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:11:6: ( ';' )
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:11:8: ';'
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
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:12:6: ( '=' )
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:12:8: '='
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
	// $ANTLR end "T__9"

	// $ANTLR start "DATATYPE"
	public final void mDATATYPE() throws RecognitionException {
		try {
			int _type = DATATYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:17:10: ( ( 'int' | 'float' ) )
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:17:12: ( 'int' | 'float' )
			{
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:17:12: ( 'int' | 'float' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='i') ) {
				alt1=1;
			}
			else if ( (LA1_0=='f') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:17:13: 'int'
					{
					match("int"); 

					}
					break;
				case 2 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:17:19: 'float'
					{
					match("float"); 

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
	// $ANTLR end "DATATYPE"

	// $ANTLR start "CONSTANT"
	public final void mCONSTANT() throws RecognitionException {
		try {
			int _type = CONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:18:9: ( ( '0' .. '9' ) )
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:
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

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONSTANT"

	// $ANTLR start "VARIABLE"
	public final void mVARIABLE() throws RecognitionException {
		try {
			int _type = VARIABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:19:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:19:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:19:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARIABLE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:21:3: ( ( ' ' )+ )
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:21:5: ( ' ' )+
			{
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:21:5: ( ' ' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:21:5: ' '
					{
					match(' '); 
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
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

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:1:8: ( T__8 | T__9 | DATATYPE | CONSTANT | VARIABLE | WS )
		int alt4=6;
		switch ( input.LA(1) ) {
		case ';':
			{
			alt4=1;
			}
			break;
		case '=':
			{
			alt4=2;
			}
			break;
		case 'i':
			{
			int LA4_3 = input.LA(2);
			if ( (LA4_3=='n') ) {
				int LA4_8 = input.LA(3);
				if ( (LA4_8=='t') ) {
					int LA4_10 = input.LA(4);
					if ( ((LA4_10 >= '0' && LA4_10 <= '9')||(LA4_10 >= 'A' && LA4_10 <= 'Z')||(LA4_10 >= 'a' && LA4_10 <= 'z')) ) {
						alt4=5;
					}

					else {
						alt4=3;
					}

				}

				else {
					alt4=5;
				}

			}

			else {
				alt4=5;
			}

			}
			break;
		case 'f':
			{
			int LA4_4 = input.LA(2);
			if ( (LA4_4=='l') ) {
				int LA4_9 = input.LA(3);
				if ( (LA4_9=='o') ) {
					int LA4_11 = input.LA(4);
					if ( (LA4_11=='a') ) {
						int LA4_13 = input.LA(5);
						if ( (LA4_13=='t') ) {
							int LA4_14 = input.LA(6);
							if ( ((LA4_14 >= '0' && LA4_14 <= '9')||(LA4_14 >= 'A' && LA4_14 <= 'Z')||(LA4_14 >= 'a' && LA4_14 <= 'z')) ) {
								alt4=5;
							}

							else {
								alt4=3;
							}

						}

						else {
							alt4=5;
						}

					}

					else {
						alt4=5;
					}

				}

				else {
					alt4=5;
				}

			}

			else {
				alt4=5;
			}

			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt4=4;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=5;
			}
			break;
		case ' ':
			{
			alt4=6;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:1:10: T__8
				{
				mT__8(); 

				}
				break;
			case 2 :
				// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:1:15: T__9
				{
				mT__9(); 

				}
				break;
			case 3 :
				// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:1:20: DATATYPE
				{
				mDATATYPE(); 

				}
				break;
			case 4 :
				// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:1:29: CONSTANT
				{
				mCONSTANT(); 

				}
				break;
			case 5 :
				// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:1:38: VARIABLE
				{
				mVARIABLE(); 

				}
				break;
			case 6 :
				// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:1:47: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
