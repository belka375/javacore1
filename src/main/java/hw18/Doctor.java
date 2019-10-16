package hw18;

public class Doctor {
    private String name;
    private String lastName;
    private Position position;


    public Doctor(String name, String lastName, Position position){
        this.position=position;
        this.name=name;
        this.lastName=lastName;
    }
    public void printDoctor(){
        System.out.println("Name: "+ name+ "; Last Name: "+ lastName+"; Position: "+position);
    }
}
