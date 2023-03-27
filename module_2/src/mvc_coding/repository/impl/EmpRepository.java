package mvc_coding.repository.impl;

import mvc_coding.model.Employees;
import mvc_coding.repository.IEmpRepository;

import java.util.List;

public class EmpRepository implements IEmpRepository {
    private final String EMPLOYESS_LIST_PATH = "module_2/src/mvc_coding/data/ListOfEmployee.csv";


    @Override
    public List<Employees> getAllEmployee() {
        return null;
    }

    @Override
    public void addEmployee() {

    }

    @Override
    public void deleteEmployee() {

    }
}
