package array_medthod_java.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienKyTu {
    public static int countChar(String value, String input) {
        int count = 0;
        int size = value.length();
        char b = input.charAt(0);
        for (int i = 0; i < size; i++) {
            if (value.charAt(i) == b) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập một chuỗi bất kỳ : ");
        String a = input.nextLine();
        System.out.println(" mảng vừa nhập là : " + a);
        boolean flag = false;
        do {
            System.out.println(" Nhập ký tự cần tìm : ");
            String letter = input.nextLine();
            if (letter.length() > 1) {
                flag = true;
            } else {
                int output = countChar(a, letter);
                System.out.println("số lần xuất hiện của ký tự " + letter + " là " + output);
            }
        } while (flag);
    }
}
