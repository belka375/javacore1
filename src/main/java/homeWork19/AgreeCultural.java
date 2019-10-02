package homeWork19;

public class AgreeCultural {
    private String nameOfCulture;
    private int filesNumber;

    public AgreeCultural(String nameOfCulture, int filesNumber) {
        this.nameOfCulture = nameOfCulture;
        this.filesNumber = filesNumber;
    }

    public int getFilesNumber() {
        return filesNumber;
    }

    public String getNameOfCulture() {
        return nameOfCulture;
    }
}
