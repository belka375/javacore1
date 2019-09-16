package hw8;

public class TV {
    public String brand;
    public String color;
    public String model;

    public void turnOn(){
        System.out.println("The TV is on");
    }
     public void connect(){
         System.out.println("The TV is connected");
     }
     public void TVdescription(){
         System.out.println("TV brand is "+ brand+"\nColor: " + color+ "\nModel: "+ model);

     }
}

