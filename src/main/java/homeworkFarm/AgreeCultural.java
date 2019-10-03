package homeworkFarm;

public class AgreeCultural implements PrintInfo {
    private String nameOfCulture;
    private int fieldsNumber;

    public AgreeCultural(String nameOfCulture, int fieldsNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fieldsNumber = fieldsNumber;
    }

    public String getNameOfCulture() {
        return nameOfCulture;
    }

    public void setNameOfCulture(String nameOfCulture) {
        this.nameOfCulture = nameOfCulture;
    }

    public int getFieldsNumber() {
        return fieldsNumber;
    }

    public void setFieldsNumber(int fieldsNumber) {
        this.fieldsNumber = fieldsNumber;
    }

    @Override
    public void PrintInfo() {
        System.out.println(nameOfCulture +": "+ fieldsNumber +" fields");

    }
}
