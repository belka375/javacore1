package hw15;

public class MetalBeam implements ProtoElement {
    private String nameOfElement;
    private int length;
    private int height;
    private int width;
    private int brinellHardnes;
    private double density;

    public MetalBeam(String nameOfElement, int length, int height, int width, int brinellHardnes, double density) {
        this.nameOfElement = nameOfElement;
        this.length = length;
        this.height = height;
        this.width = width;
        this.brinellHardnes = brinellHardnes;
        this.density = density;
    }

    public int volume() {
        int v=length*height*width;
        return v;
    }


    @Override
    public void getInfo() {
        System.out.println(nameOfElement+" volume = "+volume()+", Lb per foot = "+lbft());
    }

    public double lbft(){
        double lbft=height*width*density;
        return lbft;
    }

}
