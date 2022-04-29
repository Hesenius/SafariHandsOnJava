package generalization;

import java.sql.SQLException;

public class Parent {
  public CharSequence doStuff() {
    System.out.println("Parent.doStuff()");
    return "Parent.doStuff()";
  }
}

class Child extends Parent {
  //  public CharSequence doStuff() {

  // OK, all string are charsequence (covariant return)
//  public String doStuff() {

  // MUST NOT throw any exceptions in an overriding method
  // that are not "permitted" in the parent method
//  public CharSequence doStuff() throws SQLException {

  // covariant returns are OK, but incompatible returns are not!
//  public Object doStuff() {

  // FAILS: overriding methods must not be LESS accessible
//  CharSequence doStuff() {

  @Override
  public CharSequence doStuff() {
    System.out.println("Child.doStuff()");
    return "Child.doStuff";
  }
}

class TryIt {
  public static void main(String[] args) {
    Parent p = new Child();
    CharSequence cs = p.doStuff();
  }
}