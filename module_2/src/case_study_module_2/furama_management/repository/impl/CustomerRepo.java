package case_study_module_2.furama_management.repository.impl;

import case_study_module_2.furama_management.model.person.Customer;
import case_study_module_2.furama_management.model.person.Employee;
import case_study_module_2.furama_management.repository.ICustomerRepo;
import case_study_module_2.furama_management.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepo implements ICustomerRepo {
    private static final String CUSTOMER_LIST_PATH = "module_2/src/case_study_module_2/furama_management/data/CustomersList.csv";

    @Override
    public void add(String path, Customer customer) {
        String str = customer.toCSV();
        List<String> list = new ArrayList<>();
        list.add(str);
        ReadAndWrite.writeFile(CUSTOMER_LIST_PATH, list, true);
    }

    @Override
    public List<Customer> getAll() {
        List<String> list = ReadAndWrite.readFile(CUSTOMER_LIST_PATH);
        List<Customer> customerList = new ArrayList<>();
        for (String element : list) {
            if (!element.equals("") && element != null) {
                String[] array = element.split(",");
                Customer customer = new Customer(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8]);
                customerList.add(customer);
            }
        }
        return customerList;
    }

    @Override
    public void editCustomer(Customer customer) {
        List<String> list = ReadAndWrite.readFile(CUSTOMER_LIST_PATH);
        List<Customer> customerList = new ArrayList<>();
        for (String element : list) {
            if (!element.equals("") && element != null) {
                String[] array = element.split(",");
                Customer customer1 = new Customer(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8]);
                customerList.add(customer1);
            }
        }
        for (int i = 0; i < customerList.size(); i++) {
            if (customer.getCustomerID().equals(customerList.get(i).getCustomerID())) {
                customerList.remove(i);
                customerList.add(i, customer);
                break;
            }
        }
        List<String> customerListStr = new ArrayList<>();
        for (int i = 0; i < customerList.size(); i++) {
            customerListStr.add(customerList.get(i).toString());
        }
        ReadAndWrite.writeFile(CUSTOMER_LIST_PATH, customerListStr, false);
    }
}

