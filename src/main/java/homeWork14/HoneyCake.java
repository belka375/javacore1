package homeWork14;

public class HoneyCake extends BaseIngredients{
    private String honey;
    private String banana;
    private String soda;

    public HoneyCake(String batter, String sugar, String milk, String flour, String honey, String banana, String soda){
        super(batter, sugar, milk, flour);
        this.banana = banana;
        this.honey = honey;
        this.soda = soda;
    }

    public String getHoney() {
        return honey;
    }

    public String getBanana() {
        return banana;
    }

    public String getSoda() {
        return soda;
    }
    public void printHoney(){
        System.out.println("My favorite Honey Cake contains: ");
        printBase();
        System.out.println(honey+" "+banana+", "+soda);
    }
}
