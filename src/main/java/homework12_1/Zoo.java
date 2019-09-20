package homework12_1;


public class Zoo {
    private String name;
    private String city;
    private Animals[] animals;
    private Address address;


    public Zoo(String city, Animals[] animals, Address address) {
        this.city = city;
        this.city = city;
        this.animals = animals;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Animals[] getAnimals() {
        return animals;
    }

    public Address getAddress() {
        return address;
    }

    public void printZoo() {
        System.out.println(name);
        address.printAddress();
        for (Animals animals : animals) {
            animals.printAnimals();
        }
    }
}

