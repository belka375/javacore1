package hw14;

public class Customer extends Person {
    private AccountType actype;

    public Customer(String firstName, String lastName, int personId, AccountType actype){
        super(firstName, lastName, personId);
        this.actype=actype;
    }

    public void printCustomer(){
        printPerson();
        System.out.println("Account Type: "+actype);

    }

}