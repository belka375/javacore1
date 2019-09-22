package lesson12;

public class SystemBlock {
    private int size;
    private String brand;
    private int operationalMemory;

    public SystemBlock (int size, String brand, int operationalMemory) {

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setOperationalMemory(int operationalMemory) {
        this.operationalMemory = operationalMemory;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public int getOperationalMemory() {
        return operationalMemory;
    }

    public void printSystemBlock () {
        System.out.println(size + " " + brand + " " + operationalMemory );
    }
}
