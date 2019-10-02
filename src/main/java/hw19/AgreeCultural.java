package hw19;

public class AgreeCultural {
        private String nameOfCulture;
        private int fieldNumber;

    public AgreeCultural(String nameOfCulture, int fieldNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fieldNumber = fieldNumber;
    }

    public String getNameOfCulture() {
        return nameOfCulture;
    }

    public int getFieldNumber() {
        return fieldNumber;
    }

    public void getACinfo(){
        System.out.println(nameOfCulture+" sown on field №"+ fieldNumber);
    }
}
