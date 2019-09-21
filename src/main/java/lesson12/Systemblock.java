package lesson12;

public class SystemBlock {
    private String brand;
    private String operatingSystem;
    private String memoryRam;

    public SystemBlock(String brand, String os, String ram){
        this.brand=brand;
        this.operatingSystem=os;
        this.memoryRam=ram;
    }

    public String getBrand() {
        return brand;
    }

    public String getMemoryRam() {
        return memoryRam;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void printSystemBlockInfo(){
        System.out.println("System block: "+brand+" "+operatingSystem+" "+memoryRam);
    }
}
