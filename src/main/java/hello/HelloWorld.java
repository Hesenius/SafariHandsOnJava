package hello;

// NO CHANGE to generated code
// IN FACT, java.lang.* is automatically imported
//import java.lang.System;
// ALL imports must start at the ROOT of the package tree
// the thing they end with is the first thing you can subsequently
// use directly.
import static java.lang.System.out;



// public class is a type, so is interface, non-public classes
// abstract classes, and in newer Java "record"

// a public type MUST be in a source file with a matching name
// that means at most one public type per source file
public class HelloWorld {
  // program entry point is a main method
  // main is very picky:
  public static void main(String[] args) {
//    java.lang.System.out.println("Hello World!");
//    System.out.println("Hello World!");
    out.println("Hello World!");
  }
}

class MoreStuff{

}
