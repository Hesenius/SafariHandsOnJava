package readtext;

import java.util.Scanner;

public class UseScanner {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    System.out.println("You typed: " + s);
  }
}
