package hw20extra;

abstract class Whales implements Mammals {
    public void longOfHair() {
        System.out.println("I have hair");

    }

    public abstract void myMeals();

    public void whaleInfo() {
        System.out.println("I am a whale");
    }

    @Override
    public void nervouseSystem() {
        {
            System.out.println("I have a spinal cord ");
        }
    }
}
