package hw15;

public abstract class Tour implements ProtoTour{
    protected String country;
    protected String accomodation;
    protected int price;
    protected int days;

    public Tour(String country, String accomodation, int price, int days) {
        this.country = country;
        this.accomodation = accomodation;
        this.price = price;
        this.days = days;
    }

//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public void setAccomodation(String accomodation) {
//        this.accomodation = accomodation;
//    }
//
//    public void setPrice(boolean price) {
//        this.price = price;
//    }
//
//    public void setDays(int days) {
//        this.days = days;
//    }

    public String getCountry() {
        return country;
    }

    public String getAccomodation() {
        return accomodation;
    }

    public int getPrice() {
        return price;
    }

    public int getDays() {
        return days;
    }

    public void printTourInfo(){
        System.out.println("Country: " + country + "."+ "\nAccomodation: " + accomodation +". " + "\nNumber of days: " + days + ". " + "\nPrice: " + price);

    }

}
