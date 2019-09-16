public class Furniture {
    private String type;
    private String[] colors;
    private double price;


    public Furniture () {

    }

    public Furniture (String type, String[] colors, double price) {

    }

    public void setType (String type) {
        this.type = type;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public String getType (){
        return type;
    }

    public String[] getColors () {
        return colors;
    }

    public double getPrice() {
        return price;
    }

    public void printFurniture () {
        System.out.println(type + " " + colors + " " +price);
    }

}
