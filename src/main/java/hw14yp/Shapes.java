package hw14yp;

public class Shapes {
    protected String name;
    protected String color;
    protected double area;
    protected Thickness lineThickness;


    public Shapes (String name, String color, double area, Thickness lineThickness){
        this.name=name;
        this.color=color;
        this.area=area;
        this.lineThickness=lineThickness;

    }

    protected void printShape(){
        System.out.println("Name of shape: "+name+ ", Color of shape: "+color+ ", Area of shape: "+area+ ", Line thickness: "+lineThickness);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    public Thickness getLineThickness() {
        return lineThickness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setLineThickness(Thickness lineThickness) {
        this.lineThickness = lineThickness;
    }
}

