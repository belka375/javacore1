package hw14yp;

public class Address {

        private String storeName;
        private String streetName;
        private String city;
        private String state;
        private int zip;

        public Address(String storeName, String streetName,String city,String state, int zip){
            this.storeName=storeName;
            this.streetName=streetName;
            this.city=city;
            this.state=state;
            this.zip=zip;
        }
        public String getStoreName(){
            return storeName;
        }

        public int getZip() {
            return zip;
        }

        public String getCity() {
            return city;
        }

        public String getState() {
            return state;
        }

        public String getStreetName() {
            return streetName;
        }

        public void printAddress(){
            System.out.println("***Store Address:****");
            System.out.println("\n"+storeName+" "+"\n"+streetName+" "  +"\n"+city+" "+ state+ "\n"+zip);
        }
}
