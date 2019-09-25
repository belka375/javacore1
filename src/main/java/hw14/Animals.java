package hw14;

public class Animals extends Live {
    private String animalName;

    public Animals(Continent continent,String country, Region region, String animalName){
        super(continent,country, region);
        this.animalName=animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
    public void printAnimalInfo(){
        printWorldMapInfo();
        System.out.println("Name of animal: "+animalName);
    }
}
