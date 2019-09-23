package homeWork12;

public class SystemBlock {

    private Brand brand;
    private Color color;
    private String processor;
    private String [] memory;

    public SystemBlock( Brand brand, Color color, String processor, String[] memory){
        this.brand=brand;
        this.color=color;
        this.memory=memory;
        this.processor=processor;

    }

    public Color getColor() {
        return color;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getProcessor() {
        return processor;
    }

    public String[] getMemory() {
        return memory;
    }
    public  void printSysBlock(){
        System.out.print( brand+"\n"+ color+ "\nProcessor- "+processor+ "\nMemory/Storage" +"\n");
        for (String mem : memory) {
            System.out.println(mem);

        }
    }
}
