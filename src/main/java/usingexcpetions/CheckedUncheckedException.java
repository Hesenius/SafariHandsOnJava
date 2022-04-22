package usingexcpetions;

import java.sql.SQLException;

public class CheckedUncheckedException {
  public static void doStuff() throws SQLException {
    if (Math.random() > 0.5) {
//      throw new IndexOutOfBoundsException("oops");
//      try {
        throw new SQLException("oops");
//      } catch (SQLException e) {
//        e.printStackTrace();
//      }
    }
  }

  public static void main(String[] args) {
    try {
      doStuff();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
