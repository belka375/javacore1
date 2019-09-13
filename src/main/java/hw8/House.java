package hw8;

public class House {
    public int price;
    public String location;
    public int zipCode;

    public int getPrice(){
        return price;
    }
    public String getLocation(){
        return location;
    }
    public int getZipCode(){
        return zipCode;
    }
    public void printHouseInfo(){
        System.out.println("House in "+location+" with zip code "+zipCode+" has price "+price);
    }
}
