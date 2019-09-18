package hw10;

public class Apple {
    private String model;
    private String version;
    private String memory;

    public Apple(){
    }
    public Apple(String model, String version, String memory){
        this.model=model;
        this.version=version;
        this.memory=memory;
    }
    public void setModel(String model) {
        this.model=model;
    }
    public void setVersion(String ver) {
        version=ver;
    }
    public void setMemory(String memo) {
        memory=memo;
    }
    public String getModel() {
        return model;
    }
    public String getVersion() {
        return version;
    }
    public String getMemory() {
        return memory;
    }
    public void appleInfo(){
        System.out.println(model+" "+version+" "+memory);
    }
}
