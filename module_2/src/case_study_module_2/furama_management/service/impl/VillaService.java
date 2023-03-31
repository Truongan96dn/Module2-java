package case_study_module_2.furama_management.service.impl;

import case_study_module_2.furama_management.model.facility.Villa;
import case_study_module_2.furama_management.service.IVillaService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VillaService implements IVillaService {
    Scanner scanner = new Scanner(System.in);
    static Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();

    static {
        villaIntegerMap.put(new Villa("SV02-villa1", 100, 5000, 7, "week", "kingBed", 1, 25), 1);
        villaIntegerMap.put(new Villa("SV03-villa1", 200, 10000, 7, "month", "QueenBed", 2, 70), 5);
    }

    @Override
    public void display() {
        for (Villa v : villaIntegerMap.keySet()) {
            System.out.println(v);
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
        System.out.println("Input swimming pool area");
        float swimArea = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(serviceName, usingArea, rentalPrice, personLimit, typeofRental, roomStandard, numberOfFloor, swimArea);
        villaIntegerMap.put(villa, 1);
    }

    @Override
    public void edit() {

    }

    @Override
    public void displayMaintenance() {
        boolean flag = true;
        for (Integer v : villaIntegerMap.values()) {
            if (v >= 5) {
                System.out.println("Facility needs to maintenance !" + villaIntegerMap.keySet());
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Villa : There is no facility need to maintenance !");
        }
    }
}
