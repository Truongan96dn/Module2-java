package case_study_module_2.furama_management.repository;

import case_study_module_2.furama_management.model.person.Employee;

import java.util.List;

public interface IEmployeeRepo {
    void add (String path, Employee employee);
    List<Employee> getAll();
    void editEmployee(Employee employee);
}
