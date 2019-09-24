package homeWork14;

public class SystemBlock extends Super {
    private String os;
    private String processor;
    private String[] ports;
    private Storage storage;

    public SystemBlock (String brand, String model, Color color, double size, double weight, double warranty, String os,
                        String processor,String[] ports, Storage storage){
        super(brand, model, color, size,weight,warranty);
        this.os=os;
        this.processor=processor;
        this.ports=ports;
        this. storage=storage;
    }

    public String getOs() {
        return os;
    }

    public String getProcessor() {
        return processor;
    }

    public String[] getPorts() {
        return ports;
    }

    public Storage getStorage() {
        return storage;
    }
    public void printSystemBlock(){
        printSuper();
        System.out.println(os+"\n"+ processor);
        storage.printStorage();
        for (String port:ports) {
            System.out.println(port);

        }

    }
}