package case_study_module_2.furama_management.controller;

import case_study_module_2.furama_management.service.impl.CustomerService;
import case_study_module_2.furama_management.service.impl.EmployeeService;
import case_study_module_2.furama_management.service.impl.FacilityService;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean flag = true;

    public static void displayMainMenu() {
        int choose;
        do {
            System.out.println("---FURAMA MANAGEMENT---" +
                    "\n 1.Employee Management" +
                    "\n 2.Customer Management" +
                    "\n 3.Facility Management" +
                    "\n 4.Booking Management" +
                    "\n 5.Promotion Management" +
                    "\n 6.Exit");
            System.out.print("Function you want to access : ");
            try {
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        employeeMenu();
                        break;
                    case 2:
                        customerMenu();
                        break;
                    case 3:
                        facilityMenu();
                        break;
                    case 4:
                        bookingMenu();
                        break;
                    case 5:
                        promotionMenu();
                        break;
                    case 6:
                        System.out.println("Exit succeed !");
                        flag = false;
                        break;
                    default:
                        System.out.println("----Invalid input (Out Number), please choose again----");
                }
            } catch (NumberFormatException e) {
                System.out.println("----Invalid input (Not a Number) ,please choose again----");
            }
        } while (flag);
    }

    public static void employeeMenu() {
        int choose;
        EmployeeService employeeService = new EmployeeService();
        do {
            System.out.println("---EMPLOYEE MANAGEMENT---" +
                    "\n 1.Display list employee " +
                    "\n 2.Add new employee" +
                    "\n 3.Edit employee" +
                    "\n 4.Return Main Menu");
            System.out.print("Function you want to access : ");
            try {
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        employeeService.display();
                        break;
                    case 2:
                        employeeService.add();
                        break;
                    case 3:
                        employeeService.edit();
                        break;
                    case 4:
                        displayMainMenu();
                        break;
                    default:
                        System.out.println("----Invalid input (Number Out), please choose again----");
                }
            } catch (NumberFormatException e) {
                System.out.println("----Invalid input (Not a Number), please choose again----");
            }

        } while (flag);
    }

    public static void customerMenu() {
        int choose;
        CustomerService customerService = new CustomerService();
        do {
            System.out.println("---CUSTOMER MANAGEMENT---" +
                    "\n 1.Display list customer " +
                    "\n 2.Add new customer" +
                    "\n 3.Edit customer" +
                    "\n 4.Return Main Menu");
            System.out.print("Function you want to access : ");
            try {
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        customerService.display();
                        break;
                    case 2:
                        customerService.add();
                        break;
                    case 3:
                        customerService.edit();
                        break;
                    case 4:
                        displayMainMenu();
                        break;
                    default:
                        System.out.println("----Invalid input (Number Out) , please choose again----");

                }
            } catch (NumberFormatException e) {
                System.out.println("----Invalid input (Not a Number) , please choose again----");
            }

        } while (flag);
    }

    public static void facilityMenu() {
        FacilityService facilityService = new FacilityService();
        do {
            System.out.println("---FACILITY MANAGEMENT---" +
                    "\n 1.Display list facility " +
                    "\n 2.Add new facility" +
                    "\n 3.Display list facility maintenance" +
                    "\n 4.Return Main Menu");
            System.out.print("Function you want to access : ");
            try{
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        facilityService.display();
                        break;
                    case 2:
                        facilityService.add();
                        break;
                    case 3:
                        facilityService.displayMaintenance();
                        break;
                    case 4:
                        displayMainMenu();
                        flag = false;
                        break;
                    default:
                        System.out.println("----Invalid input (Number Out), please choose again----");
                }
            }catch (NumberFormatException e){ System.out.println("----Invalid input (Not a Number) , please choose again----");}

        } while (flag);
    }

    public static void bookingMenu() {
        int choose;
        do {
            System.out.println("---BOOKING MANAGEMENT---" +
                    "\n 1.Add new booking " +
                    "\n 2.Display list booking" +
                    "\n 3.Create new contract" +
                    "\n 4.Display list contracts" +
                    "\n 5.Edit contracts" +
                    "\n 6.Return Main Menu");
            System.out.print("Function you want to access : ");
            try {
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        displayMainMenu();
                        break;
                    default:
                        System.out.println("----Invalid input (Number Out), please choose again----");
                }
            } catch (NumberFormatException e) {
                System.out.println("----Invalid input (Not a Number), please choose again----");
            }

        } while (flag);
    }

    public static void promotionMenu() {
        int choose;
        do {
            System.out.println("---PROMOTION MANAGEMENT---" +
                    "\n 1.Display list customers use service " +
                    "\n 2.Display list customers get voucher" +
                    "\n 3.Return Main Menu");
            System.out.print("Function you want to access : ");
            try {
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                    case 2:
                    case 3:
                        displayMainMenu();
                        break;
                    default:
                        System.out.println("----Invalid input (Number Out), please choose again----");
                }
            } catch (NumberFormatException e) {
                System.out.println("----Invalid input (Not a Number), please choose again----");
            }
        } while (flag);
    }
}
