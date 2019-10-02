package lesson16;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        double x = Math.PI*radius*radius;
        return x;
    }

    @Override
    public void printInfo() {
        System.out.println(getSquare());
    }
}
