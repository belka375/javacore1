package hw14;

public class Customer extends Person {
    private AccountType[] atype;
    private AccountType actype;

    public Customer(String firstName, String lastName, int personId, AccountType[] atype){
        super(firstName, lastName, personId);
        this.atype=atype;
    }

    public void printCustomer(){
        printPerson();
        System.out.println("Account Type: "+actype);
        for (AccountType a:atype){
            System.out.println(a);
        }
    }

}