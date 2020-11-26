package by.ralovets.epamcourse.task06;

import by.ralovets.epamcourse.task06.exception.TimeException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MainTest {
    @Test
    public void getFullMinutesTest01() {
        int actual = 0;
        try {
            actual = Main.getFullMinutes(0);
        } catch (TimeException e) {
            fail(e.getMessage());
        }
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFullMinutesTest02() {
        int actual = 0;
        try {
            actual = Main.getFullMinutes(3725);
        } catch (TimeException e) {
            fail(e.getMessage());
        }
        int expected = 62;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFullMinutesTest03() {
        int actual = 0;
        try {
            actual = Main.getFullMinutes(143);
        } catch (TimeException e) {
            fail(e.getMessage());
        }
        int expected = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFullMinutesTest04() {
        try {
            Main.getFullMinutes(-143);
            fail();
        } catch (TimeException e) {
            assertEquals(Main.EXCEPTION_MSG, e.getMessage());
        }
    }

    @Test
    public void getFullHoursTest01() {
        int actual = 0;
        try {
            actual = Main.getFullHours(143);
        } catch (TimeException e) {
            fail(e.getMessage());
        }
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFullHoursTest02() {
        int actual = 0;
        try {
            actual = Main.getFullHours(12643);
        } catch (TimeException e) {
            fail(e.getMessage());
        }
        int expected = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFullHoursTest03() {
        int actual = 0;
        try {
            actual = Main.getFullHours(99144);
        } catch (TimeException e) {
            fail(e.getMessage());
        }
        int expected = 27;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFullHoursTest04() {
        try {
            Main.getFullHours(-99144);
            fail();
        } catch (TimeException e) {
            assertEquals(Main.EXCEPTION_MSG, e.getMessage());
        }
    }

    @Test
    public void getTimeTest01() {
        try {
            String actual = Main.getTime(23411);
            String expected = String
                    .format("%2d hours %2d minutes %2d seconds", 6, 30, 11);

            Assert.assertEquals(expected, actual);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void getTimeTest02() {
        try {
            String actual = Main.getTime(99144);
            fail();
        } catch (Exception e) {
            Assert.assertEquals(Main.EXCEPTION_MSG, e.getMessage());
        }
    }

    @Test
    public void getTimeTest03() {
        try {
            String actual = Main.getTime(1);
            String expected = String
                    .format("%2d hours %2d minutes %2d seconds", 0, 0, 1);

            Assert.assertEquals(expected, actual);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void getTimeTest04() {
        try {
            String actual = Main.getTime(60);
            String expected = String
                    .format("%2d hours %2d minutes %2d seconds", 0, 1, 0);

            Assert.assertEquals(expected, actual);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void getTimeTest05() {
        try {
            String actual = Main.getTime(3600);
            String expected = String
                    .format("%2d hours %2d minutes %2d seconds", 1, 0, 0);

            Assert.assertEquals(expected, actual);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void getTimeTest06() {
        try {
            Main.getTime(-3600);
            fail();
        } catch (Exception e) {
            Assert.assertEquals(Main.EXCEPTION_MSG, e.getMessage());
        }
    }
}