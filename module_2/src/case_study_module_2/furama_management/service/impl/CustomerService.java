package case_study_module_2.furama_management.service.impl;

import case_study_module_2.furama_management.controller.FuramaController;
import case_study_module_2.furama_management.model.person.Customer;
import case_study_module_2.furama_management.service.ICustomerService;
import case_study_module_2.furama_management.utils.FacilityValidate;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    Scanner scanner = new Scanner(System.in);
    static List<Customer> customersList = new LinkedList<>();

    static {
        customersList.add(new Customer("An", "01/02/2000", "nam", "29345", "12234567", "hotruongandn@gmail.com)", "49583", "Diamond", "da nang"));
    }


    @Override
    public void display() {
        for (Customer c : customersList) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {
        String dayOfBirth;
        System.out.println(" Input new customer ID");
        String customerID = scanner.nextLine();
        System.out.println("Input type of Customer");
        String typeOfCustomer = scanner.nextLine();
        System.out.println("Input address");
        String address = scanner.nextLine();
        System.out.println("Input Name ");
        String name = scanner.nextLine();
        do {
            System.out.println("Input day of birth (dd/MM/YYYY)");
            dayOfBirth = scanner.nextLine();
        } while (!FacilityValidate.checkDateOfBirth(dayOfBirth));
        System.out.println("Input gender");
        String gender = scanner.nextLine();
        System.out.println("Input person ID");
        String personId = scanner.nextLine();
        System.out.println("Input phone number");
        String phoneNumb = scanner.nextLine();
        System.out.println("Input email");
        String email = scanner.nextLine();
        Customer customer = new Customer(name, dayOfBirth, gender, personId, phoneNumb, email, customerID, typeOfCustomer, address);
        customersList.add(customer);
    }

    @Override
    public void edit() {
        System.out.println("input Employee ID need to change :");
        String id = scanner.nextLine();
        for (int i = 0; i < customersList.size(); i++) {
            if (id.equals(customersList.get(i).getCustomerID())) {

                do {
                    System.out.println("Choose information need to change :" +
                            "\n 1. Type of customer " +
                            "\n 2. address " +
                            "\n 3. Name " +
                            "\n 4. Day of Birth " +
                            "\n 5. Gender " +
                            "\n 6. Person ID " +
                            "\n 7. Phone number " +
                            "\n 8. Email " +
                            "\n 9. Return Customer Menu");
                    int choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            System.out.println("Input type of customer need to change :");
                            String typeOfCustomer = scanner.nextLine();
                            customersList.get(i).setTypeOfCustomer(typeOfCustomer);
                            System.out.println("succeed");
                            break;
                        case 2:
                            System.out.println("Input address need to change:");
                            String address = scanner.nextLine();
                            customersList.get(i).setAddress(address);
                            System.out.println("succeed");
                            break;
                        case 3:
                            System.out.println("input Name need to change :");
                            String name = scanner.nextLine();
                            customersList.get(i).setName(name);
                            System.out.println("succeed");
                            break;
                        case 4:
                            System.out.println("input new Day of birth :");
                            String dayOfbirth = scanner.nextLine();
                            customersList.get(i).setDayOfBirth(dayOfbirth);
                            System.out.println("succeed");
                            break;
                        case 5:
                            System.out.println("input new gender :");
                            String gender = scanner.nextLine();
                            customersList.get(i).setGender(gender);
                            System.out.println("succeed");
                            break;
                        case 6:
                            System.out.println("Input person ID need to change :");
                            String personId = scanner.nextLine();
                            customersList.get(i).setPersonID(personId);
                            System.out.println("succeed");
                        case 7:
                            System.out.println("Input phone number need to change :");
                            String phoneNumb = scanner.nextLine();
                            customersList.get(i).setPhoneNumber(phoneNumb);
                            System.out.println("succeed");
                        case 8:
                            System.out.println("input new Email :");
                            String email = scanner.nextLine();
                            customersList.get(i).setEmail(email);
                            System.out.println("succeed");
                            break;
                        case 9:
                            FuramaController.customerMenu();
                            break;
                    }
                } while (true);
            }
        }
    }
}
