// Generated from .\csce322hw01pt01.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322hw01pt01Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

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


	public csce322hw01pt01Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "csce322hw01pt01.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 1:
			SECTIONBEGINNING_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			SECTIONENDING_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			SECTIONTITLE_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			ASSIGNVALUE_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			MAZESYMBOL_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			ROWENDING_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			MAZEBEGINNING_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			MAZEENDING_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			LISTBEGINNING_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			LISTENDING_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			ANY_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void SECTIONBEGINNING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("Open Section: " + getText());
			break;
		}
	}
	private void SECTIONENDING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("Close Section: " + getText());
			break;
		}
	}
	private void SECTIONTITLE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println("Section Title: " + getText());
			break;
		}
	}
	private void ASSIGNVALUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.println("Designation: " + getText() );
			break;
		}
	}
	private void MAZESYMBOL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			System.out.println("Location: " + getText());
			break;
		}
	}
	private void ROWENDING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			System.out.println("Close Row: " + getText());
			break;
		}
	}
	private void MAZEBEGINNING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			System.out.println("Open Maze: " + getText());
			break;
		}
	}
	private void MAZEENDING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			System.out.println("Close Maze: " + getText());
			break;
		}
	}
	private void LISTBEGINNING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			System.out.println("Open Moves: " + getText());
			break;
		}
	}
	private void LISTENDING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			System.out.println("Close Moves: " + getText());
			break;
		}
	}
	private void ANY_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			System.out.println("The unrecognizable token " + getText()+ " appears in line " + getLine()+".");
					System.exit(0);
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u00c4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2#\n\2\r"+
		"\2\16\2$\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5d\n\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7s\n\7\3\b\3\b\3\t\3\t\6\ty\n\t\r"+
		"\t\16\tz\5\t}\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\2\2\21\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\2\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20\3\2\5\5"+
		"\2\13\f\17\17\"\"\3\2\62;\5\2//iizz\2\u00c8\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\3\"\3\2\2\2\5(\3\2\2\2\7:\3\2\2\2\tc\3\2\2\2\13g\3\2\2\2"+
		"\rr\3\2\2\2\17t\3\2\2\2\21|\3\2\2\2\23\u0080\3\2\2\2\25\u0085\3\2\2\2"+
		"\27\u0094\3\2\2\2\31\u00a1\3\2\2\2\33\u00b1\3\2\2\2\35\u00bf\3\2\2\2\37"+
		"\u00c1\3\2\2\2!#\t\2\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%&\3"+
		"\2\2\2&\'\b\2\2\2\'\4\3\2\2\2()\7^\2\2)*\7d\2\2*+\7g\2\2+,\7i\2\2,-\7"+
		"k\2\2-.\7p\2\2./\7}\2\2/\60\7u\2\2\60\61\7g\2\2\61\62\7e\2\2\62\63\7v"+
		"\2\2\63\64\7k\2\2\64\65\7q\2\2\65\66\7p\2\2\66\67\7\177\2\2\678\3\2\2"+
		"\289\b\3\3\29\6\3\2\2\2:;\7^\2\2;<\7g\2\2<=\7p\2\2=>\7f\2\2>?\7}\2\2?"+
		"@\7u\2\2@A\7g\2\2AB\7e\2\2BC\7v\2\2CD\7k\2\2DE\7q\2\2EF\7p\2\2FG\7\177"+
		"\2\2GH\3\2\2\2HI\b\4\4\2I\b\3\2\2\2JK\7^\2\2KL\7v\2\2LM\7k\2\2MN\7v\2"+
		"\2NO\7n\2\2OP\7g\2\2PQ\7}\2\2QR\7O\2\2RS\7q\2\2ST\7x\2\2TU\7g\2\2UV\7"+
		"u\2\2Vd\7\177\2\2WX\7^\2\2XY\7v\2\2YZ\7k\2\2Z[\7v\2\2[\\\7n\2\2\\]\7g"+
		"\2\2]^\7}\2\2^_\7O\2\2_`\7c\2\2`a\7|\2\2ab\7g\2\2bd\7\177\2\2cJ\3\2\2"+
		"\2cW\3\2\2\2de\3\2\2\2ef\b\5\5\2f\n\3\2\2\2gh\7<\2\2hi\7<\2\2ij\3\2\2"+
		"\2jk\b\6\6\2k\f\3\2\2\2ls\7e\2\2mn\7e\2\2ns\7e\2\2op\7\63\2\2pq\7:\2\2"+
		"qs\7\62\2\2rl\3\2\2\2rm\3\2\2\2ro\3\2\2\2s\16\3\2\2\2tu\t\3\2\2u\20\3"+
		"\2\2\2v}\t\4\2\2wy\5\17\b\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}"+
		"\3\2\2\2|v\3\2\2\2|x\3\2\2\2}~\3\2\2\2~\177\b\t\7\2\177\22\3\2\2\2\u0080"+
		"\u0081\7^\2\2\u0081\u0082\7^\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\n\b"+
		"\2\u0084\24\3\2\2\2\u0085\u0086\7^\2\2\u0086\u0087\7d\2\2\u0087\u0088"+
		"\7g\2\2\u0088\u0089\7i\2\2\u0089\u008a\7k\2\2\u008a\u008b\7p\2\2\u008b"+
		"\u008c\7}\2\2\u008c\u008d\7o\2\2\u008d\u008e\7c\2\2\u008e\u008f\7|\2\2"+
		"\u008f\u0090\7g\2\2\u0090\u0091\7\177\2\2\u0091\u0092\3\2\2\2\u0092\u0093"+
		"\b\13\t\2\u0093\26\3\2\2\2\u0094\u0095\7^\2\2\u0095\u0096\7g\2\2\u0096"+
		"\u0097\7p\2\2\u0097\u0098\7f\2\2\u0098\u0099\7}\2\2\u0099\u009a\7o\2\2"+
		"\u009a\u009b\7c\2\2\u009b\u009c\7|\2\2\u009c\u009d\7g\2\2\u009d\u009e"+
		"\7\177\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\f\n\2\u00a0\30\3\2\2\2\u00a1"+
		"\u00a2\7^\2\2\u00a2\u00a3\7d\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7i\2\2"+
		"\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7}\2\2\u00a8\u00a9"+
		"\7o\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7x\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\u00ad\7u\2\2\u00ad\u00ae\7\177\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b"+
		"\r\13\2\u00b0\32\3\2\2\2\u00b1\u00b2\7^\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4"+
		"\7p\2\2\u00b4\u00b5\7f\2\2\u00b5\u00b6\7}\2\2\u00b6\u00b7\7o\2\2\u00b7"+
		"\u00b8\7q\2\2\u00b8\u00b9\7x\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7u\2\2"+
		"\u00bb\u00bc\7\177\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b\16\f\2\u00be"+
		"\34\3\2\2\2\u00bf\u00c0\7\u0080\2\2\u00c0\36\3\2\2\2\u00c1\u00c2\13\2"+
		"\2\2\u00c2\u00c3\b\20\r\2\u00c3 \3\2\2\2\b\2$crz|\16\b\2\2\3\3\2\3\4\3"+
		"\3\5\4\3\6\5\3\t\6\3\n\7\3\13\b\3\f\t\3\r\n\3\16\13\3\20\f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}