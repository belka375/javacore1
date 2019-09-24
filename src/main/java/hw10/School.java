package hw10;

public class School {
        private String name;
        private String location;
        private String type;
        private String[] majors;

        public School(){
        }
        public School(String name, String location, String type, String[] majors){
            this.name=name;
            this.location=location;
            this.type=type;
            this.majors=majors;
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
        public void setMajors(String[] majors) {
        this.majors = majors;
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
        public String[] getMajors() {
        return majors;
        }
        public void schoolInfo(){
        System.out.println(name+", "+location+", "+type+", "+majors);
            for (String major:majors) {
                System.out.println(major);
            }
        }
}
