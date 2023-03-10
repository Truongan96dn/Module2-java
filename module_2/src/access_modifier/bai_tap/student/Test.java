package access_modifier.bai_tap.student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tên :");
        String a = sc.nextLine();
        System.out.print("Nhập vào lớp :");
        String b = sc.nextLine();
        if (a.length() == 0 && b.length() == 0) {
            System.out.println("Trả về giá trị mặc định của constructor");
            student.getName();
            student.getClasses();
        } else {
            student.setName(a);
            student.setClasses(b);
        }
        System.out.println("Tên : " + student.getName());
        System.out.println("Lớp : " + student.getClasses());
    }
}
