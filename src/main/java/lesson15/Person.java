package lesson15;

public class Person implements ProtoPerson {
    private String name;
    private String lastName;

    public Person(String name, String lastName){
        this.name=name;
        this.lastName=lastName;
    }
    public void printInfo(){
        System.out.println(name);
        System.out.println(lastName);
    }

}
