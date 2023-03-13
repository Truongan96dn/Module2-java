package inheritance.bai_tap.point2D_and_point3D;

import java.util.Scanner;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float z) {
        this.z = 0.0f;
    }

    public Point3D() {
    }

    private Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    private float getZ() {
        return z;
    }

    private void setZ(float z) {
        this.z = z;
    }

    private void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    private float[] getXYZ(float x, float y, float z) {
        float array[] = {x, y, z};
        return array;
    }

    @Override
    public String toString() {
        return "Point3D(" +
                "x=" + x + "," +
                "y=" + y + "," +
                "z=" + z +
                ')';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point3D point3D = new Point3D();
        Point2D point2D = new Point2D();
        System.out.println("Nhập vào x : ");
        float x = sc.nextFloat();
        System.out.println("Nhập vào y : ");
        float y = sc.nextFloat();
        System.out.println("Nhập vào z : ");
        float z = sc.nextFloat();
        point3D.setXYZ(x, y, z);
        point2D.setXY(x, y);
        System.out.println(point3D.toString());
        System.out.println(point2D.toString());
    }
}
