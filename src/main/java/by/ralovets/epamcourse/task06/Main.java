package by.ralovets.epamcourse.task06;

import by.ralovets.epamcourse.input.ConsoleInput;
import by.ralovets.epamcourse.task06.exception.TimeException;

/**
 * 6. Идет n-я секунда суток, определить, сколько полных часов,
 * полных минут и секунд прошло к этому моменту.
 */
public class Main {
    public final static int SECONDS_IN_MINUTE = 60;
    public final static int SECONDS_IN_HOUR = SECONDS_IN_MINUTE * 60;
    public final static int SECONDS_IN_DAY = SECONDS_IN_HOUR * 24;

    public final static String EXCEPTION_MSG = "Неверное количество секунд";

    public static void main(String[] args) {
        int n = ConsoleInput.readInteger();

        try {
            System.out.println(getTime(n));
        } catch (TimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getTime(int seconds) throws TimeException {
        if (seconds < 0 | seconds > SECONDS_IN_DAY)
            throw new TimeException(EXCEPTION_MSG);

        int hours;
        int minutes;

        hours = getFullHours(seconds);
        seconds -= hours * SECONDS_IN_HOUR;

        minutes = getFullMinutes(seconds);
        seconds -= minutes * SECONDS_IN_MINUTE;

        return String.format("%2d hours %2d minutes %2d seconds",
                hours, minutes, seconds);
    }

    public static int getFullHours(int seconds) throws TimeException {
        if (seconds < 0)
            throw new TimeException(EXCEPTION_MSG);

        return seconds / SECONDS_IN_HOUR;
    }

    public static int getFullMinutes(int seconds) throws TimeException {
        if (seconds < 0)
            throw new TimeException(EXCEPTION_MSG);

        return seconds / SECONDS_IN_MINUTE;
    }
}
