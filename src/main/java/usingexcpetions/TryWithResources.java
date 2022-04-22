package usingexcpetions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
  public static void badMain(String[] args) {
    FileReader fr = null;
    BufferedReader br = null;
    try {
      fr = new FileReader("text.txt");
      br = new BufferedReader(fr);
      String line = br.readLine();
      System.out.println("> " + line);
    } catch (IOException ioe) {
      System.out.println("It broke: " + ioe.getMessage());
    } finally {
      if (br != null) {
        try {
          br.close(); // this would close the file transitively
        } catch (IOException ioe) {
          System.out.println("close failed");
        }
      }
      // NEED TO DO THE SAME HERE!!!!
//      if (fr != null) {
//        fr.close();
//      }
    }
  }
  public static void main(String[] args) throws FileNotFoundException {
    FileReader fr = new FileReader("text.txt");
    try (
        // "resources" must be AutoCloseable
//        String s = "Hello";
        // declare and initialize is "normal"
//        FileReader fr = new FileReader("text.txt");
        fr; // Java 9+, fr must be final or effectively final
        BufferedReader br = new BufferedReader(fr);
    ) {
      String line = br.readLine();
      System.out.println("> " + line);
    } catch (IOException ioe) {
      System.out.println("It broke: " + ioe.getMessage());
    } // auto-generated finally will close resources...
//    fr = null;

    // "suppressed" exceptions :)
    Exception e = null;
    e.getSuppressed(); // finds any close exceptions that TWR handled
  }
}
