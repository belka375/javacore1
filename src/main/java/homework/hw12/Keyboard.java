package homework.hw12;

public class Keyboard {

    private String brand;
    private String color;
    private int year;
    private double length;

    public Keyboard(String brand,String col, int yr,double length){
        this.brand=brand;
        this.color=col;
        this.year=yr;
        this.length=length;
        }

    public String getBrand() {
        return brand;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
    public double getLength() {
        return length;
    }

    public void printKeyboard() {
        System.out.print("brand: " + brand + "  year: " + year + "\ncolor: " + color + "  length: " + length);
        System.out.println("  ");
    }





}
