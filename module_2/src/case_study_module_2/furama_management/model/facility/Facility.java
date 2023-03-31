package case_study_module_2.furama_management.model.facility;

public class Facility {
    protected String serviceName;
    protected float usingArea;
    protected float rentalPrice;
    protected int personLimit;
    protected String typeOfRental;

    public Facility() {
    }

    public Facility(String serviceName, float usingArea, float rentalPrice, int personLimit, String typeOfRental) {
        this.serviceName = serviceName;
        this.usingArea = usingArea;
        this.rentalPrice = rentalPrice;
        this.personLimit = personLimit;
        this.typeOfRental = typeOfRental;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public float getUsingArea() {
        return usingArea;
    }

    public void setUsingArea(float usingArea) {
        this.usingArea = usingArea;
    }

    public float getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(float rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public int getPersonLimit() {
        return personLimit;
    }

    public void setPersonLimit(int personLimit) {
        this.personLimit = personLimit;
    }

    public String getTypeOfRental() {
        return typeOfRental;
    }

    public void setTypeOfRental(String typeOfRental) {
        this.typeOfRental = typeOfRental;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", usingArea=" + usingArea +
                ", rentalPrice=" + rentalPrice +
                ", personLimit=" + personLimit +
                ", typeOfRental='" + typeOfRental + '\'' +
                '}';
    }
    public String toCsv(){
        return serviceName+","+usingArea+","+rentalPrice+","+personLimit+","+typeOfRental;
    }
}
