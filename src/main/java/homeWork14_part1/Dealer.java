package homeWork14_part1;

public class Dealer {
    private String dealerName;
    private Car carBrand;
    private int amountOfWorkers;
    private Address address;


    public Dealer(String dealerName, Car carBrand, int amountOfWorkers, Address address) {
        this.dealerName = dealerName;
        this.address = address;
        this.carBrand = carBrand;
        this.amountOfWorkers = amountOfWorkers;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public void setCarBrand(Car carBrand) {
        this.carBrand = carBrand;
    }

    public void setAmountOfWorkers(int amountOfWorkers) {
        this.amountOfWorkers = amountOfWorkers;
    }


    public String getDealerName() {
        return dealerName;
    }

    public Address getAddress() {
        return address;
    }

    public Car getCarBrand() {
        return carBrand;
    }

    public int getAmountOfWorkers() {
        return amountOfWorkers;
    }


    public void printDealerInfo() {
        System.out.println("Dealer info: " + dealerName + " \n");
        address.printAddressInfo();
        System.out.println("Workers qty.: " + amountOfWorkers);
        carBrand.printCarInfo();
    }
}
