package proyectologica;
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\027\000\002\002\007\000\002\002\004\000\002\002" +
    "\011\000\002\004\003\000\002\004\003\000\002\005\005" +
    "\000\002\005\003\000\002\006\003\000\002\006\003\000" +
    "\002\007\003\000\002\007\003\000\002\007\003\000\002" +
    "\007\003\000\002\007\003\000\002\010\003\000\002\010" +
    "\003\000\002\003\005\000\002\003\006\000\002\003\005" +
    "\000\002\003\005\000\002\011\004\000\002\011\004\000" +
    "\002\011\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\004\004\005\001\002\000\004\002\054\001" +
    "\002\000\022\016\021\017\015\020\011\021\007\022\013" +
    "\023\006\024\020\025\014\001\002\000\012\005\ufff4\006" +
    "\ufff4\011\ufff4\014\ufff4\001\002\000\012\005\ufff6\006\ufff6" +
    "\011\ufff6\014\ufff6\001\002\000\006\005\052\006\ufffe\001" +
    "\002\000\014\005\ufff3\006\ufff3\010\ufff3\011\ufff3\012\ufff3" +
    "\001\002\000\006\005\ufffb\006\ufffb\001\002\000\012\005" +
    "\ufff5\006\ufff5\011\ufff5\014\ufff5\001\002\000\004\006\ufffd" +
    "\001\002\000\012\005\ufff7\006\ufff7\011\ufff7\014\ufff7\001" +
    "\002\000\004\006\023\001\002\000\006\005\ufff9\006\ufff9" +
    "\001\002\000\014\005\ufff2\006\ufff2\010\ufff2\011\ufff2\012" +
    "\ufff2\001\002\000\012\005\ufff8\006\ufff8\011\ufff8\014\ufff8" +
    "\001\002\000\006\005\ufffa\006\ufffa\001\002\000\004\026" +
    "\024\001\002\000\006\007\025\015\026\001\002\000\020" +
    "\016\021\017\015\020\011\021\007\022\013\023\006\024" +
    "\020\001\002\000\004\002\001\001\002\000\006\005\047" +
    "\015\050\001\002\000\010\010\041\011\042\012\040\001" +
    "\002\000\006\011\033\014\032\001\002\000\004\027\036" +
    "\001\002\000\004\013\034\001\002\000\004\027\035\001" +
    "\002\000\006\005\ufff0\015\ufff0\001\002\000\006\005\uffef" +
    "\015\uffef\001\002\000\004\030\046\001\002\000\004\013" +
    "\045\001\002\000\004\013\044\001\002\000\004\013\043" +
    "\001\002\000\004\030\uffec\001\002\000\004\030\uffed\001" +
    "\002\000\004\030\uffeb\001\002\000\006\005\uffee\015\uffee" +
    "\001\002\000\020\016\021\017\015\020\011\021\007\022" +
    "\013\023\006\024\020\001\002\000\004\002\uffff\001\002" +
    "\000\006\005\ufff1\015\ufff1\001\002\000\020\016\021\017" +
    "\015\020\011\021\007\022\013\023\006\024\020\001\002" +
    "\000\006\005\ufffc\006\ufffc\001\002\000\004\002\000\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\004\002\003\001\001\000\002\001\001\000" +
    "\014\004\015\005\007\006\011\007\021\010\016\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\010\003\026\007" +
    "\030\010\027\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\011\036\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\003" +
    "\050\007\030\010\027\001\001\000\002\001\001\000\002" +
    "\001\001\000\012\005\052\006\011\007\021\010\016\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // startT ::= SELECT categories OF COUNTRIESDB SEMI 
            {
              Object RESULT =null;
		int catleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int catright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object cat = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		 RESULT = "SELECT " + cat + " FROM countryData"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("startT",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= startT EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // startT ::= SELECT categories OF COUNTRIESDB WITH condition SEMI 
            {
              Object RESULT =null;
		int catleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int catright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Object cat = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int condleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int condright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object cond = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = "SELECT " + cat + " FROM countryData WHERE " + cond; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("startT",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // categories ::= category 
            {
              Object RESULT =null;
		int catleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int catright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object cat = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = cat; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("categories",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // categories ::= EVERYCAT 
            {
              Object RESULT =null;
		 RESULT = "*"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("categories",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // category ::= category AND category 
            {
              Object RESULT =null;
		int cat1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int cat1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object cat1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int cat2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cat2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object cat2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = cat1 + ", " + cat2; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("category",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // category ::= categoryName 
            {
              Object RESULT =null;
		int catleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int catright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object cat = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = cat; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("category",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // categoryName ::= textCats 
            {
              Object RESULT =null;
		int catleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int catright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object cat = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = cat; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("categoryName",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // categoryName ::= numberCats 
            {
              Object RESULT =null;
		int catleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int catright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object cat = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = cat; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("categoryName",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // textCats ::= CATNAME 
            {
              Object RESULT =null;
		 RESULT = "name"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("textCats",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // textCats ::= CATCOUNTRY 
            {
              Object RESULT =null;
		 RESULT = "country"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("textCats",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // textCats ::= CATLANGS 
            {
              Object RESULT =null;
		 RESULT = "languages"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("textCats",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // textCats ::= CATTZ 
            {
              Object RESULT =null;
		 RESULT = "timezone"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("textCats",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // textCats ::= CATGOV 
            {
              Object RESULT =null;
		 RESULT = "government"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("textCats",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // numberCats ::= CATPOP 
            {
              Object RESULT =null;
		 RESULT = "population"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("numberCats",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // numberCats ::= CATSIZE 
            {
              Object RESULT =null;
		 RESULT = "size"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("numberCats",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // condition ::= condition AND condition 
            {
              Object RESULT =null;
		int cond1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int cond1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object cond1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int cond2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cond2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object cond2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = cond1 + " AND " + cond2; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("condition",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // condition ::= textCats EQUAL THANTOCONN TEXT 
            {
              Object RESULT =null;
		int catleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int catright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object cat = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = cat + " = '"  + t + "'"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("condition",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // condition ::= textCats INCLUDING TEXT 
            {
              Object RESULT =null;
		int catleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int catright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object cat = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = cat + " = '%"  + t + "%'"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("condition",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // condition ::= numberCats operation NUMBER 
            {
              Object RESULT =null;
		int catleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int catright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object cat = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int opleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object op = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = cat + " " + op + " "  + n + ""; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("condition",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // operation ::= GREATER THANTOCONN 
            {
              Object RESULT =null;
		 RESULT = ">"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("operation",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // operation ::= EQUAL THANTOCONN 
            {
              Object RESULT =null;
		 RESULT = "="; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("operation",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // operation ::= LOWER THANTOCONN 
            {
              Object RESULT =null;
		 RESULT = "<"; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("operation",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
