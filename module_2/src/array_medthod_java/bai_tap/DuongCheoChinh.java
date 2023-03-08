package array_medthod_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DuongCheoChinh {
    public static float sumDuongCheo(float array[][]) {
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum = sum + array[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập ma trận vuông n : ");
        int a = Integer.parseInt(input.nextLine());
        float[][] array = new float[a][a];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập phần tử thứ " + (i + 1) + " " + (j + 1));
                array[i][j] = Float.parseFloat(input.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(array));
        float sum = sumDuongCheo(array);
        System.out.println("Tổng các phần tử đường chéo chính là " + sum);
    }
}
