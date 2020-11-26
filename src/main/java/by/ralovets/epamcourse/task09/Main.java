package by.ralovets.epamcourse.task09;

import by.ralovets.epamcourse.input.ConsoleInput;
import by.ralovets.epamcourse.task09.math.Circle;
import by.ralovets.epamcourse.task09.math.exception.CircleException;

/**
 * Вычислить длину окружности и площадь круга
 * одного и того же заданного радиуса R.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите радиус окружности");
        int radius = ConsoleInput.readIntegerFrom(0);

        try {
            System.out.printf("Длина окружности равна %f\n",
                    Circle.getCircumference(radius));
        } catch (CircleException e) {
            System.out.println(e.getMessage());
            return;
        }

        try {
            System.out.printf("Площадь круга равна %f\n",
                    Circle.getArea(radius));
        } catch (CircleException e) {
            System.out.println(e.getMessage());
        }
    }
}