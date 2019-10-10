package hw20byTanik;

public class Lion extends Carnivores {

    public String myName;

    public Lion(String myName){
        this.myName=myName;
    }

    public void eatOtherAnimals(){
        System.out.println("I eat other animals");
    }

    @Override
    public void haveFur() {
        System.out.println("I have fur");
    }

    @Override
    public void haveSkeleton() {
        System.out.println("I have a skeleton");
    }

    @Override
    public void goodPet() {
        System.out.println("I am not a good pet");
    }

    @Override
    public void alive() {
        System.out.println("I am a live creature");
    }
}
