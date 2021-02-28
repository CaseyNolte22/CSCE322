// Generated from d:\Programming\CSCE322\HW1\Part2\csce322hw01pt02.g4 by ANTLR 4.8

    import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322hw01pt02Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, SECTIONBEGINNING=2, SECTIONENDING=3, SECTIONTITLE=4, ASSIGNVALUE=5, 
		MOVESYMBOL=6, MAZESYMBOL=7, ROWENDING=8, MAZEBEGINNING=9, MAZEENDING=10, 
		LISTBEGINNING=11, LISTENDING=12, TILDE=13, ANY=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHITESPACE", "SECTIONBEGINNING", "SECTIONENDING", "SECTIONTITLE", "ASSIGNVALUE", 
			"MOVESYMBOL", "NUMERICALSYMBOL", "MAZESYMBOL", "ROWENDING", "MAZEBEGINNING", 
			"MAZEENDING", "LISTBEGINNING", "LISTENDING", "TILDE", "ANY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'\\begin{section}'", "'\\end{section}'", null, "'::'", null, 
			null, "'\\\\'", "'\\begin{maze}'", "'\\end{maze}'", "'\\begin{moves}'", 
			"'\\end{moves}'", "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACE", "SECTIONBEGINNING", "SECTIONENDING", "SECTIONTITLE", 
			"ASSIGNVALUE", "MOVESYMBOL", "MAZESYMBOL", "ROWENDING", "MAZEBEGINNING", 
			"MAZEENDING", "LISTBEGINNING", "LISTENDING", "TILDE", "ANY"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


		int number_of_players = 0;
		int number_of_g = 0; 
		int number_of_x = 0;
		int total_maze_symbols = 0;
		int n = 0;
		int k = 0;
		int g_i_pos = 0;
		int g_j_pos = 0;
		ArrayList<String> row = new ArrayList<String>();
	    ArrayList<ArrayList<String>> rowset = new ArrayList<ArrayList<String>>();
		boolean cPresent = false;
		boolean ccPresent = false;
		boolean oneeightyPresent = false; 
		boolean semantic_violated = false;


	public csce322hw01pt02Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "csce322hw01pt02.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u00af\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2#\n\2\r"+
		"\2\16\2$\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5`\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7k\n\7\3\b\3\b\3\t\3\t\6\tq\n\t\r\t\16\tr\5\tu\n\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\2\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20\3\2\5\5\2\13\f\17\17\""+
		"\"\3\2\62;\5\2//iizz\2\u00b3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3\""+
		"\3\2\2\2\5(\3\2\2\2\78\3\2\2\2\t_\3\2\2\2\13a\3\2\2\2\rj\3\2\2\2\17l\3"+
		"\2\2\2\21t\3\2\2\2\23v\3\2\2\2\25y\3\2\2\2\27\u0086\3\2\2\2\31\u0091\3"+
		"\2\2\2\33\u009f\3\2\2\2\35\u00ab\3\2\2\2\37\u00ad\3\2\2\2!#\t\2\2\2\""+
		"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\b\2\2\2\'\4\3\2"+
		"\2\2()\7^\2\2)*\7d\2\2*+\7g\2\2+,\7i\2\2,-\7k\2\2-.\7p\2\2./\7}\2\2/\60"+
		"\7u\2\2\60\61\7g\2\2\61\62\7e\2\2\62\63\7v\2\2\63\64\7k\2\2\64\65\7q\2"+
		"\2\65\66\7p\2\2\66\67\7\177\2\2\67\6\3\2\2\289\7^\2\29:\7g\2\2:;\7p\2"+
		"\2;<\7f\2\2<=\7}\2\2=>\7u\2\2>?\7g\2\2?@\7e\2\2@A\7v\2\2AB\7k\2\2BC\7"+
		"q\2\2CD\7p\2\2DE\7\177\2\2E\b\3\2\2\2FG\7^\2\2GH\7v\2\2HI\7k\2\2IJ\7v"+
		"\2\2JK\7n\2\2KL\7g\2\2LM\7}\2\2MN\7O\2\2NO\7q\2\2OP\7x\2\2PQ\7g\2\2QR"+
		"\7u\2\2R`\7\177\2\2ST\7^\2\2TU\7v\2\2UV\7k\2\2VW\7v\2\2WX\7n\2\2XY\7g"+
		"\2\2YZ\7}\2\2Z[\7O\2\2[\\\7c\2\2\\]\7|\2\2]^\7g\2\2^`\7\177\2\2_F\3\2"+
		"\2\2_S\3\2\2\2`\n\3\2\2\2ab\7<\2\2bc\7<\2\2c\f\3\2\2\2dk\7e\2\2ef\7e\2"+
		"\2fk\7e\2\2gh\7\63\2\2hi\7:\2\2ik\7\62\2\2jd\3\2\2\2je\3\2\2\2jg\3\2\2"+
		"\2k\16\3\2\2\2lm\t\3\2\2m\20\3\2\2\2nu\t\4\2\2oq\5\17\b\2po\3\2\2\2qr"+
		"\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tn\3\2\2\2tp\3\2\2\2u\22\3\2\2\2"+
		"vw\7^\2\2wx\7^\2\2x\24\3\2\2\2yz\7^\2\2z{\7d\2\2{|\7g\2\2|}\7i\2\2}~\7"+
		"k\2\2~\177\7p\2\2\177\u0080\7}\2\2\u0080\u0081\7o\2\2\u0081\u0082\7c\2"+
		"\2\u0082\u0083\7|\2\2\u0083\u0084\7g\2\2\u0084\u0085\7\177\2\2\u0085\26"+
		"\3\2\2\2\u0086\u0087\7^\2\2\u0087\u0088\7g\2\2\u0088\u0089\7p\2\2\u0089"+
		"\u008a\7f\2\2\u008a\u008b\7}\2\2\u008b\u008c\7o\2\2\u008c\u008d\7c\2\2"+
		"\u008d\u008e\7|\2\2\u008e\u008f\7g\2\2\u008f\u0090\7\177\2\2\u0090\30"+
		"\3\2\2\2\u0091\u0092\7^\2\2\u0092\u0093\7d\2\2\u0093\u0094\7g\2\2\u0094"+
		"\u0095\7i\2\2\u0095\u0096\7k\2\2\u0096\u0097\7p\2\2\u0097\u0098\7}\2\2"+
		"\u0098\u0099\7o\2\2\u0099\u009a\7q\2\2\u009a\u009b\7x\2\2\u009b\u009c"+
		"\7g\2\2\u009c\u009d\7u\2\2\u009d\u009e\7\177\2\2\u009e\32\3\2\2\2\u009f"+
		"\u00a0\7^\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7f\2\2"+
		"\u00a3\u00a4\7}\2\2\u00a4\u00a5\7o\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7"+
		"\7x\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7\177\2\2\u00aa"+
		"\34\3\2\2\2\u00ab\u00ac\7\u0080\2\2\u00ac\36\3\2\2\2\u00ad\u00ae\13\2"+
		"\2\2\u00ae \3\2\2\2\b\2$_jrt\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}