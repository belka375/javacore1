package samplesOfHv.ta14;

public class PlaceForRent {
    protected String placeName;
    protected PlaceType placeType;
    protected int rooms;
    protected int bathrooms;
    protected Appliances[] appliances;
    protected boolean available;

    public PlaceForRent(int rooms, int bathrooms){
        this.rooms=rooms;
        this.bathrooms=bathrooms;
    }

    public PlaceForRent(String placeName, PlaceType placeType, boolean available, int rooms, int bathrooms, Appliances[] appliances ){
        this.placeName=placeName;
        this.placeType=placeType;
        this.available=available;
        this.rooms=rooms;
        this.bathrooms=bathrooms;
        this.appliances=appliances;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean getAvailable() {
        return available;
    }

    protected void printPlaceForRent(){
        System.out.print("\nPlace Name: "+placeName+"\nPlace type: " +placeType+"\nAvailable: "+available+
                "\nNumber of Rooms: "+rooms+"\nNumber of Bathrooms: "+bathrooms+
                "\nAppliances included: ");
        for (Appliances a:appliances) {
            System.out.print(a+" ");
        }
    }
}