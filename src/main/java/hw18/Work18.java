package hw18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Work18 {
 public static void main(String[] args) {
     Doctor hanna = new Doctor("Hanna", "Hovard", Position.NURSE);
     Doctor joseph = new Doctor("Joseph", "Jonson", Position.PEDIATOR);
     Doctor philip = new Doctor("Philip", "Kite", Position.RADIOLOGIST);
     Doctor ashly = new Doctor("Ashly", "Madison", Position.PHYSICIAN);
     Doctor patrik = new Doctor("Patrik", "Vonka", Position.THERAPIST);

     ArrayList<Doctor> arnoldPalmerDoctors = new ArrayList<>();
     Doctor[] arnoldPalmerDoctorsArray = new Doctor[]{hanna, joseph, philip, ashly, patrik};
     for (Doctor doc : arnoldPalmerDoctorsArray) {
         arnoldPalmerDoctors.add(doc);
     }

     HashMap<Integer, String> rooms = new HashMap<>();
     rooms.put(1, "Nurse");
     rooms.put(2, "Pediator");
     rooms.put(3, "X-Ray");
     rooms.put(4, "Physician");
     rooms.put(5, "Therapist");


     Insurances[] arnoldPalmerInsurancAccseptedArray = new Insurances[]{Insurances.BLUE_CROSS_BLUE_SHIELD, Insurances.HUMANA};
     ArrayList<Insurances> arnoldPalmerInsurancAccsepted = new ArrayList<>(Arrays.asList(arnoldPalmerInsurancAccseptedArray));

     Address arnoldPalerAdress = new Address("92 W Miller St", "Orlando", "FL", 32806);
     Hospital arnoldPalmer = new Hospital("Arnold Palmer", arnoldPalerAdress, arnoldPalmerDoctors, rooms, arnoldPalmerInsurancAccsepted);

     arnoldPalmer.printInfo();
     arnoldPalmer.printDoctors();
     arnoldPalmer.printOffices();
 }
}
