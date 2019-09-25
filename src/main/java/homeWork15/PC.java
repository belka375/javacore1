package homeWork15;

public class PC implements Print {

    protected String name;
    protected String os;
    protected String processor;

    public PC(String name, String os, String processor) {
        this.name = name;
        this.os = os;
        this.processor = processor;
    }
    public void printInfo(){
        System.out.println(name+", "+os+", "+processor);
    }
}
