package homework.hw9;

public class CellPhone {


    private String brand;
    private String color;
    private int year;
    private double length;
    private double width;
    private double price;
    private boolean isNew;
    private boolean isOnSale;

    public void setBrand(String brand){this.brand=brand;}
    public void setColor(String color){this.color=color;}
    public void setYear(int year){this.year=year;}
    public void setLength(double length){this.length=length;}
    public void setWidth(double width){this.width=width;}
    public void setIsNew(boolean isNew){this.isNew=isNew;}
    public void setIsOnSale(boolean isOnSale){this.isOnSale=isOnSale;}




    public void isOnSale(){
        if (isOnSale=true)
        {System.out.println("On Sale");
        }else{System.out.println("no");}
    }

    private void printDimentions(){System.out.println("width "+width+";\nlength "+length);}

    private void printPhoneInfo(){System.out.println("brand "+brand+";\n;year "+year+";\nprice "+price);}

    private void playMusic(){System.out.println("Music is ON");}

    }
