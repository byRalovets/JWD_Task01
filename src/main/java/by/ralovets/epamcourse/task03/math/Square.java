package by.ralovets.epamcourse.task03.math;

import by.ralovets.epamcourse.task03.math.exception.SquareException;

public class Square {

    public static final String NOT_POSITIVE_SIDE_MSG
            = "Сторона квадрата должна быть больше 0";
    public static final String NOT_POSITIVE_AREA_MSG
            = "Площадь квадрата должна быть больше 0";
    public static final String NOT_POSITIVE_DIAGONAL_MSG
            = "Диагональ квадрата должна быть больше 0";
    private final double area;
    private final double side;

    public double getArea() {
        return area;
    }

    public Square(double side) throws SquareException {
        if (side <= 0) {
            throw new SquareException(NOT_POSITIVE_SIDE_MSG);
        }

        area = side * side;
        this.side = side;
    }

    public static double getSideFromArea(double area) throws SquareException {
        if (area <= 0) {
            throw new SquareException(NOT_POSITIVE_AREA_MSG);
        }

        return Math.sqrt(area);
    }

    public static double getSideFromDiagonal(double diagonal)
            throws SquareException {
        if (diagonal <= 0) {
            throw new SquareException(NOT_POSITIVE_DIAGONAL_MSG);
        }

        return diagonal / Math.sqrt(2);
    }

    // радиус вписанной окружности
    public double getInradius() {
        return side / 2;
    }
}
