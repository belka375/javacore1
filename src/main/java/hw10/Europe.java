package hw10;

public class Europe {
    private String country;
    private String city;
    private String capital;

    public Europe(){

    }
    public Europe(String country, String city, String capital){
        this.country=country;
        this.city=city;
        this.capital=capital;
    }

    public void setCountry(String country) {
        this.country=country;
    }
    public void setCity(String city) {
        this.city=city;
    }
    public void setCapital(String capital) {
        this.capital=capital;
    }

    public String getCountry() {
        return country;
    }
    public String getCity() {
        return city;
    }
    public String getCapital() {
        return capital;
    }
}
