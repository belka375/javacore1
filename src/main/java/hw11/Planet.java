package hw11;

public class Planet {

    private SolarSystem planetNames;
    private int orbitalPeriod;

    public Planet (SolarSystem [] planetName, int orbitalPeriod){
        this.planetNames=planetNames;
        this.orbitalPeriod=orbitalPeriod;
    }


    public void printPlanetsInfo(SolarSystem [] planetName){
        System.out.println("closest planets:" +planetNames);
        for (SolarSystem pl:planetNames){
            System.out.println("Planets" +pl);
        }
    }

}
