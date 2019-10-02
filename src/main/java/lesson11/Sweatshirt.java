package lesson11;

public class Sweatshirt {
    private String brand;
    public Size sizes;
    private int code;

    public Sweatshirt(){

    }

    public Sweatshirt(String brand, Size sizes, int code) {

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSizes(Size sizes) {
        this.sizes = sizes;
    }

    public void setCode (int code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public int getCode() {
        return code;
    }

    public Size getSizes() {
        return sizes;
    }
}
