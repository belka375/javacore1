package lesson16;

public class Teacher extends Person {
    public Teacher(String name, String lastName) {
        super(name, lastName);
    }
    public void printName(){
        System.out.println("Professor"+name+" "+lastName);
    }
}
