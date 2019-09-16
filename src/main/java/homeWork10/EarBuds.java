package homeWork10;

public class EarBuds {

    private String name;
    private double price;
    private double warranty;
    private String[] colors;

    public EarBuds(String name, double price, double war, String[] colors){
        this.name=name;
        this.price=price;
        this.warranty=war;
        this.colors=colors;
    }

    public EarBuds(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWarranty(double war) {
        this.warranty = war;
    }

    public void setColor(String[] colors) {  this.colors = colors; }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWarranty() {
        return warranty;
    }

    public String[] getColor() {

        return colors;
    }
    public void printBudsInfo(){
        System.out.println("Model-" + name+";\nBuy now- "+ price+";\nWarranty- "+ warranty+" yr;");
        System.out.print("Available colors: ");
        for (String color:colors) {
            System.out.print(color+" ");

        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------");
    }
}
