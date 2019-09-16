package hw10;

public class Work {
    public static void main(String[] args) {

        int[] dimens = new int[]{10, 7};
        Patio firstPatio = new Patio();
        firstPatio.setPatioNumber("First Patio");
        firstPatio.setType("Open");
        firstPatio.setPatioSurface("Gravel");
        firstPatio.setDimensions(dimens);
        firstPatio.printPatioInfo();

        int[] dimenss = new int[]{20, 10};
        Patio secondPatio = new Patio("Second Patio","Closed", true, "Concrete", dimenss);
        secondPatio.printPatioInfo();

        Sofa reclinerSofa=new Sofa();
        int[] sizes=new int[]{96,42};
        reclinerSofa.setType("Recliner");
        reclinerSofa.setSize(sizes);
        reclinerSofa.setColor("black");
        reclinerSofa.printSofaInfo();

        int[] size=new int[]{80, 40};
        Sofa standardSofa=new Sofa("Standard",size,"gray");
        standardSofa.printSofaInfo();

        Animal frog = new Animal();
        String[] eat = new String[]{"insects", "small snakes", "mice", "baby turtles"};
        frog.setAnimalName("Frog");
        frog.setGroup("Amphibians");
        frog.setWhatEats(eat);
        frog.setCubsOrEggsNumber(2500);
        frog.setBlood("cold-blooded");
        frog.printAnimalDescription();

        String[] eats= new String[]{"ambar deer", "wild pigs", "water buffalo", "antelope"};
        Animal tiger = new Animal("Tiger", "Mammals", eats, 4, "warm-blooded");
        tiger.printAnimalDescription();
    }
}
