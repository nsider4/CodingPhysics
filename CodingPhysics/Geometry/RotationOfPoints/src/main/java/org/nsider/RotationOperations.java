package org.nsider;

import java.util.Scanner;

public class RotationOperations {

    /* Option 1: Calculate the angle of rotation with an optional center */
    protected void findAngleOfRotation(Scanner scanner) {
        Point basePoint = promptPoint(scanner, "Enter the base point");
        Point transformedPoint = promptPoint(scanner, "Enter the transformed point");
        Point center = promptOptionalCenter(scanner);

        double angle1 = Math.toDegrees(Math.atan2(basePoint.getY() - center.getY(), basePoint.getX() - center.getX()));
        double angle2 = Math.toDegrees(Math.atan2(transformedPoint.getY() - center.getY(), transformedPoint.getX() - center.getX()));
        double angleOfRotation = angle2 - angle1;

        System.out.printf("\nAngle of rotation: %.2f°%n", angleOfRotation);
    }

    /* Option 2: Find the perpendicular bisector between two points */
    protected void findPerpendicularBisector(Scanner scanner) {
        Point point1 = promptPoint(scanner, "Enter the first point");
        Point point2 = promptPoint(scanner, "Enter the second point");

        Point midpoint = point1.midpoint(point2);
        double slope = (point2.getY() - point1.getY()) / (point2.getX() - point1.getX());
        double perpSlope = -1 / slope;

        System.out.printf("\nMidpoint (center of perpendicular bisector): (%.4f, %.4f)%n", midpoint.getX(), midpoint.getY());
        System.out.printf("Perpendicular bisector line equation: y = %.4fx + %.4f%n", perpSlope, midpoint.getY() - perpSlope * midpoint.getX());
    }

    /* Option 3: Rotate a point around a center by a specified angle */
    protected void rotatePoint(Scanner scanner) {
        Point point = promptPoint(scanner, "Enter the point to rotate");
        Point center = promptPoint(scanner, "Enter the center of rotation");

        System.out.print("\nEnter the angle of rotation in degrees (positive for counterclockwise, negative for clockwise): ");
        double angle = scanner.nextDouble();

        /* Rotate the point */
        Point rotatedPoint = point.rotateAround(center, angle);

        System.out.printf("\nRotated point: (%.4f, %.4f)%n", rotatedPoint.getX(), rotatedPoint.getY());
    }

    /* Helper method to prompt for a point */
    private Point promptPoint(Scanner scanner, String prompt) {
        System.out.println("\n" + prompt);
        System.out.print("x: ");
        double x = scanner.nextDouble();
        System.out.print("y: ");
        double y = scanner.nextDouble();
        return new Point(x, y);
    }

    /* Helper method to prompt for an optional center point, defaults to (0, 0) */
    private Point promptOptionalCenter(Scanner scanner) {
        scanner.nextLine();  // Consume newline
        System.out.print("\nEnter the center of rotation cx (or press Enter to use (0,0)): ");
        String input = scanner.nextLine().trim();
        double cx = 0, cy = 0;
        if (!input.isEmpty()) {
            cx = Double.parseDouble(input);
            System.out.print("Enter the center of rotation cy: ");
            cy = scanner.nextDouble();
        }
        return new Point(cx, cy);
    }
}