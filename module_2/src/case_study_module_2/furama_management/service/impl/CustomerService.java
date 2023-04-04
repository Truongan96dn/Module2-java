package case_study_module_2.furama_management.service.impl;

import case_study_module_2.furama_management.controller.FuramaController;
import case_study_module_2.furama_management.model.person.Customer;
import case_study_module_2.furama_management.repository.impl.CustomerRepo;
import case_study_module_2.furama_management.service.ICustomerService;
import case_study_module_2.furama_management.utils.FacilityValidate;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    CustomerRepo customerRepo = new CustomerRepo();
    private static final String CUSTOMER_LIST_PATH= "module_2/src/case_study_module_2/furama_management/data/CustomersList.csv";
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        List<Customer> customerList = customerRepo.getAll();
        for (Customer c : customerList) {
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
        customerRepo.add(CUSTOMER_LIST_PATH,customer);
    }

    @Override
    public void edit() {
        List<Customer> customerList= customerRepo.getAll();
        boolean flag =true ;
        System.out.println("input Customer ID need to change :");
        String id = scanner.nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            if (id.equals(customerList.get(i).getCustomerID())) {
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
                    try{
                        int choose = Integer.parseInt(scanner.nextLine());
                        switch (choose) {
                            case 1:
                                System.out.println("Input type of customer need to change :");
                                String typeOfCustomer = scanner.nextLine();
                                customerList.get(i).setTypeOfCustomer(typeOfCustomer);
                                System.out.println("succeed");
                                break;
                            case 2:
                                System.out.println("Input address need to change:");
                                String address = scanner.nextLine();
                                customerList.get(i).setAddress(address);
                                System.out.println("succeed");
                                break;
                            case 3:
                                System.out.println("input Name need to change :");
                                String name = scanner.nextLine();
                                customerList.get(i).setName(name);
                                System.out.println("succeed");
                                break;
                            case 4:
                                System.out.println("input new Day of birth :");
                                String dayOfbirth = scanner.nextLine();
                                customerList.get(i).setDayOfBirth(dayOfbirth);
                                System.out.println("succeed");
                                break;
                            case 5:
                                System.out.println("input new gender :");
                                String gender = scanner.nextLine();
                                customerList.get(i).setGender(gender);
                                System.out.println("succeed");
                                break;
                            case 6:
                                System.out.println("Input person ID need to change :");
                                String personId = scanner.nextLine();
                                customerList.get(i).setPersonID(personId);
                                System.out.println("succeed");
                            case 7:
                                System.out.println("Input phone number need to change :");
                                String phoneNumb = scanner.nextLine();
                                customerList.get(i).setPhoneNumber(phoneNumb);
                                System.out.println("succeed");
                            case 8:
                                System.out.println("input new Email :");
                                String email = scanner.nextLine();
                                customerList.get(i).setEmail(email);
                                System.out.println("succeed");
                                break;
                            case 9:
                                customerRepo.editCustomer(customerList.get(i));
                                FuramaController.customerMenu();
                                break;
                            default:
                                System.out.println("Invalid input , please choose again !");
                        }
                    }catch (NumberFormatException e){
                        System.out.println("Invalid input , please choose again !");
                    }
                } while (true);
            }
        }if(flag) {
            System.out.println("ID not Valid !");
        }
    }
}
