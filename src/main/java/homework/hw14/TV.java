package homework.hw14;

public class TV extends Item{
    protected double displaySize;
    protected boolean isFlat;
    protected String color;

    public TV(String model,String brand,int yr,double price,Condition condition,boolean sale,double display, boolean isFlat,String col){
        super(model,brand,yr,price,condition,sale);
        this.displaySize=display;
        this.isFlat=isFlat;
        this.color=col;
    }


    public double getDisplaySize() {
        return displaySize;
    }

    public String getColor() {
        return color;
    }

    public void printTv(){
        printItem();
        System.out.println("display size: "+displaySize+"   color: "+color);
        if(isFlat==true) {
            System.out.println("screen: flat");
        }else{
            System.out.println("screen: curved");
                }
        System.out.println("  ");
           }
}
