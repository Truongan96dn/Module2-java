package inheritance.bai_tap.circle_and_cylinder;

public class Circle {
    float radius;
    String color;
    protected  Circle(float radius, String color){
        this.radius = radius;
        this.color = color;
    }
    protected Circle(){}

    protected float getRadius() {
        return radius;
    }

    protected void setRadius(float radius) {
        this.radius = radius;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }
    protected double checkCircleArea(double r){
        return Math.pow(r,2)*3.1415;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
