package hw19;

public class AgriCultural {
    private String nameOfCulture;
    private int fieldNumber;

    public AgriCultural(String nameOfCulture, int fieldNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fieldNumber = fieldNumber;
    }

    public void printInfo() {
        System.out.println(nameOfCulture+" on a field"+fieldNumber);
    }
}
