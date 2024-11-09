package org.nsider;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
