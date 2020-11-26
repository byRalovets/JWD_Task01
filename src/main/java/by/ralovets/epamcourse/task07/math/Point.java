package by.ralovets.epamcourse.task07.math;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {

    private final int x;
    private final int y;
    private double distance = -1;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point point) {
        int xDistance = x - point.x;
        int yDistance = y - point.y;

        return sqrt(pow(xDistance, 2) + pow(yDistance, 2));
    }

    public double getDistance() {
        if (distance >= 0) {
            return distance;
        }
        distance = getDistance(new Point(0, 0));
        return distance;
    }
}
