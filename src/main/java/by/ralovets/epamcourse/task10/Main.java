package by.ralovets.epamcourse.task10;

import by.ralovets.epamcourse.input.ConsoleInput;
import by.ralovets.epamcourse.task10.exception.IllegalIntervalException;

import java.util.function.Consumer;

import static java.lang.Math.*;

/**
 * 10.	Составить программу для вычисления значений функции F(x) = tg(x)
 * на отрезке [а, b] с шагом h. Результат представить в виде таблицы,
 * первый столбец которой – значения аргумента,
 * второй - соответствующие значения функции
 */
public class Main {
    public final static double EPS = 10E-6;
    // PI / 2 + PI / n, где n - целое число
    public final static double INVALID_ARG = PI / 2;

    public final static String TOO_SMALL_STEP_MSG
            = "Шаг не должен быть меньше допустимой погрешности";
    public final static String BORDERS_EXCEPTION_MSG
            = "Левая граница не должна быть больше правой";

    public static void main(String[] args) {
        System.out.println("Определите начало интервала");
        double a = ConsoleInput.readDouble();
        System.out.println("Определите конец интервала");
        double b = ConsoleInput.readDouble();
        System.out.println("Определите шаг аргумента функции");
        double h = ConsoleInput.readDouble();

        Consumer<String> printer = System.out::println;
        try {
            calcAndPrintValues(a, b, h, printer);
        } catch (IllegalIntervalException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void calcAndPrintValues(
            double from, double to, double step,
            Consumer<String> printer) throws IllegalIntervalException {
        if (Math.abs(step) < EPS) {
            throw new IllegalIntervalException(TOO_SMALL_STEP_MSG);
        }

        if (from > to & step > 0) {
            throw new IllegalIntervalException(BORDERS_EXCEPTION_MSG);
        }

        if (from < to & step < 0) {
            throw new IllegalIntervalException(BORDERS_EXCEPTION_MSG);
        }

        double x = from;
        if (step > 0) {
            while (x < to + EPS) {
                if (isZero(x)) {
                    x = 0;
                }

                if (isInvalidArgument(x)) {
                    printer.accept(String.format("x: %.4f\t\ty: -", x));
                } else {
                    printer.accept(String.format("x: %.4f\t\ty: %.4f",
                            x, tan(x)));
                }

                x += step;
            }
        } else {
            while (x > to - EPS) {
                if (isZero(x)) {
                    x = 0;
                }

                if (isInvalidArgument(x)) {
                    printer.accept(String.format("x: %.4f\t\ty: -", x));
                } else {
                    printer.accept(String.format("x: %.4f\t\ty: %.4f",
                            x, tan(x)));
                }

                x += step;
            }
        }
    }

    public static boolean isInvalidArgument(double x) {
        x = x % PI;

        return abs(abs(x) - INVALID_ARG) < EPS;
    }

    public static boolean isZero(double x) {
        return Math.abs(x) < EPS;
    }
}