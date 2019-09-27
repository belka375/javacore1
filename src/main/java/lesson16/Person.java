package lesson16;

public class Person {
    public static int number;
    protected String name;
    protected String lastName;

    public Person(String name, String lastName) {
        this.lastName=lastName;
        this.name=name;
        number++;

    }

    public static int getNumber() {
        return number;
    }

    public void printName(){
        System.out.println(name+" "+lastName);
    }

    public static void setNumber(int number) {
        Person.number = number;
    }
}
