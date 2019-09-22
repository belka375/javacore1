package hw14.nested;

public class Car {
    private OwnerName name;
    private String model;
    private String color;

    public Car (OwnerName name, String model, String color){
        this.name=name;
        this.color=color;
        this.model=model;
    }

    public String getModel() {
        return model;
    }

    public OwnerName getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
