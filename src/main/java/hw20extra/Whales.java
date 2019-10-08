package hw20extra;

abstract class Whales implements Mammals {
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
