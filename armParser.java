// Generated from arm.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class armParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, REGISTER=9, 
		LABEL=10, INT=11, WS=12, COMMENT=13;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_movInstr = 2, RULE_addInstr = 3, 
		RULE_subInstr = 4, RULE_mulInstr = 5, RULE_cmpInstr = 6, RULE_bInstr = 7, 
		RULE_operand = 8, RULE_immediate = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruction", "movInstr", "addInstr", "subInstr", "mulInstr", 
			"cmpInstr", "bInstr", "operand", "immediate"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'MOV'", "','", "'ADD'", "'SUB'", "'MUL'", "'CMP'", "'B'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "REGISTER", "LABEL", 
			"INT", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "arm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public armParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(armParser.EOF, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) {
				{
				{
				setState(20);
				instruction();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
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

	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MovInstructionContext extends InstructionContext {
		public MovInstrContext movInstr() {
			return getRuleContext(MovInstrContext.class,0);
		}
		public MovInstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).enterMovInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).exitMovInstruction(this);
		}
	}
	public static class SubInstructionContext extends InstructionContext {
		public SubInstrContext subInstr() {
			return getRuleContext(SubInstrContext.class,0);
		}
		public SubInstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).enterSubInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).exitSubInstruction(this);
		}
	}
	public static class MulInstructionContext extends InstructionContext {
		public MulInstrContext mulInstr() {
			return getRuleContext(MulInstrContext.class,0);
		}
		public MulInstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).enterMulInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).exitMulInstruction(this);
		}
	}
	public static class CompareInstructionContext extends InstructionContext {
		public CmpInstrContext cmpInstr() {
			return getRuleContext(CmpInstrContext.class,0);
		}
		public CompareInstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).enterCompareInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).exitCompareInstruction(this);
		}
	}
	public static class BranchInstructionContext extends InstructionContext {
		public BInstrContext bInstr() {
			return getRuleContext(BInstrContext.class,0);
		}
		public BranchInstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).enterBranchInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).exitBranchInstruction(this);
		}
	}
	public static class AddInstructionContext extends InstructionContext {
		public AddInstrContext addInstr() {
			return getRuleContext(AddInstrContext.class,0);
		}
		public AddInstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).enterAddInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).exitAddInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new MovInstructionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				movInstr();
				}
				break;
			case T__2:
				_localctx = new AddInstructionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				addInstr();
				}
				break;
			case T__3:
				_localctx = new SubInstructionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				subInstr();
				}
				break;
			case T__4:
				_localctx = new MulInstructionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				mulInstr();
				}
				break;
			case T__5:
				_localctx = new CompareInstructionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
				cmpInstr();
				}
				break;
			case T__6:
				_localctx = new BranchInstructionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(33);
				bInstr();
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

	public static class MovInstrContext extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(armParser.REGISTER, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public MovInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).enterMovInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).exitMovInstr(this);
		}
	}

	public final MovInstrContext movInstr() throws RecognitionException {
		MovInstrContext _localctx = new MovInstrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_movInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			match(REGISTER);
			setState(38);
			match(T__1);
			setState(39);
			operand();
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

	public static class AddInstrContext extends ParserRuleContext {
		public List<TerminalNode> REGISTER() { return getTokens(armParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(armParser.REGISTER, i);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public AddInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).enterAddInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).exitAddInstr(this);
		}
	}

	public final AddInstrContext addInstr() throws RecognitionException {
		AddInstrContext _localctx = new AddInstrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_addInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__2);
			setState(42);
			match(REGISTER);
			setState(43);
			match(T__1);
			setState(44);
			match(REGISTER);
			setState(45);
			match(T__1);
			setState(46);
			operand();
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

	public static class SubInstrContext extends ParserRuleContext {
		public List<TerminalNode> REGISTER() { return getTokens(armParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(armParser.REGISTER, i);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public SubInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).enterSubInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).exitSubInstr(this);
		}
	}

	public final SubInstrContext subInstr() throws RecognitionException {
		SubInstrContext _localctx = new SubInstrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__3);
			setState(49);
			match(REGISTER);
			setState(50);
			match(T__1);
			setState(51);
			match(REGISTER);
			setState(52);
			match(T__1);
			setState(53);
			operand();
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

	public static class MulInstrContext extends ParserRuleContext {
		public List<TerminalNode> REGISTER() { return getTokens(armParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(armParser.REGISTER, i);
		}
		public MulInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).enterMulInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).exitMulInstr(this);
		}
	}

	public final MulInstrContext mulInstr() throws RecognitionException {
		MulInstrContext _localctx = new MulInstrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mulInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__4);
			setState(56);
			match(REGISTER);
			setState(57);
			match(T__1);
			setState(58);
			match(REGISTER);
			setState(59);
			match(T__1);
			setState(60);
			match(REGISTER);
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

	public static class CmpInstrContext extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(armParser.REGISTER, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public CmpInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmpInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).enterCmpInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).exitCmpInstr(this);
		}
	}

	public final CmpInstrContext cmpInstr() throws RecognitionException {
		CmpInstrContext _localctx = new CmpInstrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmpInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__5);
			setState(63);
			match(REGISTER);
			setState(64);
			match(T__1);
			setState(65);
			operand();
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

	public static class BInstrContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(armParser.LABEL, 0); }
		public BInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).enterBInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).exitBInstr(this);
		}
	}

	public final BInstrContext bInstr() throws RecognitionException {
		BInstrContext _localctx = new BInstrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bInstr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__6);
			setState(68);
			match(LABEL);
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

	public static class OperandContext extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(armParser.REGISTER, 0); }
		public ImmediateContext immediate() {
			return getRuleContext(ImmediateContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operand);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(REGISTER);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				immediate();
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

	public static class ImmediateContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(armParser.INT, 0); }
		public ImmediateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immediate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).enterImmediate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof armListener ) ((armListener)listener).exitImmediate(this);
		}
	}

	public final ImmediateContext immediate() throws RecognitionException {
		ImmediateContext _localctx = new ImmediateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_immediate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__7);
			setState(75);
			match(INT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17P\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3%\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\5\nK\n\n\3\13\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2"+
		"\2L\2\31\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b+\3\2\2\2\n\62\3\2\2\2\f9\3\2"+
		"\2\2\16@\3\2\2\2\20E\3\2\2\2\22J\3\2\2\2\24L\3\2\2\2\26\30\5\4\3\2\27"+
		"\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33"+
		"\31\3\2\2\2\34\35\7\2\2\3\35\3\3\2\2\2\36%\5\6\4\2\37%\5\b\5\2 %\5\n\6"+
		"\2!%\5\f\7\2\"%\5\16\b\2#%\5\20\t\2$\36\3\2\2\2$\37\3\2\2\2$ \3\2\2\2"+
		"$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%\5\3\2\2\2&\'\7\3\2\2\'(\7\13\2\2()\7"+
		"\4\2\2)*\5\22\n\2*\7\3\2\2\2+,\7\5\2\2,-\7\13\2\2-.\7\4\2\2./\7\13\2\2"+
		"/\60\7\4\2\2\60\61\5\22\n\2\61\t\3\2\2\2\62\63\7\6\2\2\63\64\7\13\2\2"+
		"\64\65\7\4\2\2\65\66\7\13\2\2\66\67\7\4\2\2\678\5\22\n\28\13\3\2\2\29"+
		":\7\7\2\2:;\7\13\2\2;<\7\4\2\2<=\7\13\2\2=>\7\4\2\2>?\7\13\2\2?\r\3\2"+
		"\2\2@A\7\b\2\2AB\7\13\2\2BC\7\4\2\2CD\5\22\n\2D\17\3\2\2\2EF\7\t\2\2F"+
		"G\7\f\2\2G\21\3\2\2\2HK\7\13\2\2IK\5\24\13\2JH\3\2\2\2JI\3\2\2\2K\23\3"+
		"\2\2\2LM\7\n\2\2MN\7\r\2\2N\25\3\2\2\2\5\31$J";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}