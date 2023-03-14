package interface_bai_tap.reziable;

import interface_bai_tap.colorable.IColorabale;

public class Square extends Rectangle implements IResizable, IColorabale {
    double side = 5;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public double getQuareArea(){
        return Math.pow(this.side,2);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent) {
        side = side + side*percent/100;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
