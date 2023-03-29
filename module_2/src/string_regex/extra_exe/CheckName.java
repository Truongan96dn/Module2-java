package string_regex.extra_exe;

import java.util.Scanner;

public class CheckName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên cần kiểm tra");
        String name = scanner.nextLine();
        System.out.println(checkName(name));
    }
    public static boolean checkName(String name ){
        String reGex = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*\\s[A-Z][a-z]*$";
        return name.matches(reGex);
    }
}
