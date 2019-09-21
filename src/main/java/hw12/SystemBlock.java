package hw12;

public class SystemBlock {
    private String brandName;
    private String color;
    private String oS;
    private String graphics;
    private int hardDr;
    private int RAM;
    private  double processorSpeed;

    public SystemBlock(String brandName,String color,String oS,String graphics,int hardDr,int RAM,double processorSpeed){
        this.brandName=brandName;
        this.color=color;
        this.oS=oS;
        this.graphics=graphics;
        this.hardDr=hardDr;
        this.RAM=RAM;
        this.processorSpeed=processorSpeed;
    }

    public String getColor() {
        return color;
    }

    public String getBrandName() {
        return brandName;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public int getHardDr() {
        return hardDr;
    }

    public int getRAM() {
        return RAM;
    }

    public String getGraphics() {
        return graphics;
    }

    public void printSystemBlock(){
        System.out.println(brandName+" "+color+" "+oS+" "+graphics+" "+hardDr+" "+RAM+" "+processorSpeed);
    }
}
