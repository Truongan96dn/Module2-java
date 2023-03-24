package exception_debug;

import java.util.Scanner;

public class IllegalTriangle {

    public void checkTriangle() throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 3 cạnh của tam giác  ");
        System.out.println("Nhập cạnh a : ");
        float a = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập cạnh b : ");
        float b = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập cạnh c : ");
        float c = Float.parseFloat(scanner.nextLine());
        if (a < 0 || b < 0 || c < 0 || a + b <= c || a + c <= b || b + c <- a) {
            System.out.println(" ba cạnh nhập vào không tạo ra tam giác ");
        } else {
            System.out.println("Ba cạnh nhập vào tạo ra tam giác ");
        }
    }

    public static void main(String[] args) throws IllegalTriangleException {
        IllegalTriangle illegalTriangle = new IllegalTriangle();
        try {
            illegalTriangle.checkTriangle();
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}
