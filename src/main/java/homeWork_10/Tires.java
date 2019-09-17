package homeWork_10;

public class Tires {

    private String season;
    private double radius;
    private int width;
    private String[] carTypes;


    public Tires() {
    }

    public Tires(int radius, int width, String season) {
        this.radius = radius;
        this.width = width;
        this.season = season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setRadius(double radius) {
        if (radius < 14) {
            System.out.println("Warning! Please select correct tire size!");
        }
        this.radius = radius;
    }

    public void setWidth(int width) {
        if (width < 180) {
            System.out.println("Warning! Please select correct tire width!");
        }
        this.width = width;
    }

    public void setCarTypes(String[] carTypes) {
        this.carTypes = carTypes;
    }

    public String getSeason() {
        return season;
    }

    public double getRadius() {
        return radius;
    }

    public int getWidth() {
        return width;
    }


    public void printTiresInfo() {
        System.out.println("Tire season - " + season + " \nTire radius - " + radius + " \nTire width -  " + width);
        for (String ct : carTypes) {
            System.out.print("For " + ct + " ");
        }
    }

    public void printParameters() {
        System.out.println("Tire radius - " + radius + "\nTire width - " + width + "\nTire season - " + season);
    }
}
