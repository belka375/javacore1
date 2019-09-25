package workHw15;

public class Car extends Vehicle {

    public int numDoor ;
    public String maker;

    public Car(int numDoor,String maker,String model,String color){
                super(color, model);
                this.numDoor = numDoor;
                this.maker = maker;

    }

    public int getNumDoor() {
        return numDoor;
    }

    public String getMaker() {
        return maker;
    }

}
