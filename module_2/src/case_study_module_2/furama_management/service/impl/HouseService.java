package case_study_module_2.furama_management.service.impl;

import case_study_module_2.furama_management.model.facility.House;
import case_study_module_2.furama_management.model.facility.Villa;
import case_study_module_2.furama_management.service.IHouseService;

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
        System.out.println("Input new service Name : ");
        String serviceName = scanner.nextLine();
        System.out.println("Input using area : ");
        float usingArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Input rental price:");
        float rentalPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Input person limit");
        int personLimit = Integer.parseInt(scanner.nextLine());
        System.out.println("Input type of rental ");
        String typeofRental = scanner.nextLine();
        System.out.println("Input room standard");
        String roomStandard = scanner.nextLine();
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
