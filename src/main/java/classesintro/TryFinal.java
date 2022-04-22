package classesintro;

public class TryFinal {
//  final int x = 99; // initializing value must be an EXPRESSION
  final int x; // MUST have been definitely initialized exactly once
  // before completion of construction process

  // could use instance initilizer
//  { // these initializer blocks can have loops, conditions, try/catch...
//    x = 100;
//  }
//
  // OR use constructor
  public TryFinal() {
    System.out.println("running constructor...");
    x = 100;
  }

  int y;
  {
    System.out.println("running initializer");
    y = 200;
  }

  public static void main(String[] args) {
    int x = 99;
    x = 100;

    final int y;
    y = 200; // first assignment OK
//    y++; // Cannot "reassign" a final variable

    TryFinal tf = new TryFinal();
    System.out.println(tf.x);
//    tf.x = 100;  NOPE
  }
}
