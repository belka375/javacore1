package hw8;

public class Apartment {
    public String type;
    public double area;
    public double price;
    public int numberOfBadrooms;




    public void printApartmentInfo(){
        System.out.println("Apartment Type= "+type+"; Apartment Area= "+area+" sqft; Apartment price = $"+price+ "; Number of bedrooms = " +numberOfBadrooms);
    }
}
