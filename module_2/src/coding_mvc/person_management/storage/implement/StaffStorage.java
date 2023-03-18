package coding_mvc.person_management.storage.implement;

import coding_mvc.person_management.Model.Staff;
import coding_mvc.person_management.storage.IStaffStore;

import java.util.ArrayList;
import java.util.List;

public class StaffStorage implements IStaffStore {
    private static List<Staff> staffList = new ArrayList<>();

    static {
        staffList.add(new Staff(1, "AN", "1/2/1998", "Nam", "Hoa"));
        staffList.add(new Staff(2, "NGOC", "1/2/1992", "Nam", "Ly"));
        staffList.add(new Staff(3, "VAN", "1/2/2001", "Nu", "Toan"));
    }

    @Override
    public List<Staff> getAll() {
        return staffList;
    }

    @Override
    public void addStaff(Staff staff) {
        staffList.add(staff);

    }

    @Override
    public void deleteStaff(int removeID) {
        staffList.remove(removeID);

    }
}
