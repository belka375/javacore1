package lesson12;

public class Student {
    private String name;
    private String lastName;
    private int id;

    public Student(String name,String lastName, int id){
        this.name=name;
        this.lastName=lastName;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void printStudent(){
        System.out.println(name+" "+lastName+" "+id);
    }
}
