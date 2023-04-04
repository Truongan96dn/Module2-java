package case_study_module_2.furama_management.repository.impl;

import case_study_module_2.furama_management.model.facility.Room;
import case_study_module_2.furama_management.model.facility.Villa;
import case_study_module_2.furama_management.repository.IRoomRepo;
import case_study_module_2.furama_management.utils.ReadAndWrite;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RoomRepo implements IRoomRepo {
    private static final String ROOM_LIST_PATH = "module_2/src/case_study_module_2/furama_management/data/RoomList.csv";
    @Override
    public void add(Room room, Integer value) {
        List<String> stringList = ReadAndWrite.readFile(ROOM_LIST_PATH);
        String string = room.toCSV();
        stringList.add(string + "," + value);
        for (int i = 0; i < stringList.size(); i++) {
            if (i == 0) {
                ReadAndWrite.writeFile(ROOM_LIST_PATH, Collections.singletonList(stringList.get(i)), false);
            } else {
                ReadAndWrite.writeFile(ROOM_LIST_PATH, Collections.singletonList(stringList.get(i)), true);
            }
        }
    }

    @Override
    public Map<Room, Integer> getAll() {
        Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();
        List<String> list = ReadAndWrite.readFile(ROOM_LIST_PATH);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String string = list.get(i);
            String[] arr = string.split(",");
          //   (String serviceName, float usingArea, float rentalPrice,
            //    int personLimit, String typeOfRental, String freeServiceInclude)
            roomIntegerMap.put(new Room(arr[0],Float.parseFloat(arr[1]),Float.parseFloat(arr[2]),Integer.parseInt(arr[3]),arr[4],arr[5]),Integer.parseInt(arr[6]));
        }
        return roomIntegerMap;
    }
}
