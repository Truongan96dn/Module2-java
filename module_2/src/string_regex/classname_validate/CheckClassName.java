package string_regex.classname_validate;

import java.util.Scanner;

public class CheckClassName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên lớp cần kiểm tra : ");
        String input = scanner.nextLine();
        System.out.println(validateClassName(input));
    }

    public static boolean validateClassName(String name) {
        String reGex = "^[ACP][0-9]{4}[GHYK]$";
        return name.matches(reGex);
    }
}
