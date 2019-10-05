package hw20.Animals.Vertebrates.Mammals.Carnivores;

import java.util.ArrayList;

public class BlueWhale extends Carnivores {
    private String name;

    public BlueWhale(String name, ArrayList<String> iWillEat) {
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
        System.out.println("An adult blue whale can eat up to 40 million krill in a day. The whales always feed in the areas with the highest concentration of krill, sometimes eating up to 3,600 kilograms (7,900 lb) of krill in a single day");
    }

    @Override
    public void reproduction() {
        System.out.println("Females typically give birth once every two to three years at the start of the winter after a gestation period of 10 to 12 months. The calf weighs about 2.5 tonnes (2.8 short tons) and is around 7 meters (23 ft) in length.");

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
