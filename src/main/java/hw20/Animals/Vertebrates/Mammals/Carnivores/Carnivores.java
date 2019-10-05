package hw20.Animals.Vertebrates.Mammals.Carnivores;

import hw20.Animals.Vertebrates.Mammals.Mammals;

import java.util.ArrayList;

abstract class Carnivores implements Mammals {
    private ArrayList<String> iWillEat;

    Carnivores(ArrayList<String> iWillEat) {
    this.iWillEat=iWillEat;
    }

    @Override
    public void consumerFoodChainInfo() {
        System.out.println("Usualy eats: ");
        iWillEat.forEach(s -> System.out.print(s+", "));
        System.out.println("\n");
    }

}
