package hw12;

public class SystemBlock {
    private Color color;
    private MotherBoard motherBoard;

    public SystemBlock(Color color, MotherBoard motherBoard){
        this.motherBoard=motherBoard;
        this.color=color;
    }


    public Color getColor() {
        return color;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void systemBlockPrintInfo(){
        System.out.println("SystemBlock color is - "+color);
        motherBoard.printNotherBoardInfo();
    }

}
