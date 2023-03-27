package student_management_example.model;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    static String school;
    static {
        school = "BK";
    }
    // sử dụng cho hashset và linkedHashset, HasMap, LinkedHasMap
    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return id == student.id && this.name.equals(student.name);
    }
    // sử dụng cho hashset và linkedHashset
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    //    // triển khai lại method compareTo của Comparable => TreeSet, TreeMap
    @Override
    public int compareTo(Student o) {
        if (this.id == o.id) {
            // thì đi so sánh tên
            return this.name.compareTo(o.name);

        } else {
            return this.id-o.id;
        }

    }

    public Student() {
    }
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static String getSchool() {
        return school;
    }
    public static void setSchool(String school) {
        Student.school = school;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
