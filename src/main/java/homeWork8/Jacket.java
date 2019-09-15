package homeWork8;

public class Jacket {
    public String model;
    public String brand;
    public int size;
    public String color;
    public double price;
    public String material;



    public void printJacketInfo(){
        System.out.println("Brand- " + brand + ";\nModel- " + model + "\nColor- " + color+ ";\nSize- " + size);
    }
    public void printPrice(){
        System.out.println("Best price- " + price);
    }



}
