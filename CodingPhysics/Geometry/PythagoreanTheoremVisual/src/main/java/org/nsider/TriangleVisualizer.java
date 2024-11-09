package org.nsider;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TriangleVisualizer extends Application {

    private static TriangleSides sides;

    public static void setSides(TriangleSides triangleSides) {
        sides = triangleSides;
    }

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();

        /* Set maximum visual length for the diagram */
        double maxVisualLength = 300;
        double sideA = sides.getA(); /* Get the length of side a */
        double sideB = sides.getB(); /* Get the length of side b */
        double sideC = sides.getC(); /* Get the length of hypotenuse (c) */

        /* Calculate the scale factor to fit the triangle in the visual area */
        double maxSide = Math.max(Math.max(sideA, sideB), sideC);
        double scaleFactor = maxVisualLength / maxSide;

        /* Scale the sides for visualization */
        double scaledSideA = sideA * scaleFactor;
        double scaledSideB = sideB * scaleFactor;

        /* Position for the lines and texts */
        double baseY = scaledSideB + 20;

        /* Create the lines representing the triangle sides */
        Line lineA = new Line(50, baseY, 50 + scaledSideA, baseY); /* Line for side a */
        Line lineB = new Line(50, baseY, 50, baseY - scaledSideB); /* Line for side b */
        Line lineC = new Line(50 + scaledSideA, baseY, 50, baseY - scaledSideB); /* Line for hypotenuse c */

        /* Set colors for the sides */
        lineA.setStroke(Color.BLUE);
        lineB.setStroke(Color.GREEN);
        lineC.setStroke(Color.RED);

        /* Create text labels for each side */
        Text textA = new Text(50 + scaledSideA / 2, baseY + 15, "a = " + String.format("%.2f", sideA));
        Text textB = new Text(30, baseY - scaledSideB * 0.5 - 10, "b = " + String.format("%.2f", sideB));
        Text textC = new Text(50 + scaledSideA / 2 + 10, baseY - scaledSideB * 0.5 + 10, "c = " + String.format("%.2f", sideC));

        /* Add the lines and texts to the pane */
        pane.getChildren().addAll(lineA, lineB, lineC, textA, textB, textC);

        /* Set the scene size based on the scaled sides */
        double sceneWidth = 50 + scaledSideA + 50;
        double sceneHeight = baseY + 30;

        /* Create and show the scene */
        Scene scene = new Scene(pane, sceneWidth, sceneHeight);
        stage.setTitle("Pythagorean Theorem Visualization"); /* Set window title */
        stage.setScene(scene); /* Set the scene to the stage */
        stage.show(); /* Show the window */
    }
}
