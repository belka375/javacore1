package hw13;

public class Menu {

    private Dish dish;
    private String drink;
    private String desert;

    public Menu(Dish dish, String drink, String desert){
        this.dish=dish;
        this.drink=drink;
        this.desert=desert;
    }

    public Dish getDish() {
        return dish;
    }

    public String getDesert() {
        return desert;
    }

    public String getDrink() {
        return drink;
    }
}


