package les12;

public class Student {
    private String name;
    private String lastName;
    private int id;


    public Student (String name, String lastName, int id){
        this.id=id;
        this.lastName=lastName;
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public void printStudent(){
        System.out.println(name+ " " +lastName+" "+id);
    }



}
