package org.nsider;

import java.util.Scanner;

public class TranslationManager {

    /** Method to translate a point */
    protected Point translatePoint(Point point, double tx, double ty) {
        return new Point(point.x + tx, point.y + ty);
    }

    /** Method to calculate a translation vector */
    protected Point calculateTranslation(Point basePoint, Point transformedPoint) {
        return new Point(transformedPoint.x - basePoint.x, transformedPoint.y - basePoint.y);
    }
}