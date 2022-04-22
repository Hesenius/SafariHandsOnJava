package usingcollectionsandgenerics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UsingSet {
  public static void main(String[] args) {
    Set<String> names = new HashSet<>();
    names.add("Fred");
    System.out.println(names.add("Jim"));
    System.out.println(names.add("Jim"));
    names.add("Sheila");
    System.out.println(names);
    for (String s : names) {
      System.out.println(s);
    }

    // Tree set requires "ordering"--can be "natural" i.e.
    // the class in question implements Comparable, or
    // can provide a Comparator at construction of the set
    Set<StringBuilder> ssb = new TreeSet<>();
//    Set<StringBuilder> ssb = new HashSet<>();
    ssb.add(new StringBuilder("Fred"));
    System.out.println(ssb.add(new StringBuilder("Jim")));
    // HashSet uses .equals to determine duplicates
    // (also uses .hashCode to expedite the search)
    System.out.println(ssb.add(new StringBuilder("Jim")));
    ssb.add(new StringBuilder("Sheila"));
    System.out.println(ssb);
  }
}
