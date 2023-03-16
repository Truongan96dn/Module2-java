package dsa_list;

import java.util.Scanner;

public class MyListTest extends MyList<Integer> {
    public static void main(String[] args) {
        MyList<Integer> listInterger = new MyList();
        // thêm phần tử vào mảng
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(4);
        listInterger.add(5);
        //Thêm phần tử vào vị trí index
        listInterger.add(2, 1);
        for (int i = 0; i < listInterger.getSize(); i++) {
            System.out.println(listInterger.get(i));
        }
        System.out.println("----------");
        //Xoá phần tử tại vị trí index
        listInterger.remove(2);
        for (int i = 0; i < listInterger.getSize(); i++) {
            System.out.println(listInterger.get(i));
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào giá trị cần tìm trong mảng : ");
        int numb = sc.nextInt();
        //Tìm index của element cần tìm
        System.out.println("index của gíá trị cần tìm trong mảng là :" + listInterger.IndexOf(numb));
    }
}
