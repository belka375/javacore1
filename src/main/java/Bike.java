public class Bike {
    public int numOfWeels;
    public String color;
    public String condition;
    public String model;
    public boolean electric;

    public void beep(){System.out.println("Beep");}
    public void printBikeInfo(){
        System.out.println("Model is = "+model+"; color = "+color+"; condition "+condition+"; electrical - "+electric);
    }
}
