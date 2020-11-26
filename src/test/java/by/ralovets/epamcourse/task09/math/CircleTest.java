package by.ralovets.epamcourse.task09.math;

import by.ralovets.epamcourse.task09.math.exception.CircleException;
import org.junit.Assert;
import org.junit.Test;

import static by.ralovets.epamcourse.task09.math.Circle.getArea;
import static by.ralovets.epamcourse.task09.math.Circle.getCircumference;
import static java.lang.Math.PI;
import static org.junit.Assert.fail;

public class CircleTest {

    private final static double EPS = 10E-9;

    @Test
    public void getCircumferenceTest01() {
        double actual = 0;

        try {
            actual = getCircumference(1);
        } catch (CircleException e) {
            fail(e.getMessage());
        }

        double expected = 2 * PI;

        Assert.assertTrue(Math.abs(actual - expected) <= EPS);
    }

    @Test
    public void getCircumferenceTest02() {
        double actual = 0;

        try {
            actual = getCircumference(10);
        } catch (CircleException e) {
            fail(e.getMessage());
        }

        double expected = 2 * PI * 10;

        Assert.assertTrue(Math.abs(actual - expected) <= EPS);
    }

    @Test
    public void getCircumferenceTest03() {
        try {
            double actual = getCircumference(0);
            fail();
        } catch (CircleException e) {
            Assert.assertEquals(
                    Circle.NOT_POSITIVE_RADIUS_MSG, e.getMessage());
        }
    }

    @Test
    public void getCircumferenceTest04() {
        try {
            double actual = getCircumference(-10);
            fail();
        } catch (CircleException e) {
            Assert.assertEquals(
                    Circle.NOT_POSITIVE_RADIUS_MSG, e.getMessage());
        }
    }

    @Test
    public void getAreaTest01() {
        int radius = 1;
        double actual = 0;

        try {
            actual = getArea(radius);
        } catch (CircleException e) {
            fail(e.getMessage());
        }

        double expected = PI * radius * radius;

        Assert.assertTrue(Math.abs(actual - expected) <= EPS);
    }

    @Test
    public void getAreaTest02() {
        int radius = 10;
        double actual = 0;

        try {
            actual = getArea(radius);
        } catch (CircleException e) {
            fail(e.getMessage());
        }

        double expected = PI * radius * radius;

        Assert.assertTrue(Math.abs(actual - expected) <= EPS);
    }

    @Test
    public void getAreaTest03() {
        try {
            double actual = getArea(0);
            fail();
        } catch (CircleException e) {
            Assert.assertEquals(
                    Circle.NOT_POSITIVE_RADIUS_MSG, e.getMessage());
        }
    }

    @Test
    public void getAreaTest04() {
        try {
            double actual = getArea(-10);
            fail();
        } catch (CircleException e) {
            Assert.assertEquals(
                    Circle.NOT_POSITIVE_RADIUS_MSG, e.getMessage());
        }
    }
}
