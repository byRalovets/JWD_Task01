package by.ralovets.epamcourse.task10;

import by.ralovets.epamcourse.task10.exception.IllegalIntervalException;
import org.junit.Test;

import static by.ralovets.epamcourse.task10.Main.*;
import static java.lang.Math.PI;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void calcAndPrintValuesTest01() {
        try {
            calcAndPrintValues(0, 12, -0.3, System.out::println);
            fail();
        } catch (IllegalIntervalException e) {
            assertEquals(BORDERS_EXCEPTION_MSG, e.getMessage());
        }
    }

    @Test
    public void calcAndPrintValuesTest02() {
        try {
            calcAndPrintValues(12, -3, 0.3, System.out::println);
            fail();
        } catch (IllegalIntervalException e) {
            assertEquals(BORDERS_EXCEPTION_MSG, e.getMessage());
        }
    }

    @Test
    public void calcAndPrintValuesTest03() {
        try {
            calcAndPrintValues(12, -3, EPS / 1000,
                    System.out::println);
            fail();
        } catch (IllegalIntervalException e) {
            assertEquals(TOO_SMALL_STEP_MSG, e.getMessage());
        }
    }

    @Test
    public void isZeroTest01() {
        assertTrue(isZero(-EPS / 10));
    }

    @Test
    public void isZeroTest02() {
        assertTrue(isZero(EPS / 10));
    }

    @Test
    public void isZeroTest03() {
        assertFalse(isZero(EPS * 10));
    }

    @Test
    public void isInvalidArgumentTest01() {
        assertTrue(isInvalidArgument(INVALID_ARG));
    }

    @Test
    public void isInvalidArgumentTest02() {
        assertTrue(isInvalidArgument(INVALID_ARG + PI));
    }

    @Test
    public void isInvalidArgumentTest03() {
        assertTrue(isInvalidArgument(INVALID_ARG - 10 * PI));
    }
}
