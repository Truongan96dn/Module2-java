package case_study_module_2.furama_management.repository.impl;

import case_study_module_2.furama_management.model.facility.Villa;
import case_study_module_2.furama_management.repository.IVillaRepo;
import case_study_module_2.furama_management.utils.ReadAndWrite;

import java.util.*;

public class VillaRepo implements IVillaRepo {
    private static final String VILLA_LIST_PATH = "module_2/src/case_study_module_2/furama_management/data/VillaList.csv";

    @Override
    public void add(Villa villa, Integer value) {
        List<String> stringList = ReadAndWrite.readFile(VILLA_LIST_PATH);
        String string = villa.toCsv();
        stringList.add(string + "," + value);
        for (int i = 0; i < stringList.size(); i++) {
            if (i == 0) {
                ReadAndWrite.writeFile(VILLA_LIST_PATH, Collections.singletonList(stringList.get(i)), false);
            } else {
                ReadAndWrite.writeFile(VILLA_LIST_PATH, Collections.singletonList(stringList.get(i)), true);
            }
        }
    }

    @Override
    public Map<Villa, Integer> getAll() {
        Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
        List<String> list = ReadAndWrite.readFile(VILLA_LIST_PATH);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String string = list.get(i);
            String[] arr = string.split(",");
            //String serviceName, float usingArea, float rentalPrice, int personLimit, String typeOfRental,
            // String roomStandard, int numberOfFloors, float swimmingPoolArea
            villaIntegerMap.put(new Villa(arr[0],Float.parseFloat(arr[1]),Float.parseFloat(arr[2]),Integer.parseInt(arr[3]),arr[4],arr[5],Integer.parseInt(arr[6]),Float.parseFloat(arr[7])),Integer.parseInt(arr[8]));
        }
        return villaIntegerMap;
    }
}
