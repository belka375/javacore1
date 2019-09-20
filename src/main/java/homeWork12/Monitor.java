package homeWork12;

public class Monitor {
    private String name;
    private String color;
    private int diagonal;
    private double price;

    public Monitor(String name, String color, int diagonal, double price){
        this.color = color;
        this.name = name;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void printMonitor()
    {System.out.println("name: "+ name + "\ncolor is: "+ color + "\n Diagonal: " + diagonal+"inch" + "\nPrice is " + price+"$");
    }

}

