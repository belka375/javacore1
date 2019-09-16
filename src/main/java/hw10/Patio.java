package hw10;

public class Patio {
    private String patioNumber;
    private String type;
    public boolean isSunny;
    private String patioSurface;
    private int[] dimensions;

    public Patio(){}
    public Patio(String patioNumber, String type, boolean sunny, String patioSurface, int[] dimensions){
        this.patioNumber=patioNumber;
        this.type=type;
        isSunny=sunny;
        this.patioSurface=patioSurface;
        this.dimensions=dimensions;
    }

    public void setPatioNumber(String patioNumber) {
        this.patioNumber = patioNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPatioSurface(String patioSurface) {
        this.patioSurface = patioSurface;
    }

    public void setDimensions(int[] dimensions) {
        this.dimensions = dimensions;
    }

    public String getPatioNumber() {
        return patioNumber;
    }

    public String getType() {
        return type;
    }

    public String getPatioSurface() {
        return patioSurface;
    }

    public int[] getDimensions() {
        return dimensions;
    }

    public void printPatioInfo(){
        System.out.println("*************");
        System.out.println(patioNumber+"\nType is "+type+"\nSurface from: "+patioSurface+"\nDimensions in inches: length="+dimensions[0]+" width="+dimensions[1]);
    }
}
