package homeWork14;

public class ChocolateCake extends BaseIngredients {
    private String chocolate;
    private String blueberry;
    private String strawberry;

    public ChocolateCake(String batter, String sugar, String milk, String flour, String chocolate, String blueberry, String strawberry){
        super(batter, sugar, milk, flour);
        this.blueberry = blueberry;
        this.chocolate = chocolate;
        this.strawberry = strawberry;
    }

    public String getBlueberry() {
        return blueberry;
    }

    public String getChocolate() {
        return chocolate;
    }

    public String getStrawberry() {
        return strawberry;
    }
    public void printChoco(){
        System.out.println("My favorite Chocolate Cake contains: ");
        printBase();
        System.out.println(chocolate+", "+blueberry+", "+strawberry);
    }
}
