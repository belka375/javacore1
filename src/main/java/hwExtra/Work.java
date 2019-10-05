package hwExtra;

public class Work {
    public static void main(String[] args) {
        Food[] food=new Food[]{Food.MEAT, Food.GRASS, Food.MILK};
        Wild wildAnimals=new Wild("grey", "wood", food, "Wolfie");
        Domestic domesticAnimals=new Domestic("brown","farm", food, "Burenka");

        wildAnimals.printWolfie();
    }
}
