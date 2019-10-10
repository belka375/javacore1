package hw20extra;

public class Lion extends Carnivores {


    public Lion(Area areaoflLife, boolean havelegs) {
        super(areaoflLife,havelegs);
    }

    public Area getAreaoflLife() {
        return areaoflLife;
    }

    @Override
    public void needOxigen() {
        System.out.println("I need Oxigen and i can breath!!!");
    }

    @Override
    public void howIMove() {
        System.out.println("i have 4 legs and i am carnivor");

    }

    @Override
    public void longOfHair() {
        System.out.println("I have long and short hair and i am a mammal");
    }

    @Override
    public void myMeals() {
        System.out.println("i love frech meals");
    }

    @Override
    public void iCanMove() {
        System.out.println(" i can run realy fast");

    }

    public void king() {
        System.out.println("I am a king of the animals");
    }

    @Override
    public void nervouseSystem() {
        {
            System.out.println("I have a spinal cord - i am a vertebrat ");
        }


    }

    public void printInfo() {
        System.out.println("i live in " + areaoflLife + " and i have legs - " + havelegs);
    }
}
