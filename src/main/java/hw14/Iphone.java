package hw14;

public class Iphone {
    private Headset iphone;
    private String color;
    private int memory;

    public Iphone(Headset iphone, String color, int memory){
        this.color=color;
        this.iphone=iphone;
        this.memory=memory;

    }

    public Headset getIphone() {
        return iphone;
    }

    public String getColor() {
        return color;
    }

    public int getMemory() {
        return memory;
    }
}


