package array_medthod_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Gop2Mang {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(" Nhap vao phan tu cua mang 1 :" + "vi tri thu " + i);
            array1[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array1));
        int[] array2 = new int[3];
        for (int i = 0; i < array2.length; i++) {
            System.out.println(" Nhap vao phan tu cua mang 2 :" + "vi tri thu " + i);
            array2[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array2));
        int[] array3 = new int[6];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = array1.length; i < array3.length; i++) {
            array3[i] = array2[i - array1.length];
        }
        System.out.println(" Array 3 :");
        System.out.println(Arrays.toString(array3));
    }
}
