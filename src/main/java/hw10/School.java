package hw10;

public class School {
        private String name;
        private String location;
        private String type;
        private String[] majors;

//        public School(){
//        }
        public School(String name, String location, String type, String[] majors){
            this.name=name;
            this.location=location;
            this.type=type;
            this.majors=majors;
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
        System.out.println(name+", "+location+", "+type);
            for (String major:majors) {
                System.out.print(major);
            }
        }
}
