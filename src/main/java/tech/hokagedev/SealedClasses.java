package tech.hokagedev;

/**
 * @author sareaboudousamadou.
 */
public class SealedClasses {
    public static void main(String[] args) {

    }
}

final class Circle extends Shape {}

non-sealed class Rectangle extends Shape {}

abstract sealed class Shape permits Circle, Rectangle {}


// Different types of constructors
