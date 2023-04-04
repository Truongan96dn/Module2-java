package case_study_module_2.furama_management.service.impl;

import case_study_module_2.furama_management.controller.FuramaController;
import case_study_module_2.furama_management.model.facility.Facility;
import case_study_module_2.furama_management.model.facility.Villa;
import case_study_module_2.furama_management.service.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityService implements IFacilityService {
    Scanner scanner = new Scanner(System.in);
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static VillaService villaService = new VillaService();
    static RoomService roomService = new RoomService();
    static HouseService houseService = new HouseService();

    @Override
    public void display() {
        villaService.display();
        roomService.display();
        houseService.display();
    }

    @Override
    public void add() {
        boolean flag = true;
        do {
            System.out.println("Type of facility:" +
                    "\n 1. Add New Villa " +
                    "\n 2. Add New House " +
                    "\n 3. Add New Room " +
                    "\n 4. Return to menu ");
            try{
                int choose = scanner.nextInt();
                switch (choose) {
                    case 1:
                        villaService.add();
                        break;
                    case 2:
                        houseService.add();
                        break;
                    case 3:
                        roomService.add();
                        break;
                    case 4:
                        FuramaController.facilityMenu();
                        flag = false;
                        break;
                    default:
                        System.out.println("----Invalid input (Number Out) , please choose again----");
                }
            }catch (NumberFormatException e){System.out.println("----Invalid input (Not a Number) , please choose again----");}
        } while (flag);
    }
    @Override
    public void edit() {}
    @Override
    public void displayMaintenance() {
        villaService.displayMaintenance();
        houseService.displayMaintenance();
        roomService.displayMaintenance();
    }
}
