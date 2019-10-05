package hw20.Animals.Vertebrates.Mammals.Carnivores;

import java.util.ArrayList;

public class Wolf extends Carnivores {
    private String name;

    public Wolf(String name, ArrayList<String> iWillEat) {
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
        System.out.println("In one sitting, an adult wolf can effectively eat 22 1/2 pounds of meat, although this is the extreme and not the daily average. That would be a great feast, but an adult can go 12 days — sometimes more — without food.");
     //Typical body temperature310ºK or 36.4ºC or 97.5ºFBasal metabolic rate11.5630 WBody mass7902.6 gMetabolic rate per body mass0.001463 W/g
    }

    @Override
    public void reproduction() {
        System.out.println("Wolf packs typically have one litter of pups per year. Mating typically occurs between January and March. Wolves begin breeding between 2 and 3 years of age and are believed to mate for life.");

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
