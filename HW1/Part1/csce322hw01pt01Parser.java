// Generated from .\csce322hw01pt01.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322hw01pt01Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, SECTIONBEGINNING=2, SECTIONENDING=3, SECTIONTITLE=4, ASSIGNVALUE=5, 
		MOVESYMBOL=6, MAZESYMBOL=7, ROWENDING=8, MAZEBEGINNING=9, MAZEENDING=10, 
		LISTBEGINNING=11, LISTENDING=12, TILDE=13, ANY=14;
	public static final int
		RULE_gravityGame = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"gravityGame"
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

	@Override
	public String getGrammarFileName() { return "csce322hw01pt01.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public csce322hw01pt01Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class GravityGameContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(csce322hw01pt01Parser.EOF, 0); }
		public GravityGameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gravityGame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt01Listener ) ((csce322hw01pt01Listener)listener).enterGravityGame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt01Listener ) ((csce322hw01pt01Listener)listener).exitGravityGame(this);
		}
	}

	public final GravityGameContext gravityGame() throws RecognitionException {
		GravityGameContext _localctx = new GravityGameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gravityGame);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << SECTIONBEGINNING) | (1L << SECTIONENDING) | (1L << SECTIONTITLE) | (1L << ASSIGNVALUE) | (1L << MOVESYMBOL) | (1L << MAZESYMBOL) | (1L << ROWENDING) | (1L << MAZEBEGINNING) | (1L << MAZEENDING) | (1L << LISTBEGINNING) | (1L << LISTENDING) | (1L << TILDE) | (1L << ANY))) != 0)) {
				{
				{
				setState(2);
				matchWildcard();
				}
				}
				setState(7);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(8);
			match(EOF);
			System.out.println( "Close of File"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\16\4\2\t\2\3\2"+
		"\7\2\6\n\2\f\2\16\2\t\13\2\3\2\3\2\3\2\3\2\2\2\3\2\2\2\2\r\2\7\3\2\2\2"+
		"\4\6\13\2\2\2\5\4\3\2\2\2\6\t\3\2\2\2\7\5\3\2\2\2\7\b\3\2\2\2\b\n\3\2"+
		"\2\2\t\7\3\2\2\2\n\13\7\2\2\3\13\f\b\2\1\2\f\3\3\2\2\2\3\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}