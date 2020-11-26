package by.ralovets.epamcourse.task02;

import by.ralovets.epamcourse.input.ConsoleInput;
import by.ralovets.epamcourse.task02.util.Month;
import by.ralovets.epamcourse.task02.util.exception.MonthException;

/**
 * Задача 2. Составить программу, которая по заданным году и номеру месяца
 * определяет количество дней в этом месяце и корректно определялись все
 * високосные года.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите год");
        int year = ConsoleInput.readInteger();

        System.out.println("Введите месяц");
        int monthNumber = ConsoleInput.readInteger();

        Month month = null;
        try {
            month = new Month(monthNumber, year);
        } catch (MonthException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.printf("В этом месяце %d дней\n", month.getDaysCount());
    }
}
