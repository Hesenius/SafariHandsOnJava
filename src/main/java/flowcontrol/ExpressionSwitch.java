package flowcontrol;

public class ExpressionSwitch {
  public static void main(String[] args) {
    int x = 97;
    // switch becomes an expression if positioned where an
    // expression is expected
    var msg = switch (x) {
      case 97, 98, 99 -> "it's ninety nine, 98, or 97";
      case 100 -> "it's one hundred";
      // without this default, coverage would be incomplete,
      // which is NOT valid for a switch expression
      default -> "it's something else";
    };
    System.out.println(msg);
  }

}
