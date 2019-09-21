package homework.hw12;

public class SystemBlock {

    private String brand;
    private String color;
    private int year;
    private double height;
    private String[] ports;


    public SystemBlock(String brand,String col,int yr,double height,String[] ports){
        this.brand=brand;
        this.color=col;
        this.year=yr;
        this.height=height;
        this.ports=ports;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getHeight() {
        return height;
    }

    public String[] getPorts() {
        return ports;
    }

    public void printSystemBlock(){
        System.out.print("brand: "+ brand+"  year: "+year+"\ncolor: "+color+"  height: "+height+"\nports: ");
        for (String port:ports){
            System.out.print(port+"  ");
        }
         System.out.println("   ");




    }
}
