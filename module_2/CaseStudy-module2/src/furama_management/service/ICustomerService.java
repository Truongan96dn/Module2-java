package furama_management.service;

public interface ICustomerService extends IService{
    @Override
    void display();

    @Override
    void add();

    @Override
    void edit();
}
