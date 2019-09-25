package hw14yp;

public class Triangle extends Shapes {

    private String typeOfTriangle;
    private int numberOfSides;
    int numberOfCorners;



    public Triangle(String name, String color, double area, Thickness lineThickness, int numberOfSides, int numberOfCorners,  String typeOfTriangle){
        super(name, color, area, lineThickness);
        this.typeOfTriangle=typeOfTriangle;
        this.numberOfCorners=numberOfCorners;
        this.numberOfSides=numberOfSides;
    }


    public void printTriangle(){
        System.out.println("Type of triangle: "+typeOfTriangle+", # of sides: " +numberOfSides+ ", # of corners:  "+numberOfCorners);

    }

}
