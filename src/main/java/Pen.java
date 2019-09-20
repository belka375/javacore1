public class Pen {
    public String ink;
    public String color;
    public int length;
    public String type;

    public void write(){
        System.out.println("You can write with pen");
    }
    public void penAttributes(){
        System.out.println("Pen = "+ink+"; length = "+length+" inches; color = "+color+"; type = "+type);
    };
}
