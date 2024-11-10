package org.nsider;

/* Class to represent a point with x and y coordinates */
public class Point {

    private double x;
    private double y;

    /* Constructor */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /* Getters */
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    /* Setter methods */
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    /* Method to calculate the distance to another point */
    public double distanceTo(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    /* Method to rotate the point around a center by a given angle */
    public Point rotateAround(Point center, double angleInDegrees) {
        double radians = Math.toRadians(angleInDegrees);

        /* Translate point to origin */
        double translatedX = this.x - center.x;
        double translatedY = this.y - center.y;

        /* Perform rotation */
        double rotatedX = translatedX * Math.cos(radians) - translatedY * Math.sin(radians);
        double rotatedY = translatedX * Math.sin(radians) + translatedY * Math.cos(radians);

        /* Translate back to the original center */
        rotatedX += center.x;
        rotatedY += center.y;

        return new Point(rotatedX, rotatedY);
    }

    /* Method to find the midpoint between this point and another point */
    public Point midpoint(Point other) {
        double midX = (this.x + other.x) / 2;
        double midY = (this.y + other.y) / 2;
        return new Point(midX, midY);
    }
}
