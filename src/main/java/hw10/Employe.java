package hw10;

public class Employe {
    private String firstName;
    private String lastName;
    private boolean contractor;
    private String[] groupOfAccess;

    public Employe(){}
    public Employe(String firstName, String lastName, boolean contractor, String[] groupOfAccess){
        this.firstName=firstName;
        this.lastName=lastName;
        this.contractor=contractor;
        this.groupOfAccess=groupOfAccess;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setContractor(boolean contractor) {
        this.contractor = contractor;
    }

    public void setGroupOfAccess(String[] groupOfAccess) {
        this.groupOfAccess = groupOfAccess;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String[] getGroupOfAccess() {
        return groupOfAccess;
    }
    public void printEmployeInfo() {
        System.out.println("-------------");
        System.out.println("Info about new employe: " +firstName + ", " + lastName + ", " + contractor);
        for (String grac : groupOfAccess) {
            System.out.print(grac + ", ");
        }
    }
}
