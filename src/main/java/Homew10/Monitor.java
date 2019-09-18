package Homew10;

public class Monitor {
    private String name;
    private int[] brightness;
    private double diagonal;

    public Monitor(){}

    public Monitor(String name, int[] brightness, double diagonal ){
        this.name = name;
        this.brightness = brightness;
        this. diagonal= diagonal;
    }

    public void setName(String name){this.name=name;}
    public void setBrightness(int[] brightness){this.brightness=brightness;}
    public void setDiagonal(double diagonal){this.diagonal=diagonal;}

    public String getName(){return name;}
    public int[] getBrightness(){return diagonal;}
    public double getDiagonal(){return diagonal;}

    public void printClass(){
        System.out.println("Name = "+name+"; Diagonal = "+diagonal);
        System.out.print("Oxidation States = ");
        for (int i:brightness) {System.out.print(i+", ");}
        System.out.println("  ");
    }
}

