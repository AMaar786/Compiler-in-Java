// $ANTLR 3.5.2 D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g 2015-06-08 15:59:01

  package compiler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class g1Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CONSTANT", "DATATYPE", "VARIABLE", 
		"WS", "';'", "'='"
	};
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int CONSTANT=4;
	public static final int DATATYPE=5;
	public static final int VARIABLE=6;
	public static final int WS=7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public g1Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public g1Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return g1Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g"; }



	// $ANTLR start "declstmt"
	// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:15:2: declstmt : ( declaration )+ ;
	public final void declstmt() throws RecognitionException {
		try {
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:15:11: ( ( declaration )+ )
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:15:14: ( declaration )+
			{
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:15:14: ( declaration )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==DATATYPE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:15:14: declaration
					{
					pushFollow(FOLLOW_declaration_in_declstmt41);
					declaration();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declstmt"



	// $ANTLR start "declaration"
	// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:16:2: declaration : DATATYPE VARIABLE '=' CONSTANT ';' ;
	public final void declaration() throws RecognitionException {
		try {
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:16:14: ( DATATYPE VARIABLE '=' CONSTANT ';' )
			// D:\\ComPiLeRZzZ\\Eclipse\\JavaWorkSpace\\Compiler\\src\\compiler\\g1.g:16:17: DATATYPE VARIABLE '=' CONSTANT ';'
			{
			match(input,DATATYPE,FOLLOW_DATATYPE_in_declaration51); 
			match(input,VARIABLE,FOLLOW_VARIABLE_in_declaration53); 
			match(input,9,FOLLOW_9_in_declaration55); 
			match(input,CONSTANT,FOLLOW_CONSTANT_in_declaration57); 
			match(input,8,FOLLOW_8_in_declaration59); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declaration"

	// Delegated rules



	public static final BitSet FOLLOW_declaration_in_declstmt41 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_DATATYPE_in_declaration51 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_VARIABLE_in_declaration53 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_declaration55 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CONSTANT_in_declaration57 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_declaration59 = new BitSet(new long[]{0x0000000000000002L});
}
