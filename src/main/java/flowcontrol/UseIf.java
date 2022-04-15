package flowcontrol;

public class UseIf {
  public static void main(String[] args) {
    double n = Math.random();
    if (n > 0.5) {
      System.out.println("It's big");
      System.out.println("yup, more than half");
    } else if (n > 0.2) {
      System.out.println("looks pretty small");
    } else {
      System.out.println("very small");
    }

    String message = n > 0.5 ? "bigish" : "smallish";
    System.out.println(message);
  }
}
