package coding_mvc.person_management.model;

public class Staff extends Person {
    protected String expertise;

    public Staff(int id, String name, String birthday, String gender, String expertise) {
        super(id, name, birthday, gender);
        this.expertise = expertise;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }
}
