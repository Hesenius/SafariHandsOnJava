package usingexcpetions;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Example1 {
  public static void mightBreak() throws FileNotFoundException {
    System.out.println("in mightBreak");
    try {
      if (Math.random() > 0.5) {
        throw new FileNotFoundException("That broke");
      } else if (Math.random() > 0.5) {
        throw new SQLException("BAD");
      }
    } catch (SQLException sqle) {
      throw new RuntimeException(sqle);
    }

    System.out.println("completing mightBreak");
  }
  public static void main(String[] args) {
    System.out.println("about to call");
    try {
      mightBreak();
      System.out.println("returned normally");
    } catch (FileNotFoundException fnfe){
      System.out.println("File problem: " + fnfe.getMessage());
    } catch (IllegalArgumentException ie) {
      System.out.println("that broke with " + ie.getMessage());
    } finally {
      System.out.println("in finally");
    }
    System.out.println("returned from call");
  }
}
