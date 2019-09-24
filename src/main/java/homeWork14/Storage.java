package homeWork14;

public class Storage {
    private String memory;
    private String storage_ssd;
    private String storage_hdd;
    private String gpu;

    public Storage(String memory, String ssd, String hdd, String gpu){
        this.memory=memory;
        this.storage_ssd=ssd;
        this.storage_hdd=hdd;
        this.gpu=gpu;
    }

    public String getGpu() {
        return gpu;
    }

    public String getMemory() {
        return memory;
    }

    public String getStorage_hdd() {
        return storage_hdd;
    }

    public String getStorage_ssd() {
        return storage_ssd;
    }
    public void printStorage(){
        System.out.println("RAM- "+memory+"; "+storage_ssd+"; "+storage_hdd+"\n"+gpu);
    }
}
