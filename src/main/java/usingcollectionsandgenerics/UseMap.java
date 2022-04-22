package usingcollectionsandgenerics;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class UseMap {
  public static void main(String[] args) {
    Map<String, LocalDate> msld = new HashMap<>();
    msld.put("Fred", LocalDate.of(1994, 4, 12));
    msld.put("Jim", LocalDate.of(1934, 6, 1));
    System.out.println(msld);
    System.out.println("Fred's birthday was " + msld.get("Fred"));
    System.out.println("Freddy's birthday was " + msld.get("Freddy"));
    System.out.println("Freddy is in the data? " + msld.containsKey("Freddy"));

    msld.put("Fred", LocalDate.of(2022, 1, 1));
    System.out.println(msld);
  }
}
