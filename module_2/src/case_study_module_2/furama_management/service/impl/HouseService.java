package case_study_module_2.furama_management.service.impl;

import case_study_module_2.furama_management.model.facility.House;
import case_study_module_2.furama_management.repository.impl.HouseRepo;
import case_study_module_2.furama_management.service.IHouseService;
import case_study_module_2.furama_management.utils.FacilityValidate;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HouseService implements IHouseService {
    Scanner scanner = new Scanner(System.in);
    HouseRepo houseRepo = new HouseRepo();
    static Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
    @Override
    public void display() {
        houseIntegerMap=houseRepo.getAll();
        for (House h : houseIntegerMap.keySet()) {
            System.out.println(h+"value="+houseIntegerMap.get(h));
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
        int numberOfFloor;
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
        do{
            System.out.println("Input number of floor");
            numberOfFloor = Integer.parseInt(scanner.nextLine());
        }while (!FacilityValidate.checkFloor(numberOfFloor));
        House house = new House(serviceName, usingArea, rentalPrice, personLimit, typeofRental, roomStandard, numberOfFloor);
        Integer value = 1;
        houseRepo.add(house,value);
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
