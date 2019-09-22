package hw14;

public class Person {
    private String name;
    private Iphone iphone;

    public Person(String name, Iphone iphone){
        this.name=name;
        this.iphone=iphone;

    }

    public Iphone getIphone() {
        return iphone;
    }
}

