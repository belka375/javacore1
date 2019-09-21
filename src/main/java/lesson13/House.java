package lesson13;

public class House {
    private Address address;
    private int bedrooms;
    private int bathrooms;
    private double square;
    private Computer computer;

    public House(Address adr,int bedrooms,int bathrooms, double sq, Computer pc){
        this.address=adr;
        this.bedrooms=bedrooms;
        this.bathrooms=bathrooms;
        this.square=sq;
        this.computer=pc;

    }

    public Address getAddress() {
        return address;
    }

    public Computer getComputer() {
        return computer;
    }

    public double getSquare() {
        return square;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public int getBedrooms() {
        return bedrooms;
    }
}
