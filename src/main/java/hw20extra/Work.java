package hw20extra;

public class Work {
    public static void main(String [] args){
        System.out.println("guess who i am??????:");
        Lion lion=new Lion(Area.Selva, true);
        lion.iCanMove();
        lion.king();
        lion.myMeals();
        lion.getAreaoflLife();
        lion.needOxigen();
        lion.nervouseSystem();
        lion.longOfHair();
        lion.howIMove();
        lion.printInfo();
        System.out.println("***********************");

        System.out.println("guess who i am??????:");
        BlueWhale blueWhale=new BlueWhale(Area.Ocean, false);
        blueWhale.iCanMove();
        blueWhale.myMeals();
        blueWhale.getAreaoflLife();
        blueWhale.needOxigen();
        blueWhale.nervouseSystem();
        blueWhale.longOfHair();
        blueWhale.howIMove();
        blueWhale.printInfo();
        blueWhale.whaleInfo();

        System.out.println("***********************");
        System.out.println("guess who i am??????:");
        Wolf wolf=new Wolf(Area.Forest, true);
        wolf.iCanMove();
        wolf.myMeals();
        wolf.getAreaoflLife();
        wolf.needOxigen();
        wolf.nervouseSystem();
        wolf.longOfHair();
        wolf.howIMove();
        wolf.printInfo();




    }
}
