package org.nsider;

import java.util.Scanner;

public class TranslationDisplay {
    private TranslationManager manager;

    /* Constructor */
    public TranslationDisplay() {
        manager = new TranslationManager();
    }

    /* Method to start the program */
    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            /*  Display the menu */
            displayMenu();

            System.out.print("Enter your choice (1/2/3): ");
            choice = scanner.nextInt();

            /*  Process the user's choice */
            switch (choice) {
                case 1 -> translatePoints(scanner);
                case 2 -> calculateTranslations(scanner);
                case 3 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    /* Method to display the menu */
    private void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Translate a point");
        System.out.println("2. Calculate translation");
        System.out.println("3. Exit");
    }

    /* Method to handle translating multiple points */
    protected void translatePoints(Scanner scanner) {
        boolean addMorePoints = true;

        while (addMorePoints) {
            Point point = getPointFromUser(scanner);
            double[] translation = getTranslationFromUser(scanner);

            Point translatedPoint = manager.translatePoint(point, translation[0], translation[1]);
            System.out.println("\nOriginal point: (" + point.x + ", " + point.y + ")");
            System.out.println("Translated point: (" + translatedPoint.x + ", " + translatedPoint.y + ")");

            addMorePoints = shouldContinue(scanner, "\nWould you like to translate another point? (y/n): ");
        }
    }

    /* Method to handle calculating multiple translation vectors */
    protected void calculateTranslations(Scanner scanner) {
        boolean calculateMoreTranslations = true;

        while (calculateMoreTranslations) {
            Point basePoint = getPointFromUser(scanner, "\nEnter the base point (x y): ");
            Point transformedPoint = getPointFromUser(scanner, "\nEnter the transformed point (x y): ");

            Point translation = manager.calculateTranslation(basePoint, transformedPoint);
            System.out.println("\nTranslation applied: (" + translation.x + ", " + translation.y + ")");

            calculateMoreTranslations = shouldContinue(scanner, "\nWould you like to calculate another translation? (y/n): ");
        }
    }

    /* Method to ask the user if they want to continue */
    private boolean shouldContinue(Scanner scanner, String prompt) {
        System.out.print(prompt);
        String response = scanner.next();
        return response.equalsIgnoreCase("y");
    }

    /*  Method to get a point from the user */
    private Point getPointFromUser(Scanner scanner) {
        return getPointFromUser(scanner, "\nEnter the point (x y): ");
    }

    private Point getPointFromUser(Scanner scanner, String prompt) {
        System.out.println(prompt);
        System.out.print("Enter x coordinate: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y coordinate: ");
        double y = scanner.nextDouble();
        return new Point(x, y);
    }

    /* Method to get the translation from the user */
    private double[] getTranslationFromUser(Scanner scanner) {
        System.out.print("\nEnter the translation for (x): ");
        double tx = scanner.nextDouble();
        System.out.print("Enter the translation for (y): ");
        double ty = scanner.nextDouble();
        return new double[] {tx, ty};
    }
}
