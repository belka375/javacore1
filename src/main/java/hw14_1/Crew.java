package hw14_1;

import java.time.LocalDateTime;

public class Crew extends CostcoPerson{
        private String occupation;
        private double hourlyRate;

        public Crew(String name, String lastName, LocalDateTime dob, String occupation, double hourlyRate){
            super(name, lastName, dob);
            this.occupation=occupation;
            this.hourlyRate=hourlyRate;
        }

        public double getHourlyRate() {
            return hourlyRate;
        }

        public String getOccupation() {
            return occupation;
        }

        public void printCrew(){
            printCostcoPerson();
            System.out.println("Occupation: "+occupation+"\nPay Rate/Hour: $"+hourlyRate);


        }


    }
