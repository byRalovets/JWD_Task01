package by.ralovets.epamcourse.task08;

import by.ralovets.epamcourse.task08.exception.FunctionUndefinedException;
import org.junit.Assert;
import org.junit.Test;

import static by.ralovets.epamcourse.task08.Main.EPS;
import static java.lang.Math.abs;
import static org.junit.Assert.fail;

public class MainTest {

    @Test
    public void functionTest01() {
        try {
            double actual = Main.function(3);
            double expected = 9.0;

            Assert.assertTrue(abs(actual - expected) <= EPS);
        } catch (FunctionUndefinedException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void functionTest02() {
        try {
            double actual = Main.function(1000);
            double expected = -996991.0;

            Assert.assertTrue(abs(actual - expected) <= EPS);
        } catch (FunctionUndefinedException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void functionTest03() {
        try {
            double actual = Main.function(0);
            double expected = -1.0 / 6;

            Assert.assertTrue(abs(actual - expected) <= EPS);
        } catch (FunctionUndefinedException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void functionTest04() {
        try {
            double actual = Main.function(-1);
            double expected = -1.0 / 7;

            Assert.assertTrue(abs(actual - expected) <= EPS);
        } catch (FunctionUndefinedException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void functionTest05() {
        try {
            // При аргументе *кубический корень из 6*
            // знаменатель равен нулю
            Main.function(1.8171205928321396588912117563273);
            fail();
        } catch (FunctionUndefinedException e) {
            Assert.assertEquals(Main.DIV_BY_ZERO_MSG, e.getMessage());
        }
    }
}