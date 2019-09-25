package hw15byTanik;

public class Work15 {
    public static void main(String[] args) {

        Edible fruitApple1 = new Fruit("apple", "red", 123.4, false);
        Edible fruitApple2 = new Fruit("apple", "green", 89.7, true);
        Edible fruitPear1 = new Fruit("pear", "yellow", 59.80, true);

        Edible vegetableTomato1 = new Vegetable("tomato", "red", 102.3, false);
        Edible vegetableTomato2 = new Vegetable("tomato", "yellow", 77.2, true);

        Edible grainWeat1 = new Grain("weat", false);
        Edible grainBuckweat1 = new Grain("buckweat", true);


        fruitApple1.printInfo();
        fruitApple2.printInfo();
        fruitPear1.printInfo();
        vegetableTomato1.printInfo();
        vegetableTomato2.printInfo();
        grainWeat1.printInfo();
        grainBuckweat1.printInfo();

        Edible[] arrayEdible = new Edible[]{fruitApple1, fruitApple2, fruitPear1, vegetableTomato1, vegetableTomato2, grainWeat1, grainBuckweat1};

        System.out.println("\n\n***Only ORGANIC Produce-----> ");
        for (Edible item : arrayEdible) {

            if (item.getOrganic()) {
                item.printInfo();
            }
        }
    }

}
