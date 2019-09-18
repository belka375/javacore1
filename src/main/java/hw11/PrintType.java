package hw11;

public class PrintType {
    private String typeName;
    private int minimumOrder;
    private int[] maxSize;
    private  OffsetCollors[] colorsUsed;


    public PrintType (String typeName, int minimumOrder, int[] maxSize, OffsetCollors[] colorsUsed){
        this.typeName=typeName;
        this.minimumOrder=minimumOrder;
        this.maxSize=maxSize;
        this.colorsUsed=colorsUsed;
    }

    public void printClass(){
        System.out.println("Print Type = "+typeName+", Minimum Order "+minimumOrder);
        System.out.print("Max Size ");
        for (int i:maxSize) {
            System.out.print(i+", ");
        }
        System.out.println(" ");
        System.out.print("Color Used ");
        for (OffsetCollors j:colorsUsed) {
            System.out.print(j+", ");
        }
    }
}
