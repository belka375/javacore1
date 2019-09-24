package homeWork14_part1;

public class AutoDealer {
    private Address address;
    private Dealer dealer;

    public AutoDealer(Address address, Dealer dealer) {
        this.address = address;
        this.dealer = dealer;

    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public Address getAddress() {
        return address;
    }

    public Dealer getDealer() {
        return dealer;
    }


    public void printAutoDealer() {
        System.out.println("Auto dealer information:" + "\n");
        address.printAddressInfo();
        dealer.printDealerInfo();
    }
}
