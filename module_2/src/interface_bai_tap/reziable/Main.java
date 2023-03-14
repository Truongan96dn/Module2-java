package interface_bai_tap.reziable;

import interface_bai_tap.colorable.IColorabale;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Diện tích hình chữ nhật là :" + rectangle.getArea());
        Square square = new Square();
        System.out.println("Diện tích hình vuông là : " + square.getQuareArea());
        Circle circle = new Circle();
        System.out.println("Diện tích hình tròn là : " + circle.getCircleArea());
        double input = (int)(Math.random()*99+1);
        System.out.println(" phần trăm đã thay đổi :" +input);
        String a = "diện tích hình chữ nhật = " + rectangle.getArea();
        String b = " diện tích hình tròn =" + circle.getCircleArea();
        String c = "diện tích hình vuông =" + square.getQuareArea();
        String[] array = new String[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        System.out.println(Arrays.toString(array));
        rectangle.resize(input);
        square.resize(input);
        circle.resize(input);
        String[] newarr = new String[3];
        String a1 = "diện tích hình chữ nhật mới = " + rectangle.getArea();
        String b1 = " diện tích hình tròn mới =" + circle.getCircleArea();
        String c1 = "diện tích hình vuông mới =" + square.getQuareArea();
        newarr[0] = a1;
        newarr[1] = b1;
        newarr[2] = c1;
        System.out.println(Arrays.toString(newarr));
    }
}
