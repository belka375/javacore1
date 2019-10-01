package homeWork_19;

public class AgreeCultural {

    private String nameOfCulture;
    private int fieldsNumber;

    public AgreeCultural(String nameOfCulture, int fieldsNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fieldsNumber = fieldsNumber;
    }
    public void printAgreeCulturalInfo(){
        System.out.println(nameOfCulture+ " \nNumber of fields: "+fieldsNumber);
    }
}
