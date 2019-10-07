package hw19;

public class AgreeCulture {

    private String nameOfCulture;
    private int fieldsNumber;

    public AgreeCulture(String nameOfCulture, int fieldsNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fieldsNumber = fieldsNumber;
    }

    public void printAgreeCultureInfo(){
        System.out.println(nameOfCulture+" -> field number: "+fieldsNumber);
    }
}
