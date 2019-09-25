package hw15;

public class Work {
    public static void main(String[] args) {
        MotorVehicle car = new MotorVehicle(CarType.CONVERTIBLE, "BMW", "BMW");
        RailedVehicle train = new RailedVehicle(TrainType.ELECTRIC);
        printVehicle(car);
        printVehicle(train);
        beepVehicle(train);

        Vehicle steamTrain = new RailedVehicle(TrainType.STEAM);
        Vehicle hatchbackCar = new MotorVehicle(CarType.HATCHBACK, "Subaru", "Subaru");
        printVehicle(steamTrain);
        printVehicle(hatchbackCar);
        headlightOnVehicle(hatchbackCar);

        Vehicle dieselTrain = new RailedVehicle(TrainType.DIESEL);
        Vehicle suvCar = new MotorVehicle(CarType.SUV, "CRV", "Honda");
        printVehicle(dieselTrain);
        printVehicle(suvCar);
    }

    private static void headlightOnVehicle(Vehicle hc) {
        hc.headlightOn();
    }

    private static void beepVehicle(Vehicle t) {
        t.beep();
    }

    private static void printVehicle(Vehicle c) {
        c.printInfo();
    }


}
