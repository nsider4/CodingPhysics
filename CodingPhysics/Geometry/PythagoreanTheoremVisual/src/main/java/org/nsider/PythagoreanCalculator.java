package org.nsider;

import java.util.Scanner;

public class PythagoreanCalculator {

    private final TriangleSides sides;

    public PythagoreanCalculator(TriangleSides sides) {
        this.sides = sides;
    }


    /* Method to handle the side calculation */
    public void handleSideCalculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose which side to calculate (a, b, or c): ");
        String sideToCalculate = scanner.nextLine().toLowerCase();

        switch (sideToCalculate) {
            case "c" -> calculateHypotenuse(scanner);
            case "a" -> calculateSideA(scanner);
            case "b" -> calculateSideB(scanner);
            default -> System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    /* Method to calculate the hypotenuse (c) */
    private void calculateHypotenuse(Scanner scanner) {
        double a = promptForSide(scanner, "Enter side a: ");
        double b = promptForSide(scanner, "Enter side b: ");
        double c = calculateHypotenuse(a, b);
        System.out.printf("The length of the hypotenuse (c) is: %.4f%n", c);
        setSides(a, b, c);
    }

    /* Method to calculate side a based on the hypotenuse (c) and side b */
    private void calculateSideA(Scanner scanner) {
        double c = promptForSide(scanner, "Enter hypotenuse c: ");
        double b = promptForSide(scanner, "Enter side b: ");
        if (c <= b) {
            System.out.println("The hypotenuse must be greater than the other side.");
            return;
        }

        double a = calculateSide(c, b);
        System.out.printf("The length of side a is: %.4f%n", a);
        setSides(a, b, c);
    }

    /* Method to calculate side b based on the hypotenuse (c) and side a */
    private void calculateSideB(Scanner scanner) {
        double c = promptForSide(scanner, "Enter hypotenuse c: ");
        double a = promptForSide(scanner, "Enter side a: ");
        if (c <= a) {
            System.out.println("The hypotenuse must be greater than the other side.");
            return;
        }

        double b = calculateSide(c, a);
        System.out.printf("The length of side b is: %.4f%n", b);
        setSides(a, b, c);
    }

    /* Helper Setter method to set the sides */
    private void setSides(double a, double b, double c) {
        sides.setA(a);
        sides.setB(b);
        sides.setC(c);
    }

    /* Helper method to prompt the user for a side and return the value */
    private double promptForSide(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    /* Method to calculate the hypotenuse based on the two sides */
    private double calculateHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    /* Method to calculate side based on the hypotenuse (c) and the other side */
    private double calculateSide(double c, double b) {
        return Math.sqrt(c * c - b * b);
    }
}
