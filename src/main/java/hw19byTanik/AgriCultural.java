package hw19byTanik;

public class AgriCultural {
    private String nameOfCulture;
    private int fieldNumber;

    public AgriCultural(String nameOfCulture, int fieldNumber){
        this.fieldNumber=fieldNumber;
        this.nameOfCulture=nameOfCulture;
    }

    public void printInfo(){
        System.out.println(nameOfCulture+", on field number "+fieldNumber+";");
    }
}
