package homeWork20;

import homeWork20.animals.Vertebrates.Mammals.Carnivores.BlueWhale;
import homeWork20.animals.Vertebrates.Mammals.Carnivores.Lion;
import homeWork20.animals.Vertebrates.Mammals.Carnivores.Wolf;
import homeWork20.animals.Vertebrates.Mammals.Whales;
import homeWork20.bacteria.Phyla;
import homeWork20.fungi.Mushrooms;
import homeWork20.plants.Grain;

public class HomeWork_20 {
    public static void main(String[] args) {
        Grain rice = new Grain("Rice", "800 BC");
        Grain oat = new Grain("Oat", "1000 BC");
        rice.discover();
        rice.food();
        System.out.println("***********************************");
        oat.food();
        oat.discover();
        System.out.println("***********************************");
        Mushrooms agaricus_bisporus = new Mushrooms(5, "Agaricus bisporus");
        agaricus_bisporus.food();
        agaricus_bisporus.size();
        System.out.println("***********************************");

        Phyla mollusca = new Phyla("Mollusca", 1000);
        mollusca.discover();
        mollusca.food();
        System.out.println("***********************************");

        Whales killer = new Whales("Killer whale", 29, 8000, 18, 26);
        killer.breeding();
        killer.food();
        killer.comprising();
        killer.description();
        killer.fatOfMilk();
        System.out.println("***********************************");

        Wolf dingo = new Wolf("Dingo", 8, 180, 3, 2.7);
        dingo.fatOfMilk();
        dingo.description();
        dingo.comprising();
        dingo.breeding();
        dingo.food();
        System.out.println("***********************************");

        Lion panthera = new Lion("Panthera", 22, 250, 110, 250);
        panthera.food();
        panthera.fatOfMilk();
        panthera.description();
        panthera.comprising();
        panthera.breeding();
        System.out.println("***********************************");
        BlueWhale blueWhale = new BlueWhale("Blue Whale", 90, 330000, 12, 82);
        blueWhale.food();
        blueWhale.breeding();
        blueWhale.fatOfMilk();
        blueWhale.description();
        blueWhale.comprising();





    }
}
