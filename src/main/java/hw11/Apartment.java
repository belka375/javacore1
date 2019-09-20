package hw11;

public class Apartment {


    private String type;
    private double area;
    private int price;
    private int numberOfBadrooms;
    private Amenities[] amenities;


    public Apartment(String type, double area, int price, int numberOfBadrooms, Amenities[] amenities){
        this.type=type;
        this.area=area;
        this.price=price;
        this.numberOfBadrooms=numberOfBadrooms;
        this.amenities=amenities;
    }

    public Apartment() {
    }

    public Apartment(String type) {
        this.type = type;
    }

    public Apartment(int price){
        this.price = price;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setNumberOfBadrooms(int numberOfBadrooms) {
        this.numberOfBadrooms = numberOfBadrooms;
    }
    public void setAmenities(Amenities[] amenities) {
        this.amenities = amenities;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public double getArea() {
        return area;
    }

    public int getNumberOfBadrooms() {
        return numberOfBadrooms;
    }

    public double sqFeetPrice (){
        return price/area;
    }

    public void printApartmentInfo(){
        System.out.println("Apartment Type = " +type+ "; Apartment Area = "+area+  "; Apartment price = "+price);
        for (Amenities ament:amenities){
            System.out.print(ament+ ", ");
        }
        System.out.println();
    }
}
