package homeWork10;

public class Kittens {

    private String name;
    private String color;
    private double price;
    private String[] temper;

    public Kittens(String name, String color, double price, String[] temperament){
        this.name=name;
        this.price=price;
        this.color=color;
        this.temper=temperament;
    }

    public Kittens(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTemper(String[] temperament) {
        this.temper = temperament;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String[] getTemper() {
        return temper;
    }
    public void printCat(){
        System.out.println("Kitten-" + name+";\nColor- "+ color+";\nBuy now for- "+ price+" $;");
        System.out.print("Temperament: ");
        for (String tem:temper) {
            System.out.print(tem+" ");

        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------");
    }
}
