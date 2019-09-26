package hw14;

public class Icebreaker extends InternalCombustionEngine {
    private String name;
    private int displacement;

    public Icebreaker(String engineModel, int powerInHP, int cylinderCount, String coolingType, String name, int displacement){
        super(engineModel, powerInHP, cylinderCount, coolingType);
        this.name=name;
        this.displacement=displacement;
    }
}
