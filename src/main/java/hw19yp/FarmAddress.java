package hw19yp;

public class FarmAddress {
        private String streetAddress;
        private String town;
        private String state;
        private int zip;

        public FarmAddress(String streetAddress, String town, String state, int zip) {
            this.streetAddress = streetAddress;
            this.town = town;
            this.state = state;
            this.zip = zip;
        }

        public void printInfo(){
            System.out.println("Farm Address: "+streetAddress+", "+town+", "+state+" "+zip);
        }
    }
