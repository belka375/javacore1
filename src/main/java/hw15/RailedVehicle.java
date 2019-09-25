package hw15;

public class RailedVehicle implements Vehicle {
    private TrainType trainType;

    public RailedVehicle(TrainType trainType) {
        this.trainType = trainType;
    }

    public void setTrainType(TrainType trainType) {
        this.trainType = trainType;
    }

    public TrainType getTrainType() {
        return trainType;
    }

    public void beep() {
        System.out.println("beep");
    }

    public void headlightOn() {
        System.out.println("headlightOn");

    }

    public void printInfo() {
        System.out.println("\n******************");
        System.out.println("Train type: " + trainType);
    }
}
