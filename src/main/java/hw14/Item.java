package hw14;

public class Item {
    private String itemName;
    private Price price;

    public Item(String itemName, Price price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public Price getPrice() {
        return price;
    }
}
