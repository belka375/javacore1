package homework12;


public class SystemBlock {

    private int model;
    private int processor;
    private int motherboard;

    public SystemBlock(int model, int processor, int motherboard){
        this.model=model;
        this.processor=processor;
        this.motherboard=motherboard;
    }


    public int getModel() {
        return model;
    }

    public int getProcessor() {
        return processor;
    }

    public int getMotherboard() {
        return motherboard;
    }
    public void printSystemBlockInfo(){
        System.out.println("This System Block is " +model+ " "+processor+ " " +motherboard);
    }
}




