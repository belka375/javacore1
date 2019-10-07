package hw20extra;

public class Wolf extends Carnivores{
    private Area areaoflLife;
    public boolean havelegs;

    public Wolf(Area areaoflLife, boolean havelegs) {
        this.areaoflLife = areaoflLife;
        this.havelegs = havelegs;
    }

    public Area getAreaoflLife() {
        return areaoflLife;
    }

    @Override
    public void needOxigen() {
        System.out.println("I can breath!");
    }

    @Override
    public void myMeals() {
        System.out.println("i love small fresh animals");
    }

    @Override
    public void iCanMove() {
        System.out.println(" i can run");

    }
    public void printInfo(){
        System.out.println("i live in "+ areaoflLife+" and i have legs - "+havelegs);
    }

}
