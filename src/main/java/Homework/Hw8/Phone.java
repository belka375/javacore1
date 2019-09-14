package Homework.Hw8;

public class Phone {
    public String brand;
    public String color;
    public int year;
    public int width;
    public double length;
    public double price;
    public boolean isNew;
    public boolean onSale;

    public void printDimentions(){System.out.println("width "+width+";\nlength "+length);};

    public void printPhoneInfo(){
        System.out.println("brand "+brand+";\n;year "+year+";\nprice "+price);};

    public void playMusic(){ System.out.println("Music is ON");};
}
