package hw15;

public class VacuumCleaner implements HomeAppliance {
    private double power;
    private String brand;

    public VacuumCleaner(double power, String brand){
        this.power=power;
        this.brand=brand;
    }

    public void printInfo() {
        System.out.print("Vacuum cleaner: ");
        System.out.println("\nbrand: "+brand);
        System.out.println("power: "+power);

    }
}
