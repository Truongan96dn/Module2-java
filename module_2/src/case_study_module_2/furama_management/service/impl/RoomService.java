package case_study_module_2.furama_management.service.impl;

import case_study_module_2.furama_management.model.facility.Room;
import case_study_module_2.furama_management.model.facility.Villa;
import case_study_module_2.furama_management.service.IRoomService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RoomService implements IRoomService {
    Scanner scanner = new Scanner(System.in);
    static Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();

    static {
        roomIntegerMap.put(new Room("SV03-room1", 30, 400, 2, "day", "MorningBreakFast"), 1);

    }

    public void display() {
        for (Room r : roomIntegerMap.keySet()) {
            System.out.println(r);
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
        System.out.println("Input new Free Service");
        String freeSer = scanner.nextLine();
        Room room = new Room(serviceName, usingArea, rentalPrice, personLimit, typeofRental, freeSer);
        roomIntegerMap.put(room, 1);
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
