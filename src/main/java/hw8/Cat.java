package hw8;

public class Cat {
    public String name;

    public String color;
    public String breed;
    public int age;

    public void sleep(){
        System.out.println("The cat is sleeping");
    }
    public void play(){
        System.out.println("The cat is playing");
    }
    public void catInfo() {
        System.out.println("Cat's name is "+ name + "; Color: "+ color + "; Bread: "+ breed+ "; Age: "+ age);
    }
}
