package HW15;

public class Accessories implements ProtoPhone {
    public String brand;
    public int price;

    public Accessories(String brand, int price){
        this.brand=brand;
        this.price=price;
    }


    public void printInfo() {
        if(price>1000){
        System.out.println("Accessories are included");}
                else {
            System.out.println("Accessories are not included");
        }

    }
}
