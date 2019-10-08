package homework18;

public class Doctor {
    private String name;
    private String lastname;
    private Position position;

    public Doctor(String name, String lastname, Position position) {
        this.name = name;
        this.lastname = lastname;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Position getPosition() {
        return position;
    }
    public void printDoctors(){
        System.out.println("Dr."+name+" "+lastname+"is "+position);
    }
}
