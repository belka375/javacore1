package hw10;

public class Address {
    private int houseNumber;
    private String streetName;
    private String city;
    private String zipCode;
    public String state;

    public void setHouseNumber (int hnum){
        houseNumber=hnum;
    }
    public void setStreetName (String strName){
        streetName=strName;
    }
    public void setCity (String c){
        city=c;
    }
    public void setZipCode(String zip){
        zipCode=zip;
    }

    public int getHouseNumber() {
        return houseNumber;
    }
    public String getStreetName() {
        return streetName;
    }
    public String getCity(){
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getState() {
        return state;
    }

    public void printFullAddress () {
        System.out.println(houseNumber+" "+streetName+", "+city+", "+zipCode+" "+state );
    }
}
