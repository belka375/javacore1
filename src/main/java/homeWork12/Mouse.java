package homeWork12;

public class Mouse {

    private Brand brand;
    private Color color;
    private ConnectionType type;

    public Mouse(Brand brand, Color color, ConnectionType type){
        this.brand=brand;
        this.color=color;
        this.type=type;
    }

    public Brand getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    public ConnectionType getType() {
        return type;
    }
    public  void printMouse(){
        System.out.println("\nMouse-  " + brand+"\n"+color+ "\nType- "+ type);
    }
}
