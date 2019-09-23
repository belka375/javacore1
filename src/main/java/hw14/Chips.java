package hw14;

public class Chips extends Food {

    private String flavor;


    public Chips(NutriciousFacts nutrition, String kind, double weight, String flavor) {
        super(nutrition, kind, weight);
        this.flavor = flavor;

    }


    public String getFlavor() {
        return flavor;
    }
}


