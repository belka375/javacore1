package hw14.nested;

public class Dealership {
    private String dealerShipName;
    private Car car;
    private CarType carType;
    private Maker maker;
    private int carNumber;

    public Dealership(String dsn, Car car, CarType carType, Maker maker, int carNumber){
        this.dealerShipName=dsn;
        this.car=car;
        this.carNumber=carNumber;
        this.carType=carType;
        this.maker=maker;
    }

    public Car getCar() {
        return car;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public String getDealerShipName() {
        return dealerShipName;
    }

    public Maker getMaker() {
        return maker;
    }
}
