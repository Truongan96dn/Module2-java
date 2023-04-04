package case_study_module_2.furama_management.service.impl;

import case_study_module_2.furama_management.model.facility.Room;
import case_study_module_2.furama_management.model.facility.Villa;
import case_study_module_2.furama_management.repository.impl.RoomRepo;
import case_study_module_2.furama_management.service.IRoomService;
import case_study_module_2.furama_management.utils.FacilityValidate;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RoomService implements IRoomService {
    Scanner scanner = new Scanner(System.in);
    RoomRepo roomRepo = new RoomRepo();
    static Map<Room,Integer> roomIntegerMap = new LinkedHashMap<>();

    public void display() {
        roomIntegerMap=roomRepo.getAll();
        for (Room v:roomIntegerMap.keySet()) {
            System.out.println(v + "value="+roomIntegerMap.get(v));
        }
    }

    @Override
    public void add() {
        String serviceName;
        float usingArea;
        float rentalPrice;
        int personLimit;
        String typeofRental;
        do {
            System.out.println("Input new Room service Name (SVRO-XXXX): ");
            serviceName = scanner.nextLine();

        } while (!FacilityValidate.checkRoomServiceName(serviceName));
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
        System.out.println("Input new Free Service");
        String freeSer = scanner.nextLine();
        Room room = new Room(serviceName,usingArea,rentalPrice,personLimit,typeofRental,freeSer);
        Integer value = 1;
        roomRepo.add(room,value);
    }

    @Override
    public void displayMaintenance() {
        boolean flag = true;
        for (Integer r : roomIntegerMap.values()) {
            if (r >= 5) {
                System.out.println("Facility needs to maintenance !" + roomIntegerMap.keySet());
            }
        }
        if (flag) {
            System.out.println("Room : There is no facility need to maintenance !");
        }
    }

    @Override
    public void edit() {
    }
}
