package inheritance.bai_tap.point2D_and_point3D;

public class Point2D {
    float x = 0.0f;
    float y = 0.0f;

    protected Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    protected Point2D() {
    }

    protected float getX() {
        return x;
    }

   protected void setX(float x) {
        this.x = x;
    }

    protected float getY() {
        return y;
    }

    protected void setY(float y) {
        this.y = y;
    }

    protected void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    protected float[] getXY(float x, float y) {
        float[] array = {x, y};
        return array;
    }

    @Override
    public String toString() {
        return "Point2D(" +
                "x=" + x +
                ", y=" + y +
                ')';
    }
}
