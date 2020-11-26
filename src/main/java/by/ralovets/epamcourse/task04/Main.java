package by.ralovets.epamcourse.task04;

import by.ralovets.epamcourse.input.ConsoleInput;

/**
 * 4.	Составить программу, печатающую значение true, если указанное
 * высказывание является истинным, и false — в противном случае:
 * среди заданных целых чисел А, В, С, D есть хотя бы два четных.
 * <p>
 */
public class Main {
    public static void main(String[] args) {
        int a = ConsoleInput.readInteger();
        int b = ConsoleInput.readInteger();
        int c = ConsoleInput.readInteger();
        int d = ConsoleInput.readInteger();

        System.out.println(getEvenNumbersCount(a, b, c, d) >= 2);
    }

    public static int getEvenNumbersCount(int... numbers) {
        int evenNumbersCount = 0;
        for (int number : numbers) {
            if (isEven(number)) {
                evenNumbersCount++;
            }
        }
        return evenNumbersCount;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
