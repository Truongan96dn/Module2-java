package mvc_coding.repository;

import mvc_coding.model.Employees;

import java.util.List;

public interface IEmpRepository {
    List<Employees> getAllEmployee ();
    void addEmployee();
    void deleteEmployee();
}
