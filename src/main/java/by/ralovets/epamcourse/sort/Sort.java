package by.ralovets.epamcourse.sort;

public class Sort {

    public static <T extends Comparable<T>> T[] bubbleSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static <T extends Comparable<T>> T[] insertionSort(T[] array) {
        T temp;
        int j;

        if (array.length <= 1) {
            return array;
        }

        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            for (j = i - 1; j >= 0; j--) {
                if (temp.compareTo(array[j]) < 0) {
                    array[j + 1] = array[j];
                    if (j == 0) {
                        array[j] = temp;
                    }
                } else {
                    array[j + 1] = temp;
                    break;
                }
            }
        }
        return array;
    }

    private Sort() {

    }
}