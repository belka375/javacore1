package hw8;

public class Work {
    public static void main(String[] args) {
        System.out.println("************************************************************");
        House sanJoseHouse = new House();
        sanJoseHouse.location = "San Jose";
        sanJoseHouse.zipCode = 95123;
        sanJoseHouse.price = 1100000;
        sanJoseHouse.printHouseInfo();

        House athertonHouse = new House();
        athertonHouse.location = "Atherton";
        athertonHouse.zipCode = 94027;
        athertonHouse.price = 14500000;
        athertonHouse.printHouseInfo();

        System.out.println("*****************************");
        Dolphin bottlenose = new Dolphin();
        bottlenose.type = "Bottlenose";
        bottlenose.color = "grey";
        bottlenose.length = "3 m";
        bottlenose.weight = "170 kg";
        bottlenose.dolphinDescription();

        System.out.println("They can:");

        bottlenose.dive();
        bottlenose.play();
        bottlenose.swimFast();
        bottlenose.whistle();

        System.out.println("**************************");
        Dolphin irrawaddy = new Dolphin();
        irrawaddy.type = "Irrawaddy";
        irrawaddy.color = "pale gray";
        irrawaddy.length = "2 m";
        irrawaddy.weight = "135 kg";
        irrawaddy.dolphinDescription();

        System.out.println("They can:");

        irrawaddy.dive();
        irrawaddy.swimSlow();
        irrawaddy.whistle();

        System.out.println("*************************************");

        Flower rose = new Flower();

        rose.type = "Grandiflora Roses";
        rose.color = "deep golden yellow";
        rose.height = "65 cm";
        rose.shape = "clusters of five to seven large blooms";
        rose.smell = "like fresh apples";
        rose.flowerDescription();

        System.out.println("They can:");
        rose.blossom();

        System.out.println("*************************************");
        Flower tulip = new Flower();
        tulip.type = "Triumph Tulips";
        tulip.color = "vibrant display of colors";
        tulip.height = "50 cm";
        tulip.shape = "cup shaped";
        tulip.smell = "sweet-smelling";
        tulip.flowerDescription();




    }
}
