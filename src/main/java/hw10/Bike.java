package hw10;

public class Bike {
    private int numbersOfWeels;
    private String model;
    private String[] location;

    public Bike(){

    }
    public Bike(int numbersOfWeels, String model, String[] locatoin){
        this.location=locatoin;
        this.model=model;
        this.numbersOfWeels=numbersOfWeels;

    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }

    public void setNumbersOfWeels(int numbersOfWeels) {
        this.numbersOfWeels = numbersOfWeels;

    }

    public String getModel() {
        return model;
    }

    public int getNumbersOfWeels() {
        return numbersOfWeels;
    }

    public String[] getLocation() {
        return location;
    }
    public void printInfoBike(){
        System.out.println(numbersOfWeels+" "+model);
        for(String loc:location){
            System.out.println(loc+" ");
        }
    }
}
