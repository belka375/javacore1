package hw12yp;

public class SystemBlock {
    private String brand;

    public SystemBlock(String brand) {
        this.brand = brand;
    }
    public void printInfo() {
        System.out.println("***** System Block **** ");
        System.out.println("Brand: "+brand);
    }
}
