package hw10;

public class Apple {
    private String model;
    private String version;
    private int[] memory;

    public Apple() {
    }
    public Apple(String model, String version, int[] memory) {
        this.model = model;
        this.version = version;
        this.memory = memory;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setVersion(String ver) {
        this.version = ver;
    }
    public void setMemory(int memo) {
        this.memory = memory;
    }
    public String getModel() {
        return model;
    }
    public String getVersion() {
        return version;
    }
    public int[] getMemory() {
        return memory;
    }
    public void appleInfo() {
        System.out.println(model + " " + version + " " + memory);
        for (int memo : memory) {
            System.out.println(memo);
        }
    }
}
