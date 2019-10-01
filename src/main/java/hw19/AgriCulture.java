package hw19;

public class AgriCulture {
    private String nameOfCulture;
    private int fieldsNumber;

    public AgriCulture(String nameOfCulture, int fieldsNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fieldsNumber = fieldsNumber;
    }

    public void printInfo(){
        System.out.println("Name: "+nameOfCulture+", Fields number: "+fieldsNumber);
    }
}
