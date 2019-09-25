package hw14yp;

public class Circle extends Shapes {
    private int diameter;
    public boolean corner;

    public Circle (String name, String color, double area, Thickness lineThickness, int diameter, boolean corner){
        super(name, color, area, lineThickness);
        this.diameter=diameter;
        this.corner=corner;

    }

    public void printCircle(){
        System.out.println(" diameter of circle: "+diameter+ ", # of corners: "+corner);
    }
}
