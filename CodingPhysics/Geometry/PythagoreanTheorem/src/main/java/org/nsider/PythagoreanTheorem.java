package org.nsider;

import java.util.Scanner;

public class PythagoreanTheorem {

    public static void main(String[] args) {
        runCalculator();
        //PythagoreanTheoremSimple.simpleTheoremExample();         <----- Uncomment this line to run the simple Pythagorean theorem example
    }

    /* Method to run the Pythagorean Theorem calculator */
    private static void runCalculator() {
        /* Initialize scanner for user input */
        Scanner scanner = new Scanner(System.in);

        /* Display program header */
        System.out.println("Pythagorean Theorem Calculator");
        System.out.println("Choose which side to calculate (a, b, or c): ");

        /* Prompt user to choose the side they want to calculate */
        String sideToCalculate = scanner.nextLine().toLowerCase();

        double a = 0, b = 0, c = 0;

        /* Use a switch statement to calculate the selected side */
        switch (sideToCalculate) {
            case "c":
                a = promptForSide(scanner, "Enter side a: ");
                b = promptForSide(scanner, "Enter side b: ");

                c = calculateHypotenuse(a, b);
                System.out.printf("The length of the hypotenuse (c) is: %.4f%n", c);
                break;

            case "a":
                c = promptForSide(scanner, "Enter hypotenuse c: ");
                b = promptForSide(scanner, "Enter side b: ");

                if (c <= b) { /* Check that the hypotenuse is greater than the other side */
                    System.out.println("The hypotenuse must be greater than the other side.");
                    scanner.close();
                    return;
                }

                a = calculateSide(c, b);
                System.out.printf("The length of side a is: %.4f%n", a);
                break;

            case "b":
                c = promptForSide(scanner, "Enter hypotenuse c: ");
                a = promptForSide(scanner, "Enter side a: ");

                if (c <= a) { /* Check that the hypotenuse is greater than the other side */
                    System.out.println("The hypotenuse must be greater than the other side.");
                    scanner.close();
                    return;
                }

                b = calculateSide(c, a);
                System.out.printf("The length of side b is: %.4f%n", b);
                break;

            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        /* Display the final equation used */
        System.out.print("\nCalculation Summary:\n");
        displayResult(a, b, c, sideToCalculate);

        /* Close scanner */
        scanner.close();
    }

    /* Helper method to prompt the user for a side and return the value */
    private static double promptForSide(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    /* Method to calculate the hypotenuse (c) */
    private static double calculateHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    /* Method to calculate a side (a or b) based on the hypotenuse (c) and the other side */
    private static double calculateSide(double c, double knownSide) {
        return Math.sqrt(c * c - knownSide * knownSide);
    }

    /* Method to display the calculation summary */
    private static void displayResult(double a, double b, double c, String sideToCalculate) {
        if (sideToCalculate.equalsIgnoreCase("c")) { /* For hypotenuse (c) */
            System.out.printf("%.2f^2 + %.2f^2 = c^2\n", a, b);
            System.out.printf("c = √(%.2f + %.2f) = %.4f\n", a * a, b * b, c);

        } else if (sideToCalculate.equalsIgnoreCase("a")) { /* For side a */
            System.out.printf("%.2f^2 + %.2f^2 = a^2\n", b, c);
            System.out.printf("a = √(%.2f - %.2f) = %.4f\n", b * b, c * c, a);

        } else if (sideToCalculate.equalsIgnoreCase("b")) { /* For side b */
            System.out.printf("%.2f^2 + %.2f^2 = b^2\n", a, c);
            System.out.printf("b = √(%.2f - %.2f) = %.4f\n", a * a, c * c, b);
        }
    }
}