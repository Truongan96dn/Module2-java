package search_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmSettings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {2, 3, 5, 6, 7, 9, 10, 12, 16, 20};
        System.out.println(Arrays.toString(array));
        System.out.println("nhập giá trị cần tìm trong mảng ");
        int value = scanner.nextInt();
        int index = binarySearch(array, value);
        System.out.println("vị trí phần tử cần tìm là : " + index);
    }

    public static int binarySearch(int[] array, int value) {
        int first = 0;
        int last = array.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }
}
