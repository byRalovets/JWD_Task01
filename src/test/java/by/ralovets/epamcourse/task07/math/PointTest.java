package by.ralovets.epamcourse.task07.math;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    private static final double EPS = 10E-6;

    @Test
    public void getDistanceTest01() {
        Point pointFrom = new Point(0, 0);
        Point pointTo = new Point(3, 4);
        double actual = pointFrom.getDistance(pointTo);
        double expected = 5.0;

        Assert.assertTrue(Math.abs(actual - expected) <= EPS);
    }

    @Test
    public void getDistanceTest02() {
        Point pointFrom = new Point(0, 0);
        Point pointTo = new Point(-3, -4);
        double actual = pointFrom.getDistance(pointTo);
        double expected = 5.0;

        Assert.assertTrue(Math.abs(actual - expected) <= EPS);
    }

    @Test
    public void getDistanceTest03() {
        Point pointFrom = new Point(0, 0);
        Point pointTo = new Point(5, 5);
        double actual = pointFrom.getDistance(pointTo);
        double expected = Math.sqrt(25 + 25);

        Assert.assertTrue(Math.abs(actual - expected) <= EPS);
    }

    @Test
    public void getDistanceTest04() {
        Point pointFrom = new Point(0, 0);
        Point pointTo = new Point(0, 0);
        double actual = pointFrom.getDistance(pointTo);
        double expected = Math.sqrt(0);

        Assert.assertTrue(Math.abs(actual - expected) <= EPS);
    }

    @Test
    public void getDistanceTest05() {
        Point pointFrom = new Point(21, 45);
        Point pointTo = new Point(-5, -11);
        double actual = pointFrom.getDistance(pointTo);
        double expected = Math.sqrt(26 * 26 + 56 * 56);

        Assert.assertTrue(Math.abs(actual - expected) <= EPS);
    }

    @Test
    public void getDistanceTest06() {
        Point pointFrom = new Point(0, 0);
        double actual = pointFrom.getDistance();
        double expected = 0;

        Assert.assertTrue(Math.abs(actual - expected) <= EPS);
    }

    @Test
    public void getDistanceTest07() {
        Point pointFrom = new Point(5, 5);
        double actual = pointFrom.getDistance();
        double expected = Math.sqrt(25 + 25);

        Assert.assertTrue(Math.abs(actual - expected) <= EPS);
    }

    @Test
    public void getDistanceTest08() {
        Point pointFrom = new Point(3, 4);
        double actual = pointFrom.getDistance();
        double expected = 5.0;

        Assert.assertTrue(Math.abs(actual - expected) <= EPS);
    }

    @Test
    public void getDistanceTest09() {
        Point pointFrom = new Point(-3, -4);
        double actual = pointFrom.getDistance();
        double expected = 5;

        Assert.assertTrue(Math.abs(actual - expected) <= EPS);
    }

    @Test
    public void getDistanceTest10() {
        Point pointFrom = new Point(0, 31);
        double actual = pointFrom.getDistance();
        double expected = 31;

        Assert.assertTrue(Math.abs(actual - expected) <= EPS);
    }
}