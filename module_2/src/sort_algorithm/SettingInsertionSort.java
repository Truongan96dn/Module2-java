package sort_algorithm;


import java.util.Arrays;
import java.util.Scanner;

public class SettingInsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào kích thước của mảng :");
        int arrSize = scanner.nextInt();
        int input;
        int array[] = new int[arrSize];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + "/" + (arrSize - 1) + "của mảng");
            input = scanner.nextInt();
            array[i] = input;
        }
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
            }
            array[pos] = x;
        }
        System.out.println("Mảng sau khi được sắp xếp theo insertionSort : " + Arrays.toString(array));
    }
}
