package hw15;

public class Truck implements Auto {
    private String brand;
    private int hP;
    private String color;

    public Truck(String brand,int hP,String color) {
        this.color=color;
        this.hP=hP;
        this.brand=brand;
    }

    @Override
    public void printInfo() {
        System.out.println(brand+","+hP+"HP@"+"\n"+color);
    }
}

