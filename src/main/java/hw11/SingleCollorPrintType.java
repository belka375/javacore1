package hw11;

public class SingleCollorPrintType {
    private String typeName;
    private int minimumOrder;
    private int[] maxSize;
    private OffsetCollors colorInUse;


    public SingleCollorPrintType(String typeName, int minimumOrder, int[] maxSize, OffsetCollors colorInUse) {
        this.typeName = typeName;
        this.minimumOrder = minimumOrder;
        this.maxSize = maxSize;
        this.colorInUse = colorInUse;
    }

    public void printClass(){
        System.out.println("  ");
        System.out.println("Print Type = "+typeName+", Minimum Order "+minimumOrder);
        System.out.print("Max Size ");
        for (int i:maxSize) {
            System.out.print(i+", ");
        }
        System.out.println("Collor In Use = "+colorInUse);
    }

}