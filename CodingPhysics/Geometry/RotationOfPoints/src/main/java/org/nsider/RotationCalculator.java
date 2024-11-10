package org.nsider;

import java.util.Scanner;

public class RotationCalculator {

    public static void main(String[] args) {
        new RotationCalculator().run(args);
    }

    public void run(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RotationOperations operations = new RotationOperations();
        boolean exit = false;

        while (!exit) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> operations.findAngleOfRotation(scanner);
                case 2 -> operations.findPerpendicularBisector(scanner);
                case 3 -> operations.rotatePoint(scanner);
                case 4 -> exit = true;
                default -> System.out.println("\nInvalid option. Please try again.");
            }
        }
        scanner.close();
        System.out.println("\nGoodbye!");
    }

    /* Display menu options */
    private void displayMenu() {
        System.out.println("\n--- Rotation Calculator Menu ---");
        System.out.println("1. Find angle of rotation given base and transformed points (with optional center)");
        System.out.println("2. Find perpendicular bisector between two points");
        System.out.println("3. Rotate a point around a center by a given angle");
        System.out.println("4. Exit");
        System.out.print("\nChoose an option: ");
    }
}