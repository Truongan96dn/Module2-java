package furama_management.service.impl;

import furama_management.controller.FuramaController;
import furama_management.model.person.Employee;
import furama_management.service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    static List<Employee> employeeArrayList = new ArrayList<>();
    static {
    employeeArrayList.add(new Employee("An","01/02/1996","Nam","23421","01234","hotruongandn@gmail.com","123","DH","Manager",7000));
}

    @Override
    public void display() {
        for (Employee e: employeeArrayList) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        System.out.println(" Input new employee ID");
        String staffId = scanner.nextLine();
        System.out.println("Input education");
        String education = scanner.nextLine();
        System.out.println("Input  position");
        String position = scanner.nextLine();
        System.out.println("Input salary");
        int salary = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Name ");
        String name = scanner.nextLine();
        System.out.println("Input day of birth");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Input gender");
        String gender = scanner.nextLine();
        System.out.println("Input person ID");
        String personId = scanner.nextLine();
        System.out.println("Input phone number");
        String phoneNumb = scanner.nextLine();
        System.out.println("Input email");
        String email = scanner.nextLine();
        Employee employee = new Employee(name,dayOfBirth,gender,personId,phoneNumb,email,staffId,education,position,salary);
        employeeArrayList.add(employee);
    }

    @Override
    public void edit() {
        System.out.println("input Employee ID need to change :");
        String id = scanner.nextLine();
        for (int i = 0; i < employeeArrayList.size(); i++) {
            if(id.equals(employeeArrayList.get(i).getStaffID())){

                do{
                    System.out.println("Choose information need to change :"+
                            "\n 1. Education "+
                            "\n 2. Position "+
                            "\n 3. Salary "+
                            "\n 4. Name "+
                            "\n 5. Day of Birth "+
                            "\n 6. Gender "+
                            "\n 7. Person ID "+
                            "\n 8. Phone number "+
                            "\n 9. Email "+
                            "\n 10. Return Employee Menu");
                    int choose = Integer.parseInt(scanner.nextLine());
                    switch (choose){
                        case 1:
                            System.out.println("Input Education need to change :");
                            String edu = scanner.nextLine();
                            employeeArrayList.get(i).setEducation(edu);
                            System.out.println("succeed");
                            break;
                        case 2:
                            System.out.println("Input position need to change:");
                            String pos = scanner.nextLine();
                            employeeArrayList.get(i).setPosition(pos);
                            System.out.println("succeed");
                            break;
                        case 3:
                            System.out.println("Input salary need to change :");
                            int salary = Integer.parseInt(scanner.nextLine());
                            employeeArrayList.get(i).setSalary(salary);
                            System.out.println("succeed");
                            break;
                        case 4:
                            System.out.println("input Name need to change :");
                            String name = scanner.nextLine();
                            employeeArrayList.get(i).setName(name);
                            System.out.println("succeed");
                            break;
                        case 5:
                            System.out.println("input new Day of birth :");
                            String dayOfbirth = scanner.nextLine();
                            employeeArrayList.get(i).setDayOfBirth(dayOfbirth);
                            System.out.println("succeed");
                            break;
                        case 6:
                            System.out.println("input new gender :");
                            String gender = scanner.nextLine();
                            employeeArrayList.get(i).setGender(gender);
                            System.out.println("succeed");
                            break;
                        case 7:
                            System.out.println("Input person ID need to change :");
                            String personId = scanner.nextLine();
                            employeeArrayList.get(i).setPersonID(personId);
                            System.out.println("succeed");
                        case 8:
                            System.out.println("Input phone number need to change :");
                            String phoneNumb = scanner.nextLine();
                            employeeArrayList.get(i).setPhoneNumber(phoneNumb);
                            System.out.println("succeed");
                        case 9:
                            System.out.println("input new Email :");
                            String email = scanner.nextLine();
                            employeeArrayList.get(i).setEmail(email);
                            System.out.println("succeed");
                            break;
                        case 10:
                            FuramaController.employeeMenu();
                            break;
                    }
                }while (true);
            }
        }

    }
}
