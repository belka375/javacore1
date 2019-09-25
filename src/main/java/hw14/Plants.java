package hw14;

public class Plants extends Live {
    private String plantName;

    public Plants(Continent continent,String country, Region region, String plantName){
        super(continent,country, region);
        this.plantName=plantName;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }
    public void printPlantInfo(){
        printWorldMapInfo();
        System.out.println("Name of plant: "+plantName);
    }
}
