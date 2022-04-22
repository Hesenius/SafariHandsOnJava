package moreio;

import java.io.*;
import java.nio.charset.Charset;

public class WriteAFile {
  public static void main(String[] args) /*throws IOException*/ {
    try (BufferedReader input =
//             new BufferedReader(new FileReader("input.txt"));
             new BufferedReader(
                 new InputStreamReader(
                     new FileInputStream("input.txt"),
                     Charset.forName("UTF-8")));
         PrintWriter output =
             new PrintWriter(new FileWriter("output.txt"));) {
      String line;
      while ((line = input.readLine()) != null) {
        output.println("> " + line);
      }
    } catch(IOException ioe) {
      System.out.println("oops, that broke: " + ioe.getMessage());
    }
  }
}
