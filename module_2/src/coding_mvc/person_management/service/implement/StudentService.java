package coding_mvc.person_management.service.implement;

import coding_mvc.person_management.Model.Student;
import coding_mvc.person_management.storage.IStudentSrore;
import coding_mvc.person_management.storage.implement.StudentStorage;

import java.util.List;
import java.util.Scanner;


public class StudentService implements IStudentService {
    IStudentSrore iStudentSrore = new StudentStorage();
    List<Student> list = iStudentSrore.getAll();


    @Override
    public void display() {
        for (Student student : list) {
            System.out.println(student);
        }

    }

    @Override
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập giới tính ");
        String gender = scanner.nextLine();
        System.out.println("Nhập lớp : ");
        String className = scanner.nextLine();
        System.out.println("Nhập điểm ");
        double point = Double.parseDouble(scanner.nextLine());
        Student students = new Student(id, name, dateOfBirth, gender, className, point);
        iStudentSrore.addStudent(students);
        System.out.println("Thêm học sinh thành công!");

    }

    @Override
    public void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id muốn xóa ");
        int removeID = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (removeID == list.get(i).getId()) {
                System.out.println("Bạn có chắc muốn xóa học sinh " + i + " không? ");
                System.out.println("1. Có");
                System.out.println("2. Không ");
                int number = Integer.parseInt(scanner.nextLine());
                switch (number) {
                    case 1:
                        iStudentSrore.deleteStudent(i);
                        System.out.println("Xóa học sinh thành công ");
                    case 2:
                }
                return;
            }
        }
        System.out.println("Không tồn tại");
    }
}
