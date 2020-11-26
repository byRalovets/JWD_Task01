package by.ralovets.epamcourse.task04;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void isEvenTest01() {
        int number = 0;
        Assert.assertTrue(Main.isEven(number));
    }

    @Test
    public void isEvenTest02() {
        int number = -10;
        Assert.assertTrue(Main.isEven(number));
    }

    @Test
    public void isEvenTest03() {
        int number = -111;
        Assert.assertFalse(Main.isEven(number));
    }

    @Test
    public void isEvenTest04() {
        int number = 20;
        Assert.assertTrue(Main.isEven(number));
    }

    @Test
    public void isEvenTest05() {
        int number = 1231;
        Assert.assertFalse(Main.isEven(number));
    }

    @Test
    public void getEvenNumbersCountTest01() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        int expected = 2;
        int actual = Main.getEvenNumbersCount(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEvenNumbersCountTest02() {
        int a = Integer.MAX_VALUE;
        int b = 19381;
        int c = 3;
        int d = -1;

        int expected = 0;
        int actual = Main.getEvenNumbersCount(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEvenNumbersCountTest03() {
        int a = Integer.MIN_VALUE;
        int b = -22;
        int c = Integer.MAX_VALUE - 1;
        int d = 4;

        int expected = 4;
        int actual = Main.getEvenNumbersCount(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEvenNumbersCountTest04() {
        int a = 0;
        int b = 0;
        int c = 1;
        int d = 0;

        int expected = 3;
        int actual = Main.getEvenNumbersCount(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEvenNumbersCountTest05() {
        int a = 1;
        int b = 3;
        int c = 5;
        int d = 8;

        int expected = 1;
        int actual = Main.getEvenNumbersCount(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }
}