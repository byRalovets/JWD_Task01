package by.ralovets.epamcourse.task02.util;

import by.ralovets.epamcourse.task02.util.exception.MonthException;

public class Month {

    public static final String INCORRECT_MONTH_INDEX_MSG
            = "Номер месяца должен удовлетворять x с целыми числами от 1 до 12";
    public static final String INCORRECT_YEAR_MSG
            = "Год должен быть положительным числом";
    public final static int[] MONTHES
            = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private int daysCount;

    public int getDaysCount() {
        return daysCount;
    }

    public Month(int month, int year) throws MonthException {
        if (month < 1 | month > 12) {
            throw new MonthException(INCORRECT_MONTH_INDEX_MSG);
        }

        if (year < 1) {
            throw new MonthException(INCORRECT_YEAR_MSG);
        }

        daysCount = MONTHES[month - 1];

        boolean isLeapYear = isLeapYear(year);
        if (month == 2 & isLeapYear) {
            daysCount++;
        }
    }

    /**
     * Leap year is year which is divisible by 4 without remainder
     * But if year is divisible by 100, it also should be divisible by 400
     */
    private boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}
