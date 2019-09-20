package workHw12;

public class Mouse{
    private MColor color;
    private boolean wired;
    private boolean laser;

    //constructor
    public Mouse (MColor col, boolean wired, boolean laser){
        color = col;
        this.wired =  wired;
        this.laser = laser;
    }

    public MColor getColor() {
        return color;
    }



}
