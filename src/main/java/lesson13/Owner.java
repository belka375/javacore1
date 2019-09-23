package lesson13;


public class Owner {
    private String name;
    private String lastName;
    private  int id;

    public Owner(String name, String lastName, int id){
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void printOwner(){
        System.out.println("Owner is "+name +" "+lastName+ "ID: "+id);
    }
}
