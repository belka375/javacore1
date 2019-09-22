package hw14;

import hw12.SystemBlock;

public class WorldMap {
    protected Continent continent;
    protected String country;
    protected Region region;

    public WorldMap(Continent continent, String country, Region region){
        this.continent=continent;
        this.region=region;
        this.country=country;
    }

    protected void printWorldMapInfo(){
        System.out.println("Continent: "+continent+" Country: "+ country + " Region: "+ region);
    }
}
