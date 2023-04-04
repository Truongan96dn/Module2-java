package case_study_module_2.furama_management.service.impl;

import case_study_module_2.furama_management.controller.FuramaController;
import case_study_module_2.furama_management.model.person.Employee;
import case_study_module_2.furama_management.repository.impl.EmployeeRepo;
import case_study_module_2.furama_management.service.IEmployeeService;
import case_study_module_2.furama_management.utils.FacilityValidate;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    EmployeeRepo employeeRepo = new EmployeeRepo();
    private static final String EMPLOYEE_LIST_PATH = "module_2/src/case_study_module_2/furama_management/data/EmployeeList.csv";
    @Override
    public void display() {
        List<Employee> employeeList = employeeRepo.getAll();
        for (Employee list:employeeList){
            System.out.println(list);
        }
    }
    @Override
    public void add() {
        String dayOfBirth;
        System.out.println(" Input new employee ID");
        String staffId = scanner.nextLine();
        System.out.println("Input education");
        String education = scanner.nextLine();
        System.out.println("Input position");
        String position = scanner.nextLine();
        System.out.println("Input salary");
        int salary = Integer.parseInt(scanner.nextLine());
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
        Employee employee = new Employee(name, dayOfBirth, gender, personId, phoneNumb, email, staffId, education, position, salary);
        employeeRepo.add(EMPLOYEE_LIST_PATH,employee);
    }

    @Override
    public void edit() {
        List<Employee> list1 = employeeRepo.getAll();
        boolean flag =true ;
        System.out.println("input Employee ID need to change :");
        String id = scanner.nextLine();
        for (int i = 0; i < list1.size(); i++) {
            if (id.equals(list1.get(i).getStaffID())) {
                do {
                    System.out.println("Choose information need to change :" +
                            "\n 1. Education " +
                            "\n 2. Position " +
                            "\n 3. Salary " +
                            "\n 4. Name " +
                            "\n 5. Day of Birth " +
                            "\n 6. Gender " +
                            "\n 7. Person ID " +
                            "\n 8. Phone number " +
                            "\n 9. Email " +
                            "\n 10. Save and Return Employee Menu");
                    System.out.print("Number you choose : ");
                    int choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            System.out.println("Input Education need to change :");
                            String edu = scanner.nextLine();
                            list1.get(i).setEducation(edu);
                            System.out.println("succeed");
                            break;
                        case 2:
                            System.out.println("Input position need to change:");
                            String pos = scanner.nextLine();
                            list1.get(i).setPosition(pos);
                            System.out.println("succeed");
                            break;
                        case 3:
                            System.out.println("Input salary need to change :");
                            int salary = Integer.parseInt(scanner.nextLine());
                            list1.get(i).setSalary(salary);
                            System.out.println("succeed");
                            break;
                        case 4:
                            System.out.println("input Name need to change :");
                            String name = scanner.nextLine();
                            list1.get(i).setName(name);
                            System.out.println("succeed");
                            break;
                        case 5:
                            System.out.println("input new Day of birth :");
                            String dayOfbirth = scanner.nextLine();
                            list1.get(i).setDayOfBirth(dayOfbirth);
                            System.out.println("succeed");
                            break;
                        case 6:
                            System.out.println("input new gender :");
                            String gender = scanner.nextLine();
                            list1.get(i).setGender(gender);
                            System.out.println("succeed");
                            break;
                        case 7:
                            System.out.println("Input person ID need to change :");
                            String personId = scanner.nextLine();
                            list1.get(i).setPersonID(personId);
                            System.out.println("succeed");
                        case 8:
                            System.out.println("Input phone number need to change :");
                            String phoneNumb = scanner.nextLine();
                            list1.get(i).setPhoneNumber(phoneNumb);
                            System.out.println("succeed");
                        case 9:
                            System.out.println("input new Email :");
                            String email = scanner.nextLine();
                            list1.get(i).setEmail(email);
                            System.out.println("succeed");
                            break;
                        case 10:
                            employeeRepo.editEmployee(list1.get(i));
                            FuramaController.employeeMenu();
                            break;
                        default:
                            System.out.println("Invalid Input , please choose again");
                    }
                } while (flag);
            }
        }if(flag) {
            System.out.println("ID not Valid !");
        }
    }
}
