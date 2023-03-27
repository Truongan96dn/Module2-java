package student_management_example.repository;

import student_management_example.model.Student;
import student_management_example.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAllStudent();
    void add();
}
