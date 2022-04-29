package usesealed;

sealed public class Parent permits Child/*, OtherChild*/ {
}

final class Child extends Parent {}

/*non-sealed */class OtherChild /*extends Parent*/ {}
