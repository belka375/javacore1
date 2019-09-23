package hw12;

public class Keyboard {
    private Brand keybordBrand;
    private Color keyboardColor;
    private boolean wireless;

    public Keyboard(Brand brandK, Color colorK, boolean wirelessK){
        this.keybordBrand = brandK;
        this.keyboardColor = colorK;
        this.wireless = wirelessK;
    }

    public void keyboardDescription() {
        System.out.println("Keyboard: " + "\n\tBrand: " + keybordBrand + "\n\tColor: " + keyboardColor + "\n\tWireless: " + wireless + "\n");
    }
}
