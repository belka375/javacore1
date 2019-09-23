package hw12;

public class SystemBlock {
    private Brand sysBrand;
    private Color sysColor;
    private ProcessorType sysPT;

    public SystemBlock(Brand brandS, Color colorS,  ProcessorType procT){
        this.sysBrand = brandS;
        this.sysColor = colorS;
        this.sysPT = procT;
    }

    public void sysDescription() {
        System.out.println("System Block: " + "\n\tBrand: " + sysBrand + "\n\tColor: " + sysColor + "\n\tProcessor: " + sysPT + "\n");
    }
}
