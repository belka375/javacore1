package hw14;

public class Yogurt extends Food{
    private boolean isPlain;


    public Yogurt (NutriciousFacts nutrition, String kind, double weight, boolean isPlain) {
        super(nutrition, kind, weight);
        this.isPlain = isPlain;
    }
}
