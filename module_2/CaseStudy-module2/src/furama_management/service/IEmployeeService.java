package furama_management.service;

public interface IEmployeeService extends IService{
    @Override
    void display();

    @Override
    void add();

    @Override
    void edit();
}
