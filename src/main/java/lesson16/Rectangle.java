package lesson16;

public class Rectangle implements Shape{
    private double wide;
    private double hight;

    public Rectangle(double wide, double hight) {
        this.wide = wide;
        this.hight = hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    public double getHight() {
        return hight;
    }

    public double getWide() {
        return wide;
    }

    @Override
    public double getSquare() {
        double y =wide*hight;
        return y;
    }

    @Override
    public void printInfo() {
        System.out.println(getSquare());
    }
}
