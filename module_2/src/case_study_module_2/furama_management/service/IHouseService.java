package case_study_module_2.furama_management.service;

public interface IHouseService extends IFacilityService{
    @Override
    void display();

    @Override
    void add();

    @Override
    void displayMaintenance();
}
