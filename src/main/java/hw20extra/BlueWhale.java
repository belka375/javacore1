package hw20extra;

public class BlueWhale extends Whales {
    private Area areaoflLife;
    public boolean havelegs;

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
    public void whaleInfo() {
        System.out.println("I am quin of the Ocean");
    }

    @Override
    public void iCanMove() {
        System.out.println("i can jumping from the water");

    }
    public void printInfo(){
        System.out.println("i live in "+ areaoflLife+" and i have legs - "+havelegs);
    }

    @Override
    public void howIMove() {
        System.out.println("I can swim for the long distances");

    }

    public Area getAreaoflLife() {
        return areaoflLife;
    }
}
