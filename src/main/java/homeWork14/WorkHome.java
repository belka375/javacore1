package homeWork14;

public class WorkHome {
    public static void main(String[] args) {

        ChocolateCake choko = new ChocolateCake("Corowka 80% batter", "White sugar", "Soy milk",
                                                "white flour", "Chokolate", "blueberry", "strawberry");
        HoneyCake ginge = new HoneyCake("kristy 60% batter", "Brown sugar", "Cow milk",
                                           "white flour", "Honey", "Banana", "soda");
        CheeseCake newYork = new CheeseCake("Corowka 80% batter", "Brown sugar", "Cow fat milk",
                                                "white flour", "Philadelfia", "Whole cream", "Cinnamon");


        System.out.println("======================");
        newYork.printCheeseCake();
        System.out.println("======================");
        ginge.printHoney();
        System.out.println("======================");
        choko.printChoco();
        System.out.println("======================");
        System.out.println("Base ingredients is: ");
        choko.printBase();

        newYork.getBatter();
        ginge.getBanana();
        System.out.println("==========================");
        System.out.println(choko.getBlueberry());





    }
}
