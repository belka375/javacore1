package homeworkHospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hospital implements PrintInfo {
    private String hospitalName;
    private Address address;
    private List<Doctors> doctors;
    private Map<Integer, String> rooms;
    private List <InsuranceCompanies> insuranceCompanies;

    public Hospital(String hospitalName, Address address, List<Doctors> doctors, Map<Integer, String> rooms, List<InsuranceCompanies> insuranceCompanies) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.insuranceCompanies = insuranceCompanies;
    }


    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Doctors> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctors> doctors) {
        this.doctors = doctors;
    }

    public Map<Integer, String> getRooms() {
        return rooms;
    }

    public void setRooms(HashMap<Integer, String> rooms) {
        this.rooms = rooms;
    }

    public List<InsuranceCompanies> getInsuranceCompanies() {
        return insuranceCompanies;
    }

    public void setInsuranceCompanies(List<InsuranceCompanies> insuranceCompanies) {
        this.insuranceCompanies = insuranceCompanies;
    }

    @Override
    public void PrintInfo() {
        System.out.println(hospitalName);
        address.PrintInfo();
        doctors.forEach(str -> str.PrintInfo());
        System.out.println();

    }
}
