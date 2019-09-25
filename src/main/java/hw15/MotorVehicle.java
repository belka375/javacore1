package hw15;

public class MotorVehicle implements Vehicle {
    private CarType carType;
    private String model;
    private String maker;

    public MotorVehicle(CarType carType, String model, String maker) {
        this.model = model;
        this.carType = carType;
        this.maker = maker;
    }

    public void beep() {
        System.out.println("beep");
    }

    public void headlightOn() {
        System.out.println("headlightOn");
    }

    public void printInfo() {
        System.out.println("**********************");
        System.out.print("Maker: " + maker + " ");
        System.out.print("Type: " + carType + " ");
        System.out.print("Model: " + model);
        System.out.println("\n**********************");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public CarType getCarType() {
        return carType;
    }

    public String getModel() {
        return model;
    }

    public String getMaker() {
        return maker;
    }
}
