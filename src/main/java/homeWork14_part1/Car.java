package homeWork14_part1;

public class Car {
    private String brand;
    private String model;
    private BodyType bodyType;
    private Color color;


    public Car(String brand, String model, BodyType bodyType, Color color) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.color = color;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public Color getColor() {
        return color;
    }

    public void printCarInfo() {
        System.out.println("Car info: " + brand + " /" + model + " /" + bodyType + " /" + color);
    }
}
