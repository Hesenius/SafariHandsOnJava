package inheritance;

import inheritance.otherpackage.Holiday;

public class Date {
//  private int day; // inaccessible outside our top-level curlies

//  int day; // accessible ANYWHERE in the SAME PACKAGE

// protected is MORE ACCESSIBLE than default!
// (adds subclass access, provided reference
// type is of subclass type)
  protected int day;

  private int month;
  private int year;

  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  // IFF we provide ZERO constructors in the code
  // then compiler generates "default constructor"
  // generally: takes zero arguments, and has
  // accessibility of the enclosing class
  // and initilizes no fields. I.e.
//  public Date() {
//  }

  public int getDay() {
    return day;
  }

  public int getMonth() {
    return month;
  }

  public int getYear() {
    return year;
  }

  public void setDay(int day) {
//    if (day not valid) throw exception;
    this.day = day;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String toString() {
    return "Date: day=" + day + ", month=" + month + ", year=" + year;
  }
}


class UseDateEtc {
  public static void main(String[] args) {
//    Date h = new Holiday(1, 1, 2023, "New Year's day");
    Date h = new Holiday("New Year's day");
//    System.out.println("day is " + h.day);
    System.out.println(h);

    Date d = new Date(1, 1, 2000);
  }
}