package coding_mvc.person_management.storage;

import coding_mvc.person_management.model.Staff;

import java.util.List;

public interface IStaffStore {
    List<Staff> getAll();

    void addStaff(Staff staff);

    void deleteStaff(int removeID);

}
