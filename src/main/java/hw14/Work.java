package hw14;

public class Work {
    public static void main(String[] args){
        Animals rabbit = new Animals(Continent.NORTH_AMERICA, "Canada", Region.PRAIARIE, "Canadian Rabbit");
        Trees oak = new Trees(Continent.NORTH_AMERICA,"Noth America", Region.PRAIARIE,"Corck oak");
        Plants agava = new Plants(Continent.NORTH_AMERICA,"Mexico",Region.DESERT,"Agava");

        rabbit.printAnimalInfo();
        oak.printTreeInfo();
        agava.printPlantInfo();

    }
}
