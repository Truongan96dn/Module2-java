package sort_algorithm;

import java.util.Arrays;

public class InsertionSortStep {
    public static void main(String[] args) {
        int[] array = {5, 7, 18, 25, 15, 11, 21, 12};
        System.out.println("Mảng chưa được sắp xếp : " + Arrays.toString(array));
        insertionSort(array);
    }

    public static void insertionSort(int[] array) {
        int x;
        int pos;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (0 < pos && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
                System.out.println("lần thứ " + i + "-" + pos + " " + Arrays.toString(array));
            }
            array[pos] = x;
            System.out.println("lần thứ " + i + "-" + pos + " " + Arrays.toString(array));
        }
    }
}
