package case_study_module_2.furama_management.model.facility;

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
                "serviceName='" + serviceName + '\'' +
                ", usingArea=" + usingArea +
                ", rentalPrice=" + rentalPrice +
                ", personLimit=" + personLimit +
                ", typeOfRental='" + typeOfRental + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    public String toCsv() {
        return serviceName+","+usingArea+","+rentalPrice+","+personLimit+","+typeOfRental+","+roomStandard+","+numberOfFloors;
    }
}
