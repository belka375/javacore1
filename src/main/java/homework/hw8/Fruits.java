package homework.hw8;

public class Fruits {
    public String name;
    public String color;
    public int quantity;
    public int year;
    public double weight;
    public double radius;
    public boolean isRipe;
    public boolean isTasty;

    public void grow(){
        System.out.println("normal size");}
    public void printPhysicalDescription(){
        System.out.println("Physical description:\ncolor: "+color+" \nradius: "+radius+ " \nweight: "+weight);}
    public void smell() {
        if (isRipe = true) {
            System.out.println("Fragrant");
        } else {
            System.out.println("no smell");
        }
    }

    public void taste() {
        if (isTasty = true) {
            System.out.println("The taste is good");
        }else{
            System.out.println("The taste is sour");}
    }


}
