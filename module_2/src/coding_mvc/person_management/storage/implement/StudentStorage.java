package coding_mvc.person_management.storage.implement;

import coding_mvc.person_management.model.Student;
import coding_mvc.person_management.storage.IStudentSrore;

import java.util.ArrayList;
import java.util.List;

public class StudentStorage implements IStudentSrore {
    private static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(123, "Ngoc", "2/4/1998", "Nam", "C0123G1", 8.9));
        studentList.add(new Student(124, "Dung", "2/5/1988", "Nam", "C0123G1", 10));
        studentList.add(new Student(125, "Thu", "2/6/2000", "Nu", "C0123G1", 7.5));
        studentList.add(new Student(126, "Hoang", "25/4/1989", "Nam", "C0123G1", 8));
    }


    @Override
    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public void addStudent(Student student) {
        studentList.add(student);

    }

    @Override
    public void deleteStudent(int id) {
        studentList.remove(id);

    }
}
