package case_study_module_2.furama_management.repository;

import case_study_module_2.furama_management.model.facility.House;

import java.util.Map;

public interface IHouseRepo {
    void add(House house,Integer value);
    Map<House,Integer> getAll();
}
