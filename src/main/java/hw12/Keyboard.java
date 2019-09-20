package hw12;


public class Keyboard {
    private Color color;
    private  String brand;

    public Keyboard(Color color, String brand){
        this.brand=brand;
        this.color=color;
    }

    public Color getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }
    public void printKeyboardInfo(){
        System.out.println("Keyboard is: "+color+"\n Brand of Keyboard: "+brand);
    }
}
