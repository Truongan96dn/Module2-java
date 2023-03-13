package inheritance.bai_tap.movable_point;

import java.util.Arrays;

public class MovablePoint extends Point {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(float xSpeed, float ySpeed) {
        float arr[] = new float[2];
        arr[0] = this.xSpeed;
        arr[1] = this.ySpeed;
        return arr;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "Speed=" + Arrays.toString(getSpeed(x, y)) +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public MovablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
