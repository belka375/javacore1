package homework12_13_14;

import java.time.LocalDate;

public class Component {
    protected Make make;
    protected String model;
    protected LocalDate yearOfMake;
    protected Color color;

    public Component (Make make, String model, LocalDate yearOfMake, Color color){
        this.color = color;
        this.model = model;
        this.make = make;
        this.yearOfMake = yearOfMake;
    }

    public Color getColor() {
        return color;
    }

    public Make getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setYearOfMake(LocalDate yearOfMake) {
        this.yearOfMake = yearOfMake;
    }
}
