package workHw19;

public class AgriCulture {

    private String nameOfCulture;
    private int fielsNumber;


    public AgriCulture(String nameOfCulture,int fielsNumber){
        this.nameOfCulture = nameOfCulture;
        this.fielsNumber = fielsNumber;
    }

    public int getFielsNumber() {
        return fielsNumber;
    }

    public String getNameOfCulture() {
        return nameOfCulture;
    }

    public void printAgriCulture(){
        System.out.println("Culture name:" + nameOfCulture +  " " + "Fields Number:" + fielsNumber);
    }

}
