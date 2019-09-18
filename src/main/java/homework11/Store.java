package homework11;

public class Store {
    private Kitchenware utensils;
    private int price;

    public Store (Kitchenware utensils, int price){
        this.utensils = utensils;
        this.price = price;
    }

    public Kitchenware getUtensils() {
        return utensils;
    }

    public int getPrice() {
        return price;
    }

    public void setUtensils(Kitchenware utensils) {
        this.utensils = utensils;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
