package hw14;

public class Scooter extends InternalCombustionEngine{
   private String scooterModel;
   private String brand;
   private int wheelCount;
   private Tiers tiers;


   public Scooter(String enginModelmodel, int powerInHP, int cylinderCount, String coolingType, String scooterModel, String brand, int wheelCount, Tiers tr){
       super(enginModelmodel, powerInHP, cylinderCount, coolingType);
       this.scooterModel=scooterModel;
       this.brand=brand;
       this.wheelCount=wheelCount;
       tiers=tr;
   }

    public void setScooterModel(String scooterModel) {
        this.scooterModel = scooterModel;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public Tiers getTiers() {
        return tiers;
    }
}

