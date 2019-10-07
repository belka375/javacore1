package hw20extra;

public class BlueWhale extends Whales {
    private Area areaoflLife;
    private boolean havelegs;

    public BlueWhale(Area areaoflLife, boolean havelegs) {
        this.areaoflLife = areaoflLife;
        this.havelegs = havelegs;
    }

    @Override
    public void needOxigen() {
        System.out.println("I can breath!!!");
    }

    @Override
    public void myMeals() {
       System.out.println("I love fish");
    }

    @Override
    public void iCanMove() {
        System.out.println("i can swim");

    }
    public void printInfo(){
        System.out.println("i live in "+ areaoflLife+" and i have legs - "+havelegs);
    }
}
