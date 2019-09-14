package homework8;

public class Box {
    public String color;
    public String shape;
    public int length;
    public double weight;

    public void tear(){
        System.out.println("tear");
    }



    public void printBoxInfo(){
        System.out.println("Color = "+color+"; Shape="+shape+"; Length="+length+"; Weight="+weight);
    }
}
