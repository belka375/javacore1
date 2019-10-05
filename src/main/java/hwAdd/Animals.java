package hwAdd;

public class Animals {
    protected String color;
    protected String location;

    public Animals(String color, String location) {
        this.color= this.color;
        this.location= this.location;
    }
    protected void printAnimals(){
        System.out.println(color+", "+location);
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

}
