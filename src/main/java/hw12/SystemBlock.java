package hw12;

public class SystemBlock {
    private String processorBrand;
    private double pcMemorySize;
    private double hdMemorySize;
    private String hdMemoryType;

    public SystemBlock(String cpu, double pcmemsize, double hmemsize, String mtype){
        this.processorBrand=cpu;
        this.pcMemorySize=pcmemsize;
        this.hdMemorySize=hmemsize;
        this.hdMemoryType=mtype;
    }

    public String getProcessorBrand() {
        return processorBrand;
    }

    public double getHdMemorySize() {
        return hdMemorySize;
    }

    public double getPcMemorySize() {
        return pcMemorySize;
    }

    public String getHdMemoryType() {
        return hdMemoryType;
    }
    public void printSystenBlock(){
        System.out.println(processorBrand+" "+pcMemorySize+" "+hdMemoryType+" "+hdMemorySize);
    }
}
