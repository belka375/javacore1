package Homew10;

public class Box {
    private String model;
    private String material;
    private int size;
    private int[] volume;

    public Box(){}

    public Box(String model, String material, int size, int[] volume){
        this.model=model;
        this.material=material;
        this.volume=volume;
        this.size=size;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setVolume(int[] volume) {

    this.volume=volume;
        }


    public String getModel(){return model;}
    public String getMaaterial(){return material;}
    public int getSize(){return size;}
    public int[] getVolume(){return volume;}

    public void printClass(){
        System.out.println("Best choice = "+model+"; material = "+material+"; volume = "+volume);
        System.out.print("Your order =");
        for (int i:volume) {
            System.out.print(i+", ");
        }
        System.out.println("   ");
    }



}
