package hw12;

public class Kishki {
    private String cpu;
    private String motherBoard;
    private String memory;
    private String hdd;
    private String videoCard;
    private String powerUnit;

    public Kishki(String cpu, String motherBoard, String memory, String hdd, String videoCard, String powerUnit){
        this.cpu=cpu;
        this.motherBoard=motherBoard;
        this.memory=memory;
        this.hdd=hdd;
        this.videoCard=videoCard;
        this.powerUnit=powerUnit;
    }

    public void printClass(Kishki kishki){
        System.out.println("CPU — "+cpu+", Mother Board — "+motherBoard+", Memory — "+memory+", HDD —"+hdd+"Video Card — "+videoCard+", Power Unit — "+powerUnit);
    }
}
