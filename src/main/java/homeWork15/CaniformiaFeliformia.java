package homeWork15;

public abstract class CaniformiaFeliformia implements Predator {
    private String nameClass;
    private String name;
    private String reproduction;
    private int legs;

    public CaniformiaFeliformia(String nameClass, String name, String reproduction, int legs) {
        this.nameClass = nameClass;
        this.name = name;
        this.reproduction = reproduction;
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public String getNameClass() {
        return nameClass;
    }

    public String getReproduction(String s) {
        return reproduction;
    }

    public String getName() {
        return name;
    }
    public void printPredator(){
        System.out.println(nameClass+", "+name+", "+"\n"+reproduction+", legs: "+legs);
    }
}
