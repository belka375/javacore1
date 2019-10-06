package hw18baurzhan;

public class Doctor {
    private String name;
    private String lastName;
    private Position position;

    public Doctor(String name, String lastName, Position position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }

    public void printInfo(){
        System.out.println(name + " "+ lastName + " "+ position);
    }
}
