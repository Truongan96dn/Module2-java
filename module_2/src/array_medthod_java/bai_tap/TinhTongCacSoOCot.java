package array_medthod_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongCacSoOCot {
    public static float sum(int index, float array[][]) {
        float sum=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (index == j) {
                    sum = sum + array[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" nhập vào số dòng của mảng 2 chiều : ");
        int a = Integer.parseInt(input.nextLine());
        System.out.println(" nhập vào số cột của mảng 2 chiều : ");
        int b = Integer.parseInt(input.nextLine());
        float[][] array = new float[a][b];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập phần tử thứ " + (i + 1) + " " + (j + 1));
                array[i][j] = Float.parseFloat(input.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Bạn muốn tính tổng của cột thứ mấy ? ");
        int index = input.nextInt();
        float sum1 = sum(index,array);
        System.out.println("tổng của cột " + index + " là " + sum1);
    }
}
