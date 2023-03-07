package array_medthod_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class PhanTuBeNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[2][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập phần tử thứ " + (i + 1) + " " + (j + 1));
                array[i][j] =  Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(array));

        int min= array[0][0];
        int[] array1 = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    array1 = new int[]{i, j};
                }
            }
        }
        System.out.println("Phần tử bé nhất trong mảng là : array " + Arrays.toString(array1) + " = " + min);
    }
}


