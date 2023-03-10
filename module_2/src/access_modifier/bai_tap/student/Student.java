package access_modifier.bai_tap.student;

public class Student {
    private String name = "Athena";
    private String classes = "C01";

    public Student() {
    }

    protected String getName() {
        return this.name;
    }

    protected String getClasses() {
        return this.classes;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }
}
