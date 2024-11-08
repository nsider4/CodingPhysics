package org.nsider;

public class PythagoreanTheoremSimple {

    /* Very simple hard-coded example of the Pythagorean theorem */
    public static void simpleTheoremExample() {
        // a^2 + b^2 = c^2

        double a = 8;
        double b = 8;
        double c;

        System.out.println("a: " +a);
        System.out.println("b: " +b);

        System.out.println("\na^2 + b^2 = c^2\n");

        System.out.println(a + "^2 + " + b + "^2 = c^2");
        System.out.println("√(" + a + "^2 - " + b + "^2) = c");

        /* Calculating hypotenuse */
        c = Math.sqrt(a*a + b*b);

        System.out.println(c + " = c");
    }
}
