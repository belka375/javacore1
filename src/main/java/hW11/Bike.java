package hW11;

public class Bike {
    public WheelsNumber numOfWeels;
    public String color;
    public String condition;
    public String model;
    public boolean electric;


    public Bike(WheelsNumber numOfWeels, String color, String condition, String model, boolean electric){
        this.numOfWeels=numOfWeels;
        this.color= color;
        this.condition = condition;
        this.model = model;
        this.electric=electric;
    }

    public void beep(){System.out.println("Beep");}
    public void printBikeInfo(){
        System.out.println("Model is = "+model+"; color = "+color+"; condition "+condition+"; electrical - "+electric+"; wheels number "+numOfWeels);
    }
}
