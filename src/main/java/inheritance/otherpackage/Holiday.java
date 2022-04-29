package inheritance.otherpackage;

import inheritance.Date;

public class Holiday extends Date {
  String name;
  int d = getDValue();

  {
    System.out.println("instance initializer");
    // instance initializer
    d *=2;
  }
  static int getDValue() {
    System.out.println("getting D value");
    return 99;
  }

  public Holiday(int day, int month, int year, String name) {
//    super(); // doesn't exist!!!

    // cannot have any reference to "this"
    // nor to any code, before the call to super(...)
//    super(this.d, month, year);

    super(day, month, year); // but this is OK
    // implicit HERE is invocation of all instance initializers...
    System.out.println("In constructor");
    this.name = name;
  }

  public Holiday(String name) {
    // "sideways" but still up immediately on arrival at the other constructor
    this(1, 1, 2000, name);
    System.out.println("in secondary constructor");
  }

//  public static String asText(Date h) { // FAILS
  public static String asText(Holiday h) { // works
    return "Holiday with day = " + h.day;
  }

  @Override // Checks to see if this method *IS* an override
  public String toString() {
//    int day = 999; // this would be used in preference to
    // "this.day" in the next line, if this decl existed
//    String rv =  "I'm a Holiday with " + "Date: day=" + day + ", month="
//        + this.getMonth() + ", year=" + this.getYear()
//        + " and my name is " + name;

    // super.blah() invokes the version of blah() that we would
    // have had, if we had not overridden it here.
    String rv =  "I'm a Holiday with " + super.toString()
        + " and my name is " + name;
    int day = 999;
    return rv;
  }
}
