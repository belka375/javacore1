package hwExtra;

public class Animals {
    protected String color;
    protected String location;

    public Animals(String color, String location) {
        this.color=color;
        this.location=location;
    }

    public String getColor() {
        return color;
    }

    public String getLocation() {
        return location;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void printAnimals(){
        System.out.println(color);
        System.out.println(location);
    }
}
