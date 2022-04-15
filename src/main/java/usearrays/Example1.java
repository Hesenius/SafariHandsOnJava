package usearrays;

public class Example1 {
  public static void main(String[] args) {

    // arrays, even arrays of primitives, are reference types, NOT primitives
    int [] ia;
    // ALL objects (including arrays) are ZEROED when allocated
    ia = new int[3];
    ia[0] = 10;
    ia[0] += 20;
    System.out.println(ia[0]);

    // FAILS, java arrays are FIXED SIZE after creation
//    ia[3] = 99;
//    System.out.println(ia[3]);

    System.out.println(ia.length);

//    String [] names = new String[] {
    // can leave out "new String[]" IFF compiler believes the base
    // type is unambigous in this context
    String [] names = {
        "Fred", "Jim", "Sheila"
    };
    System.out.println(names.length);
    System.out.println(names[0]);

    int [][] iaa = {
        {1,2,3},
        {4,5},
        {6,7,8,9,10}, // trailing comma is OK :)
    };

    System.out.println(iaa[0][1]);

    int [][] iaa2 = new int[3][];
    iaa2[0] = new int[4];
  }
}
