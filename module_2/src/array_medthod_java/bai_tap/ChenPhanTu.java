package array_medthod_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ChenPhanTu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập vào phần tử cần thêm : ");
        int plusX = input.nextInt();
        int[] array = {1, 2, 4, 5, 6, 7, 0, 0, 0, 0};
        System.out.println(" Nhập vào vị trí cần chèn : ");
        int index = input.nextInt();
        if (index <= -1 && index >= (array.length - 1)) {
            System.out.println(" không chèn được phần tử vào mảng");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (index == i) {
                    for (int j = array.length - 1; j > i; j--) {
                        array[j] = array[j - 1];
                    }
                    array[index] = plusX;
                    i++;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}

