package homework8;

public class Smartphone {
    public String color;
    public String shape;
    public int length;
    public double weight;

    public void call(){
        System.out.println("call");
    }
    public void Message(){
        System.out.println("Message");
    }
    public void printSmartphoneInfo(){
        System.out.println("Color = "+color+"; Shape="+shape+"; Length="+length+"; Weight="+weight);
    }
}
