package coding_mvc.person_management.view;

import coding_mvc.person_management.controller.StaffMenu;
import coding_mvc.person_management.controller.StudentMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn xem danh sách nhân viên hay học sinh ?");
        System.out.println("1.Học sinh");
        System.out.println("2.Nhân viên");
        System.out.println(" Xin vui lòng chọn số :");
        int numb = Integer.parseInt(scanner.nextLine());
        if (numb == 1) {
            new StudentMenu().menuStudent();
        } else if (numb == 2) {
            new StaffMenu().menuStaff();
        }
    }
}
