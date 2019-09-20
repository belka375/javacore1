package homeWork_12;

public class SystemBlock {
    private int ram;
    private double hd;
    private double processor;
    private String brand;

    public SystemBlock(String brand, int ram, double processor, double hd) {
        this.brand = brand;
        this.ram = ram;
        this.processor = processor;
        this.hd = hd;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public double getProcessor() {
        return processor;
    }

    public double getHd() {
        return hd;
    }

    public void printSystemBlockInfo() {
        System.out.println("System block component (Brand/RAM/Processor/HardDrive - " + brand + "/" + ram + "GB/" + processor + "GHz/" + hd + "GB");
    }
}
