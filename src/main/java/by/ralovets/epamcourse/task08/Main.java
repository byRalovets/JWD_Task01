package by.ralovets.epamcourse.task08;

import by.ralovets.epamcourse.input.ConsoleInput;
import by.ralovets.epamcourse.task08.exception.FunctionUndefinedException;

/**
 * 8. Вычислить значение функции
 * <p>
 * Запуск проекта:
 * 1. mvn compile
 * 2. mvn exec:java -Dexec.mainClass="by.ralovets.epamcourse.Main"
 */
public class Main {

    public static final double EPS = 10E-9;
    public final static String DIV_BY_ZERO_MSG =
            "Введённый X не удовлетворяет области определения функции";

    public static void main(String[] args) {
        System.out.println("Введите аргумент функции");
        double x = ConsoleInput.readDouble();

        try {
            System.out.println("Значение функции " + function(x));
        } catch (FunctionUndefinedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double function(double x) throws FunctionUndefinedException {
        if (x >= 3) {
            return function1(x);
        }
        return function2(x);
    }

    private static double function1(double x) {
        return -(x * x) + (3 * x) + 9;
    }

    private static double function2(double x)
            throws FunctionUndefinedException {
        double denominator = x * x * x - 6;
        if (Math.abs(denominator) <= EPS)
            throw new FunctionUndefinedException(DIV_BY_ZERO_MSG);
        return 1 / denominator;
    }
}