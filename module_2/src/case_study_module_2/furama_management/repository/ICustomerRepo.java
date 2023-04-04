package case_study_module_2.furama_management.repository;

import case_study_module_2.furama_management.model.person.Customer;

import java.util.List;

public interface ICustomerRepo {
    void add (String path, Customer customer);
    List<Customer> getAll();
    void editCustomer(Customer customer);
}
