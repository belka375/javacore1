package Homework10;
/*
 * Homework 10.3-  Volunteer
*/
public class Volunteer {

    private String name;
    private String address;
    private String email;
    private String job;

    public Volunteer (String volname){
        this.name = volname;
    }

public Volunteer ( String vname, String vaddress, String vemail, String vjob){

        this.name = vname;
        this.address = vaddress;
        this.email = vemail;
        this.job = vjob;

}
    public void printClass() {

        System.out.println("Welcome to our volunteer program" + " " + name +  "! "  + "Your address:" + address + "," + "your email:" + email + ", "+  "your skills:" +  job);
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getJob() {
        return job;
    }




}
