package by.ralovets.epamcourse.task05;

import by.ralovets.epamcourse.input.ConsoleInput;

import java.util.ArrayList;
import java.util.List;

/**
 * 5. Составить программу, печатающую значение true,
 * если указанное высказывание является истинным,
 * и false — в противном случае: является ли целое
 * число совершенным (сумма делителей равна самому числу.
 */
public class Main {
    public static void main(String[] args) {
        int a = ConsoleInput.readInteger();
        System.out.println(isPerfectNumber(a));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int dividersSum = getIntListSum(getDividers(number));
        return number == dividersSum;
    }

    public static int getIntListSum(List<Integer> integerList) {
        int sum = 0;
        for (int i: integerList) {
            sum += i;
        }
        return sum;
    }

    public static List<Integer> getDividers(int number) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < number / 2 + 1; i++) {
            if (number % i == 0) {
                numbers.add(i);
            }
        }
        return numbers;
    }
}
