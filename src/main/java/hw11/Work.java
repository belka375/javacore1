package hw11;

public class Work {
    public static void main(String[] args) {

        Ingredients[] ingredients = new Ingredients[]{Ingredients.WATER,  Ingredients.FRAGRANCE_FREE, Ingredients.MINERAL, Ingredients.OIL_FREE, Ingredients.PARABEN_FREE, Ingredients.WAX};

        Mascara lancome = new Mascara("Lancome", "Definicils", Benefit.LENGTHENING, Color.BLACK, 0.33, 22, true, ingredients);


        lancome.printMascaraInfo();

        Accessories[] accessories = new Accessories[]{Accessories.BASE, Accessories.CUP_HOLDER,Accessories.HEAD_HOLDER};
        Carseat britax = new Carseat("B-SAFE 35", "Britax", 19, KidAge.REAR_FACING, accessories);

        System.out.println("----------------------------------");
        britax.printCarseatInfo();






    }

}
