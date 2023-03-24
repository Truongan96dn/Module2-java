package read_write_file_to_csv;

public class Student {
    private int id;
    private String name;
    private String classes;

    public Student() {
    }

    public Student(int id, String name, String classes) {
        this.id = id;
        this.name = name;
        this.classes = classes;
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

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }

    /*Dung de in thong tin cho viec ghi file csv*/
    public String getInfoToCsv() {
        return id + "," + name + "," + classes;
    }
}
