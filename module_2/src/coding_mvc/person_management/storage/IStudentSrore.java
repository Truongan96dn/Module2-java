package coding_mvc.person_management.storage;

import coding_mvc.person_management.model.Student;

import java.util.List;

public interface IStudentSrore {
    List<Student> getAll();

    void addStudent(Student student);

    void deleteStudent(int id);
}
