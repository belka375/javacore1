package homeWork14;

public class CheeseCake extends BaseIngredients {
    private String cheese;
    private String cream;
    private String cinnamon;

    public CheeseCake(String batter, String sugar, String milk, String flour,String cheese, String cream, String cinnamon){
        super(batter, sugar,  milk, flour);
        this.cheese = cheese;
        this.cream = cream;
        this.cinnamon = cinnamon;
    }

    public String getCheese() {
        return cheese;
    }

    public String getCream() {
        return cream;
    }

    public String getCinnamon() {
        return cinnamon;
    }
    public void printCheeseCake(){
        System.out.println("My favorite Cheese Cake contains: ");
        printBase();
        System.out.println(cheese+", "+cream+", "+cinnamon);
    }
}
