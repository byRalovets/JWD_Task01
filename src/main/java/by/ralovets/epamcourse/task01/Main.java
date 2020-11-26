package by.ralovets.epamcourse.task01;

import by.ralovets.epamcourse.input.ConsoleInput;

/**
 * Задача 1. Написать программу, позволяющую по последней цифре числа
 * определить последнюю цифру его квадрата.
 */
public class Main {

    public static void main(String[] args) {
        int a = ConsoleInput.readInteger();

        System.out.printf("Последняя цифра квадрата числа %d: %d\n",
                a, getLastDigitOfSquare(a));
    }

    public static int getLastDigitOfSquare(int number) {
        int result = number;

        // to avoid number overflow I work with the last digit
        if (result > 9 | result < -9)
            result = getLastDigit(result);

        result *= result;

        if (result > 9) {
            return getLastDigit(result);
        }

        return result;
    }

    public static int getLastDigit(int number) {
        return Math.abs(number % 10);
    }
}
