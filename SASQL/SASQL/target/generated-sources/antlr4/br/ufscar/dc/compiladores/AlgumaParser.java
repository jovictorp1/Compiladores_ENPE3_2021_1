// Generated from br/ufscar/dc/compiladores/Alguma.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores;

import br.ufscar.dc.compiladores.alguma.sintatico.Arquivo;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgumaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, DATE=8, PROCSQL=9, 
		QUIT=10, CREATETABLE=11, SELECT=12, PV=13, FORMAT=14, OPERADOR=15, INT=16, 
		REAL=17, VARCHAR=18, ERROR_VARCHAR=19, BOOLEAN=20, DATE9=21, MES=22, AS=23, 
		FROM=24, WHERE=25, AND=26, INSERT=27, DROPTABLE=28, ABREPARCH=29, FECHAPARCH=30, 
		DELETE=31, EXPORT=32, VALUES=33, FILEPATH=34, FILETYPE=35, FILENAME=36, 
		IDENT=37, COMENTARIO=38, WS=39;
	public static final int
		RULE_type_file = 0, RULE_program = 1, RULE_query = 2, RULE_cmd = 3, RULE_cmd_create = 4, 
		RULE_def_column = 5, RULE_length = 6, RULE_cmd_select = 7, RULE_cmd_where = 8, 
		RULE_cmd_insert = 9, RULE_cmd_drop = 10, RULE_cmd_delete = 11, RULE_cmd_export = 12, 
		RULE_val_input = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"type_file", "program", "query", "cmd", "cmd_create", "def_column", "length", 
			"cmd_select", "cmd_where", "cmd_insert", "cmd_drop", "cmd_delete", "cmd_export", 
			"val_input"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'XLSX'", "'CSV'", "'TXT'", "'PROC SQL;'", "'QUIT;'", "':'", "','", 
			null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "DATE", "PROCSQL", "QUIT", 
			"CREATETABLE", "SELECT", "PV", "FORMAT", "OPERADOR", "INT", "REAL", "VARCHAR", 
			"ERROR_VARCHAR", "BOOLEAN", "DATE9", "MES", "AS", "FROM", "WHERE", "AND", 
			"INSERT", "DROPTABLE", "ABREPARCH", "FECHAPARCH", "DELETE", "EXPORT", 
			"VALUES", "FILEPATH", "FILETYPE", "FILENAME", "IDENT", "COMENTARIO", 
			"WS"
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
	public String getGrammarFileName() { return "Alguma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlgumaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Type_fileContext extends ParserRuleContext {
		public Type_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterType_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitType_file(this);
		}
	}

	public final Type_fileContext type_file() throws RecognitionException {
		Type_fileContext _localctx = new Type_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ProgramContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__3);
			setState(31);
			query();
			setState(32);
			match(T__4);
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

	public static class QueryContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATETABLE) | (1L << SELECT) | (1L << INSERT) | (1L << DROPTABLE) | (1L << DELETE) | (1L << EXPORT))) != 0)) {
				{
				{
				setState(34);
				cmd();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CmdContext extends ParserRuleContext {
		public Cmd_createContext cmd_create() {
			return getRuleContext(Cmd_createContext.class,0);
		}
		public Cmd_selectContext cmd_select() {
			return getRuleContext(Cmd_selectContext.class,0);
		}
		public Cmd_insertContext cmd_insert() {
			return getRuleContext(Cmd_insertContext.class,0);
		}
		public Cmd_dropContext cmd_drop() {
			return getRuleContext(Cmd_dropContext.class,0);
		}
		public Cmd_deleteContext cmd_delete() {
			return getRuleContext(Cmd_deleteContext.class,0);
		}
		public Cmd_exportContext cmd_export() {
			return getRuleContext(Cmd_exportContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmd);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATETABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				cmd_create();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				cmd_select();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				cmd_insert();
				}
				break;
			case DROPTABLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				cmd_drop();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				cmd_delete();
				}
				break;
			case EXPORT:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				cmd_export();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Cmd_createContext extends ParserRuleContext {
		public TerminalNode CREATETABLE() { return getToken(AlgumaParser.CREATETABLE, 0); }
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public TerminalNode AS() { return getToken(AlgumaParser.AS, 0); }
		public List<Def_columnContext> def_column() {
			return getRuleContexts(Def_columnContext.class);
		}
		public Def_columnContext def_column(int i) {
			return getRuleContext(Def_columnContext.class,i);
		}
		public List<TerminalNode> PV() { return getTokens(AlgumaParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(AlgumaParser.PV, i);
		}
		public Cmd_createContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmd_create(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmd_create(this);
		}
	}

	public final Cmd_createContext cmd_create() throws RecognitionException {
		Cmd_createContext _localctx = new Cmd_createContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmd_create);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(CREATETABLE);
			setState(49);
			match(IDENT);
			setState(50);
			match(AS);
			setState(51);
			def_column();
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					match(PV);
					setState(53);
					def_column();
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(59);
			match(PV);
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

	public static class Def_columnContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public TerminalNode FORMAT() { return getToken(AlgumaParser.FORMAT, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public Def_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDef_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDef_column(this);
		}
	}

	public final Def_columnContext def_column() throws RecognitionException {
		Def_columnContext _localctx = new Def_columnContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_def_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(IDENT);
			setState(62);
			match(T__5);
			setState(63);
			match(FORMAT);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABREPARCH) {
				{
				setState(64);
				length();
				}
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

	public static class LengthContext extends ParserRuleContext {
		public TerminalNode ABREPARCH() { return getToken(AlgumaParser.ABREPARCH, 0); }
		public TerminalNode INT() { return getToken(AlgumaParser.INT, 0); }
		public TerminalNode FECHAPARCH() { return getToken(AlgumaParser.FECHAPARCH, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitLength(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(ABREPARCH);
			setState(68);
			match(INT);
			setState(69);
			match(FECHAPARCH);
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

	public static class Cmd_selectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(AlgumaParser.SELECT, 0); }
		public List<TerminalNode> IDENT() { return getTokens(AlgumaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(AlgumaParser.IDENT, i);
		}
		public TerminalNode FROM() { return getToken(AlgumaParser.FROM, 0); }
		public TerminalNode PV() { return getToken(AlgumaParser.PV, 0); }
		public Cmd_whereContext cmd_where() {
			return getRuleContext(Cmd_whereContext.class,0);
		}
		public Cmd_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmd_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmd_select(this);
		}
	}

	public final Cmd_selectContext cmd_select() throws RecognitionException {
		Cmd_selectContext _localctx = new Cmd_selectContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmd_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(SELECT);
			setState(72);
			match(IDENT);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(73);
				match(T__6);
				setState(74);
				match(IDENT);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(FROM);
			setState(81);
			match(IDENT);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(82);
				cmd_where();
				}
			}

			setState(85);
			match(PV);
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

	public static class Cmd_whereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(AlgumaParser.WHERE, 0); }
		public List<TerminalNode> IDENT() { return getTokens(AlgumaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(AlgumaParser.IDENT, i);
		}
		public List<TerminalNode> OPERADOR() { return getTokens(AlgumaParser.OPERADOR); }
		public TerminalNode OPERADOR(int i) {
			return getToken(AlgumaParser.OPERADOR, i);
		}
		public List<Val_inputContext> val_input() {
			return getRuleContexts(Val_inputContext.class);
		}
		public Val_inputContext val_input(int i) {
			return getRuleContext(Val_inputContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(AlgumaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(AlgumaParser.AND, i);
		}
		public Cmd_whereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmd_where(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmd_where(this);
		}
	}

	public final Cmd_whereContext cmd_where() throws RecognitionException {
		Cmd_whereContext _localctx = new Cmd_whereContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmd_where);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(WHERE);
			setState(88);
			match(IDENT);
			setState(89);
			match(OPERADOR);
			setState(90);
			val_input();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(91);
				match(AND);
				setState(92);
				match(IDENT);
				setState(93);
				match(OPERADOR);
				setState(94);
				val_input();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Cmd_insertContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(AlgumaParser.INSERT, 0); }
		public List<TerminalNode> IDENT() { return getTokens(AlgumaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(AlgumaParser.IDENT, i);
		}
		public List<TerminalNode> ABREPARCH() { return getTokens(AlgumaParser.ABREPARCH); }
		public TerminalNode ABREPARCH(int i) {
			return getToken(AlgumaParser.ABREPARCH, i);
		}
		public List<TerminalNode> FECHAPARCH() { return getTokens(AlgumaParser.FECHAPARCH); }
		public TerminalNode FECHAPARCH(int i) {
			return getToken(AlgumaParser.FECHAPARCH, i);
		}
		public TerminalNode VALUES() { return getToken(AlgumaParser.VALUES, 0); }
		public List<Val_inputContext> val_input() {
			return getRuleContexts(Val_inputContext.class);
		}
		public Val_inputContext val_input(int i) {
			return getRuleContext(Val_inputContext.class,i);
		}
		public TerminalNode PV() { return getToken(AlgumaParser.PV, 0); }
		public Cmd_whereContext cmd_where() {
			return getRuleContext(Cmd_whereContext.class,0);
		}
		public Cmd_insertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmd_insert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmd_insert(this);
		}
	}

	public final Cmd_insertContext cmd_insert() throws RecognitionException {
		Cmd_insertContext _localctx = new Cmd_insertContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmd_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(INSERT);
			setState(101);
			match(IDENT);
			setState(102);
			match(ABREPARCH);
			setState(103);
			match(IDENT);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(104);
				match(T__6);
				setState(105);
				match(IDENT);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(FECHAPARCH);
			setState(112);
			match(VALUES);
			setState(113);
			match(ABREPARCH);
			setState(114);
			val_input();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(115);
				match(T__6);
				setState(116);
				val_input();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(FECHAPARCH);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(123);
				cmd_where();
				}
			}

			setState(126);
			match(PV);
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

	public static class Cmd_dropContext extends ParserRuleContext {
		public TerminalNode DROPTABLE() { return getToken(AlgumaParser.DROPTABLE, 0); }
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public TerminalNode PV() { return getToken(AlgumaParser.PV, 0); }
		public Cmd_dropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_drop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmd_drop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmd_drop(this);
		}
	}

	public final Cmd_dropContext cmd_drop() throws RecognitionException {
		Cmd_dropContext _localctx = new Cmd_dropContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmd_drop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(DROPTABLE);
			setState(129);
			match(IDENT);
			setState(130);
			match(PV);
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

	public static class Cmd_deleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(AlgumaParser.DELETE, 0); }
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public Cmd_whereContext cmd_where() {
			return getRuleContext(Cmd_whereContext.class,0);
		}
		public TerminalNode PV() { return getToken(AlgumaParser.PV, 0); }
		public Cmd_deleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmd_delete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmd_delete(this);
		}
	}

	public final Cmd_deleteContext cmd_delete() throws RecognitionException {
		Cmd_deleteContext _localctx = new Cmd_deleteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmd_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(DELETE);
			setState(133);
			match(IDENT);
			setState(134);
			cmd_where();
			setState(135);
			match(PV);
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

	public static class Cmd_exportContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(AlgumaParser.EXPORT, 0); }
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public List<TerminalNode> PV() { return getTokens(AlgumaParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(AlgumaParser.PV, i);
		}
		public TerminalNode FILEPATH() { return getToken(AlgumaParser.FILEPATH, 0); }
		public List<Val_inputContext> val_input() {
			return getRuleContexts(Val_inputContext.class);
		}
		public Val_inputContext val_input(int i) {
			return getRuleContext(Val_inputContext.class,i);
		}
		public TerminalNode FILENAME() { return getToken(AlgumaParser.FILENAME, 0); }
		public TerminalNode FILETYPE() { return getToken(AlgumaParser.FILETYPE, 0); }
		public Type_fileContext type_file() {
			return getRuleContext(Type_fileContext.class,0);
		}
		public Cmd_exportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_export; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmd_export(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmd_export(this);
		}
	}

	public final Cmd_exportContext cmd_export() throws RecognitionException {
		Cmd_exportContext _localctx = new Cmd_exportContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmd_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(EXPORT);
			setState(138);
			match(IDENT);
			setState(139);
			match(PV);
			setState(140);
			match(FILEPATH);
			setState(141);
			val_input();
			setState(142);
			match(PV);
			setState(143);
			match(FILENAME);
			setState(144);
			val_input();
			setState(145);
			match(PV);
			setState(146);
			match(FILETYPE);
			setState(147);
			type_file();
			setState(148);
			match(PV);
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

	public static class Val_inputContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AlgumaParser.INT, 0); }
		public TerminalNode REAL() { return getToken(AlgumaParser.REAL, 0); }
		public TerminalNode VARCHAR() { return getToken(AlgumaParser.VARCHAR, 0); }
		public TerminalNode DATE9() { return getToken(AlgumaParser.DATE9, 0); }
		public TerminalNode BOOLEAN() { return getToken(AlgumaParser.BOOLEAN, 0); }
		public Val_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterVal_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitVal_input(this);
		}
	}

	public final Val_inputContext val_input() throws RecognitionException {
		Val_inputContext _localctx = new Val_inputContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_val_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << REAL) | (1L << VARCHAR) | (1L << BOOLEAN) | (1L << DATE9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u009b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\3\3\4\7"+
		"\4&\n\4\f\4\16\4)\13\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\61\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\69\n\6\f\6\16\6<\13\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7D\n\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\tN\n\t\f\t\16\tQ\13\t\3\t\3\t\3\t\5"+
		"\tV\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nb\n\n\f\n\16\ne\13"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13m\n\13\f\13\16\13p\13\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13x\n\13\f\13\16\13{\13\13\3\13\3\13\5\13\177\n"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\2\2\20\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\2\4\3\2\3\5\4\2\22\24\26\27\2\u009a"+
		"\2\36\3\2\2\2\4 \3\2\2\2\6\'\3\2\2\2\b\60\3\2\2\2\n\62\3\2\2\2\f?\3\2"+
		"\2\2\16E\3\2\2\2\20I\3\2\2\2\22Y\3\2\2\2\24f\3\2\2\2\26\u0082\3\2\2\2"+
		"\30\u0086\3\2\2\2\32\u008b\3\2\2\2\34\u0098\3\2\2\2\36\37\t\2\2\2\37\3"+
		"\3\2\2\2 !\7\6\2\2!\"\5\6\4\2\"#\7\7\2\2#\5\3\2\2\2$&\5\b\5\2%$\3\2\2"+
		"\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\7\3\2\2\2)\'\3\2\2\2*\61\5\n\6\2+"+
		"\61\5\20\t\2,\61\5\24\13\2-\61\5\26\f\2.\61\5\30\r\2/\61\5\32\16\2\60"+
		"*\3\2\2\2\60+\3\2\2\2\60,\3\2\2\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2"+
		"\61\t\3\2\2\2\62\63\7\r\2\2\63\64\7\'\2\2\64\65\7\31\2\2\65:\5\f\7\2\66"+
		"\67\7\17\2\2\679\5\f\7\28\66\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3"+
		"\2\2\2<:\3\2\2\2=>\7\17\2\2>\13\3\2\2\2?@\7\'\2\2@A\7\b\2\2AC\7\20\2\2"+
		"BD\5\16\b\2CB\3\2\2\2CD\3\2\2\2D\r\3\2\2\2EF\7\37\2\2FG\7\22\2\2GH\7 "+
		"\2\2H\17\3\2\2\2IJ\7\16\2\2JO\7\'\2\2KL\7\t\2\2LN\7\'\2\2MK\3\2\2\2NQ"+
		"\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\32\2\2SU\7\'\2\2"+
		"TV\5\22\n\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\17\2\2X\21\3\2\2\2YZ\7\33"+
		"\2\2Z[\7\'\2\2[\\\7\21\2\2\\c\5\34\17\2]^\7\34\2\2^_\7\'\2\2_`\7\21\2"+
		"\2`b\5\34\17\2a]\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\23\3\2\2\2ec\3"+
		"\2\2\2fg\7\35\2\2gh\7\'\2\2hi\7\37\2\2in\7\'\2\2jk\7\t\2\2km\7\'\2\2l"+
		"j\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7 \2\2r"+
		"s\7#\2\2st\7\37\2\2ty\5\34\17\2uv\7\t\2\2vx\5\34\17\2wu\3\2\2\2x{\3\2"+
		"\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|~\7 \2\2}\177\5\22\n\2~}"+
		"\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7\17\2\2\u0081\25"+
		"\3\2\2\2\u0082\u0083\7\36\2\2\u0083\u0084\7\'\2\2\u0084\u0085\7\17\2\2"+
		"\u0085\27\3\2\2\2\u0086\u0087\7!\2\2\u0087\u0088\7\'\2\2\u0088\u0089\5"+
		"\22\n\2\u0089\u008a\7\17\2\2\u008a\31\3\2\2\2\u008b\u008c\7\"\2\2\u008c"+
		"\u008d\7\'\2\2\u008d\u008e\7\17\2\2\u008e\u008f\7$\2\2\u008f\u0090\5\34"+
		"\17\2\u0090\u0091\7\17\2\2\u0091\u0092\7&\2\2\u0092\u0093\5\34\17\2\u0093"+
		"\u0094\7\17\2\2\u0094\u0095\7%\2\2\u0095\u0096\5\2\2\2\u0096\u0097\7\17"+
		"\2\2\u0097\33\3\2\2\2\u0098\u0099\t\3\2\2\u0099\35\3\2\2\2\f\'\60:COU"+
		"cny~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}