package homework.hw12;

public class Mouse {
    private String brand;
    private int year;
    private String[] type;


    public Mouse(String brand,int yr,String[] type) {
        this.brand = brand;
        this.year = yr;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public String[] getType() {
        return type;
    }

    public void printMouse(){
        System.out.print("brand: "+brand+"  year: "+year+"\ntype: ");
        for (String t:type){
            System.out.println(t);
        }
    }
}
