package lesson11;

public class Lipstick {
    private Colors color;
    private  int price;

    public Lipstick(Colors color, int price){
        this.color=color;
        this.price=price;
    }

    public Colors getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
