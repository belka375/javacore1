package hw11;

public class Mascara {
    private String brand;
    private Benefit benefit;
    private String name;
    private Color color;
    private double size;
    private int price;
    private boolean isWaterproof;
    private Ingredients[] ingredients;

    public Mascara(String brand, String name, Benefit benefit, Color color, double size, int price, boolean isWaterproof, Ingredients[] ingredients){
        this.brand=brand;
        this.name=name;
        this.benefit=benefit;
        this.color=color;
        this.size=size;
        this.price=price;
        this.isWaterproof=isWaterproof;
        this.ingredients=ingredients;

    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public double getSize() {
        return size;
    }

    public Benefit getBenefit() {
        return benefit;
    }

    public Color getColor() {
        return color;
    }

    public Ingredients[] getIngredients() {
        return ingredients;
    }

    public void printMascaraInfo(){
        System.out.println(name+" "+brand+", "+size+" oz \nColor:  "+color+"\nBenefit: "+benefit);
        for (Ingredients ingredient:ingredients) {
            System.out.print("Ingredients: "+ingredient+", ");
        }
        if (isWaterproof){
            System.out.println("\nWaterproof");
        }else{
            System.out.println("\nLong lasting");
        }
    }
}
