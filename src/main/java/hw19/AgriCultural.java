package hw19;

public class AgriCultural {
    private String nameOfCulture;
    private int numberOfFields;

    public AgriCultural(String nameOfCulture, int numberOfFields) {
        this.nameOfCulture = nameOfCulture;
        this.numberOfFields = numberOfFields;
    }

    public void printInfo(){
        System.out.println( nameOfCulture + ", " + numberOfFields );

    }


}
