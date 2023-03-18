package coding_mvc.person_management.service.implement;

import coding_mvc.person_management.Model.Staff;
import coding_mvc.person_management.storage.IStaffStore;
import coding_mvc.person_management.storage.implement.StaffStorage;

import java.util.List;
import java.util.Scanner;

public class StaffService implements IStaffService {
    IStaffStore iStaffStore = new StaffStorage();
    List<Staff> list = iStaffStore.getAll();


    @Override
    public void display() {
        for (Staff staff : list) {
            System.out.println(staff);

        }
    }

    @Override
    public void addStaff() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập giới tính ");
        String gender = scanner.nextLine();
        System.out.println("Nhập chuyên môn : ");
        String expertise = scanner.nextLine();
        Staff staff = new Staff(id, name, dateOfBirth, gender, expertise);
        iStaffStore.addStaff(staff);
        System.out.println("Thêm nhân viên thành công!");

    }

    @Override
    public void deleteStaff() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id nhân viên muốn xóa ");
        int removeID = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (removeID == list.get(i).getId()) {
                System.out.println("Bạn có chắc muốn xóa nhân viên" + i + "không ?");
                System.out.println("1. Có");
                System.out.println("2. Không ");
                int number = Integer.parseInt(scanner.nextLine());
                switch (number) {
                    case 1:
                        iStaffStore.deleteStaff(i);
                        System.out.println("Xóa nhân viên thành công ");
                    case 2:
                }
                return;
            }
        }
        System.out.println("Không tồn tại");
    }
}
