package case_study_module_2.furama_management.repository.impl;

import case_study_module_2.furama_management.model.person.Employee;
import case_study_module_2.furama_management.repository.IEmployeeRepo;
import case_study_module_2.furama_management.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo implements IEmployeeRepo {
    private static final String EMPLOYEE_LIST_PATH = "module_2/src/case_study_module_2/furama_management/data/EmployeeList.csv";

    @Override
    public void add(String path, Employee employee) {
        String str = employee.toCSV();
        List<String> list = new ArrayList<>();
        list.add(str);
        ReadAndWrite.writeFile(EMPLOYEE_LIST_PATH, list, true);
    }

    @Override
    public List<Employee> getAll() {
        List<String> list = ReadAndWrite.readFile(EMPLOYEE_LIST_PATH);
        List<Employee> employeeList = new ArrayList<>();
        for (String element : list) {
            if (!element.equals("") && element != null) {
                String[] array = element.split(",");
                Employee employee = new Employee(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8], Integer.parseInt(array[9]));
                employeeList.add(employee);
            }
        }
        return employeeList;
    }

    @Override
    public void editEmployee(Employee employee) {
        List<String> list = ReadAndWrite.readFile(EMPLOYEE_LIST_PATH);
        List<Employee> employeeList = new ArrayList<>();
        for (String element : list) {
            if (!element.equals("") && element != null) {
                String[] array = element.split(",");
                Employee employee1 = new Employee(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8], Integer.parseInt(array[9]));
                employeeList.add(employee1);
            }
        }
        for (int i = 0; i < employeeList.size(); i++) {
            if (employee.getStaffID().equals(employeeList.get(i).getStaffID())) {
                employeeList.remove(i);
                employeeList.add(i, employee);
                break;
            }
        }
        List<String> employeeListStr = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            employeeListStr.add(employeeList.get(i).toString());
        }
        ReadAndWrite.writeFile(EMPLOYEE_LIST_PATH, employeeListStr, false);
    }
}
