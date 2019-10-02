package lesson16;



public class Teacher extends Person{
    private  Person teacher;
    private String status;
    private int id;


    public Teacher(String name, int numb, String lastName,int number, String street, String state, String city, int zip, String status, int id) {
        super( name, numb, lastName, number, street, state, city, zip);
        this.status = status;
        this.id = id;
    }
}
