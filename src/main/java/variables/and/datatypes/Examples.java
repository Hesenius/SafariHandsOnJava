package variables.and.datatypes;

public class Examples {
  public static void main(String[] args) {
    // primitive data types
    // boolean, byte, short, char, int, long, float, double
    int y;
    if (Math.random() > -1) {
      y = 10;
    } else {
      y = 11;
    }
    int x = 99;
    System.out.println(y);

    // four numeric literals
    // underscore like "thousands separator"
    int z = 100; // always an int (32 bit signed number)
    long lng = 3_000_000_000L; // l suffix makes a long literal

    double pi = 3.14; // double literal (anything with decimal, or E notation
    float smallPi = 3.14F; // float literal


    float f = (float)pi; // a type, in parens as a prefix is a "cast"

    byte s1 = 100; // compiler allows int literals (constant) to be "shrunk"
    byte s2 = 120; // to fit into smaller data types

//    byte s3 = s1 + s2; // arithmetic is performed with at least int types
    byte s3 = (byte)(s1 + s2); // overflow!
    System.out.println(s3);

    // Java 10+ has "var" type inferencing
    var count = 3; // intelliJ uses Control-Q for "quick documentation"
//    count = 3.14; // NOPE, it's an int type...

    // operators mostly expected?
    // + - * /  -- arithmetic is based on the largest type of argument (at least int)
    // < <= > >=
    // == !=

    int p = 10;
    int q = 11;
    System.out.println(p == q);
    System.out.println(p != q);

    // NO "truthy/falsy" concept. ONLY boolean results are boolean
    String name = "Fred";
    String name2 = "Frederick";
    String newName = name + "erick"; // + is overloaded for String concatenation
    // anything can be automatically converted to String to participate
    // in concatenation
    System.out.println(name2);
    System.out.println(newName);
    System.out.println(name2 == newName);
    System.out.println(name2.equals(newName));
    String name3 = "Fred";
    System.out.println(name == name3);

    String name4 = name3.intern();
    System.out.println(name == name4);

    String name5 = name4.toUpperCase();
    System.out.println(name4);
    System.out.println(name5);
    name5 = null;
//    name5.toUpperCase(); // null pointer exception!!!
  }
}
