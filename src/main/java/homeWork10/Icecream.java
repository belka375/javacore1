package homeWork10;

public class Icecream {
    private String name;
    private double weight;
    private String[] ingredients;
    private String color;
    private int price;

    //====================default constructor==============
    public Icecream(){};
    //=============================constructor1 ====================

    public Icecream(String name, int price){
        this.name = name;
        this.price = price;
    }

//==============constructor 2 ========================
    public Icecream(String name, double weight, String[] ingredients, String color, int price){
        this.color =color;
        this.ingredients = ingredients;
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public void printIngredients(){
        for(String ingredients : ingredients){
            System.out.println("\n It contains " + ingredients+" ");
        }
    }

    public void printIceCream(){
        System.out.println("My favorite Ice Cream is "+ name +";\nIts weight is "+weight +"gr" + ";\nColor is  "+color
                + ";\nAnd I pay not too match Its price only : "+price+"$");for(String ingr: ingredients){
                    System.out.println("It contains " +ingr + " ");
        }
    }
    //==========================setter=====================

    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
//============getter=======================================

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public double getWeight() {
        return weight;
    }
    public String getColor() {
        return color;
    }
    public String[] getIngredients() {
        return ingredients;
    }
}
