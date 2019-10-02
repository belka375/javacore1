package hw19;

public class AgreeCultural {
    private String nemOfCulture;
    private int fielsNumber;

    public AgreeCultural(String nemOfCulture, int fielsNumber) {
        this.nemOfCulture = nemOfCulture;
        this.fielsNumber = fielsNumber;
    }

    public void printInfo(){
        System.out.println("name of culture: "+ nemOfCulture + "\nnumber of fiels: "+ fielsNumber);
    }

    public int getFielsNumber() {
        return fielsNumber;
    }

    public String getNemOfCulture() {
        return nemOfCulture;
    }
}
