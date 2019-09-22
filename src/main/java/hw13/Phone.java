package hw13;

import java.time.LocalDateTime;

public class Phone {
protected String brand;
protected String color;
protected int price;
protected LocalDateTime doi;

public Phone(String brand, String color, int price, LocalDateTime doi) {
    this.brand = brand;
    this.color = color;
    this.price = price;
    this.doi = doi;
}public Phone(){}

    protected void printInfo(){
        System.out.println("This phone is by"+ brand+". It's color is" + color+ ". It costs "+ price+"USD. The date of issue is"+doi);



}

}
