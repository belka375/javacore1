package hw12;

public class MotherBoard {
    private String brand;
    private int memory;
    private String [] intCards;

    public MotherBoard(String brand, int memory, String[] intCards){
        this.brand=brand;
        this.memory=memory;
        this.intCards=intCards;

    }

    public String getBrand() {
        return brand;
    }

    public int getMemory() {
        return memory;
    }

    public String[] getIntCards() {
        return intCards;
    }

    public void printNotherBoardInfo(){
        System.out.println("MB brand -  "+brand+" MB mamory is "+ memory);
        for(String inc:intCards){
            System.out.println(inc);

        }
    }


}
