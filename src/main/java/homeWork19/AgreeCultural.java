package homeWork19;

public class AgreeCultural {


    private String nameOfCulture;
    private int fielsNumber;

    public AgreeCultural(String nameOfCulture, int fielsNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fielsNumber = fielsNumber;
    }
    public void printAgreeCultural(){
        System.out.println(nameOfCulture+ " - field number -"+fielsNumber);
    }
}
