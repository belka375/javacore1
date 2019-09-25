package hw13;

public class Restaurant {


        private String name;
        private RestaurantAddress address;
        private Menu menu;
        private int tables;
        private double square;
        private Waiter waiter;


        public Restaurant(String name, RestaurantAddress address, Menu menu, int tables, double square, Waiter waiter){
            this. name=name;
            this.address=address;
            this.menu=menu;
            this.tables=tables;
            this.square=square;
            this.waiter=waiter;


        }
    public RestaurantAddress getAddress() {
        return address;
    }


    public Menu getMenu() {
        return menu;
    }

    public int getTables() {
        return tables;
    }

    public double getSquare() {
        return square;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public String getName() {
        return name;
    }
}






