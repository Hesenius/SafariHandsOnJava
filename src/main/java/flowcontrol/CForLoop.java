package flowcontrol;

public class CForLoop {
  public static void main(String[] args) {
    int x = 0; // initialization (declaration??)
    while (x < 3) { // condition
      System.out.println(x);
      x++; // get-ready-for-next-time
    }

    System.out.println("x is now: " + x);
    System.out.println("--------------");

    // multiple variable declarations MUST HAVE same base type

    // init part is EITHER decl+init, OR expression statements
    for (int y = 0, z = 10, a[] = {1, 2, 3};
         // potentially complex, but must be boolean, expression
         y < 3;
         // expression statements
         y++, System.out.println(z)) {
      System.out.println(y);
    }

    // variables declared in parens that are followed by curlies
    // these are called "formal parameters"
    // Scope of these if from point of declaration to the end of
    // the immediately FOLLOWING curlies
//    System.out.println("y is out of scope: " + y);

    for (var t = 10; t > 5; t--) {
      System.out.println(t);
    }

//    int a = 1, b = 2;
//    var a = 1, b = 2; // NOPE, var can't do this
  }
}
