package by.ralovets.epamcourse.task05;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class MainTest {

    @Test
    public void getDividersTest01() {
        List<Integer> actual = Main.getDividers(920);
        List<Integer> expected = Arrays.asList(1, 2, 4, 5, 8, 10, 20, 23,
                40, 46, 92, 115, 184, 230, 460);

        Assert.assertArrayEquals(actual.toArray(), expected.toArray());
    }

    @Test
    public void getDividersTest02() {
        List<Integer> actual = Main.getDividers(1);
        List<Integer> expected = Collections.emptyList();

        Assert.assertArrayEquals(actual.toArray(), expected.toArray());
    }

    @Test
    public void getIntListSumTest01() {
        int actualSum = Main
                .getIntListSum(Arrays.asList(1, 2, 4, 5, 8, 10, 20,
                        23, 40, 46, 92, 115, 184, 230, 460));
        int expectedSum = Stream.of(1, 2, 4, 5, 8, 10, 20, 23, 40,
                46, 92, 115, 184, 230, 460)
                .reduce(Integer::sum)
                .orElse(0);

        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void getIntListSumTest02() {
        int actualSum = Main.getIntListSum(Collections.emptyList());
        int expectedSum = 0;

        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void isPerfectNumberTest01() {
        Assert.assertFalse(Main.isPerfectNumber(1234));
    }

    @Test
    public void isPerfectNumberTest02() {
        Assert.assertTrue(Main.isPerfectNumber(33550336));
    }

    @Test
    public void isPerfectNumberTest03() {
        Assert.assertTrue(Main.isPerfectNumber(28));
    }

    @Test
    public void isPerfectNumberTest04() {
        Assert.assertFalse(Main.isPerfectNumber(-28));
    }

    @Test
    public void isPerfectNumberTest05() {
        Assert.assertFalse(Main.isPerfectNumber(0));
    }
}