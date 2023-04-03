package case_study_module_2.furama_management.service.impl;

import case_study_module_2.furama_management.model.facility.House;
import case_study_module_2.furama_management.model.facility.Villa;
import case_study_module_2.furama_management.service.IHouseService;
import case_study_module_2.furama_management.utils.FacilityValidate;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HouseService implements IHouseService {
    Scanner scanner = new Scanner(System.in);
    static Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();

    static {
        houseIntegerMap.put((new House("SV01-house1", 70, 4000, 4, "month", "twin", 2)), 1);
        houseIntegerMap.put((new House("SV02-house1", 70, 500, 4, "day", "king", 2)), 6);
    }

    @Override
    public void display() {
        for (House h : houseIntegerMap.keySet()) {
            System.out.println(h);
        }
    }

    @Override
    public void add() {
        String serviceName;
        float usingArea;
        float rentalPrice;
        int personLimit;
        String typeofRental;
        String roomStandard;
        do {
            System.out.println("Input new House service Name (SVHO-XXXX) : ");
            serviceName = scanner.nextLine();
        } while (!FacilityValidate.checkHouseServiceName(serviceName));
        do {
            System.out.println("Input using area >30m2 : ");
            usingArea = Integer.parseInt(scanner.nextLine());
        } while (!FacilityValidate.checkUsingAreaAndPoolArea(usingArea));
        do {
            System.out.println("Input rental price (not minus number):");
            rentalPrice = Integer.parseInt(scanner.nextLine());
        } while (!FacilityValidate.checkRentalPrice(rentalPrice));
        do {
            System.out.println("Input person limit (over 1 person)");
            personLimit = Integer.parseInt(scanner.nextLine());
        } while (!FacilityValidate.checkPersonLimit(personLimit));
        do {
            System.out.println("Input type of rental ");
            typeofRental = scanner.nextLine();
        } while (!FacilityValidate.checkTypeOfRentalAndRoomStandard(typeofRental));
        do {
            System.out.println("Input room standard");
            roomStandard = scanner.nextLine();
        } while (!FacilityValidate.checkTypeOfRentalAndRoomStandard(roomStandard));
        System.out.println("Input number of floor");
        int numberOfFloor = Integer.parseInt(scanner.nextLine());
        House house = new House(serviceName, usingArea, rentalPrice, personLimit, typeofRental, roomStandard, numberOfFloor);
        houseIntegerMap.put(house, 1);
    }

    @Override
    public void displayMaintenance() {
        boolean flag = true;
        for (Integer h : houseIntegerMap.values()) {
            if (h >= 5) {
                System.out.println("Facility needs to maintenance !" + houseIntegerMap.keySet());
                flag = false;
            }
        }
        if (flag) {
            System.out.println("House : There is no facility need to maintenance !");
        }
    }

    @Override
    public void edit() {
    }
}
