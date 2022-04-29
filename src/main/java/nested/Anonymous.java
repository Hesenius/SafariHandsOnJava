package nested;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Anonymous {
  static class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
      return o2.compareTo(o1);
    }
  }

  public static void main(String[] args) {
    Comparator<String> csReverse = new StringLengthComparator();

    List<String> names = new ArrayList<>(List.of("Fred", "Sheila", "Jim"));
    System.out.println(names);
//    names.sort(csReverse);
//    System.out.println(names);

////    while(true) {
//    names.sort(
//        new Comparator<String>() {
//          @Override
//          public int compare(String o1, String o2) {
//            return o2.compareTo(o1);
//          }
//        }
//    );
//    System.out.println(names);
////    }

//    Object obj = new Comparator<String>() {
//      @Override
//      public int compare(String o1, String o2) {
//        return o2.compareTo(o1);
//      }
//    };
//    System.out.println("Type of obj is " + obj.getClass().getName());

    // context MUST require an object that implements an INTERFACE
    // interface declares exactly one abstract method
    // AND that's the only method we want to implement
    // we can shorten this syntax further
//    names.sort(
//        /*new Comparator<String>() {
//          @Override
//          public int compare*/(String o1, String o2) -> {
//            return o2.compareTo(o1);
//          }
//       /* }*/
//    );
//    System.out.println(names);

//    names.sort(
//        (String o1, String o2) -> {
//          return o2.compareTo(o1);
//        }
//    );
//    names.sort(
//        // can leave out ALL type specification IFF it's unambiguous
////        (o1, o2) -> {
//        // use var for ALL formal params if you want type inference
//        // but also want to annotate (Java 11+)
//        (@Deprecated var o1, var o2) -> {
//          return o2.compareTo(o1);
//        }
//    );
//    names.sort((o1, o2) -> o2.compareTo(o1));

    // Method references make NO REFERENCE to the arguments
    names.sort(String::compareTo);

    // can also change (x) -> thing(x) to x -> thing(x)

    System.out.println(names);

    // OK, good context
//    Comparator<String> cs = (o1, o2) -> o2.compareTo(o1);
    // NONONONO, no context :)
//    Object cs = (o1, o2) -> o2.compareTo(o1);
    // context can be assignment, or function arg, or function return
    // or a cast :)
    Object cs = (Comparator<String>)(o1, o2) -> o2.compareTo(o1);

  }
}
