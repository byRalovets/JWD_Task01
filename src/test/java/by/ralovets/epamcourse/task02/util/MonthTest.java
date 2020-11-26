package by.ralovets.epamcourse.task02.util;

import by.ralovets.epamcourse.task02.util.exception.MonthException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

public class MonthTest {

    @Test
    public void getDaysCountTest01() {
        Month month = null;
        try {
            month = new Month(2, 2000);
        } catch (Exception e) {
            fail();
        }
        int expected = 29;
        int actual = month.getDaysCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDaysCountTest02() {
        Month month = null;
        try {
            month = new Month(2, 2001);
        } catch (Exception e) {
            fail();
        }
        int expected = 28;
        int actual = month.getDaysCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDaysCountTest03() {
        Month month = null;
        try {
            month = new Month(2, 2004);
        } catch (Exception e) {
            fail();
        }
        int expected = 29;
        int actual = month.getDaysCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDaysCountTest04() {
        Month month = null;
        try {
            month = new Month(3, 2000);
        } catch (Exception e) {
            fail();
        }
        int expected = 31;
        int actual = month.getDaysCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDaysCountTest05() {
        Month month = null;
        try {
            month = new Month(6, 1);
        } catch (Exception e) {
            fail();
        }
        int expected = 30;
        int actual = month.getDaysCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void monthTest01() {
        try {
            Month month = new Month(0, 2020);
            fail();
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void monthTest02() {
        try {
            Month month = new Month(-10, 2020);
            fail();
        } catch (MonthException e) {
            System.out.println(e.getMessage());
            Assert.assertTrue(true);
        }
    }

    @Test
    public void yearTest() {
        try {
            Month month = new Month(1, -10);
            fail();
        } catch (MonthException e) {
            System.out.println(e.getMessage());
            Assert.assertTrue(true);
        }
    }
}