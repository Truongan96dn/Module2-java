package student_management_example.controller;


import student_management_example.service.impl.StudentService;

import java.util.Scanner;

public class MainMenu {
    public static void displayMenu(){
        StudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng "+
                    "\n 1.Display"+
                    "\n 2.Add"+
                    "\n 3.Delete"+
                    "\n 4.Exit");
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("chức năng hiện thị");
                    studentService.display();
                    break;
                case 2:
                    System.out.println("chức năng thêm mới");
                    studentService.add();
                    break;
                case 3:
                    System.out.println("chức năng Xoá");
                    break;
                default:
                    System.out.println("Thoát");
                    flag =false;
            }
        }while (flag);
    }

}
