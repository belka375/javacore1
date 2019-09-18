package hw10;

public class Cat {
    private String name;
    private String breed;
    private double weight;
    private boolean longHair;
    private String[] vaccine;

public Cat(){}
public Cat(String name, String breed, double weight, boolean longHair, String[] vaccine){
    this.name=name;
    this.breed=breed;
    this.weight=weight;
    this.longHair=longHair;
    this.vaccine=vaccine;
}

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setVaccine(String[] vaccine) {
        this.vaccine = vaccine;
    }

    public void setLongHair(boolean longHair) {
        this.longHair = longHair;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }

    public void printCatInfo(){
        System.out.println("-------------");
        System.out.println("Cats name: "+name+", "+breed+", "+weight+", "+longHair);
        for (String vac:vaccine){
            System.out.print(vac+", ");
        }

    }
}
