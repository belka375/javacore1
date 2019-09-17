package hw10;

//Atributes
public class Stroller {
    private  String brand;
    private  String model;
    private int year;
    private double weight;
    private String[] accesoriesIncluded;
    private boolean isForNewborn;

    //Constructor default
    public Stroller(){
    }

    //constructor  full
    public Stroller(String brand,  String  model,   int year,  double  weight, String[]accesoriesIncluded,  boolean isForNewborn){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.weight=weight;
        this.accesoriesIncluded=accesoriesIncluded;
        this.isForNewborn=isForNewborn;
    }

    //setters
    public void setBrand(String  brand){
        this.brand=brand;
    }
    public void  setModel(String model){
        this.model=model;
    }
    public void   setYear(int  year){
        this.year=year;
    }
    public void setWeight(double weight){
        this .weight=weight;
    }
    public void  setAccesoriesIncluded(String[]accesoriesIncluded){
        this.accesoriesIncluded=accesoriesIncluded;
    }
    public void setForNewborn(boolean isForNewborn){
        this.isForNewborn=isForNewborn;
    }

    //getters
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public  int getYear(){
        return year;
    }
    public String[] getAccesoriesIncluded(){
        return accesoriesIncluded;
    }

    //print
    public void printStrollerInfo(){
        System.out.println(brand+" "+model+" \nYear: "+year+" \nWeight: "+weight+"lbs");
        System.out.print("Accessories  included: ");
        for (String accessory:accesoriesIncluded) {
            System.out.print(accessory+", ");

        }
        if(isForNewborn){
            System.out.println("\nAcceptable for  newborns");
        }else{
            System.out.println("\nFor babies from 6 months");
        }

    }

}
