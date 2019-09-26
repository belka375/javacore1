package hw15;

public class Bus implements PrototypeBus {
    private int manufactureYear;
    private String model;
    private String licencePlate;

    public Bus (int myear, String model, String licplate){
        this.manufactureYear=myear;
        this.model=model;
        this.licencePlate=licplate;
    }
    public void printInfo(){
        System.out.println(manufactureYear);
        System.out.println(model);
        System.out.println(licencePlate);
    }
}
