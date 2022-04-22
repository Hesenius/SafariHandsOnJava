package userecord;

// parens contain args to "canonical" constructor
// and define the only fields!!!
public record Date(int day, int month, int year) {
  // runs code *before* the canonical constructor
  // allows verification, but not assignment to fields
  public Date {
    if (!classesintro.Date.isValid(day, month, year)) {
      throw new IllegalArgumentException("Bad date values!");
    }
//    day++; YES, OK
//    this.day = day + 1; NO!!!
  }
}

class UseDateRecord {
  public static void main(String[] args) {
    Date d = new Date(22, 4, 2022);
    Date d1 = new Date(22, 4, 2022);
    Date d2 = new Date(18, 4, 2022);
    System.out.println(d.day());
    System.out.println(d);
//    d.day = NOPE, private again.

    System.out.println("d.equals(d1)? " + d.equals(d1));
    System.out.println("d.equals(d2)? " + d.equals(d2));

  }
}