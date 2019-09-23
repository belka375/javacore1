package hw11;

public class Toaster {
    private String brand;
    private String type;
    private int price;
    private HeatLevel heatLevel;;



    public Toaster( String brand, String type,int price, HeatLevel heatLevel ){
        this.brand = brand;
        this.type = type;
        this.price=price;
        this.heatLevel=heatLevel;
    }

    public Toaster() {

    }

    public void setBrand (String b){
        this.brand =b;

    }
    public void setType(String t){
        this.type = t;

    }
    public void setPrice (int p){
        this.price=p;

    }
    public void setHeatLevel(HeatLevel h){
        this.heatLevel = h;
    }
    public String getBrand(){
        return brand;

    }
    public String getType(String stainless_steel){
        return type;
    }
    public HeatLevel getHeatLevel(){
        return heatLevel;
    }

    public int getPrice() {
        return price;
    }
    public void printToasterInfo(){
        System.out.println(""+brand+", "+type+","+price+" dollars,"+heatLevel+".");
    }
}