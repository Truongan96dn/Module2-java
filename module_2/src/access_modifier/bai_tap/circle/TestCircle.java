package access_modifier.bai_tap.circle;

import access_modifier.bai_tap.circle.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Bán kính của hình tròn là : " + circle.getRadius());
        System.out.println("Diện tích của hình tròn là : " + circle.getArea());
        System.out.println("Màu của hình tròn là : " + circle.getColor());
    }
}
