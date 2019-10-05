package hw20.Animals.Vertebrates.Mammals.Carnivores;

import java.util.ArrayList;

public class Lion extends Carnivores {
    private String name;

    public Lion(String name, ArrayList<String> iWillEat) {
        super(iWillEat);
        this.name=name;
    }

    @Override
    public void babyMilkFeeding() {
        System.out.println("Feed newborns milk");

    }

    @Override
    public void nervousSystem() {
        System.out.println("Develop advance nervous system\n");
    }

    @Override
    public void metabolism() {
        System.out.println("The lion is a generalist hypercarnivore and is considered to be both an apex and keystone predator due to its wide prey spectrum");
       // Typical body temperature311ºK or 37.9ºC or 100.2ºFBasal metabolic rate94.5800 WBody mass98000.0 gMetabolic rate per body mass0.000965
    }

    @Override
    public void reproduction() {
        System.out.println("Most lionesses reproduce by the time they are four years of age. Lions do not mate at a specific time of year and the females are polyestrous.");

    }

    public void allInfo(){
        System.out.println(name);
        consumerFoodChainInfo();
        metabolism();
        reproduction();
        babyMilkFeeding();
        nervousSystem();
    }
}
