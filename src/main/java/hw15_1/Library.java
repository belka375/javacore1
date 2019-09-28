package hw15_1;

public class Library implements ProtoLibrary {

    private String name;
    private int year;

    public Library(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void printInfo(){
        System.out.println(name);
        System.out.println(year);
    }
}
