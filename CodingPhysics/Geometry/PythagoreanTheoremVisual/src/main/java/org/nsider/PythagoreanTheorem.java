package org.nsider;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class PythagoreanTheorem extends Application {

    private static double a, b, c;

    public static void main(String[] args) {
        /* Prompt the user to choose which side to calculate (a, b, or c) */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose which side to calculate (a, b, or c): ");
        String sideToCalculate = scanner.nextLine().toLowerCase();

        /* Handle the input and calculate the chosen side */
        switch (sideToCalculate) {
            case "c":
                /* Calculate the hypotenuse */
                calculateHypotenuse(scanner);
                break;
            case "a":
                /* Calculate side a */
                calculateSideA(scanner);
                break;
            case "b":
                /* Calculate side b */
                calculateSideB(scanner);
                break;
            default:
                /* Handle invalid input */
                System.out.println("Invalid choice.");
                return;
        }

        /* Launch the JavaFX application to display the triangle */
        launch(args);
    }

    /* Method to calculate and print the hypotenuse */
    private static void calculateHypotenuse(Scanner scanner) {
        System.out.print("Enter side a: ");
        a = scanner.nextDouble();
        System.out.print("Enter side b: ");
        b = scanner.nextDouble();
        c = calculateHypotenuse(a, b);
        System.out.printf("The length of the hypotenuse (c) is: %.4f%n", c);
    }

    /* Method to calculate and print side a */
    private static void calculateSideA(Scanner scanner) {
        System.out.print("Enter hypotenuse c: ");
        c = scanner.nextDouble();
        System.out.print("Enter side b: ");
        b = scanner.nextDouble();
        a = calculateSide(c, b);
        System.out.printf("The length of side a is: %.4f%n", a);
    }

    /* Method to calculate and print side b */
    private static void calculateSideB(Scanner scanner) {
        System.out.print("Enter hypotenuse c: ");
        c = scanner.nextDouble();
        System.out.print("Enter side a: ");
        a = scanner.nextDouble();
        b = calculateSide(c, a);
        System.out.printf("The length of side b is: %.4f%n", b);
    }

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();

        double maxVisualLength = 300;  /* Max length for the longest side in the visual representation */

        double sideA = a;
        double sideB = b;
        double sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));  /* Calculate the hypotenuse (c) */

        double maxSide = Math.max(Math.max(sideA, sideB), sideC);  /* The longest side (either a, b, or c) */
        double scaleFactor = maxVisualLength / maxSide;

        double scaledSideA = sideA * scaleFactor;
        double scaledSideB = sideB * scaleFactor;
        double scaledSideC = sideC * scaleFactor;

        double baseY = scaledSideB + 20;  /* Adjust baseY based on scaled height of sideB */

        Line lineA = new Line(50, baseY, 50 + scaledSideA, baseY);
        Line lineB = new Line(50, baseY, 50, baseY - scaledSideB);
        Line lineC = new Line(50 + scaledSideA, baseY, 50, baseY - scaledSideB);

        lineA.setStroke(Color.BLUE);
        lineB.setStroke(Color.GREEN);
        lineC.setStroke(Color.RED);

        Text textA = new Text(50 + scaledSideA / 2, baseY + 15, "a = " + String.format("%.2f", sideA));
        Text textB = new Text(30, baseY - scaledSideB * 0.5 - 10, "b = " + String.format("%.2f", sideB));
        Text textC = new Text(50 + scaledSideA / 2 + 10, baseY - scaledSideB * 0.5 + 10, "c = " + String.format("%.2f", sideC));

        pane.getChildren().addAll(lineA, lineB, lineC, textA, textB, textC);

        double sceneWidth = 50 + scaledSideA + 50;  /* Add 50 margin on both sides */
        double sceneHeight = baseY + 30;  /* Reduced space at the bottom */

        Scene scene = new Scene(pane, sceneWidth, sceneHeight);

        stage.setTitle("Pythagorean Theorem Visualization");
        stage.setScene(scene);
        stage.show();
    }

    /* Calculates the hypotenuse when a and b are given */
    public static double calculateHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    /* Calculates a side when the hypotenuse and one other side are known */
    public static double calculateSide(double c, double knownSide) {
        return Math.sqrt(c * c - knownSide * knownSide);
    }
}