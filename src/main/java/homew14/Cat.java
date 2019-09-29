package homew14;

public class Cat extends Pets {

    private String breed;
    private int age;
    private double temp;

    public Cat(String petName, int paws, double height, String breed, int age, double temp){

        super (petName, paws, height);
        this.age = age;
        this. breed = breed;
        this.temp = temp;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public double gettemp() {
        return temp;
    }
}
