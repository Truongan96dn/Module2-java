package case_study_module_2.furama_management.repository.impl;

import case_study_module_2.furama_management.model.facility.House;
import case_study_module_2.furama_management.model.facility.Room;
import case_study_module_2.furama_management.repository.IHouseRepo;
import case_study_module_2.furama_management.utils.ReadAndWrite;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HouseRepo implements IHouseRepo {
    private static final String HOUSE_LIST_PATH = "module_2/src/case_study_module_2/furama_management/data/HouseList.csv";
    @Override
    public void add(House house, Integer value) {
        List<String> stringList = ReadAndWrite.readFile(HOUSE_LIST_PATH);
        String string = house.toCsv();
        stringList.add(string + "," + value);
        for (int i = 0; i < stringList.size(); i++) {
            if (i == 0) {
                ReadAndWrite.writeFile(HOUSE_LIST_PATH, Collections.singletonList(stringList.get(i)), false);
            } else {
                ReadAndWrite.writeFile(HOUSE_LIST_PATH, Collections.singletonList(stringList.get(i)), true);
            }
        }

    }

    @Override
    public Map<House, Integer> getAll() {
        Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
        List<String> list = ReadAndWrite.readFile(HOUSE_LIST_PATH);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String string = list.get(i);
            String[] arr = string.split(",");
            //     (String serviceName, float usingArea,
            //     float rentalPrice, int personLimit, String typeOfRental,
            //     String roomStandard, int numberOfFloors) {
            houseIntegerMap.put(new House(arr[0],Float.parseFloat(arr[1]),Float.parseFloat(arr[2]),Integer.parseInt(arr[3]),arr[4],arr[5],Integer.parseInt(arr[6])),Integer.parseInt(arr[7]));
        }
        return houseIntegerMap;
    }
}
