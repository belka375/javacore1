package lesson18;

public class Person {
    private String name;
    private String lastName;
    private String address;
    private int age;
    private double weight;
    private double height;

    public Person(String name, String lastName, String address, int age, double weight, double height) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
        this.weight = weight;
        this.height = height;

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public double getHeight() {
        return height;
    }

    public double index(){
        return  weight/(height*height/10000);
    }

    public double ageMultWeight(){
        return age*weight;

    }



}
