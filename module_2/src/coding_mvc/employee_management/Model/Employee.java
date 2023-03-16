package coding_mvc.employee_management.Model;

public class Employee {
    private String name;
    private int age;
    private int salary;
    static String country;

    static {
        country = " VN ";
    }

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Employee.country = country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", country =" + country +
                '}';
    }
}
