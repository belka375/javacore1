package hw14;


public class Restaurant {

    private String name;
    private Address address;
    private Menu[] categories;
    private Servers servers;



    public void Restaurant ( String name, Address address, Menu[] categories, Servers servers){
        this.name=name;
        this.address =address;
        this.categories =categories;
        this.servers =servers;

    }

    public String getName() {
        return name;
    }

    public Address getAddress() {

        return address;
    }

    public Menu[] getCategories() {

        return categories;
    }

    public Servers getServers() {

        return servers;
    }


    public void printRestaurantInfo() {

    }
}
