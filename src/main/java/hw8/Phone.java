package hw8;

public class Phone {
    public String brand;
    public String model;
    public double displaysize;
    public double weight;
    public double length;
    public double width;
    public double height;


    public void printName() {
        System.out.println("Model = " + model + "\nBrand = " + brand);

    }
    public void printParameters() {
        System.out.println("Display size = " + displaysize + "\nDimensions = " + length + "x" + width + "x" + height + "\nWeight = " + weight);


    }
}
