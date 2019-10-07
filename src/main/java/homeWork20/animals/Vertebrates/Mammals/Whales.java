package homeWork20.animals.Vertebrates.Mammals;

public class Whales implements Mammals {
    private String name;
    private int lifespan;
    private int mass;
    private int gestation;
    private double length;

    public Whales(String name, int lifespan, int mass, int gestation, double length) {
        this.name = name;
        this.lifespan = lifespan;
        this.mass = mass;
        this.gestation = gestation;
        this.length = length;
    }

    @Override
    public void fatOfMilk() {
        System.out.println(name +  " =>This Whales's milk is very fat");

    }

    @Override
    public void description() {
        System.out.println( "Whales " +name +" are a widely distributed and diverse group of fully aquatic placental marine mammals. " +
                "Its mass = "+mass + "lbs; Length = "+length+" feet; Lifespan in years =>" + lifespan);

    }

    @Override
    public void comprising() {
        System.out.println("Whales range in size from the 2.6 metres (8.5 ft) and \n135 " +
                "kilograms (298 lb) dwarf sperm whale to the 29.9 metres (98 ft) \nand 190 metric tons (210 short tons) blue whale, " +
                "\nwhich is the largest known creature that has ever lived. \nThe sperm whale is the largest toothed predator on earth.");

    }

    @Override
    public void breeding() {
        System.out.println(name + " => Gestation period in month: "+gestation);
    }

    @Override
    public void food() {
        System.out.println("Whales are marine mammals, members of the cetacea order which also includes dolphins and porpoises. Some whales have teeth while others have baleen.");

    }
}
