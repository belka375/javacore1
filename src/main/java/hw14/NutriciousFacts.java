package hw14;

public class NutriciousFacts {
    private int carbs;
    private int protein;
    private int fat;

    public NutriciousFacts (int carbs, int protein, int fat) {
        this.carbs = carbs;
        this.protein = protein;
        this.fat = fat;
    }


    public int getCarbs() {
        return carbs;
    }

    public int getFat() {
        return fat;
    }

    public int getProtein() {
        return protein;
    }
}
