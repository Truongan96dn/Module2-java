package case_study_module_2.furama_management.model.facility;

public class Villa extends House{
    private float swimmingPoolArea;

    public Villa(String serviceName, float usingArea, float rentalPrice, int personLimit, String typeOfRental, String roomStandard, int numberOfFloors, float swimmingPoolArea) {
        super(serviceName, usingArea, rentalPrice, personLimit, typeOfRental, roomStandard, numberOfFloors);
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public Villa() {
    }

    public float getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(float swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "serviceName='" + serviceName + '\'' +
                ", usingArea=" + usingArea +
                ", rentalPrice=" + rentalPrice +
                ", personLimit=" + personLimit +
                ", typeOfRental='" + typeOfRental + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                ", swimmingPoolArea=" + swimmingPoolArea +
                '}';
    }

    public String toCsv(){
        return serviceName+","+usingArea+","+rentalPrice+","+
                personLimit+","+typeOfRental+","+
                roomStandard+","+numberOfFloors+","+swimmingPoolArea;
    }
}
