package homeWork_12;

public class Keyboard {

    private String type;
    private String brand;
    private String model;

    public Keyboard(String type, String brand, String model) {
        this.type = type;
        this.brand = brand;
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void printKeyboardInfo() {
        System.out.println("Keyboard info (type/brand/model)  -  " + type + "/" + brand + "/" + model);
    }
}

