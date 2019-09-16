public class Vehicle {


        private String whatKindOfTransport;
        private String model;
        private int year;
        private String[] usage;

        public Vehicle(String whatKindOfTransport, String model, int year, String[] usage) {
            this.whatKindOfTransport = whatKindOfTransport;
            this.model = model;
            this.year = year;
            this.usage=usage;
        }

        public Vehicle(){

        }

        public void setWhatKindOfTransport(String whatKindOfTransport) {
            this.whatKindOfTransport = whatKindOfTransport;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setUsage(String[] usage) {
            this.usage = usage;
        }
        public void printVehicleInfo(){
            System.out.print(whatKindOfTransport+ ", " +model+ ", " +year+ ", ");
            for(String purpose:usage){
                System.out.print(purpose+ " ");
            }

        }
    }


