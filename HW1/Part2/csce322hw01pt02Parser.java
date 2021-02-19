// Generated from .\csce322hw01pt02.g4 by ANTLR 4.9.1

    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322hw01pt02Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, SECTIONBEGINNING=2, SECTIONENDING=3, SECTIONTITLE=4, ASSIGNVALUE=5, 
		MOVESYMBOL=6, MAZESYMBOL=7, ROWENDING=8, MAZEBEGINNING=9, MAZEENDING=10, 
		LISTBEGINNING=11, LISTENDING=12, TILDE=13, ANY=14;
	public static final int
		RULE_gravityGame = 0, RULE_begin = 1, RULE_end = 2, RULE_moves = 3, RULE_movelist = 4, 
		RULE_sectionstart = 5, RULE_sectionend = 6, RULE_maze = 7, RULE_row = 8, 
		RULE_finalrow = 9, RULE_rowset = 10, RULE_mazesymbol = 11, RULE_movesymbol = 12, 
		RULE_semanticrules = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"gravityGame", "begin", "end", "moves", "movelist", "sectionstart", "sectionend", 
			"maze", "row", "finalrow", "rowset", "mazesymbol", "movesymbol", "semanticrules"
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
	public String getGrammarFileName() { return "csce322hw01pt02.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public csce322hw01pt02Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class GravityGameContext extends ParserRuleContext {
		public SemanticrulesContext semanticrules() {
			return getRuleContext(SemanticrulesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(csce322hw01pt02Parser.EOF, 0); }
		public MovesContext moves() {
			return getRuleContext(MovesContext.class,0);
		}
		public MazeContext maze() {
			return getRuleContext(MazeContext.class,0);
		}
		public GravityGameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gravityGame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).enterGravityGame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).exitGravityGame(this);
		}
	}

	public final GravityGameContext gravityGame() throws RecognitionException {
		GravityGameContext _localctx = new GravityGameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gravityGame);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				{
				setState(28);
				moves();
				setState(29);
				maze();
				}
				}
				break;
			case 2:
				{
				{
				setState(31);
				maze();
				setState(32);
				moves();
				}
				}
				break;
			}
			setState(36);
			semanticrules();
			setState(37);
			match(EOF);
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

	public static class BeginContext extends ParserRuleContext {
		public TerminalNode SECTIONBEGINNING() { return getToken(csce322hw01pt02Parser.SECTIONBEGINNING, 0); }
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).enterBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).exitBegin(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(SECTIONBEGINNING);
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

	public static class EndContext extends ParserRuleContext {
		public TerminalNode SECTIONTITLE() { return getToken(csce322hw01pt02Parser.SECTIONTITLE, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(SECTIONTITLE);
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

	public static class MovesContext extends ParserRuleContext {
		public SectionstartContext sectionstart() {
			return getRuleContext(SectionstartContext.class,0);
		}
		public TerminalNode LISTBEGINNING() { return getToken(csce322hw01pt02Parser.LISTBEGINNING, 0); }
		public MovelistContext movelist() {
			return getRuleContext(MovelistContext.class,0);
		}
		public SectionendContext sectionend() {
			return getRuleContext(SectionendContext.class,0);
		}
		public MovesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moves; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).enterMoves(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).exitMoves(this);
		}
	}

	public final MovesContext moves() throws RecognitionException {
		MovesContext _localctx = new MovesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_moves);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			sectionstart();
			setState(44);
			match(LISTBEGINNING);
			setState(45);
			movelist();
			setState(46);
			sectionend();
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

	public static class MovelistContext extends ParserRuleContext {
		public List<MovesymbolContext> movesymbol() {
			return getRuleContexts(MovesymbolContext.class);
		}
		public MovesymbolContext movesymbol(int i) {
			return getRuleContext(MovesymbolContext.class,i);
		}
		public List<TerminalNode> TILDE() { return getTokens(csce322hw01pt02Parser.TILDE); }
		public TerminalNode TILDE(int i) {
			return getToken(csce322hw01pt02Parser.TILDE, i);
		}
		public MovelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).enterMovelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).exitMovelist(this);
		}
	}

	public final MovelistContext movelist() throws RecognitionException {
		MovelistContext _localctx = new MovelistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_movelist);
		n = 0;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(48);
					movesymbol();
					setState(49);
					match(TILDE);
					}
					n++;
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(58);
			if (!( n >= 5 )) throw new FailedPredicateException(this, " n >= 5 ");
			setState(59);
			movesymbol();
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

	public static class SectionstartContext extends ParserRuleContext {
		public TerminalNode SECTIONBEGINNING() { return getToken(csce322hw01pt02Parser.SECTIONBEGINNING, 0); }
		public TerminalNode SECTIONTITLE() { return getToken(csce322hw01pt02Parser.SECTIONTITLE, 0); }
		public TerminalNode ASSIGNVALUE() { return getToken(csce322hw01pt02Parser.ASSIGNVALUE, 0); }
		public SectionstartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionstart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).enterSectionstart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).exitSectionstart(this);
		}
	}

	public final SectionstartContext sectionstart() throws RecognitionException {
		SectionstartContext _localctx = new SectionstartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sectionstart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(SECTIONBEGINNING);
			setState(62);
			match(SECTIONTITLE);
			setState(63);
			match(ASSIGNVALUE);
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

	public static class SectionendContext extends ParserRuleContext {
		public TerminalNode SECTIONENDING() { return getToken(csce322hw01pt02Parser.SECTIONENDING, 0); }
		public TerminalNode MAZEENDING() { return getToken(csce322hw01pt02Parser.MAZEENDING, 0); }
		public TerminalNode LISTENDING() { return getToken(csce322hw01pt02Parser.LISTENDING, 0); }
		public SectionendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).enterSectionend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).exitSectionend(this);
		}
	}

	public final SectionendContext sectionend() throws RecognitionException {
		SectionendContext _localctx = new SectionendContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sectionend);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !(_la==MAZEENDING || _la==LISTENDING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(66);
			match(SECTIONENDING);
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

	public static class MazeContext extends ParserRuleContext {
		public SectionstartContext sectionstart() {
			return getRuleContext(SectionstartContext.class,0);
		}
		public TerminalNode MAZEBEGINNING() { return getToken(csce322hw01pt02Parser.MAZEBEGINNING, 0); }
		public RowsetContext rowset() {
			return getRuleContext(RowsetContext.class,0);
		}
		public SectionendContext sectionend() {
			return getRuleContext(SectionendContext.class,0);
		}
		public MazeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maze; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).enterMaze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).exitMaze(this);
		}
	}

	public final MazeContext maze() throws RecognitionException {
		MazeContext _localctx = new MazeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_maze);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			sectionstart();
			setState(69);
			match(MAZEBEGINNING);
			setState(70);
			rowset();
			setState(71);
			sectionend();
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

	public static class RowContext extends ParserRuleContext {
		public MazesymbolContext mazesymbol;
		public TerminalNode ROWENDING() { return getToken(csce322hw01pt02Parser.ROWENDING, 0); }
		public List<MazesymbolContext> mazesymbol() {
			return getRuleContexts(MazesymbolContext.class);
		}
		public MazesymbolContext mazesymbol(int i) {
			return getRuleContext(MazesymbolContext.class,i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).exitRow(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_row);
		n = 0; row = new ArrayList<String>();
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(73);
					((RowContext)_localctx).mazesymbol = mazesymbol();
					n++;
					row.add((((RowContext)_localctx).mazesymbol!=null?_input.getText(((RowContext)_localctx).mazesymbol.start,((RowContext)_localctx).mazesymbol.stop):null));
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(79); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(81);
			if (!(n >= 6)) throw new FailedPredicateException(this, "n >= 6");
			setState(82);
			match(ROWENDING);
			rowset.add(row);
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

	public static class FinalrowContext extends ParserRuleContext {
		public MazesymbolContext mazesymbol;
		public List<MazesymbolContext> mazesymbol() {
			return getRuleContexts(MazesymbolContext.class);
		}
		public MazesymbolContext mazesymbol(int i) {
			return getRuleContext(MazesymbolContext.class,i);
		}
		public FinalrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).enterFinalrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).exitFinalrow(this);
		}
	}

	public final FinalrowContext finalrow() throws RecognitionException {
		FinalrowContext _localctx = new FinalrowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_finalrow);
		n = 0; row = new ArrayList<String>();
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(85);
					((FinalrowContext)_localctx).mazesymbol = mazesymbol();
					n++;
					row.add((((FinalrowContext)_localctx).mazesymbol!=null?_input.getText(((FinalrowContext)_localctx).mazesymbol.start,((FinalrowContext)_localctx).mazesymbol.stop):null));
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(91); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			rowset.add(row);
			setState(94);
			if (!(n >= 6)) throw new FailedPredicateException(this, "n >= 6");
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

	public static class RowsetContext extends ParserRuleContext {
		public FinalrowContext finalrow() {
			return getRuleContext(FinalrowContext.class,0);
		}
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public RowsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).enterRowset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).exitRowset(this);
		}
	}

	public final RowsetContext rowset() throws RecognitionException {
		RowsetContext _localctx = new RowsetContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rowset);
		k = 0;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(96);
					row();
					k++;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(101); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(103);
			finalrow();
			setState(104);
			if (!(k >= 5)) throw new FailedPredicateException(this, "k >= 5");
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

	public static class MazesymbolContext extends ParserRuleContext {
		public Token MAZESYMBOL;
		public TerminalNode MAZESYMBOL() { return getToken(csce322hw01pt02Parser.MAZESYMBOL, 0); }
		public MazesymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mazesymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).enterMazesymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).exitMazesymbol(this);
		}
	}

	public final MazesymbolContext mazesymbol() throws RecognitionException {
		MazesymbolContext _localctx = new MazesymbolContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mazesymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			((MazesymbolContext)_localctx).MAZESYMBOL = match(MAZESYMBOL);
			total_maze_symbols++;
				if ((((MazesymbolContext)_localctx).MAZESYMBOL!=null?((MazesymbolContext)_localctx).MAZESYMBOL.getText():null).equals("x")) {
					number_of_x++;
				}
				if ((((MazesymbolContext)_localctx).MAZESYMBOL!=null?((MazesymbolContext)_localctx).MAZESYMBOL.getText():null).equals("g")) {
					number_of_g++;
					}
				if (!(((MazesymbolContext)_localctx).MAZESYMBOL!=null?((MazesymbolContext)_localctx).MAZESYMBOL.getText():null).equals("x") && !(((MazesymbolContext)_localctx).MAZESYMBOL!=null?((MazesymbolContext)_localctx).MAZESYMBOL.getText():null).equals("g") && !(((MazesymbolContext)_localctx).MAZESYMBOL!=null?((MazesymbolContext)_localctx).MAZESYMBOL.getText():null).equals("-")) {
					number_of_players++;
				}
				
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

	public static class MovesymbolContext extends ParserRuleContext {
		public Token MOVESYMBOL;
		public TerminalNode MOVESYMBOL() { return getToken(csce322hw01pt02Parser.MOVESYMBOL, 0); }
		public MovesymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movesymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).enterMovesymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).exitMovesymbol(this);
		}
	}

	public final MovesymbolContext movesymbol() throws RecognitionException {
		MovesymbolContext _localctx = new MovesymbolContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_movesymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			((MovesymbolContext)_localctx).MOVESYMBOL = match(MOVESYMBOL);
			total_maze_symbols++;
				if ((((MovesymbolContext)_localctx).MOVESYMBOL!=null?((MovesymbolContext)_localctx).MOVESYMBOL.getText():null).equals("c")) {
					cPresent = true;
				}
				if ((((MovesymbolContext)_localctx).MOVESYMBOL!=null?((MovesymbolContext)_localctx).MOVESYMBOL.getText():null).equals("cc")) {
					ccPresent = true;
					}
				if ((((MovesymbolContext)_localctx).MOVESYMBOL!=null?((MovesymbolContext)_localctx).MOVESYMBOL.getText():null).equals("180")) {
					oneeightyPresent = true;
				}
				
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

	public static class SemanticrulesContext extends ParserRuleContext {
		public SemanticrulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semanticrules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).enterSemanticrules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322hw01pt02Listener ) ((csce322hw01pt02Listener)listener).exitSemanticrules(this);
		}
	}

	public final SemanticrulesContext semanticrules() throws RecognitionException {
		SemanticrulesContext _localctx = new SemanticrulesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_semanticrules);
		try {
			enterOuterAlt(_localctx, 1);
			{

				for (int i = 0; i < rowset.size(); i++) {
					for (int j = 0; j < rowset.get(i).size(); j++) {
						if (rowset.get(i).get(j).equals("g")) {
							g_i_pos = i;
							g_j_pos = j;
						}
					}
				}
				
				if (number_of_players < 1 | number_of_players > 4) {
					System.out.println("The semantic rule 1 was violated.");
					semantic_violated = true;
				}
				
				if (number_of_g != 1) {
					System.out.println("The semantic rule 2 was violated.");
					semantic_violated = true;
				}
				
				if ((number_of_x / total_maze_symbols) > .6 ) {
					System.out.println("The semantic rule 3 was violated.");
					semantic_violated = true;
				}
				
				if (!cPresent | !ccPresent | !oneeightyPresent) {
					System.out.println("The semantic rule 4 was violated.");
					semantic_violated = true;
				}
				
				if (rowset.get(g_i_pos+1).get(g_j_pos).equals("x") |
					rowset.get(g_i_pos-1).get(g_j_pos).equals("x") |
					rowset.get(g_i_pos).get(g_j_pos+1).equals("x") |
					rowset.get(g_i_pos).get(g_j_pos-1).equals("x")) {
					System.out.println("The semantic rule 5 was violated.");
				}
				
				if (!semantic_violated) {
					System.out.println("This game has " + number_of_players + " players.");
				}

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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return movelist_sempred((MovelistContext)_localctx, predIndex);
		case 8:
			return row_sempred((RowContext)_localctx, predIndex);
		case 9:
			return finalrow_sempred((FinalrowContext)_localctx, predIndex);
		case 10:
			return rowset_sempred((RowsetContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean movelist_sempred(MovelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  n >= 5 ;
		}
		return true;
	}
	private boolean row_sempred(RowContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return n >= 6;
		}
		return true;
	}
	private boolean finalrow_sempred(FinalrowContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return n >= 6;
		}
		return true;
	}
	private boolean rowset_sempred(RowsetContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return k >= 5;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20u\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\5\2%\n\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6"+
		"8\n\6\f\6\16\6;\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\6\nP\n\n\r\n\16\nQ\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\6\13\\\n\13\r\13\16\13]\3\13\3\13\3\13\3\f\3\f\3\f\6\ff\n\f"+
		"\r\f\16\fg\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\2\2\20"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\4\2\f\f\16\16\2k\2$\3\2\2\2\4"+
		")\3\2\2\2\6+\3\2\2\2\b-\3\2\2\2\n9\3\2\2\2\f?\3\2\2\2\16C\3\2\2\2\20F"+
		"\3\2\2\2\22O\3\2\2\2\24[\3\2\2\2\26e\3\2\2\2\30l\3\2\2\2\32o\3\2\2\2\34"+
		"r\3\2\2\2\36\37\5\b\5\2\37 \5\20\t\2 %\3\2\2\2!\"\5\20\t\2\"#\5\b\5\2"+
		"#%\3\2\2\2$\36\3\2\2\2$!\3\2\2\2%&\3\2\2\2&\'\5\34\17\2\'(\7\2\2\3(\3"+
		"\3\2\2\2)*\7\4\2\2*\5\3\2\2\2+,\7\6\2\2,\7\3\2\2\2-.\5\f\7\2./\7\r\2\2"+
		"/\60\5\n\6\2\60\61\5\16\b\2\61\t\3\2\2\2\62\63\5\32\16\2\63\64\7\17\2"+
		"\2\64\65\3\2\2\2\65\66\b\6\1\2\668\3\2\2\2\67\62\3\2\2\28;\3\2\2\29\67"+
		"\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\6\6\2\2=>\5\32\16\2>\13\3\2\2"+
		"\2?@\7\4\2\2@A\7\6\2\2AB\7\7\2\2B\r\3\2\2\2CD\t\2\2\2DE\7\5\2\2E\17\3"+
		"\2\2\2FG\5\f\7\2GH\7\13\2\2HI\5\26\f\2IJ\5\16\b\2J\21\3\2\2\2KL\5\30\r"+
		"\2LM\b\n\1\2MN\b\n\1\2NP\3\2\2\2OK\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2"+
		"\2RS\3\2\2\2ST\6\n\3\2TU\7\n\2\2UV\b\n\1\2V\23\3\2\2\2WX\5\30\r\2XY\b"+
		"\13\1\2YZ\b\13\1\2Z\\\3\2\2\2[W\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2"+
		"^_\3\2\2\2_`\b\13\1\2`a\6\13\4\2a\25\3\2\2\2bc\5\22\n\2cd\b\f\1\2df\3"+
		"\2\2\2eb\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\5\24\13\2j"+
		"k\6\f\5\2k\27\3\2\2\2lm\7\t\2\2mn\b\r\1\2n\31\3\2\2\2op\7\b\2\2pq\b\16"+
		"\1\2q\33\3\2\2\2rs\b\17\1\2s\35\3\2\2\2\7$9Q]g";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}