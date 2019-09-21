package homework.hw12;

public class MonitorN {
    private String brand;
    private String color;
    private double diagonal;
    private int year;

    public MonitorN(String brand,String col,double diag,int yr){
        this.brand=brand;
        this.color=col;
        this.diagonal=diag;
        this.year=yr;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public int getYear() {
        return year;
    }

    public void printMonitorN(){
        System.out.print("brand: "+brand+"  year:  "+year+"\ndiagonal: "+diagonal+"  color: "+color);
        System.out.println("  ");
    }


}
