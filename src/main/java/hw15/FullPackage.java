package hw15;

public class FullPackage extends Tour {
    private String activities;
    private boolean allinclusive;

    public FullPackage(String country, String accomodation, int price, int days, String activities, boolean allinclusive) {
        super(country, accomodation, price, days);
        this.activities = activities;
        this.allinclusive = allinclusive;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }

    public void setAllinclusive(boolean allinclusive) {
        this.allinclusive = allinclusive;
    }

    public String getActivities() {
        return activities;
    }

    public boolean getAllinclusive() {
        return allinclusive;
    }
    public void printTourInfo(){
        System.out.println("Country: " + country + "."+ "\nAccomodation: " + accomodation +". " + "\nNumber of days: " + days + ". " + "\nPrice: " + price + ". " + "\nIncluded activities: " + activities + "\nAll Inclusive: " + allinclusive);

    }
}







