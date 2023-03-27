package student_management_example.service.impl;

import student_management_example.model.Student;
import student_management_example.repository.impl.StudentRepository;
import student_management_example.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private StudentRepository studentRepository = new StudentRepository();

    @Override
    public void display() {
        List<Student> students = studentRepository.getAllStudent();
        for (Student s : students) {
            System.out.println(s);
        }
    }

    @Override
    public void add() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập id");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.println("nhập tên");
//        String name = scanner.nextLine();
//        Student student = new Student(id, name);
//        students.add(student);

    }

}
