package access_modifier.bai_tap.student;

public class Student {
    private String name = "John";
    private String classes = "C02";
    public Student(){}
    protected String getName(){
        return this.name;
    }
    protected String getClasses(){
        return this.classes;
    }

    protected void setName(String name ) {
        this.name = name;
    }

    protected void setClasses(String classes) {
         this.classes = classes;
    }
}
