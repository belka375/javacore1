package hw15;


public class Animal implements ProtAnimal {

    private String name;
    private String gender;
    private int age;

    public Animal(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public void printInfo(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
    }
}
