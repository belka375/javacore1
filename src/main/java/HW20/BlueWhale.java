package HW20;

public class BlueWhale extends Carnivores implements Mammals, Vertebrates, Animals, Life {

    @Override
    public void feedMilk() {
        System.out.println("I feed my babies with milk.");
    }

    @Override
    public void canMove() {
        System.out.println("I can move in water.");

    }

    @Override
    public void haveSpine() {
        System.out.println("I have a skeleton and a spine.");

    }

    @Override
    public void isAlive() {
        System.out.println("I am alive.");
    }

    @Override
    public void needsNutrients() {
        System.out.println("I eat fish and seafood.");

    }
}
