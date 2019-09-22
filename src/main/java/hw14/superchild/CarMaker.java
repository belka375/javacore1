package hw14.superchild;

public class CarMaker {
    private String makerName;
    private String country;

    public CarMaker(String makerName, String country){
        this.makerName=makerName;
        this.country=country;

    }

    public String getMakerName() {
        return makerName;
    }

    public String getCountry() {
        return country;
    }
}
