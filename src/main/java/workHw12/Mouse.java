package workHw12;

public class Mouse{
    private MColor color ;
    public boolean wired;
    public boolean laser;

    //constructor
    public Mouse (MColor col, boolean wired, boolean laser){
        color = col;
        this.wired =  wired;
        this.laser = laser;
    }

    public MColor getColor() {
        return color;
    }

    public boolean isWired() {
        return wired;
    }

    public boolean isLaser() {
        return laser;
    }

    public void printMouse(){
        System.out.println( "Mouse is  wired: "+   wired);
        System.out.println( "Mouse is laser: " + laser);
        System.out.println( "Mouse color : " +   color);
    }

}
