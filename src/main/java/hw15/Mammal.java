package hw15;

public class Mammal implements printSay {

    private String name;
    private int age;
    private String soundType;

    public Mammal(String name, int age, String soundType) {
        this.name = name;
        this.age = age;
        this.soundType = soundType;
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(age);
    }

    public void saySmth() {
        System.out.println("My favorite sound is: " + soundType + "!");
    }
}
