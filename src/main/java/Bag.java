public class Bag {
    private String type;
    private String material;
    private int price;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice (int price) {
        this.price =  price;
    }

    public Bag (){

    }

    public Bag (String type, String material, int price) {

    }

    public String getType () {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }

    public void printBag () {
        System.out.println(type + " " + material + " " + price);
    }
}
