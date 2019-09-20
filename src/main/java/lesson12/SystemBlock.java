package lesson12;

public class SystemBlock {
    private String color;
    private String brand;

    public SystemBlock(String brand, String color){
        this.brand=brand;
        this.color=color;

    }
    public void printSb()
    {
        System.out.println("The systemblock is also by " + brand + ". It's "+ color);
    }
}
