package homeWork18;

public class Doctor extends Rooms{
    private String name;
    private String lastName;
    private Position position;

    public Doctor(String name, String lastName, Position position, int number, String name1) {
        super(number, name1);
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void printInfo(){
        System.out.println("Doctor's name is: " +name+" "+lastName+";  Position is: "+position+";  room # "+ number +"-> "+ name1);
    }
}
