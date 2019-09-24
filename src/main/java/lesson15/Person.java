package lesson15;

public abstract class Person implements ProtoPerson {
    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}
