package HW15;

public class Phone implements ProtoPhone {
    public String brand;
    public int price;



    public Phone(String brand, int price){
        this.brand=brand;
        this.price=price;

    }


    public void printInfo() {
        System.out.println(brand);
        System.out.println(price);


    }
}
