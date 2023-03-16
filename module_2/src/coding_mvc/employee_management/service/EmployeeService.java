package coding_mvc.employee_management.service;

import coding_mvc.employee_management.Model.Employee;

public class EmployeeService implements IEmployeeService{
    static Employee[] employees = new Employee[10];
    static{
        employees[0]=new Employee("Hồ Trường An",27,5000);
        employees[1]=new Employee("Trương Quốc Hoà",25,10000);
        employees[2]=new Employee("Nguyễn Phúc Quý",23,500);
    }

    @Override
    public void display() {
    }
}
