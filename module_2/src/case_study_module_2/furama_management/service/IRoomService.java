package case_study_module_2.furama_management.service;

public interface IRoomService extends IFacilityService{
    @Override
    void display();

    @Override
    void add();

    @Override
    void displayMaintenance();
}
