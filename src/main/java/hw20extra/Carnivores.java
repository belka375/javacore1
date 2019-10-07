package hw20extra;

abstract class Carnivores implements Mammals {
    public void longOfHair(){
        System.out.println("I have hair");

    }
    public abstract void myMeals();

    public void carnivores(){
        System.out.println("I am carnivor");
    }
}
