package flowcontrol;

public class OldSwitch {
  public static void main(String[] args) {
    int x = 97;
    switch (x) {
      case 98:
      case 97:
      case 99: // matched value MUST BE A CONSTANT
        System.out.println("it's ninety nine, 98, or 97");
        break;
      case 100:
        System.out.println("it's one hundred");
        break;
//      case 99: // duplicates are not permitted
//        System.out.println("nope!");
      default: // does not have to be last
        System.out.println("it's something else");
        break;
    }
  }
}
