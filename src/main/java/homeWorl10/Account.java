package homeWorl10;

public class Account {


    private long number;
    private double balance;
    private int ssn;
    private String name;
    private int pin;
    private String[] address;

    public Account(long number, double balance, int ssn, String name, int pin, String[] address) {

        this.number = number;
        this.balance = balance;
        this.ssn = ssn;
        this.name = name;
        this.pin = pin;
        this.address = address;
    }

    public Account() {

    }

    public void setNumber(long number) {
        this.number = number;

    }
    public void setBalance (double number) {
        this.balance = balance;
    }
     public void setSsn(int ssn){
        this.ssn= ssn;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPin (int pin){
        this.pin=pin;
    }
    public void setAddress(String [] address){
        this.address=address;
    }
    public long getNumber(){
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public int getSsn() {
        return ssn;
    }

    public String getName() {
        return name;
    }

    public int getPin() {
        return pin;
    }

    public String[] getAddress() {
        return address;
    }
    public void printAccountInfo(){
        System.out.println("Bank Account");
        System.out.println( "Namber:" + number  + "\nBalance " +   balance + "\nSocial Security Number " + ssn + "\nName " + name+ " \nPin Code" + pin + " ");
        for(String homeAddress : address ){
            System.out.println(homeAddress+ " ");
            System.out.println("");
        }
    }
}

