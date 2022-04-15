package flowcontrol;

public class WhileLoops {
  public static void main(String[] args) {
    int x = 3;
    while (x > 0) {
      System.out.println("> " + x);
//      x = x - 1;
//      x -= 1;
      x--; // x++ ++x --x also
    }
    System.out.println("done");
    do {
      System.out.println("do loop, x is " + x);
    } while (x != 0);
    System.out.println("done again");
  }
}
