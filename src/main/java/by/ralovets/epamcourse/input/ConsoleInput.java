package by.ralovets.epamcourse.input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInput {

    private static final Scanner SCANNER = new Scanner(System.in);

    private ConsoleInput() {
    }

    public static int readInteger() {
        boolean isIncorrectValue = true;
        int value = 0;

        do {
            try {
                System.out.print("Введите целое число: ");
                value = SCANNER.nextInt();
                isIncorrectValue = false;
            } catch (InputMismatchException e) {
                SCANNER.next();
            }
        } while (isIncorrectValue);

        return value;
    }

    public static double readDouble() {
        boolean isIncorrectValue = true;
        double value = 0;

        do {
            try {
                System.out.print("Введите число: ");
                value = SCANNER.nextDouble();
                isIncorrectValue = false;
            } catch (InputMismatchException e) {
                SCANNER.next();
            }
        } while (isIncorrectValue);

        return value;
    }

    public static int readIntegerFrom(int value) {
        int result;
        do {
            result = readInteger();
        } while (result < value);

        return result;
    }
}