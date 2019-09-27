package lesson16;

public class Teacher extends Person{
    public Teacher(String name, String lastName) {
        super(name, lastName);
    }
    @Override
    public void printName(){
        System.out.println("Profeccor "+name+" "+lastName);
    }
}
