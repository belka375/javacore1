package workHw15;

public class Bus extends Vehicle {

    public int capacity ;
    public String type;

    public Bus(int capacity,String type,String model,String color){
        super(color, model);
        this.capacity = capacity;
        this.type = type;

    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

}
