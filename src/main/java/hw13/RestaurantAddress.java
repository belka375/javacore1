package hw13;

public class RestaurantAddress {



        private String streetAddress;
        private String city;
        private int zip;

        public RestaurantAddress(String streetAddress, String city, int zip){
            this.streetAddress=streetAddress;
            this.city=city;
            this.zip=zip;
        }

        public String getCity() {
            return city;
        }

        public String getStreetAddress() {
            return streetAddress;
        }

        public int getZip() {
            return zip;
        }
    }


