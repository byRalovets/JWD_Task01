package by.ralovets.epamcourse.sort;

import org.junit.Assert;
import org.junit.Test;

public class SortTest {
    @Test
    public void bubbleSortTest01() {
        Integer[] sourceArray = new Integer[]{2, 3, 5, 6, 7, 1, 0, 9, 8, 4};
        Integer[] actualArray = Sort.bubbleSort(sourceArray);
        Integer[] expectedArray = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void bubbleSortTest02() {
        Integer[] sourceArray = new Integer[]{2};
        Integer[] actualArray = Sort.bubbleSort(sourceArray);
        Integer[] expectedArray = new Integer[]{2};

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void bubbleSortTest03() {
        Integer[] sourceArray = new Integer[0];
        Integer[] actualArray = Sort.bubbleSort(sourceArray);
        Integer[] expectedArray = new Integer[0];

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void bubbleSortTest04() {
        Integer[] sourceArray
                = new Integer[]{-2, -3, -5, -6, -7, -1, -0, -9, -8, -4};
        Integer[] actualArray = Sort.bubbleSort(sourceArray);
        Integer[] expectedArray
                = new Integer[]{-9, -8, -7, -6, -5, -4, -3, -2, -1, 0};

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void insertionSortTest01() {
        Integer[] sourceArray = new Integer[]{2, 3, 5, 6, 7, 1, 0, 9, 8, 4};
        Integer[] actualArray = Sort.insertionSort(sourceArray);
        Integer[] expectedArray = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void insertionSortTest02() {
        Integer[] sourceArray = new Integer[]{2};
        Integer[] actualArray = Sort.insertionSort(sourceArray);
        Integer[] expectedArray = new Integer[]{2};

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void insertionSortTest03() {
        Integer[] sourceArray = new Integer[0];
        Integer[] actualArray = Sort.insertionSort(sourceArray);
        Integer[] expectedArray = new Integer[0];

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void insertionSortTest04() {
        Integer[] sourceArray
                = new Integer[]{-2, -3, -5, -6, -7, -1, 0, -9, -8, -4};
        Integer[] actualArray = Sort.insertionSort(sourceArray);
        Integer[] expectedArray
                = new Integer[]{-9, -8, -7, -6, -5, -4, -3, -2, -1, 0};

        Assert.assertArrayEquals(expectedArray, actualArray);
    }
}
