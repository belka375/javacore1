package hw10byTanik;

public class Building {
    private String name;
    private int height;
    private int yearBuild;
    private String country;
    private boolean isHighest;

    public Building(){
    }

    public Building (String bName, int bHeight, int bYear, String bCountry, boolean bHighest){
        this.name=bName;
        this.height=bHeight;
        this.yearBuild=bYear;
        this.country=bCountry;
        this.isHighest=bHighest;
    }

    public void setName (String n){
        this.name=n;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setYearBuild(int yearBuild) {
        this.yearBuild = yearBuild;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setHighest(boolean highest) {
        isHighest = highest;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getYearBuild() {
        return yearBuild;
    }

    public boolean getIsHighest() {
        return isHighest;
    }

    public String getCountry() {
        return country;
    }

    public void printBuildingInfo(){
        System.out.println("Building Name: "+name+";\nBuilding height: "+height+";\nBuilding Built in: "
                +yearBuild+";\nBuilding is located in: "+country+";\nIs it highest in the world? "+isHighest+".");
    }

  }
