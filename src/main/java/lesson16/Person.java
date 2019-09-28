package lesson16;

public class Person {
    protected static int number;
    protected String name;
    protected String lastName;
    public Person(String name, String lastName){
        this.name=name;
        this.lastName=lastName;
        number++;
    }

    public static int getNumber() {
        return number;
    }

    public void printName(){
        System.out.println(name+" "+lastName);
    }


}
