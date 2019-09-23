package hw14;

public class Food {
    protected NutriciousFacts nutrition;
    protected String kind;
    protected double weight;

            public Food () {}

            public Food (NutriciousFacts nutrition, String kind, double weight) {
        this.nutrition = nutrition;
        this.kind = kind;
        this.weight = weight;
            }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setNutrition(NutriciousFacts nutrition) {
        this.nutrition = nutrition;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public NutriciousFacts getNutrition() {
        return nutrition;
    }

    public String getKind() {
        return kind;
    }
}
