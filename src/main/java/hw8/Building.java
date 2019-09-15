package hw8;

public class Building {
    public String country;
    public String city;
    public String nameOfBuilding;
    public int story;
    public String color;
    public int age;
    public int number;
    public int numberOfApartment;
    public String amenities;

    public void printGeneralInformation(){System.out.println("country="+country+";\ncity="+city+";\nname="+nameOfBuilding);
    }
    public int printStory(){
        return story;
    }
    public void printAmenities(){System.out.println("Pool"+","+"hw8.Dog Park"+","+"Washer and Dryer");}
}
