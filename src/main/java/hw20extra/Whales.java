package hw20extra;

abstract class Whales implements Mammals {
    protected Area areaoflLife;
    protected boolean havelegs;

    public Whales(Area areaoflLife, boolean havelegs) {
        this.areaoflLife = areaoflLife;
        this.havelegs = havelegs;

    }
    public void longOfHair() {
        System.out.println("I have hair");

    }

    public abstract void myMeals();

    public abstract void whaleInfo();


    @Override
    public void nervouseSystem() {
        {
            System.out.println("I have a spinal cord  and i am vertebrate");
        }
    }
}
