package hw14yp;

public class Square extends Shapes {
    private int axesOfSymmetry;
    private int numberOfSides;
    int numberOfCorners;


    public Square(String name, String color, double area, Thickness lineThickness, int axesOfSymmetry, int numberOfSides, int numberOfCorners) {
        super(name, color, area, lineThickness);
        this.axesOfSymmetry = axesOfSymmetry;
        this.numberOfSides = numberOfSides;
        this.numberOfCorners = numberOfCorners;
    }

    public void printSquare() {
        System.out.println("Axes of symmetry: "+axesOfSymmetry+ ", # of sides: "+numberOfSides+", # of corners: "+numberOfCorners);
    }
}
