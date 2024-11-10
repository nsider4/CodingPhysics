package org.nsider;

public class PythagoreanTheorem {

    public static void main(String[] args) {
        TriangleSides sides = new TriangleSides();
        PythagoreanCalculator calculator = new PythagoreanCalculator(sides);

        calculator.handleSideCalculation();
    }
}