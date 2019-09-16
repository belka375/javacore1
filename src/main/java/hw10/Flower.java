package hw10;

public class Flower {

    private String name;
    private String color;
    private String[] countriesOfOrigin;

    public Flower (String name, String color, String[] countriesOfOrigin) {
        this.name = name;
        this.color = color;
        this.countriesOfOrigin = countriesOfOrigin;
    }

    public Flower(){
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountriesOfOrigin(String[] countriesOfOrigin) {
        this.countriesOfOrigin = countriesOfOrigin;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String[] getCountriesOfOrigin() {
        return countriesOfOrigin;
    }

    public void printFlower(){
        System.out.println("___This is Flower:");
        System.out.println(name + " " + color);
        for (String country: countriesOfOrigin){
            System.out.print(country + " ");
            System.out.println("");
        }
    }
}
