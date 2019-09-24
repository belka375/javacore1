package hw14;



public class Address {

    private String streetAddress;
    private String state;
    private int zipCode;
    private String city;


    public void Address (String streetAddress, String state, int zipCode, String city){
        this.streetAddress =streetAddress;
        this.state =state;
        this.zipCode =zipCode;
        this.city =city;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }
    public void printAddress(){
        //System.out.println("Address: "+ streetAddress+", " +city+", "+ state+", "+zipCode);
    }
}
