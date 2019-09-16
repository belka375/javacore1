package hw10;

public class FootWear {

    private String brand;
    private Double size;
    private Double[] sizesAvailable;

    public FootWear (String brand, Double size, Double[] sizesAvailable) {
        this.brand = brand;
        this.size = size;
        this.sizesAvailable = sizesAvailable;
    }

    public FootWear(){
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(Double size) {
        if (size < 0 && size > 20) {
            System.out.println("Error: Wrong size!");
            this.size = 0.0;
        } else {
            this.size = size;
        }
    }

    public void setSizesAvailable(Double[] sizesAvailable) {
        this.sizesAvailable = sizesAvailable;
    }

    public String getBrand() {
        return brand;
    }

    public Double getSize() {
        return size;
    }

    public Double[] getSizesAvailable() {
        return sizesAvailable;
    }

    public void printFootWear(){
        System.out.println("___This is Foot Wear:");
        System.out.println(brand + " " + size);
        for (Double sizes: sizesAvailable){
            System.out.print(sizes + " ");
            System.out.println("");
        }
    }
}
