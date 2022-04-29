package nested;

public class Outer {
  private int x = 99;
  static class Nested { // perfect for making builder classes :)
    Outer self;
    public Nested(Outer outer) {
      self = outer;
    }
    public void doStuff(Outer outer) {
      System.out.println(outer.x);
    }
  }

  class Inner { // perfect for things like iterators
    // this is the form of the default constructor :)
    Inner(Outer Outer.this) {

    }

  }

  static void makeOne(Outer outer) {
    outer.new Inner();
  }

  void makeAnotherOne() {
    this.new Inner();
    new Inner();
  }
}

class TryIt {
  public static void main(String[] args) {
    Outer outer = new Outer();
//    Outer.Nested nested = new Outer.Nested();
    Outer.Inner inner = outer.new Inner();
  }
}
