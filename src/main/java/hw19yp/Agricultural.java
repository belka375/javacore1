package hw19yp;

public class Agricultural {
        private String nameOfCulture;
        private int fieldNumber;

    public Agricultural(String nameOfCulture, int fieldNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fieldNumber = fieldNumber;
    }

    public void printInfo(){
        System.out.println("Type of agriculture: "+nameOfCulture+", field number:  "+fieldNumber);
    }
}

