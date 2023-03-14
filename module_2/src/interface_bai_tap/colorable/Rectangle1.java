package interface_bai_tap.colorable;

import interface_bai_tap.reziable.IResizable;
import interface_bai_tap.reziable.Shape;

public class Rectangle1 extends Shape1 implements IResizable {
    private double width = 2.0;
    private double length = 3.0;

    public Rectangle1() {
    }

    public Rectangle1(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle1(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        width = width + width * percent / 100;
        length = length + length * percent / 100;

    }
}

