package methodstuff;

public class UseStaticMethods {
  // NO default arg values

  // "modiers" -- annotations, access control (e.g. public), static, final
  // generic type parameter declarations
  // return type
  // method name
  // parens (mandatory)
  // inside parens, optional formal parmeter decls, comma separated
  // optional "throws clause"
  // curlies
  public static int add(int a, int b) {
//    int 喜 = 3; // UNICODE letter :)
//    int ia[];

    System.out.println("adding ints");
    return a + b;
  }

//  public static int[] getmany() { return null; }
//  public static int getmany()[] { return null; }
  public static void dontReturnAnything() {}

  // "real name" of a method/function is made up of
//  // package.name.method-main-name,type-sequence-of-args
//  public static long add(long l1, long l2) {
//    System.out.println("adding longs");
//    return l1 + l2;
//  }

  public static long add(int i1, long l1) {
    System.out.println("adding int + long");
    return i1 + l1;
  }

  public static long add(long l1, int i1) {
    System.out.println("adding long + int");
    return i1 + l1;
  }

  // Wrapper types for all the primitives
  public static Long add(Long l1, Long l2) {
    System.out.println("adding Long object to Long object");
    return Long.valueOf(l1.longValue() + l2.longValue());
//    return l1 + l2; // "autoboxing and unboxing"
  }

//  public static int add(int [] values) {
  // elipsis form ... receives an array, but
  // the compiler will create the array at the CALL site
  // if we provide comma separated list
  // single vararg element, must be last arg :)
  public static int add(int ... values) {
    int rv = 0;
    for (var v : values) {
      rv += v;
    }
    return rv;
  }

  public static void main(String[] args) {
//    System.out.println(methodstuff.UseStaticMethods.add(3, 4));
    System.out.println(add(3, 4));
    System.out.println(add(3L, 4L));
    System.out.println(add(3, 4L));

    System.out.println(add(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    System.out.println(add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
  }
}
