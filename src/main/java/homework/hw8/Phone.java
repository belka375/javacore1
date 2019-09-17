package homework.hw8;

public class Phone {
    public String brand;
    public String color;
    public int year;
    public double width;
    public boolean isNew;
    public boolean onSale;
    public double length;
    public double price;

    public void printDimensions(){System.out.println("width "+width+";\nlength "+length);}

    public void printPhoneInfo(){
        System.out.println("brand "+brand+";\nyear "+year+";\nprice "+price);}

    public void playMusic(){System.out.println("Music is ON");}
}
