package hw14byD;

public class Parents {
    protected String firstName;
    protected String lastName;
    protected String job;

    public Parents(String firstName, String lastName, String job) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.job = job;
    }
    protected void printParentsInfo(){
        System.out.println("First name:"+firstName+", Last name: "+lastName+", Occupation: "+job+".");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getJob() {
        return job;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
