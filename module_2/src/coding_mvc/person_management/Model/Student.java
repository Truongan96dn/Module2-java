package coding_mvc.person_management.model;

public class Student extends Person {
    protected String classname;
    protected double Point;

    public Student(int id, String name, String birthday, String gender, String classname, double point) {
        super(id, name, birthday, gender);
        this.classname = classname;
        Point = point;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public double getPoint() {
        return Point;
    }

    public void setPoint(double point) {
        Point = point;
    }

}
