package homew18;

public class Doctor {
    private String name;
    private String lastName;
    private String position;

    public Doctor(String name, String lastName, String position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;

    }

    public Doctor(String peter, String shatz, Position cardiologist) {
    }

    public void printlnInfo(){
        System.out.println(name+" "+ lastName + " " + position);
    }


}
