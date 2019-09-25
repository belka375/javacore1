package hw13;

public class Dish {
    public String dish;
    private String souce;

    public Dish(String dish, String souce){
        this.dish=dish;
        this.souce=souce;
    }

    public String getDish() {
        return dish;
    }

    public String getSouce() {
        return souce;
    }
}

