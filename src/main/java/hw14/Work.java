package hw14;

public class Work {
    public static void main(String[] args) {

        NutriciousFacts nutr = new NutriciousFacts(25, 40, 35);
        Chips Lays = new Chips (nutr, "Snack", 1.5, "Bacon");

        int x = Lays.getNutrition().getFat();

        System.out.println("These Chips contain" +" " + x +" fat");

        NutriciousFacts nutr1 = new NutriciousFacts(60, 35, 5);
        Yogurt Danone = new Yogurt (nutr1, "Dairy", 0.33, true);
        int y = Danone.getNutrition().getCarbs();

        System.out.println("This Yogurt contains" + " " + y + " carbs");

        NutriciousFacts nutr2 = new NutriciousFacts(80, 10,10);
        AppleSauce TraderJoes = new AppleSauce (nutr2, "FruitSnack", 0.45, "OnTheGo");

        int z = TraderJoes.getNutrition().getProtein();

        System.out.println("This Apple Sauce contains" + " " + z + " protein");

    }
}
