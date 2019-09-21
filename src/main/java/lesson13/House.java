package lesson13;

public class House {
    private Address address;
    private int bedrooms;
    private int bathrooms;
    private double square;
    private Computer computer;

    public House(Address adr, int bedrooms, int bathrooms, double square, Computer pc){
        this.address=adr;
        this.bedrooms=bedrooms;
        this.bathrooms=bathrooms;
        this.computer=pc;
        this.square=square;
    }

    public Address getAddress() {
        return address;
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

    public Computer getComputer() {
        return computer;
    }
}
