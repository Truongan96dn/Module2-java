package string_regex.phonenumb_validate;

import java.util.Scanner;

public class CheckPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số điện thoại cần kiểm tra : ");
        String number = scanner.nextLine();
        System.out.println(checkPhoneNumber(number));
    }

    public static boolean checkPhoneNumber(String number) {
        String reGex = "^\\([0-9]{2}\\)\\-\\((0)[0-9]{9}\\)$";
        return number.matches(reGex);
    }
}
