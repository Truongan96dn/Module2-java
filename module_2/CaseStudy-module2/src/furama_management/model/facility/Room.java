package furama_management.model.facility;

public class Room extends Facility{
    private String freeServiceInclude;

    public Room(String serviceName, float usingArea, float rentalPrice, int personLimit, String typeOfRental, String freeServiceInclude) {
        super(serviceName, usingArea, rentalPrice, personLimit, typeOfRental);
        this.freeServiceInclude = freeServiceInclude;
    }

    public String getFreeServiceInclude() {
        return freeServiceInclude;
    }

    public void setFreeServiceInclude(String freeServiceInclude) {
        this.freeServiceInclude = freeServiceInclude;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServiceInclude='" + freeServiceInclude + '\'' +
                '}';
    }
    public String toCSV(){
        return  super.getServiceName() + "," + super.getUsingArea() +"," + super.getRentalPrice() +"," +super.getPersonLimit() +"," +
                super.getTypeOfRental() +"," + freeServiceInclude;
    }
}
