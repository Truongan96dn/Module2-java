package case_study_module_2.furama_management.utils;

public class FacilityValidate {
    public static boolean checkVillaServiceName(String serviceName) {
        String reGex = "^(SV)(VL)\\-\\d{4}$";
        return serviceName.matches(reGex);
    }
    public static boolean checkHouseServiceName(String serviceName) {
        String reGex = "^(SV)(HO)\\-\\d{4}$";
        return serviceName.matches(reGex);
    }
    public static boolean checkRoomServiceName(String serviceName) {
        String reGex = "^(SV)(RO)\\-\\d{4}$";
        return serviceName.matches(reGex);
    }

    public static boolean checkUsingAreaAndPoolArea(float usingArea) {
        return usingArea > 30;
    }

    public static boolean checkRentalPrice(float rentalPrice) {
        return rentalPrice > 0;
    }
    public static boolean checkPersonLimit(int person){
        return person>0 && person<20;
    }
    public static boolean checkFloor ( int floor){
        return floor>0;
    }
    public static boolean checkTypeOfRentalAndRoomStandard(String input){
        String reGex= "^[A-Z][a-z]+$";
        return input.matches(reGex);
    }
    public static boolean checkDateOfBirth(String date){
        String reGex="^(([0-2][0-9])||3[0-1])\\/(([0][0-9])||1[0-2])\\/((19((2[4-9])||([3-9][0-9])))||200[0-5])$";
        return date.matches(reGex);
    }
}
