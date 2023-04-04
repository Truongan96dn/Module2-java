package case_study_module_2.furama_management.service.impl;

import case_study_module_2.furama_management.model.facility.Villa;
import case_study_module_2.furama_management.repository.impl.VillaRepo;
import case_study_module_2.furama_management.service.IVillaService;
import case_study_module_2.furama_management.utils.FacilityValidate;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VillaService implements IVillaService {
    boolean flag = true;
    Scanner scanner = new Scanner(System.in);
    VillaRepo villaRepo=new VillaRepo();
    static Map<Villa,Integer> villaIntegerMap = new LinkedHashMap<>();

    @Override
    public void display() {
        villaIntegerMap=villaRepo.getAll();
        for (Villa v:villaIntegerMap.keySet()) {
            System.out.println(v + "value= "+villaIntegerMap.get(v));
        }
    }

    @Override
    public void add() {
        String serviceName;
        float usingArea;
        float swimArea;
        float rentalPrice;
        int personLimit;
        String typeofRental;
        String roomStandard;
        int numberOfFloor;
        do {
            System.out.println("Input new Villa service Name (SVVL-XXXX) : ");
            serviceName = scanner.nextLine();
        } while (!FacilityValidate.checkVillaServiceName(serviceName));
        do {
            System.out.println("Input using area >30m2 : ");
            usingArea = Integer.parseInt(scanner.nextLine());
        } while (!FacilityValidate.checkUsingAreaAndPoolArea(usingArea));
        do {
            System.out.println("Input rental price ( not minus number):");
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
        do {
            System.out.println("Input swimming pool area >30m2 : ");
            swimArea = Integer.parseInt(scanner.nextLine());
        } while (!FacilityValidate.checkUsingAreaAndPoolArea(swimArea));
        Villa villa = new Villa(serviceName,usingArea,rentalPrice,personLimit,typeofRental,roomStandard,numberOfFloor,swimArea);
        Integer value = 0 ;
        villaRepo.add(villa,value);
    }
    @Override
    public void displayMaintenance() {
        for (Integer v : villaRepo.getAll().values()) {
            if (v >= 5) {
                System.out.println("Facility needs to maintenance !" + villaRepo.getAll().values());
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Villa : There is no facility need to maintenance !");
        }
    }
}
