package coding_mvc.person_management.Controller;

import coding_mvc.person_management.service.implement.IStudentService;
import coding_mvc.person_management.service.implement.StudentService;

import java.util.Scanner;

public class StudentMenu {
    IStudentService iStudentService = new StudentService();

    public void menuStudent() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----------------------------------------");
            System.out.println("Các chức năng : ");
            System.out.println("1. Thêm học sinh ");
            System.out.println("2. Xóa học sinh ");
            System.out.println("3. Xem danh sách học sinh ");
            System.out.println("4. Thoát");
            System.out.println("Chọn chức năng ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    iStudentService.deleteStudent();
                    break;
                case 3:
                    iStudentService.display();
                    break;
                case 4:
                    break;
            }
        } while (choice > 0 && choice < 4);
    }

}
