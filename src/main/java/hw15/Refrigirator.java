package hw15;


public class Refrigirator implements HomeAppliance {
    private String brand;
    private double capasity;

    public Refrigirator(String brand, double capasity){
        this.brand=brand;
        this.capasity=capasity;
    }

    public void printInfo() {
        System.out.print("Refrigirator: ");
        System.out.println("\nbrand: "+brand);
        System.out.println("capasity: "+capasity);

    }
}
