package flowcontrol;

public class EnhancedFor {
  public static void main(String[] args) {
    String [] names = {"Fred", "Jim", "Sheila"};
    for (var name : names) {
//    for (String name : names) {
      // IN THIS LOOP, there is NO concept of index
      System.out.println("> " + name);
    }
  }
}
