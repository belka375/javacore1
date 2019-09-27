package lesson16;

public class Rectangle implements Shape {
    private double wide;
    private double height;

    public Rectangle(double wide, double height) {
        this.wide = wide;
        this.height = height;
    }

    public double getHight() {
        return height;
    }

    public double getWide() {
        return wide;
    }

    public void setHight(double hight) {
        this.height = hight;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    @Override
    public double getSquare() {
        return wide*height;
    }
}
