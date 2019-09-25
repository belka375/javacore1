package hw14;


    public class Address {
        private String street;
        private String city;
        private int zip;
        private String state;

        public Address(String street, String city, int zip, String state){
            this.street=street;
            this.city=city;
            this.zip=zip;
            this.state=state;

        }

        public String getStreet() {
            return street;
        }

        public String getCity() {
            return city;
        }

        public int getZip() {
            return zip;
        }

        public String getState() {
            return state;
        }

        public void printInfo() {
            System.out.println(street+ " ");
        }
    }



