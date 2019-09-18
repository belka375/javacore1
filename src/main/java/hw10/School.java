package hw10;

public class School {
        private String name;
        private String location;
        private String type;

        public School(){

        }
        public School(String name, String location, String type){
            this.name=name;
            this.location=location;
            this.type=type;
        }

        public void setCountry(String country) {
            this.name=name;
        }
        public void setCity(String city) {
            this.location=location;
        }
        public void setCapital(String capital) {
            this.type=type;
        }

        public String getName() {
            return name;
        }
        public String getLocation() {
            return location;
        }
        public String getType() {
            return type;
        }
}
