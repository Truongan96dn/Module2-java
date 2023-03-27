package student_management_example.repository.impl;

import student_management_example.util.ReadAndWrite;
import student_management_example.model.Student;
import student_management_example.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
      private final String PATH_FILE ="module_2/src/student_management_example/data/student.txt";

    @Override
    public List<Student> getAllStudent() {
        List<Student> studentList = new ArrayList<>();
        // đọc file trả listString
        List<String> stringList = ReadAndWrite.readFileToListString(PATH_FILE);
        // chuyển List String => ListStudent
        for (int i = 0; i < stringList.size(); i++) {
            String string = stringList.get(i);
            String[] arr = string.split(",");
            Student student = new Student(Integer.parseInt(arr[0]),arr[1]);
            studentList.add(student);
        }
        return studentList;
    }

    @Override
    public void add() {

    }
}
