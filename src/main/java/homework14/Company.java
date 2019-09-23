package homework14;

public class Company extends Address {
    private String companyName;
    private String payee;

    public Company(String companyName, String street, String city, String state, int zip, String payee){
        super(street, city,state, zip);
        this.companyName = companyName;
        this.payee = payee;
    }
    public void printCompany(){
        System.out.println("Vendor: "+companyName+"\n"+"Payee:  "+payee);
        printAddress();
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPayee() {
        return payee;
    }
    public void companyInfo() {
        System.out.println();
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }
}
