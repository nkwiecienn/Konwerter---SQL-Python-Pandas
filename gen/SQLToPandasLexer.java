// Generated from C:/Users/Oliwier/IdeaProjects/Konwerter---SQL-Python-Pandas/gen/SQLToPandas.g4 by ANTLR 4.13.1

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SQLToPandasLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SELECT=8, FROM=9, 
		WHERE=10, IN=11, BETWEEN=12, LIKE=13, IS_NULL=14, AS=15, JOIN=16, USING=17, 
		AND=18, OR=19, ORDER_BY=20, GROUP_BY=21, INNER=22, LEFT=23, RIGHT=24,
            ASC = 25, DESC = 26, COUNT = 27, SUM = 28, AVG = 29, MAX = 30, MIN = 31, LIMIT = 32, COMMA = 33,
            LPAREN = 34, RPAREN = 35, DOT = 36, NUMERICAL_VALUE = 37, STRING_VALUE = 38, IDENTIFIER = 39,
            WS = 40, SEMICOLON = 41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};
    public static final String[] ruleNames = makeRuleNames();
    public static final String _serializedATN =
            "\u0004\u0000)\u017b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001" +
                    "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004" +
                    "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007" +
                    "\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b" +
                    "\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002" +
                    "\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002" +
                    "\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002" +
                    "\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002" +
                    "\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002" +
                    "\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002" +
                    "\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007" +
                    "!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007" +
                    "&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007" +
                    "+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007" +
                    "0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007" +
                    "5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007" +
                    ":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007" +
                    "?\u0002@\u0007@\u0002A\u0007A\u0001\u0000\u0001\u0000\u0001\u0001\u0001" +
                    "\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001" +
                    "\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001" +
                    "\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001" +
                    "\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001" +
                    "\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010" +
                    "\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013" +
                    "\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016" +
                    "\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019" +
                    "\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c" +
                    "\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f" +
                    "\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001" +
                    "!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001" +
                    "#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001" +
                    "$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0003&\u00ee" +
                    "\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001(" +
                    "\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001" +
                    ")\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001,\u0001,\u0001" +
                    ",\u0001,\u0001,\u0001,\u0003,\u0110\b,\u0001,\u0001,\u0001,\u0001-\u0001" +
                    "-\u0001-\u0001-\u0001-\u0001-\u0003-\u011b\b-\u0001-\u0001-\u0001-\u0001" +
                    ".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001" +
                    "/\u00010\u00010\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u0001" +
                    "1\u00012\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u0001" +
                    "3\u00013\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u0001" +
                    "6\u00016\u00016\u00016\u00017\u00017\u00017\u00017\u00018\u00018\u0001" +
                    "8\u00018\u00018\u00018\u00019\u00019\u0001:\u0001:\u0001;\u0001;\u0001" +
                    "<\u0001<\u0001=\u0004=\u015f\b=\u000b=\f=\u0160\u0001>\u0001>\u0005>\u0165" +
                    "\b>\n>\f>\u0168\t>\u0001>\u0001>\u0001?\u0001?\u0005?\u016e\b?\n?\f?\u0171" +
                    "\t?\u0001@\u0004@\u0174\b@\u000b@\f@\u0175\u0001@\u0001@\u0001A\u0001" +
                    "A\u0000\u0000B\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005" +
                    "\u000b\u0006\r\u0007\u000f\u0000\u0011\u0000\u0013\u0000\u0015\u0000\u0017" +
                    "\u0000\u0019\u0000\u001b\u0000\u001d\u0000\u001f\u0000!\u0000#\u0000%" +
                    "\u0000\'\u0000)\u0000+\u0000-\u0000/\u00001\u00003\u00005\u00007\u0000" +
                    "9\u0000;\u0000=\u0000?\u0000A\bC\tE\nG\u000bI\fK\rM\u000eO\u000fQ\u0010" +
                    "S\u0011U\u0012W\u0013Y\u0014[\u0015]\u0016_\u0017a\u0018c\u0019e\u001a" +
                    "g\u001bi\u001ck\u001dm\u001eo\u001fq s!u\"w#y${%}&\u007f\'\u0081(\u0083" +
                    ")\u0001\u0000\u001e\u0002\u0000SSss\u0002\u0000EEee\u0002\u0000LLll\u0002" +
                    "\u0000CCcc\u0002\u0000TTtt\u0002\u0000FFff\u0002\u0000RRrr\u0002\u0000" +
                    "OOoo\u0002\u0000MMmm\u0002\u0000WWww\u0002\u0000HHhh\u0002\u0000IIii\u0002" +
                    "\u0000NNnn\u0002\u0000BBbb\u0002\u0000UUuu\u0002\u0000KKkk\u0002\u0000" +
                    "AAaa\u0002\u0000XXxx\u0002\u0000JJjj\u0002\u0000DDdd\u0002\u0000PPpp\u0002" +
                    "\u0000GGgg\u0002\u0000VVvv\u0002\u0000QQqq\u0002\u0000YYyy\u0001\u0000" +
                    "09\u0001\u0000\'\'\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\t" +
                    "\n\r\r  \u0168\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000" +
                    "\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000" +
                    "\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000" +
                    "\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000" +
                    "\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G" +
                    "\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000" +
                    "\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000" +
                    "\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U" +
                    "\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000" +
                    "\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000" +
                    "\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c" +
                    "\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000" +
                    "\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000" +
                    "\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000\u0000q" +
                    "\u0001\u0000\u0000\u0000\u0000s\u0001\u0000\u0000\u0000\u0000u\u0001\u0000" +
                    "\u0000\u0000\u0000w\u0001\u0000\u0000\u0000\u0000y\u0001\u0000\u0000\u0000" +
                    "\u0000{\u0001\u0000\u0000\u0000\u0000}\u0001\u0000\u0000\u0000\u0000\u007f" +
                    "\u0001\u0000\u0000\u0000\u0000\u0081\u0001\u0000\u0000\u0000\u0000\u0083" +
                    "\u0001\u0000\u0000\u0000\u0001\u0085\u0001\u0000\u0000\u0000\u0003\u0087" +
                    "\u0001\u0000\u0000\u0000\u0005\u0089\u0001\u0000\u0000\u0000\u0007\u008c" +
                    "\u0001\u0000\u0000\u0000\t\u008e\u0001\u0000\u0000\u0000\u000b\u0090\u0001" +
                    "\u0000\u0000\u0000\r\u0093\u0001\u0000\u0000\u0000\u000f\u0096\u0001\u0000" +
                    "\u0000\u0000\u0011\u0098\u0001\u0000\u0000\u0000\u0013\u009a\u0001\u0000" +
                    "\u0000\u0000\u0015\u009c\u0001\u0000\u0000\u0000\u0017\u009e\u0001\u0000" +
                    "\u0000\u0000\u0019\u00a0\u0001\u0000\u0000\u0000\u001b\u00a2\u0001\u0000" +
                    "\u0000\u0000\u001d\u00a4\u0001\u0000\u0000\u0000\u001f\u00a6\u0001\u0000" +
                    "\u0000\u0000!\u00a8\u0001\u0000\u0000\u0000#\u00aa\u0001\u0000\u0000\u0000" +
                    "%\u00ac\u0001\u0000\u0000\u0000\'\u00ae\u0001\u0000\u0000\u0000)\u00b0" +
                    "\u0001\u0000\u0000\u0000+\u00b2\u0001\u0000\u0000\u0000-\u00b4\u0001\u0000" +
                    "\u0000\u0000/\u00b6\u0001\u0000\u0000\u00001\u00b8\u0001\u0000\u0000\u0000" +
                    "3\u00ba\u0001\u0000\u0000\u00005\u00bc\u0001\u0000\u0000\u00007\u00be" +
                    "\u0001\u0000\u0000\u00009\u00c0\u0001\u0000\u0000\u0000;\u00c2\u0001\u0000" +
                    "\u0000\u0000=\u00c4\u0001\u0000\u0000\u0000?\u00c6\u0001\u0000\u0000\u0000" +
                    "A\u00c8\u0001\u0000\u0000\u0000C\u00cf\u0001\u0000\u0000\u0000E\u00d4" +
                    "\u0001\u0000\u0000\u0000G\u00da\u0001\u0000\u0000\u0000I\u00dd\u0001\u0000" +
                    "\u0000\u0000K\u00e5\u0001\u0000\u0000\u0000M\u00ea\u0001\u0000\u0000\u0000" +
                    "O\u00f4\u0001\u0000\u0000\u0000Q\u00f7\u0001\u0000\u0000\u0000S\u00fc" +
                    "\u0001\u0000\u0000\u0000U\u0102\u0001\u0000\u0000\u0000W\u0106\u0001\u0000" +
                    "\u0000\u0000Y\u0109\u0001\u0000\u0000\u0000[\u0114\u0001\u0000\u0000\u0000" +
                    "]\u011f\u0001\u0000\u0000\u0000_\u0125\u0001\u0000\u0000\u0000a\u012a" +
                    "\u0001\u0000\u0000\u0000c\u0130\u0001\u0000\u0000\u0000e\u0134\u0001\u0000" +
                    "\u0000\u0000g\u0139\u0001\u0000\u0000\u0000i\u013f\u0001\u0000\u0000\u0000" +
                    "k\u0143\u0001\u0000\u0000\u0000m\u0147\u0001\u0000\u0000\u0000o\u014b" +
                    "\u0001\u0000\u0000\u0000q\u014f\u0001\u0000\u0000\u0000s\u0155\u0001\u0000" +
                    "\u0000\u0000u\u0157\u0001\u0000\u0000\u0000w\u0159\u0001\u0000\u0000\u0000" +
                    "y\u015b\u0001\u0000\u0000\u0000{\u015e\u0001\u0000\u0000\u0000}\u0162" +
                    "\u0001\u0000\u0000\u0000\u007f\u016b\u0001\u0000\u0000\u0000\u0081\u0173" +
                    "\u0001\u0000\u0000\u0000\u0083\u0179\u0001\u0000\u0000\u0000\u0085\u0086" +
                    "\u0005*\u0000\u0000\u0086\u0002\u0001\u0000\u0000\u0000\u0087\u0088\u0005" +
                    "=\u0000\u0000\u0088\u0004\u0001\u0000\u0000\u0000\u0089\u008a\u0005!\u0000" +
                    "\u0000\u008a\u008b\u0005=\u0000\u0000\u008b\u0006\u0001\u0000\u0000\u0000" +
                    "\u008c\u008d\u0005<\u0000\u0000\u008d\b\u0001\u0000\u0000\u0000\u008e" +
                    "\u008f\u0005>\u0000\u0000\u008f\n\u0001\u0000\u0000\u0000\u0090\u0091" +
                    "\u0005<\u0000\u0000\u0091\u0092\u0005=\u0000\u0000\u0092\f\u0001\u0000" +
                    "\u0000\u0000\u0093\u0094\u0005>\u0000\u0000\u0094\u0095\u0005=\u0000\u0000" +
                    "\u0095\u000e\u0001\u0000\u0000\u0000\u0096\u0097\u0007\u0000\u0000\u0000" +
                    "\u0097\u0010\u0001\u0000\u0000\u0000\u0098\u0099\u0007\u0001\u0000\u0000" +
                    "\u0099\u0012\u0001\u0000\u0000\u0000\u009a\u009b\u0007\u0002\u0000\u0000" +
                    "\u009b\u0014\u0001\u0000\u0000\u0000\u009c\u009d\u0007\u0003\u0000\u0000" +
                    "\u009d\u0016\u0001\u0000\u0000\u0000\u009e\u009f\u0007\u0004\u0000\u0000" +
                    "\u009f\u0018\u0001\u0000\u0000\u0000\u00a0\u00a1\u0007\u0005\u0000\u0000" +
                    "\u00a1\u001a\u0001\u0000\u0000\u0000\u00a2\u00a3\u0007\u0006\u0000\u0000" +
                    "\u00a3\u001c\u0001\u0000\u0000\u0000\u00a4\u00a5\u0007\u0007\u0000\u0000" +
                    "\u00a5\u001e\u0001\u0000\u0000\u0000\u00a6\u00a7\u0007\b\u0000\u0000\u00a7" +
                    " \u0001\u0000\u0000\u0000\u00a8\u00a9\u0007\t\u0000\u0000\u00a9\"\u0001" +
                    "\u0000\u0000\u0000\u00aa\u00ab\u0007\n\u0000\u0000\u00ab$\u0001\u0000" +
                    "\u0000\u0000\u00ac\u00ad\u0007\u000b\u0000\u0000\u00ad&\u0001\u0000\u0000" +
                    "\u0000\u00ae\u00af\u0007\f\u0000\u0000\u00af(\u0001\u0000\u0000\u0000" +
                    "\u00b0\u00b1\u0007\r\u0000\u0000\u00b1*\u0001\u0000\u0000\u0000\u00b2" +
                    "\u00b3\u0007\u000e\u0000\u0000\u00b3,\u0001\u0000\u0000\u0000\u00b4\u00b5" +
                    "\u0007\u000f\u0000\u0000\u00b5.\u0001\u0000\u0000\u0000\u00b6\u00b7\u0007" +
                    "\u0010\u0000\u0000\u00b70\u0001\u0000\u0000\u0000\u00b8\u00b9\u0007\u0011" +
                    "\u0000\u0000\u00b92\u0001\u0000\u0000\u0000\u00ba\u00bb\u0007\u0012\u0000" +
                    "\u0000\u00bb4\u0001\u0000\u0000\u0000\u00bc\u00bd\u0007\u0013\u0000\u0000" +
                    "\u00bd6\u0001\u0000\u0000\u0000\u00be\u00bf\u0007\u0014\u0000\u0000\u00bf" +
                    "8\u0001\u0000\u0000\u0000\u00c0\u00c1\u0007\u0015\u0000\u0000\u00c1:\u0001" +
                    "\u0000\u0000\u0000\u00c2\u00c3\u0007\u0016\u0000\u0000\u00c3<\u0001\u0000" +
                    "\u0000\u0000\u00c4\u00c5\u0007\u0017\u0000\u0000\u00c5>\u0001\u0000\u0000" +
                    "\u0000\u00c6\u00c7\u0007\u0018\u0000\u0000\u00c7@\u0001\u0000\u0000\u0000" +
                    "\u00c8\u00c9\u0003\u000f\u0007\u0000\u00c9\u00ca\u0003\u0011\b\u0000\u00ca" +
                    "\u00cb\u0003\u0013\t\u0000\u00cb\u00cc\u0003\u0011\b\u0000\u00cc\u00cd" +
                    "\u0003\u0015\n\u0000\u00cd\u00ce\u0003\u0017\u000b\u0000\u00ceB\u0001" +
                    "\u0000\u0000\u0000\u00cf\u00d0\u0003\u0019\f\u0000\u00d0\u00d1\u0003\u001b" +
                    "\r\u0000\u00d1\u00d2\u0003\u001d\u000e\u0000\u00d2\u00d3\u0003\u001f\u000f" +
                    "\u0000\u00d3D\u0001\u0000\u0000\u0000\u00d4\u00d5\u0003!\u0010\u0000\u00d5" +
                    "\u00d6\u0003#\u0011\u0000\u00d6\u00d7\u0003\u0011\b\u0000\u00d7\u00d8" +
                    "\u0003\u001b\r\u0000\u00d8\u00d9\u0003\u0011\b\u0000\u00d9F\u0001\u0000" +
                    "\u0000\u0000\u00da\u00db\u0003%\u0012\u0000\u00db\u00dc\u0003\'\u0013" +
                    "\u0000\u00dcH\u0001\u0000\u0000\u0000\u00dd\u00de\u0003)\u0014\u0000\u00de" +
                    "\u00df\u0003\u0011\b\u0000\u00df\u00e0\u0003\u0017\u000b\u0000\u00e0\u00e1" +
                    "\u0003!\u0010\u0000\u00e1\u00e2\u0003\u0011\b\u0000\u00e2\u00e3\u0003" +
                    "\u0011\b\u0000\u00e3\u00e4\u0003\'\u0013\u0000\u00e4J\u0001\u0000\u0000" +
                    "\u0000\u00e5\u00e6\u0003\u0013\t\u0000\u00e6\u00e7\u0003%\u0012\u0000" +
                    "\u00e7\u00e8\u0003-\u0016\u0000\u00e8\u00e9\u0003\u0011\b\u0000\u00e9" +
                    "L\u0001\u0000\u0000\u0000\u00ea\u00eb\u0003%\u0012\u0000\u00eb\u00ed\u0003" +
                    "\u000f\u0007\u0000\u00ec\u00ee\u0003\u0081@\u0000\u00ed\u00ec\u0001\u0000" +
                    "\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000" +
                    "\u0000\u0000\u00ef\u00f0\u0003\'\u0013\u0000\u00f0\u00f1\u0003+\u0015" +
                    "\u0000\u00f1\u00f2\u0003\u0013\t\u0000\u00f2\u00f3\u0003\u0013\t\u0000" +
                    "\u00f3N\u0001\u0000\u0000\u0000\u00f4\u00f5\u0003/\u0017\u0000\u00f5\u00f6" +
                    "\u0003\u000f\u0007\u0000\u00f6P\u0001\u0000\u0000\u0000\u00f7\u00f8\u0003" +
                    "3\u0019\u0000\u00f8\u00f9\u0003\u001d\u000e\u0000\u00f9\u00fa\u0003%\u0012" +
                    "\u0000\u00fa\u00fb\u0003\'\u0013\u0000\u00fbR\u0001\u0000\u0000\u0000" +
                    "\u00fc\u00fd\u0003+\u0015\u0000\u00fd\u00fe\u0003\u000f\u0007\u0000\u00fe" +
                    "\u00ff\u0003%\u0012\u0000\u00ff\u0100\u0003\'\u0013\u0000\u0100\u0101" +
                    "\u00039\u001c\u0000\u0101T\u0001\u0000\u0000\u0000\u0102\u0103\u0003/" +
                    "\u0017\u0000\u0103\u0104\u0003\'\u0013\u0000\u0104\u0105\u00035\u001a" +
                    "\u0000\u0105V\u0001\u0000\u0000\u0000\u0106\u0107\u0003\u001d\u000e\u0000" +
                    "\u0107\u0108\u0003\u001b\r\u0000\u0108X\u0001\u0000\u0000\u0000\u0109" +
                    "\u010a\u0003\u001d\u000e\u0000\u010a\u010b\u0003\u001b\r\u0000\u010b\u010c" +
                    "\u00035\u001a\u0000\u010c\u010d\u0003\u0011\b\u0000\u010d\u010f\u0003" +
                    "\u001b\r\u0000\u010e\u0110\u0003\u0081@\u0000\u010f\u010e\u0001\u0000" +
                    "\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000" +
                    "\u0000\u0000\u0111\u0112\u0003)\u0014\u0000\u0112\u0113\u0003?\u001f\u0000" +
                    "\u0113Z\u0001\u0000\u0000\u0000\u0114\u0115\u00039\u001c\u0000\u0115\u0116" +
                    "\u0003\u001b\r\u0000\u0116\u0117\u0003\u001d\u000e\u0000\u0117\u0118\u0003" +
                    "+\u0015\u0000\u0118\u011a\u00037\u001b\u0000\u0119\u011b\u0003\u0081@" +
                    "\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000" +
                    "\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0003)\u0014\u0000" +
                    "\u011d\u011e\u0003?\u001f\u0000\u011e\\\u0001\u0000\u0000\u0000\u011f" +
                    "\u0120\u0003%\u0012\u0000\u0120\u0121\u0003\'\u0013\u0000\u0121\u0122" +
                    "\u0003\'\u0013\u0000\u0122\u0123\u0003\u0011\b\u0000\u0123\u0124\u0003" +
                    "\u001b\r\u0000\u0124^\u0001\u0000\u0000\u0000\u0125\u0126\u0003\u0013" +
                    "\t\u0000\u0126\u0127\u0003\u0011\b\u0000\u0127\u0128\u0003\u0019\f\u0000" +
                    "\u0128\u0129\u0003\u0017\u000b\u0000\u0129`\u0001\u0000\u0000\u0000\u012a" +
                    "\u012b\u0003\u001b\r\u0000\u012b\u012c\u0003%\u0012\u0000\u012c\u012d" +
                    "\u00039\u001c\u0000\u012d\u012e\u0003#\u0011\u0000\u012e\u012f\u0003\u0017" +
                    "\u000b\u0000\u012fb\u0001\u0000\u0000\u0000\u0130\u0131\u0003/\u0017\u0000" +
                    "\u0131\u0132\u0003\u000f\u0007\u0000\u0132\u0133\u0003\u0015\n\u0000\u0133" +
                    "d\u0001\u0000\u0000\u0000\u0134\u0135\u00035\u001a\u0000\u0135\u0136\u0003" +
                    "\u0011\b\u0000\u0136\u0137\u0003\u000f\u0007\u0000\u0137\u0138\u0003\u0015" +
                    "\n\u0000\u0138f\u0001\u0000\u0000\u0000\u0139\u013a\u0003\u0015\n\u0000" +
                    "\u013a\u013b\u0003\u001d\u000e\u0000\u013b\u013c\u0003+\u0015\u0000\u013c" +
                    "\u013d\u0003\'\u0013\u0000\u013d\u013e\u0003\u0017\u000b\u0000\u013eh" +
                    "\u0001\u0000\u0000\u0000\u013f\u0140\u0003\u000f\u0007\u0000\u0140\u0141" +
                    "\u0003+\u0015\u0000\u0141\u0142\u0003\u001f\u000f\u0000\u0142j\u0001\u0000" +
                    "\u0000\u0000\u0143\u0144\u0003/\u0017\u0000\u0144\u0145\u0003;\u001d\u0000" +
                    "\u0145\u0146\u00039\u001c\u0000\u0146l\u0001\u0000\u0000\u0000\u0147\u0148" +
                    "\u0003\u001f\u000f\u0000\u0148\u0149\u0003/\u0017\u0000\u0149\u014a\u0003" +
                    "1\u0018\u0000\u014an\u0001\u0000\u0000\u0000\u014b\u014c\u0003\u001f\u000f" +
                    "\u0000\u014c\u014d\u0003%\u0012\u0000\u014d\u014e\u0003\'\u0013\u0000" +
                    "\u014ep\u0001\u0000\u0000\u0000\u014f\u0150\u0003\u0013\t\u0000\u0150" +
                    "\u0151\u0003%\u0012\u0000\u0151\u0152\u0003\u001f\u000f\u0000\u0152\u0153" +
                    "\u0003%\u0012\u0000\u0153\u0154\u0003\u0017\u000b\u0000\u0154r\u0001\u0000" +
                    "\u0000\u0000\u0155\u0156\u0005,\u0000\u0000\u0156t\u0001\u0000\u0000\u0000" +
                    "\u0157\u0158\u0005(\u0000\u0000\u0158v\u0001\u0000\u0000\u0000\u0159\u015a" +
                    "\u0005)\u0000\u0000\u015ax\u0001\u0000\u0000\u0000\u015b\u015c\u0005." +
                    "\u0000\u0000\u015cz\u0001\u0000\u0000\u0000\u015d\u015f\u0007\u0019\u0000" +
                    "\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000" +
                    "\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000" +
                    "\u0000\u0161|\u0001\u0000\u0000\u0000\u0162\u0166\u0005\'\u0000\u0000" +
                    "\u0163\u0165\b\u001a\u0000\u0000\u0164\u0163\u0001\u0000\u0000\u0000\u0165" +
                    "\u0168\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166" +
                    "\u0167\u0001\u0000\u0000\u0000\u0167\u0169\u0001\u0000\u0000\u0000\u0168" +
                    "\u0166\u0001\u0000\u0000\u0000\u0169\u016a\u0005\'\u0000\u0000\u016a~" +
                    "\u0001\u0000\u0000\u0000\u016b\u016f\u0007\u001b\u0000\u0000\u016c\u016e" +
                    "\u0007\u001c\u0000\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016e\u0171" +
                    "\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170" +
                    "\u0001\u0000\u0000\u0000\u0170\u0080\u0001\u0000\u0000\u0000\u0171\u016f" +
                    "\u0001\u0000\u0000\u0000\u0172\u0174\u0007\u001d\u0000\u0000\u0173\u0172" +
                    "\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0173" +
                    "\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0177" +
                    "\u0001\u0000\u0000\u0000\u0177\u0178\u0006@\u0000\u0000\u0178\u0082\u0001" +
                    "\u0000\u0000\u0000\u0179\u017a\u0005;\u0000\u0000\u017a\u0084\u0001\u0000" +
                    "\u0000\u0000\b\u0000\u00ed\u010f\u011a\u0160\u0166\u016f\u0175\u0001\u0006" +
                    "\u0000\u0000";
    private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeRuleNames() {
		return new String[] {
                "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "S", "E", "L",
                "C", "T", "F", "R", "O", "M", "W", "H", "I", "N", "B", "U", "K", "A",
                "X", "J", "D", "P", "G", "V", "Q", "Y", "SELECT", "FROM", "WHERE", "IN",
                "BETWEEN", "LIKE", "IS_NULL", "AS", "JOIN", "USING", "AND", "OR", "ORDER_BY",
                "GROUP_BY", "INNER", "LEFT", "RIGHT", "ASC", "DESC", "COUNT", "SUM",
                "AVG", "MAX", "MIN", "LIMIT", "COMMA", "LPAREN", "RPAREN", "DOT", "NUMERICAL_VALUE",
                "STRING_VALUE", "IDENTIFIER", "WS", "SEMICOLON"
		};
	}

	private static String[] makeLiteralNames() {
        return new String[]{
                null, "'*'", "'='", "'!='", "'<'", "'>'", "'<='", "'>='", null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, "','",
                "'('", "')'", "'.'", null, null, null, null, "';'"
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


	public SQLToPandasLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQLToPandas.g4"; }

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

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, "SELECT", "FROM", "WHERE",
                "IN", "BETWEEN", "LIKE", "IS_NULL", "AS", "JOIN", "USING", "AND", "OR",
                "ORDER_BY", "GROUP_BY", "INNER", "LEFT", "RIGHT", "ASC", "DESC", "COUNT",
                "SUM", "AVG", "MAX", "MIN", "LIMIT", "COMMA", "LPAREN", "RPAREN", "DOT",
                "NUMERICAL_VALUE", "STRING_VALUE", "IDENTIFIER", "WS", "SEMICOLON"
		};
	}
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}