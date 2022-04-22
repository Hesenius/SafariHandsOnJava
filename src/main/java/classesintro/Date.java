package classesintro;

public class Date {
  // if a field is not explicitly initialized
  // it will contain zero :) (null, false)
  // it's the action of "new" that does this
  // private says "accessible anywhere inside the enclosing TOP LEVEL curlies"
  private int day;
  private int month;
  private int year;

  // initializers are called "constructors"
  // programmers have ZERO control over the allocation (and zeroing) of memory!
  // Name MUST BE the class name
  // MUST NOT BE a return type
  // public:
  // - in a non-modular enviroment: anywhere in the JVM
  // - in a modular environment: anywhere in the same module, or
  //   IFF exported from the containing module and our module "requires"
  //   the containing module, then anywhere in the requiring module.
  public Date(int d, int month, int year) {
    if (!isValid(d, month, year)) {
      throw new IllegalArgumentException("Bad Date values");
    }
    day = d; // "this" (aka self in Python) is optional IFF unambiguous
    this.month = month;
    this.year = year;
  }
  // IFF source code contains ZERO constructors, then the compiler
  // creates a "default" constructor. (this takes zero args,
  // and does no "interersting" initialization

  public int getDay() {
    return day;
  }

  public int getMonth() {
    return month;
  }

  // explicit declaration of this is optional (and unusual)
  public int getYear(Date this) {
    return this.year;
  }

  public void setDay(int day) {
    if (!isValid(day, month, year)) {
      throw new IllegalArgumentException("Bad day");
    }
    this.day = day;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public static boolean isValid(int day, int month, int year) {
    // exercise for the reader:
    // fix the day limit according to the month and year :)
    return day > 0 && day <= 31 && month > 0 && month < 13;
  }
}

// no access level specified implies "anywhere in the SAME PACKAGE"
// "protected" is "anywhere that default is accessible, plus (with some
// limitation) in subclasses.
class TryMyDate {
  public static void main(String[] args) {
    Date d = new Date(22, 4, 2022);
    System.out.println(d);
//    System.out.println(d.day);
//    System.out.println(d.month);
//    System.out.println(d.year);
    System.out.println(d.getDay());
    System.out.println(d.getMonth());
    System.out.println(d.getYear());
//    System.out.println(d.banana);
//    d.banana = "fruit";

//    d.setDay(39);
    d.setDay(3);
    System.out.println(d.getDay());


  }
}