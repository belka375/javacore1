package hw20;

public class Wolf extends Carnivores{
    public void canEat(){
        System.out.println("Wolf can eat!!!!");
    }

    @Override
    public void calfDrinksMilk() {
        System.out.println("Wolf's calf drinks milk!!!!");
    }

    @Override
    public void haveSkeleton() {
        System.out.println("Wolf has skeleton!!!!");
    }

    @Override
    public void haveSkin() {
        System.out.println("Wolf has skin!!!!");
    }

    @Override
    public void canBreath() {
        System.out.println("Wolf can breath!!!!");
    }
    public void printInfo(){
        System.out.println("************************");
        canEat();
        calfDrinksMilk();
        haveSkeleton();
        haveSkin();
        canBreath();
    }
}
