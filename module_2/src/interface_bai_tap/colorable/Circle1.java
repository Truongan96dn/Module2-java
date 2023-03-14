package interface_bai_tap.colorable;

import interface_bai_tap.reziable.IResizable;
import interface_bai_tap.reziable.Shape;

public class Circle1 extends Shape1 implements IResizable {
    private double radius = 4.0;

    public Circle1() {
    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public Circle1(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircleArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + getRadius() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        radius = radius + radius * percent / 100;
    }
}

