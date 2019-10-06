package HW20;

public class Work {

    public static void main(String[] args) {
        Lion Simba = new Lion();

        Simba.canMove();
        Simba.feedMilk();
        Simba.haveSpine();
        Simba.isAlive();
        Simba.needsNutrients();

        System.out.println("_______________________");

        Wolf Akela = new Wolf();

        Akela.canMove();
        Akela.feedMilk();
        Akela.haveSpine();
        Akela.isAlive();
        Akela.needsNutrients();

        System.out.println("_______________________");

        BlueWhale Tim = new BlueWhale();

        Tim.canMove();
        Tim.feedMilk();
        Tim.haveSpine();
        Tim.isAlive();
        Tim.needsNutrients();
    }
}
