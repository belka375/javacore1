package lesson12;

public class Keyboard {
    private int size;
    public Colors color;
    private String material;


    public Keyboard (int size, Colors color, String material) {

    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public int getSize () {
        return size;
    }

    public String getMaterial () {
        return material;
    }

    public Colors getColor() {
        return color;
    }

    public void printKeyboard () {
        System.out.println(size + " " + color +" " + material);
    }
}
