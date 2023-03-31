package furama_management.controller;

import furama_management.service.impl.CustomerService;
import furama_management.service.impl.EmployeeService;

import java.util.Scanner;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);
    public static boolean flag = true;

    public static void displayMainMenu() {
        int choose;
        do {
            System.out.println("Menu" +
                    "\n 1.Employee Management" +
                    "\n 2.Customer Management" +
                    "\n 3.Facility Management" +
                    "\n 4.Booking Management" +
                    "\n 5.Promotion Management" +
                    "\n 6.Exit");
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
                    System.out.println("Bạn đã thoát chương trình !");
                    flag = false;
                    break;
            }


        } while (flag);
    }

    public static void employeeMenu() {
        int choose;
        EmployeeService employeeService = new EmployeeService();
        do {
            System.out.println("Menu" +
                    "\n 1.Display list employee " +
                    "\n 2.Add new employee" +
                    "\n 3.Edit employee" +
                    "\n 4.Return Main Menu");
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
            }
        } while (flag);
    }

    public static void customerMenu() {
        int choose;
        CustomerService customerService = new CustomerService();
        do {
            System.out.println("Menu" +
                    "\n 1.Display list customer " +
                    "\n 2.Add new customer" +
                    "\n 3.Edit customer" +
                    "\n 4.Return Main Menu");
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
            }
        } while (flag);
    }

    public static void facilityMenu() {
        int choose;
        do {
            System.out.println("Menu" +
                    "\n 1.Display list facility " +
                    "\n 2.Add new facility" +
                    "\n 3.Display list facility maintenance" +
                    "\n 4.Return Main Menu");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                case 2:
                case 3:
                case 4:
                    displayMainMenu();
                    break;
            }
        } while (flag);
    }

    public static void bookingMenu() {
        int choose;
        do {
            System.out.println("Menu" +
                    "\n 1.Add new booking " +
                    "\n 2.Display list booking" +
                    "\n 3.Create new contract" +
                    "\n 4.Display list contracts" +
                    "\n 5.Edit contracts" +
                    "\n 6.Return Main Menu");
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
            }
        } while (flag);
    }

    public static void promotionMenu() {
        int choose;
        do {
            System.out.println("Menu" +
                    "\n 1.Display list customers use service " +
                    "\n 2.Display list customers get voucher" +
                    "\n 3.Return Main Menu");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                case 2:
                case 3:
                    displayMainMenu();
                    break;
            }
        } while (flag);
    }
}
