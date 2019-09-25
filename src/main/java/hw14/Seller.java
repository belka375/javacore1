package hw14;

public class Seller extends Person {
    private String companyName;

    public Seller(String firstName, String lastName, int personId, String comName){
        super(firstName, lastName, personId);
        this.companyName=comName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void printSeller(){
        printPerson();
        System.out.println("Company: "+companyName);
    }

}
