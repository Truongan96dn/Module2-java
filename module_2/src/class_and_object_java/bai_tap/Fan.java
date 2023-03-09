package class_and_object_java.bai_tap;

import java.util.Scanner;

public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public boolean setOn(boolean on) {
        this.on = on;
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Fan fan = new Fan(3, false, 5, "Black");
        Scanner sc = new Scanner(System.in);
        System.out.println("bật tắt quạt bằng cách nhập true hoặc false !");
        boolean a = sc.nextBoolean();
        fan.setOn(a);
        if (fan.on) {
            System.out.println("fan speed : " + fan.speed);
            System.out.println("fan radius :" + fan.radius);
            System.out.println("fan color :" + fan.color);
            System.out.println("fan is on !");
        } else {
            System.out.println("fan radius :" + fan.radius);
            System.out.println("fan color :" + fan.color);
            System.out.println("fan is off");
        }
    }
}
