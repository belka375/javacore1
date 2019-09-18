package lesson11;

public class Pizza {
    private String name;
    public Size[] size;
    private int price;

    public Pizza() {

    }

    public Pizza (String name, Size[] size) {
        this.name = name;
        this.size = size;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Size[] size) {
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public Size[] getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}

