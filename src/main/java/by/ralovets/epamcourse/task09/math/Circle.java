package by.ralovets.epamcourse.task09.math;

import by.ralovets.epamcourse.task09.math.exception.CircleException;

import static java.lang.Math.PI;

public class Circle {

    public final static String NOT_POSITIVE_RADIUS_MSG
            = "Радиус окружности должен быть положительным числом";

    public static double getCircumference(int radius) throws CircleException {
        if (radius <= 0) {
            throw new CircleException(NOT_POSITIVE_RADIUS_MSG);
        }
        return 2 * PI * radius;
    }

    public static double getArea(int radius) throws CircleException {
        if (radius <= 0) {
            throw new CircleException(NOT_POSITIVE_RADIUS_MSG);
        }
        return PI * radius * radius;
    }
}
