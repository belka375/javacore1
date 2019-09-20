package hw12;

public class Box {
    private int cpu;
    private int memory;
    private int discSpace;

    public Box (int cpu, int memory, int discSpace){
        this.cpu=cpu;
        this.memory=memory;
        this.discSpace=discSpace;
    }

    public int getCpu() {
        return cpu;
    }

    public int getMemory() {
        return memory;
    }

    public int getDiscSpace() {
        return discSpace;
    }

    public void printBoxInfo(){
        System.out.println("Box has: "+cpu+" cores"+"\nMemory: "+memory+" GB"+"\nDisk space: "+discSpace+" GB");
    }
}
