package lesson16;

public class Rectangle implements Shape{
    private double wide;
    private double hight;

    public Rectangle(double wide, double hight) {
        this.wide = wide;
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public double getWide() {
        return wide;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    public double getSquare(){
        return wide*hight;
    }
}
