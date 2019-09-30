package lesson18;

public class Person {
    private String name;
    private String lastName;
    private String address;
    private int age;
    private double weight;
    private int height;

    public Person(String name, String lastName, String address, int age, double weight, int height) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public double getAgeMultipleByWeight (){
        return weight*age;
    }

    public int getHeight() {
        return height;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

}
