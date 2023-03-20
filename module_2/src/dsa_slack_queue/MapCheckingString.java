package dsa_slack_queue;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class MapCheckingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        System.out.println("Nhập chuỗi muốn kiểm tra :");
        String str = scanner.nextLine();
        String[] array = str.split("");
        for (String element : array) {
            if (treeMap.containsKey(element)) {
                int count = treeMap.get(element);
                treeMap.put(element, count + 1);
            } else {
                treeMap.put(element, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            String word = entry.getKey();
            int count1 = entry.getValue();
            System.out.println(word + ": " + count1);
        }

    }
}
