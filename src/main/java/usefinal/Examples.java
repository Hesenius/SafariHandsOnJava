package usefinal;

// final class cannot be subclassed...
public /*final*/ class Examples {
  // fields are always definitely initialized to zero
  // as part of the action of "new"
  int y;
  // but final fields MUST be definitely EXPLICITLY initialized
  // by all individual paths through the construction process
  // BEFORE the exit from the constructors
  // (so you cannot defer initialization of a final field and
  // try to do it in a factory method)
  final int a;
//  {
//    a = 100;
//  }

  public Examples() {
    a = 100;
  }

//  public Examples(int y) {
//
//  }

  // final method cannot be overridden
  /*final*/ void doStuff() {
    // final variable must be assigned exactly once
    /*final*/ int x/* = 99*/;
    x = 100;
    int z;
    // must have definitely initialzed a local variable
    // before attempting to read it
//    System.out.println(z); // this would fail :)
    System.out.println(y);
  }

  public static void main(String[] args) {
    final StringBuilder sb = new StringBuilder("Hello");
//    sb = null; // NOPE cannot reassign sb
    System.out.println(sb);
    // BUT can mutate the one object to which sb refers
    // PROVIDED sb is in fact a mutable type!
    sb.append(" World!");
    System.out.println(sb);
  }
}

class SpecializedExamples extends Examples {
  void doStuff() {}
}