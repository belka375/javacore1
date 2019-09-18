package HW8;


    public class PublicTransport {

        public String type;
        public String name;
        public int model;
        public int year;

        public void printTransportationInfo() {
            System.out.println(type + " " + name);


        }

        public void printTransportationCharacteristic() {
            System.out.println(model + " " + year);
        }
    }