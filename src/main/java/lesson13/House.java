package lesson13;

import homeWork12.Computer;

public class House {
    private  Address address;
    private int bathrooms;
    private int bedrooms;
    private Computer computer;

    public House(Address address, int bathrooms, int bedrooms, Computer computer){
        this.address = address;
        this.bathrooms = bathrooms;
        this.bedrooms = bedrooms;
        this.computer = computer;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public Computer getComputer() {
        return computer;
    }

    public Address getAddress() {
        return address;
    }
    public void  printHouse(){
        System.out.println(address + "\n Bathrooms: " +bathrooms + " Badrooms: " + bedrooms+"\n"+ computer);
    }
}


