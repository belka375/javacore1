package hw20extra;

abstract class Carnivores implements Mammals {
    protected Area areaoflLife;
    protected boolean havelegs;

    public Carnivores(Area areaoflLife, boolean havelegs) {
        this.areaoflLife = areaoflLife;
        this.havelegs = havelegs;

    }


    public abstract void myMeals();


}
