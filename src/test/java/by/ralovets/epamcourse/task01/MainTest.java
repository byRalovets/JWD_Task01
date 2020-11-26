package by.ralovets.epamcourse.task01;

import org.junit.Test;

import static by.ralovets.epamcourse.task01.Main.getLastDigit;
import static by.ralovets.epamcourse.task01.Main.getLastDigitOfSquare;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void getLastDigitTest01() {
        int actual = getLastDigit(0);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void getLastDigitTest02() {
        int actual = getLastDigit(1);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void getLastDigitTest03() {
        int actual = getLastDigit(-12);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void getLastDigitTest04() {
        int actual = getLastDigit(Integer.MAX_VALUE);
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void getLastDigitTest05() {
        int actual = getLastDigit(Integer.MIN_VALUE);
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void getLastDigitOfSquareTest01() {
        int actual = getLastDigitOfSquare(0);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void getLastDigitOfSquareTest02() {
        int actual = getLastDigitOfSquare(1);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void getLastDigitOfSquareTest03() {
        int actual = getLastDigitOfSquare(-12);
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void getLastDigitOfSquareTest04() {
        int actual = getLastDigitOfSquare(Integer.MAX_VALUE);
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void getLastDigitOfSquareTest05() {
        int actual = getLastDigitOfSquare(Integer.MIN_VALUE);
        int expected = 4;

        assertEquals(expected, actual);
    }
}
