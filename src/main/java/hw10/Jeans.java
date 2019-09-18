package hw10;

public class Jeans {

    private String brand;
    private int size;
    private String color;
    private double price;
//    private boolean onSale;

    // пустой конструктор
    public Jeans (){

    }

    public Jeans (String brand, int sz, String color, double price){
        this.brand=brand;
        this.size=sz;
        this.color=color;
        this.price=price;
    }

    public void OnSale(double price) {
        if (price <=30) {
            this.price = 25;
            System.out.println("On Sale");
        }else{
            System.out.println("Not on sale");
        }
    }
    public void printJeansInfo () {
        System.out.println("brand = " + brand + ", size = " + size + ", color = " + color + ", Price = " +price);
    }


}
