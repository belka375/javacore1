package lesson12;

public class Mouse {
    private boolean isWireless;
    public Colors color;

    public Mouse (Colors color) {
    this.color = color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    public void printMouse () {
        System.out.println (color);
    }

}
