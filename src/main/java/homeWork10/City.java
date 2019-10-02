package homeWork10;

public class City {
    private String name;
    private String country;
    private int population;
    private String[] districts;

//=======================================================
    public City(){}

//==============constructor=================================
    public City(String name, String country, int population, String[] districts){
        this.name = name;
        this.country = country;
        this.population = population;
        this.districts = districts;
    }
    public void printCity(){
        System.out.println("My favorite City is " + name +
            ";\nThis City s located " + country +";\n Poputation is " +
            population + ";\nAnd It Has districts: "); for(String dist:  districts){
                System.out.println(dist+" ");
        }
    }
//========================setter===========================
    public void setName(String name) {
        this.name = name;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setDistricts(String[] districts) {
        this.districts = districts;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
//============================getter========================
    public String getName() {
        return name;
    }
    public int getPopulation() {
        return population;
    }
    public String getCountry() {
        return country;
    }
    public String[] getDistricts() {
        return districts;
    }



}

