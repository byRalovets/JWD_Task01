package by.ralovets.epamcourse.sort;

/**
 * Применение сортировок пузырьком и вставками
 */
public class Main {

    public static void main(String[] args) {
        Integer[] array = new Integer[] {2, 3, 5, 6, 7, 1, 0, 9, 8, 4};
        printArray(array);
        Sort.insertionSort(array);
//        Sorts.bubbleSort(array);
        printArray(array);
    }

    public static <T> void printArray(T[] array) {
        for (T item: array) {
            System.out.print(item + "; ");
        }
        System.out.println();
    }
}