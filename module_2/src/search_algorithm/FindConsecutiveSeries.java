package search_algorithm;

import java.util.LinkedList;
import java.util.Scanner;

public class FindConsecutiveSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi muốn kiểm tra ");
        String str = scanner.nextLine();
        LinkedList<Character> find = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            if (list.size() > 1 && str.charAt(i) <= list.getLast()
                    && list.contains(str.charAt(i))) {
                list.clear();
            }
            list.add(str.charAt(i));
            if (list.size() > find.size()) {
                find.clear();
                find.addAll(list);
            }
        }
        for (Character element : find) {
            System.out.print(element);
        }
    }
}
