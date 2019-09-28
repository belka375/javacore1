package hw14_2;

import java.time.LocalDateTime;

public class Coach extends GymPerson{
    private Specialities[] specialities;
    private double hourRate;

    public Coach(String firstName, String lastName, LocalDateTime dob, Specialities[] specialities, double hourRate){
        super(firstName, lastName, dob);
        this.specialities=specialities;
        this.hourRate=hourRate;
    }

    public double getHourRate() {
        return hourRate;
    }

    public Specialities[] getSpecialities() {
        return specialities;
    }

    public void printCoach(){
        System.out.println("--------------------------");
        printGymPerson();
        System.out.print("Trainer of: ");
        for (Specialities spec:specialities) {
            System.out.print(spec+" ");
        }
        System.out.println("\nHour rate: $"+hourRate);

    }

}
