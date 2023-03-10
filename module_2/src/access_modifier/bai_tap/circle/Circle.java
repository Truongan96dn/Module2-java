package access_modifier.bai_tap.circle;

public class Circle {
    private double radius = 2.0;
    private String color = "red";

    public Circle(double r) {
        this.radius = r;
    }

    public Circle() {
    }

    protected double getRadius() {
        return this.radius;
    }

    protected double getArea() {
        double a = Math.pow(getRadius(), 2) * 3.1416;
        return a;
    }

    protected String getColor() {
        return this.color;
    }
}
