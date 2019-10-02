package homework.hw19;

public class Agricultural {
    private String nameOfCulture;
    private int fieldsNumber;

    public Agricultural(String crops, int fieldsNumber) {
        this.nameOfCulture=crops;
        this.fieldsNumber=fieldsNumber;
    }


    public void printInfo(){
        System.out.println("culture: "+nameOfCulture+"  fields: "+fieldsNumber);
    }
}
