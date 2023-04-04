package case_study_module_2.furama_management.model.person;

public class Employee extends Person {
    private String staffID;
    private String education;
    private String position;
    private int salary;

    public Employee(String name, String dayOfBirth, String gender, String personID, String phoneNumber, String email, String staffID, String education, String position, int salary) {
        super(name, dayOfBirth, gender, personID, phoneNumber, email);
        this.staffID = staffID;
        this.education = education;
        this.position = position;
        this.salary = salary;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeID=" + staffID + "," + super.getPersonID() + "," +
                super.getDayOfBirth() + "," + super.getGender() +
                "," + super.getPhoneNumber() + "," + super.getEmail() +
                "," + super.getName() + "," + education + "," + position + "," + salary;
    }

    public String toCSV() {
        return "EmployeeID=" + staffID + "," + super.getPersonID() + "," +
                super.getDayOfBirth() + "," + super.getGender() +
                "," + super.getPhoneNumber() + "," + super.getEmail() +
                "," + super.getName() + "," + education + "," + position + "," + salary;
    }
}
//}return "Employee{" +
//        "staffID='" + staffID + '\'' +
//        ", education='" + education + '\'' +
//        ", position='" + position + '\'' +
//        ", salary=" + salary +
//        ", name='" + name + '\'' +
//        ", dayOfBirth='" + dayOfBirth + '\'' +
//        ", gender='" + gender + '\'' +
//        ", personID=" + personID +
//        ", phoneNumber=" + phoneNumber +
//        ", email='" + email + '\'' +
//        '}';
