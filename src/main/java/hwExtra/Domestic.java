package hwExtra;

public class Domestic extends Animals{
    private Food[] food;
    private String cow;

    public Domestic(String color, String location, Food[] food, String cow){
        super(color, location);
        this.food=food;
        this.cow=cow;
    }
}
