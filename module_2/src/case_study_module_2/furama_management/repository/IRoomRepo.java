package case_study_module_2.furama_management.repository;


import case_study_module_2.furama_management.model.facility.Room;

import java.util.Map;

public interface IRoomRepo {
    void add(Room room, Integer value);
    Map<Room,Integer> getAll();
}
