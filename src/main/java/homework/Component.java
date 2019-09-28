package homework;

import java.time.LocalDate;

public class Component implements PrintInfo {
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

    public LocalDate getYearOfMake() {
        return yearOfMake;
    }

    @Override
    public void printInfo() {
        System.out.println(make);
        System.out.println(model);
        System.out.println(yearOfMake);
        System.out.println(color);
    }
}
