package furama_management.model.person;

public class Person {
    protected String name;
    protected String dayOfBirth;
    protected String gender;
    protected String personID;
    protected String phoneNumber;
    protected String email;

    public Person() {
    }

    public Person(String name, String dayOfBirth, String gender, String personID, String phoneNumber, String email) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.personID = personID;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", personID=" + personID +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }public String toCsv(){
        return name+","+dayOfBirth+","+gender+","+personID+","+phoneNumber+","+email;
    }

}
