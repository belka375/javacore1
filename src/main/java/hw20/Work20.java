package hw20;

import hw20.Animals.Vertebrates.Mammals.Carnivores.BlueWhale;
import hw20.Animals.Vertebrates.Mammals.Carnivores.Lion;
import hw20.Animals.Vertebrates.Mammals.Carnivores.Wolf;

import java.util.ArrayList;
import java.util.Arrays;

public class Work20 {
    public static void main (String[] args){
        ArrayList<String> wolfEats = new ArrayList<>(Arrays.asList("Elk", "Moose", "Caribou", "White tailed deer", "Mule deer"));
        ArrayList<String> lionEats = new ArrayList<>(Arrays.asList("Blue wildebeest", "Zebra", "African buffalo", "Gemsbok", "Giraffe"));
        ArrayList<String> blueWhaleEats = new ArrayList<>(Arrays.asList("Krill", "Copepods"));

        Wolf eurasianWolf = new Wolf("Eurasia Wolf", wolfEats);
        Lion africanLion = new Lion("African Lion", lionEats);
        BlueWhale blueWhale = new BlueWhale("Blue Whale", blueWhaleEats);

        eurasianWolf.allInfo();
        africanLion.allInfo();
        blueWhale.allInfo();

    }
}
