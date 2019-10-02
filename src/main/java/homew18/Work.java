package homew18;

import java.util.ArrayList;
import java.util.HashMap;

public class Work {
    public static void main(String[]args){
        var address=new Address("154 Main ave", "Elmwood Park", "NJ",07700);
        var doctors=new ArrayList<Doctor>();
        doctors.add(new Doctor("Peter","Shatz",Position.CARDIOLOGIST));
        doctors.add(new Doctor("Frank","Smile",Position.GYNECOLOGIST));
        doctors.add(new Doctor("Michael","Mulls", Position.PHISICIAN));
        doctors.add(new Doctor("Jane","Dole", Position.SURGEON));

        var rooms =new HashMap<Integer,String>();
        rooms.put(12,"Doctors room");
        rooms.put(13,"Doctors room");
        rooms.put(14,"Doctors room");
        rooms.put(15,"Doctors room");

        var acceptedIns=new ArrayList<InsuranceCompanies>();
        acceptedIns.add(InsuranceCompanies.PROGTESSIVE);
        acceptedIns.add(InsuranceCompanies.GEICO);
        acceptedIns.add(InsuranceCompanies.NATIONALGENERAL);
        acceptedIns.add(InsuranceCompanies.UNITED);

        var hospital= new Hospital("Mount Zero",address,doctors,rooms,acceptedIns);
        hospital.printlnInfo();

    }
}
