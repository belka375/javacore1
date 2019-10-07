package hw20;

public class Lion extends Carnivores {
    public void canEat(){
        System.out.println("Lion can eat!!!!");
    }

    @Override
    public void calfDrinksMilk() {
        System.out.println("Lion's calf drinks milk!!!!");
    }

    @Override
    public void haveSkeleton() {
            System.out.println("Lion has skeleton!!!!");
    }

    @Override
    public void haveSkin() {
        System.out.println("Lion has skin!!!!");
    }

    @Override
    public void canBreath(){
        System.out.println("Lion can breath!!!!");
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
