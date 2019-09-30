package workHw18;

public class Doctor {
    private String name;
    private String lastName;
    private Position position;


    public Doctor(String name, String lastName, Position position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;

    }
//getters
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }

    public Position getPosition() {
        return position;
    }
        public void printDoctor(){
            System.out.println("Doctor " + name +  " " +  lastName + " Position is : " + position);
        }

}