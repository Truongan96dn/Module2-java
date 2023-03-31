package furama_management.model.facility;

public class House extends Facility {
    protected String roomStandard;
    protected int numberOfFloors;

    public House() {
    }

    public House(String serviceName, float usingArea, float rentalPrice, int personLimit, String typeOfRental, String roomStandard, int numberOfFloors) {
        super(serviceName, usingArea, rentalPrice, personLimit, typeOfRental);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    public String toCsv() {
        return super.getServiceName() + "," + super.getTypeOfRental() + "," + super.getRentalPrice() + "," + super.getPersonLimit() + "," + super.getUsingArea() + "," + roomStandard + "," + numberOfFloors;
    }
}
