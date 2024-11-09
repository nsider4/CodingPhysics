package org.nsider;

import javafx.application.Application;


public class PythagoreanTheorem {

    private final TriangleSides sides;
    private final PythagoreanCalculator calculator;

    public PythagoreanTheorem() {
        this.sides = new TriangleSides();
        this.calculator = new PythagoreanCalculator(sides);
    }

    public static void main(String[] args) {
        new PythagoreanTheorem().run(args);
    }

    public void run(String[] args) {
        calculator.handleSideCalculation();

        TriangleVisualizer.setSides(sides);
        Application.launch(TriangleVisualizer.class, args);
    }
}