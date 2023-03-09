package class_and_object_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(float a , float b , float c){
        this.a= a;
        this.b= b;
        this.c= c;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public static double getDiscriminant(double a, double b, double c){
        return  (b*b-(4*a*c));
    }
    public static  double getRoot1(double a,double b,double c){
        return (-b+Math.sqrt(b*b-4*a*c))/(2*a);
    }
    public static double getRoot2(double a,double b,double c) {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }
    public static double getRoot3(double a , double b , double c){
        return -b/2*a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("cho phương trình bậc 2 ax2 + bx + c = 0");
        System.out.println("Nhập vào a :");
        double a = input.nextFloat();
        System.out.println("Nhập vào b :");
        double b = input.nextFloat();
        System.out.println("Nhập vào c:");
        double c = input.nextFloat();
        double delta =  getDiscriminant(a,b,c);
        if ( delta >0){
            double x1 = getRoot1(a,b,c);
            double x2 = getRoot2(a,b,c);
            System.out.println("Phương trình có 2 nghiệm riêng biệt x1 :" +x1 + "x2 : "+ x2);
        }else if (delta == 0){
            double x = getRoot3(a,b,c);
            System.out.println("Phương trình có nghiệm kép x : " +x);
        }else{
            System.out.println(" Phương Trình vô nghiệm !");
        }

    }
}
