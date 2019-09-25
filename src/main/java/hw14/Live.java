package hw14;

import hw12.SystemBlock;

public class Live {
    protected Continent continent;
    protected String country;
    protected Region region;

    public Live(Continent continent, String country, Region region){
        this.continent=continent;
        this.region=region;
        this.country=country;
    }

    protected void printWorldMapInfo(){
        System.out.println("Continent: "+continent+" Country: "+ country + " Region: "+ region);
    }
}
