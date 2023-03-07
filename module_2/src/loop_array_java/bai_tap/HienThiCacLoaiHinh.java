package loop_array_java.bai_tap;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void printRetangle() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printSquareTri() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("");
            for (int j = 4 - i; j <= 4; j++) {
                System.out.print(" * ");
            }
        }
        System.out.println(" ");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    public static void printIsoscelesTri() {
        for (int i = 1; i <= 5; i++) {
            for (int x = 5; x > i; x--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        boolean flag = true;
        do {
            System.out.println("1.print rectangle ");
            System.out.println("2.print Square Triangle");
            System.out.println("3.print Isosceles Triangle");
            System.out.println("4.Exit !");
            Scanner input = new Scanner(System.in);
            int a = Integer.parseInt(input.nextLine());
            switch (a) {
                case 1:
                    printRetangle();
                    break;
                case 2:
                    printSquareTri();
                    break;
                case 3:
                    printIsoscelesTri();
                    break;
                default:
                    System.out.println("Exit");
                    flag = false;
            }
        } while (flag);
    }
}
