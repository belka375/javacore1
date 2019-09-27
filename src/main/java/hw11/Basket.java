package hw11;

public class Basket {
    private String storeName;
    private String address;
    private Fruits[] fruits;

    public Basket(String storeName, String address, Fruits[] fruits){
        this.storeName=storeName;
        this.address=address;
        this.fruits=fruits;
    }
    public void printInfo(){
        System.out.println(storeName+", "+address+", ");
        for (Fruits fruit:fruits) {
            System.out.println(fruit);
        }
    }
}
