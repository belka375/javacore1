package HW20;

public class Wolf extends Carnivores implements Mammals, Vertebrates, Animals, Life {

    @Override
    public void needsNutrients() {
        System.out.println("I eat rabbits.");
    }

    @Override
    public void isAlive() {
        System.out.println("I am alive.");
    }

    @Override
    public void haveSpine() {
        System.out.println("I have skeleton and a spine.");
    }

    @Override
    public void canMove() {
        System.out.println("I can move.");

    }

    @Override
    public void feedMilk() {
        System.out.println("I feed baby wolves with milk.");

    }

}
