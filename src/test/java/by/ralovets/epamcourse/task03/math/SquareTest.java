package by.ralovets.epamcourse.task03.math;

import org.junit.Test;

import static by.ralovets.epamcourse.task03.math.Square.getSideFromArea;
import static by.ralovets.epamcourse.task03.math.Square.getSideFromDiagonal;
import static java.lang.Math.abs;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class SquareTest {

    private final static double EPS = 10E-9;

    @Test
    public void getAreaTest01() {
        try {
            Square square = new Square(5);
            double actual = square.getArea();
            double expected = 25;

            assertTrue(abs(expected - actual) <= EPS);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            fail();
        }
    }

    @Test
    public void getAreaTest02() {
        try {
            Square square = new Square(100);
            double actual = square.getArea();
            double expected = 10000;

            assertTrue(abs(expected - actual) <= EPS);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            fail();
        }
    }

    @Test
    public void getInradiusTest01() {
        try {
            Square square = new Square(100);
            double actual = square.getInradius();
            double expected = 50;

            assertTrue(abs(expected - actual) <= EPS);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            fail();
        }
    }

    @Test
    public void getInradiusTest02() {
        try {
            Square square = new Square(36);
            double actual = square.getInradius();
            double expected = 18;

            assertTrue(abs(expected - actual) <= EPS);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            fail();
        }
    }

    @Test
    public void getSideFromAreaTest01() {
        try {
            double actual = getSideFromArea(16);
            double expected = 4;

            assertTrue(abs(expected - actual) <= EPS);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            fail();
        }
    }

    @Test
    public void getSideFromAreaTest02() {
        try {
            double actual = getSideFromArea(36);
            double expected = 6;

            assertTrue(abs(expected - actual) <= EPS);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            fail();
        }
    }

    @Test
    public void getSideFromAreaTest03() {
        try {
            getSideFromArea(0);
            fail();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            assertTrue(true);
        }
    }

    @Test
    public void getSideFromAreaTest04() {
        try {
            getSideFromArea(-10);
            fail();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            assertTrue(true);
        }
    }

    @Test
    public void getSideFromDiagonalTest01() {
        try {
            double actual = getSideFromDiagonal(16);
            double expected = 16 / Math.sqrt(2);

            assertTrue(abs(expected - actual) <= EPS);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            fail();
        }
    }

    @Test
    public void getSideFromDiagonalTest02() {
        try {
            double actual = getSideFromDiagonal(36);
            double expected = 36 / Math.sqrt(2);

            assertTrue(abs(expected - actual) <= EPS);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            fail();
        }
    }

    @Test
    public void getSideFromDiagonalTest03() {
        try {
            getSideFromDiagonal(0);
            fail();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            assertTrue(true);
        }
    }

    @Test
    public void getSideFromDiagonalTest04() {
        try {
            getSideFromDiagonal(-10);
            fail();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            assertTrue(true);
        }
    }
}
