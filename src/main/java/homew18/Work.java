package homew18;

import hw18baurzhan.Address;
import hw18baurzhan.Doctor;
import hw18baurzhan.Hospital;
import hw18baurzhan.InsuranseCompanies;
import hw18baurzhan.Position;

import java.util.ArrayList;
import java.util.HashMap;

public class Work {

        public static void main(String[] args) {

            var address = new Address("154 Main ave", "Elmwood Park", "NJ", 07700);
            var doctors=new ArrayList<hw18baurzhan.Doctor>();
            doctors.add(new hw18baurzhan.Doctor("Peter","Shatz", hw18baurzhan.Position.DOCTOR));
            doctors.add(new hw18baurzhan.Doctor("Frank","Smile", hw18baurzhan.Position.MANAGER));
            doctors.add(new hw18baurzhan.Doctor("Michael","Mulls", hw18baurzhan.Position.DOCTOR));
            doctors.add(new hw18baurzhan.Doctor("Jane","Dole", hw18baurzhan.Position.DOCTOR));
            doctors.add(new hw18baurzhan.Doctor("Sarah","Smith", hw18baurzhan.Position.DOCTOR));
            doctors.add(new Doctor("Samuel","Solo", Position.NURSE));

            var rooms = new HashMap<Integer,String>();
            rooms.put(12,"Doctors room");
            rooms.put(13,"Doctors room");
            rooms.put(14,"Doctors room");
            rooms.put(15,"Doctors room");
            rooms.put(16,"Doctors room");
            rooms.put(17,"Ultrasound room");
            rooms.put(18,"registrators room");
            rooms.put(19,"Accounter room");

            var acceptedIns=new ArrayList<InsuranseCompanies>();
            acceptedIns.add(InsuranseCompanies.AETNA);
            acceptedIns.add(InsuranseCompanies.BLUE_CROSS);
            acceptedIns.add(InsuranseCompanies.EMBLEM);
            acceptedIns.add(InsuranseCompanies.UHC);

            var hospital = new Hospital("Mount Zero",address,doctors,rooms,acceptedIns);
            hospital.printInfo();
        }
    }


