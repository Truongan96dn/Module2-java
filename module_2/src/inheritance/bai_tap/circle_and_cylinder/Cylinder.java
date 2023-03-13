package inheritance.bai_tap.circle_and_cylinder;

import java.util.Scanner;

public class Cylinder extends Circle{
    double high;
    protected Cylinder(float radius, String color,double high) {
        super(radius, color);
        this.high = high;
    }
    protected double setHigh(double high){
        return this.high = high;
    }


    protected double getVolume(double area,double high){
        return checkCircleArea(area)*high;
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5,"red",5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào bán kính hình tròn : ");
        double radius = sc.nextDouble();
        cylinder.setRadius((float) radius);
        System.out.println("Nhập vào chiều cao của hình trụ : ");
        double high = sc.nextDouble();
        cylinder.setHigh(high);
        double volume = cylinder.getVolume(cylinder.checkCircleArea(radius), cylinder.setHigh(high) );
        System.out.println(cylinder.toString());
        System.out.println("Diện tích tam giác là : " + cylinder.checkCircleArea(radius) + " m2");
        System.out.println("Thể tích hình trụ là : "+ volume+ " m3");
    }
    @Override
    public String toString() {
        return "Cylinder{" +
                "high=" + high +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
