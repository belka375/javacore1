package HW10;

public class Carpet {
    private String name;
    private int[] dimensions;
    private String material;

    public Carpet(){}

    public Carpet(String name, int[] dimensions, String material){
        this.name=name;
        this.dimensions=dimensions;
        this.material=material;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDimensions(int[] dimensions) {
        if (dimensions.length!=2){
            System.out.println("Dementions for "+name+" not right");
        }
        this.dimensions = dimensions;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public int[] getDimensions() {
        return dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public void printClass(){
        System.out.println("Carpet "+name+" made of "+material+", size "+dimensions[0]+" buy "+dimensions[1]);
    }
}
