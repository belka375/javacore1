package hw15;

public class StandardTour extends Tour {
    private String transit;
    private boolean breakfast;

    public StandardTour(String country, String accomodation, int price, int days, String transit, boolean breakfast) {
        super(country, accomodation, price, days);
        this.transit = transit;
        this.breakfast = breakfast;
    }

    public void setTransit(String transit) {
        this.transit = transit;
    }

    public void setBreackfast(boolean breakfast) {
        this.breakfast = breakfast;
    }

    public String getTransit() {
        return transit;
    }

    public boolean getBreakfast() {
        return breakfast;
    }

    public void printTourInfo(){
        System.out.println("Country: "+ country + "."+ "\nTransit: " + transit +"\nAccomodation: " + accomodation +". " + "\nNumber of days: " + days + ". " + "\nPrice: " + price +"\nBreakfast is included: " + breakfast +".");


    }
}
