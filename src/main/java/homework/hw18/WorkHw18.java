package homework.hw18;

import java.util.ArrayList;
import java.util.HashMap;

public class WorkHw18 {
    public static void main(String[]args){

       var address=new Address("15 Maple ave","Woodland","MA",14142);

       var doctors=new ArrayList<Doctor>();

       doctors.add(new Doctor("Jack","Bull",Position.PHYSICIAN));
       doctors.add(new Doctor("Peter", "Bell",Position.CONSULTANT));
       doctors.add(new Doctor("Anna","Blank",Position.NP));
       doctors.add(new Doctor("Mary","Olson",Position.RESIDENT));
       doctors.add(new Doctor("Bill","Ray",Position.NURSE));

       var rooms=new HashMap<Integer,String>();
       rooms.put(2,"nurses room");
       rooms.put(3, "NPs room");
       rooms.put(4,"doctors room");
       rooms.put(5,"residents room");
       rooms.put(1,"reception");


       var insurances=new ArrayList<InsuranceCompanies>();
       insurances.add(InsuranceCompanies.AETNA);
       insurances.add(InsuranceCompanies.BLUE_CROSS);
       insurances.add(InsuranceCompanies.SIGNA);
       insurances.add(InsuranceCompanies.UHC);

       var hospital=new Hospital("St.Luke",address,doctors,rooms,insurances);
       hospital.printInfo();










    }
}
