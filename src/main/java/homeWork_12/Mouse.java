package homeWork_12;

public class Mouse {

    private String brand;
    private String model;
    private String style;

    public Mouse(String brand, String model, String style) {
        this.brand = brand;
        this.model = model;
        this.style = style;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getStyle() {
        return style;
    }

    public void printMouseInfo() {
        System.out.println("Mouse info (brand/model/style) - " + brand + "/" + model + "/" + style);
    }
}
