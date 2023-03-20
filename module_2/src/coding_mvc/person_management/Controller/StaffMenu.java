package coding_mvc.person_management.controller;

import coding_mvc.person_management.service.implement.IStaffService;
import coding_mvc.person_management.service.implement.StaffService;

import java.util.Scanner;

public class StaffMenu {
    IStaffService iStaffService = new StaffService();

    public void menuStaff() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----------------------------------------");
            System.out.println("Các chức năng : ");
            System.out.println("1. Thêm giảng viên ");
            System.out.println("2. Xóa giảng viên ");
            System.out.println("3. Xem danh sách giảng viên ");
            System.out.println("4. Thoát");
            System.out.println("Chọn chức năng ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    iStaffService.addStaff();
                    break;
                case 2:
                    iStaffService.deleteStaff();
                    break;
                case 3:
                    iStaffService.display();
                    break;
                case 4:
                    return;
            }
        } while (choice > 0 && choice < 4);
    }
}
