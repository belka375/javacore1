package HW20;

public class Lion extends Carnivores implements Mammals, Vertebrates, Animals, Life {
    @Override
    public void feedMilk() {
        System.out.println("I feed my babies with breast milk.");
    }

    @Override
    public void canMove() {

        System.out.println("I can run and jump.");

    }

    @Override
    public void haveSpine() {
        System.out.println("I have spine.");

    }

    @Override
    public void isAlive() {
        System.out.println("I am alive.");
    }

    @Override
    public void needsNutrients() {
        System.out.println("I need nutrition.");
    }

}
