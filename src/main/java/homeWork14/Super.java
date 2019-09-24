package homeWork14;

public class Super {
    protected String brand;
    protected String model;
    protected Color color;
    protected double size;
    protected double weight;
    protected double warranty;

    public Super(String brand, String model, Color color, double size, double weight, double warranty){
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.size=size;
        this.weight=weight;
        this.warranty=warranty;
    }

    public Color getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    public double getWarranty() {
        return warranty;
    }

    public void printSuper(){
        System.out.println(brand+" "+model+"\n"+color+"\nSize: "+size+"; Weight: "+weight+"; Warranty: "+warranty+" yr");
    }
}