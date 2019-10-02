package hw14;

public class AppleSauce extends Food {
    private String pack;

    public AppleSauce (NutriciousFacts nutrition, String kind, double weight, String pack) {
        super(nutrition, kind, weight);
        this.pack = pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }
    public String getPack() {
        return pack;
    }
}
