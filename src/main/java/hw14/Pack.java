package hw14;

public class Pack extends Order {
    private String deltype;

    public Pack (String firstName, String lastName, int personId, String comName, double price, String prodName, Currency cur, DeliveryCity delcity, String deltype){
        super (firstName, lastName, personId, comName, price, prodName, cur, delcity);
        this.deltype=deltype;
    }

    public void setDeltype(String deltype) {
        this.deltype = deltype;
    }

    public String getDeltype() {
        return deltype;
    }

    public void printPack() {
        printOrder();
        System.out.println("This pack will delivery by " + deltype);

    }
}
