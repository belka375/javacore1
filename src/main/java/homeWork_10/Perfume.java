package homeWork_10;

public class Perfume {

    private String brand;
    private int volume;
    private String goodFitFor;
    private int price;
    private String[] stores;

    public Perfume() {
    }

    public Perfume(String brand, int volume, int price, String goodFitFor) {
        this.brand = brand;
        this.volume = volume;
        this.price = price;
        this.goodFitFor = goodFitFor;
    }

    public Perfume(String brand, int volume, String[] stores) {
        this.brand = brand;
        this.volume = volume;
        this.stores = stores;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setVolume(int volume) {
        if(volume<=75){
            System.out.println("Warning! Minimum volume size is 80ml.");
            this.volume = 80;
        }else{
        this.volume = volume;}

    }

    public void setGoodFitFor(String goodFitFor) {
        this.goodFitFor = goodFitFor;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStores(String[] stores) {
        this.stores = stores;
    }

    public String getBrand() {
        return brand;
    }

    public int getVolume() {
        return volume;
    }

    public String getGoodFitFor() {
        return goodFitFor;
    }

    public int getPrice() {
        return price;
    }

    public String[] getStores() {
        return stores;
    }


    public void printClassPerfume() {
        System.out.println("Brand name - " + brand + "\nVolume - " + volume +"ml"+ "\nPrice - " + price + "$" + "\nGood for - " + goodFitFor);
    }

    public void printWhereToBuy() {
        System.out.println("Brand name - " + brand + "\nVolume - " + volume+"ml");
        for (String st : stores) {
            System.out.println("Available at " + st + " ");
        }
    }
}
