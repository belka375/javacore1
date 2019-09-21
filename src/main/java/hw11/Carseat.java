package hw11;

public class Carseat {
    private String name;
    private String brand;
    private int weight;
    private KidAge type;
    private Accessories[] accessories;

    public Carseat (String name, String brand, int weight, KidAge type,Accessories[] accessories){
        this.name=name;
        this.brand=brand;
        this.weight=weight;
        this.type=type;
        this.accessories=accessories;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getWeight() {
        return weight;
    }

    public KidAge getType() {
        return type;
    }

    public Accessories[] getAccessories() {
        return accessories;
    }



    public void printCarseatInfo(){
        System.out.println(name+", "+brand+"\nWeight: "+weight);
        System.out.print("Accessories included: ");
        for (Accessories accessory:accessories) {
            System.out.print(accessory+", ");





        }



    }


}
