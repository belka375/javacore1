package hw14_1;

import java.time.LocalDateTime;

public class CostcoPerson {
        protected String name;
        protected String lastName;
        protected LocalDateTime dob;

        public CostcoPerson(String name, String lastName, LocalDateTime dob){
            this.name=name;
            this.lastName=lastName;
            this.dob=dob;
        }

//        public LocalDateTime getDob() {
//            return dob;
//        }
//
//        public String getLastName() {
//            return lastName;
//        }
//
//        public String getName() {
//            return name;
//        }

        protected void printCostcoPerson(){
            System.out.println("\n"+name+" "+lastName+" "+dob);
        }
}


