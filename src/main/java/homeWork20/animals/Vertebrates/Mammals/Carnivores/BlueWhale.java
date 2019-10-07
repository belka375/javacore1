package homeWork20.animals.Vertebrates.Mammals.Carnivores;

public class BlueWhale extends Carnivores {
    public BlueWhale(String name, int lifespan, int mass, int gestation, double length) {
        super(name, lifespan, mass, gestation, length);
    }

    @Override
    public void fatOfMilk() {
        System.out.println(getName()+"; "+getLifespan()+" Years; "+getMass()+" lbs; "+getGestation()+" month; "+getLength()+" ft.");
    }

    @Override
    public void description() {
        System.out.println(getName()+" The blue whale is a marine mammal belonging to the baleen whale parvorder, Mysticeti. \n" +
                "At up to 29.9 meters in length and with a maximum recorded weight of 173 tonnes, " +
                "\nit is the largest animal known to have ever existed; \n"+getLifespan()+" Years; "+getMass()+" lbs; "+getGestation()+" month; "+getLength()+" ft.");
    }

    @Override
    public void comprising() {
        System.out.println(getName()+"; "+getLifespan()+" Years; "+getMass()+" lbs; "+getGestation()+" month; "+getLength()+" ft.");
    }

    @Override
    public void breeding() {
        System.out.println(getName()+"; "+getLifespan()+" Years; "+getMass()+" lbs; "+getGestation()+" month; "+getLength()+" ft.");
    }

    @Override
    public void food() {
        System.out.println(getName()+"; "+getLifespan()+" Years; "+getMass()+" lbs; "+getGestation()+" month; "+getLength()+" ft.");
    }
}
