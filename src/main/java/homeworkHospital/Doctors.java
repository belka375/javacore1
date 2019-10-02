package homeworkHospital;

public class Doctors implements PrintInfo{
    private String name;
    private String lastName;
    private Positions position;


    public Doctors(String name, String lastName, Positions position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Positions getPosition() {
        return position;
    }

    public void setPosition(Positions position) {
        this.position = position;
    }

    @Override
    public void PrintInfo() {
        System.out.println(name +" "+ lastName + " Position:" + position);

    }
}
