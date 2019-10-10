package hw20extra;

public class Wolf extends Carnivores {


    public Wolf(Area areaoflLife, boolean havelegs) {
        super (areaoflLife, havelegs);
    }

    public Area getAreaoflLife() {
        return areaoflLife;
    }

    @Override
    public void needOxigen() {
        System.out.println("I can breath!");
    }

    @Override
    public void howIMove() {
        System.out.println("For catch rubbits i need run and jump");

    }

    @Override
    public void longOfHair() {
        System.out.println("I have hair which protect me on the winter");

    }

    @Override
    public void myMeals() {
        System.out.println("i love small fresh animals");
    }

    @Override
    public void iCanMove() {
        System.out.println(" i can run");


    }

    @Override
    public void nervouseSystem() {
        {
            System.out.println("I have a spinal cord and i am vertebral ");
        }



    }
    public void printInfo(){
        System.out.println("i live in " + areaoflLife + " and i have legs - " + havelegs);
    }
}
