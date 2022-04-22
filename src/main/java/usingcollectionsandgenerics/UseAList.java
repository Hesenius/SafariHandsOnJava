package usingcollectionsandgenerics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UseAList {
  public static void breakAList(List al) {
    al.add(0, LocalDate.now());
  }

//  public static void showAll(List<String> als) {
//  public static void showAll(Collection<String> als) {
  public static void showAll(Iterable<String> als) {
//    for (String s : als) {
    for (var s : als) {
      System.out.println("> " + s);
    }
//    System.out.println("Item at pos zero is " + als.get(0));
  }

  public static void main(String[] args) {
    // without "generics" ArrayList contains ANY reference data type
//    ArrayList al = new ArrayList();
    List<String> initialNames =
        List.<String>of("Alice", "Bob"/*, LocalDate.now()*/);
    // oops, this is accepted...
//    ArrayList<String> al = new ArrayList(initialNames);
//    ArrayList<String> al = new ArrayList<String>(initialNames);
//    ArrayList<String> al = new ArrayList<String>(List.of("Alice", LocalDate.now()));
//    ArrayList<String> al = new ArrayList<>(List.of("Alice", LocalDate.now()));
//    ArrayList<String> al = new ArrayList<>(List.of("Alice"));
    // program to the interface rather than a concrete type...
    // (almost always)
    List<String> al = new ArrayList<>(List.of("Alice"));
    System.out.println("size is " + al.size());
    al.add("Fred");
    al.add("Jim");
    System.out.println("size is " + al.size());
    System.out.println("item at pos zero is " + al.get(0));
    // no good!
//    System.out.println("item at pos 99 is " + al.get(99));
    al.set(0, "Frederick");
//    String itemZero = (String)al.get(0);

    breakAList(al);
    // compiler generates the cast when using generics
    String itemZero = al.get(0);
    System.out.println("item at pos zero is " + itemZero);
    System.out.println("al is " + al);

    showAll(al);

    // using generics allows the COMPILER to validate
    // "consisten usage" of this ArrayList
//    LocalDate ld = LocalDate.now();
//    System.out.println("ld is " + ld);
//    al.add(ld);
//    System.out.println("al is " + al);
//    al.add(1); // really added Integer.valueOf(1)

    ArrayList<Integer> ali = new ArrayList<>();
    // code generated for this:
    ali.add(99);
    // actually looks like this:
    ali.add(Integer.valueOf(99));
    // and... code generated for this:
    int x = ali.get(0);
    // actually looks like this:
    int x1 = ali.get(0).intValue();

    // program to the most general generalization that supports
    // your use case!!!
    // List is that generalization for a list!
    List<String> lls = new LinkedList<>(List.of("Fred", "Jim"));
    showAll(lls);
  }
}
