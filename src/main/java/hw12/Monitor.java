package hw12;

public class Monitor {
    private String model;
    private String brand;
    private int[] dimensions;
    private int refrashRate;

    public Monitor(String model, String brand, int[] dimensions, int refrashRate){
        this.model=model;
        this.brand=brand;
        this.dimensions=dimensions;
        this.refrashRate=refrashRate;
    }

    public void printClass(){
        System.out.println("Monitor - "+model+" by "+brand+" ( "+dimensions[0]+" X "+dimensions[1]+", refresh rate — "+refrashRate+" )");
    }
}
