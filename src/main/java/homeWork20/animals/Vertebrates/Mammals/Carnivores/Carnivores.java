package homeWork20.animals.Vertebrates.Mammals.Carnivores;

import homeWork20.animals.Vertebrates.Mammals.Mammals;

public abstract class Carnivores implements Mammals {
    private String name;
    private int lifespan;
    private int mass;
    private int gestation;
    private double length;

    public Carnivores(String name, int lifespan, int mass, int gestation, double length) {
        this.name = name;
        this.lifespan = lifespan;
        this.mass = mass;
        this.gestation = gestation;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public int getGestation() {
        return gestation;
    }

    public int getLifespan() {
        return lifespan;
    }

    public int getMass() {
        return mass;
    }
}
