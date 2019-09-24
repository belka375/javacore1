package homeWork14;

public class BaseIngredients {
    protected String batter;
    protected String sugar;
    protected String milk;
    protected String flour;

    public BaseIngredients(String batter, String sugar, String milk, String flour){
        this.batter = batter;
        this.flour = flour;
        this.milk = milk;
        this.sugar = sugar;
    }

    public String getBatter() {
        return batter;
    }

    public String getFlour() {
        return flour;
    }

    public String getMilk() {
        return milk;
    }

    public String getSugar() {
        return sugar;
    }
    public void printBase(){
        System.out.println(batter+", "+sugar+", "+milk+", "+flour);
    }
}
