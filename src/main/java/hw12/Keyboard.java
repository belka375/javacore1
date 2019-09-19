package hw12;

public class Keyboard {
    private String model;
    private String brand;
    private int keyscount;
    private Collors collor;

    public Keyboard(String model, String brand, int keyscount, Collors collor){
        this.model=model;
        this.brand=brand;
        this.keyscount=keyscount;
        this.collor=collor;
    }

    public void printClass(){
        System.out.println("Keyboard - "+model+" by "+brand+" ( "+keyscount+" buttons, "+collor+" )");
    }
}
