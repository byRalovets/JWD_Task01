package by.ralovets.epamcourse.task03;

import by.ralovets.epamcourse.input.ConsoleInput;
import by.ralovets.epamcourse.task03.math.Square;
import by.ralovets.epamcourse.task03.math.exception.SquareException;

import static by.ralovets.epamcourse.task03.math.Square.getSideFromArea;
import static by.ralovets.epamcourse.task03.math.Square.getSideFromDiagonal;

/**
 * Задание 3. Окружность вписана в квадрат заданной площади;
 * Найти площадь квадрата, вписанного в эту окружность;
 * Во сколько раз площадь вписанного квадрата меньше площади заданного.
 * <p>
 * Circumradius - радиус описанной окружности;
 * Inradius - радиус вписанной окружности;
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите площадь большого квадрата");
        double outerSquareArea = ConsoleInput.readDouble();

        double outerSquareSide;
        try {
            outerSquareSide = getSideFromArea(outerSquareArea);
        } catch (SquareException e) {
            System.out.println(e.getMessage());
            return;
        }

        Square outerSquare;
        try {
            outerSquare = new Square(outerSquareSide);
        } catch (SquareException e) {
            System.out.println(e.getMessage());
            return;
        }

        // Получим радиус окружности, описывающей маленький квадрат
        // или, по-другому, вписанной в большой квадрат)
        double innerSquareCircumradius = outerSquare.getInradius();

        // Диагональ квадрата, вписанного в окружность,
        // равна двум радиусам данной окружности
        double innerSquareDiagonal = innerSquareCircumradius * 2;

        // Сторона квадрата равна квадратному корню из его диагонали
        double innerSquareSide;
        try {
            innerSquareSide = getSideFromDiagonal(innerSquareDiagonal);
        } catch (SquareException e) {
            System.out.println(e.getMessage());
            return;
        }

        Square innerSquare;
        try {
            innerSquare = new Square(innerSquareSide);
        } catch (SquareException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.printf("Площади квадратов отличаются в %.2f раза\n",
                outerSquare.getArea() / innerSquare.getArea());
    }

}
