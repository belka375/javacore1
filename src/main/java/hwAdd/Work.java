package hwAdd;

public class Work {
    public static void main(String[] args) {
        Food[] wildFood=new Food[]{Food.MEAT, Food.MILK};
        Food[] farmFood=new Food[]{Food.GRASS,Food.MILK};
        Wild wildAnimals=new Wild("grey", "wood", Food.MEAT, "Wolfie");
        Domestic domesticAnimals=new Domestic("brown","farm", Food.GRASS, "Burenka");

        wildAnimals.setColor("grey");
        wildAnimals.setLocation("wood");
        wildAnimals.printWolfie();
        domesticAnimals.setColor("brown");
        domesticAnimals.setLocation("farm");
        domesticAnimals.printDomestic();
    }
}
