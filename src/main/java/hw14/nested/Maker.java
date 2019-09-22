package hw14.nested;

public class Maker {
    private String makerName;
    private Country country;

    public Maker (String makerName, Country country){
        this.makerName=makerName;
        this.country=country;
    }

    public String getMakerName() {
        return makerName;
    }

    public Country getCountry() {
        return country;
    }
}
