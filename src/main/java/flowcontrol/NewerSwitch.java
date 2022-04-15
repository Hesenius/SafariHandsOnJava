package flowcontrol;

public class NewerSwitch {
  public static void main(String[] args) {
    int x = 97;
    switch (x) {
      case 97, 98, 99 -> { // no breaks permitted, but single subordinate clause
        System.out.println("it's ninety nine, 98, or 97");
        System.out.println("more text");
      }
      case 100 ->
        System.out.println("it's one hundred");
      default ->
        System.out.println("it's something else");
    }
  }

}
