package hw12;

public class Mouse {
    private Color color;
    private boolean wireles;
    public Mouse(Color color, boolean wireles){
        this.color=color;
        this.wireles=wireles;
    }

    public Color getColor() {
        return color;
    }
    public void printMouseInfo(){
       System.out.println("color of mouse - "+ color+"\n this mous is wireless - "+ wireles);
    }
}
