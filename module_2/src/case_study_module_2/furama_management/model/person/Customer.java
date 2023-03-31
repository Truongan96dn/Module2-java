package case_study_module_2.furama_management.model.person;

public class Customer extends Person {
    private String customerID;
    private String typeOfCustomer;
    private String address;

    public Customer(String name, String dayOfBirth, String gender, String personID, String phoneNumber, String email, String customerID, String typeOfCustomer, String address) {
        super(name, dayOfBirth, gender, personID, phoneNumber, email);
        this.customerID = customerID;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", personID=" + personID +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }

    public String toCSV(){
        return super.getName() +","+ super.getPersonID() + "," + super.getDayOfBirth() + "," +
                super.getGender() + "," + super.getPhoneNumber() +","+ super.getEmail() +","+
                customerID + "," + typeOfCustomer + "," + address;
    }
}
