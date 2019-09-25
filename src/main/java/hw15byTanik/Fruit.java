package hw15byTanik;

public class Fruit extends Plod{

    public Fruit (String type, String color, double weightGr, boolean organic){
        super(type, color, weightGr, organic);
        this.setCategory("Fruit");
    }


}