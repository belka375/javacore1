package hw12;

public class Mouse {
    private int buttonNumber;
    private MouseType mouseType;

    public Mouse (int buttonNumber, MouseType mouseType){
        this.buttonNumber=buttonNumber;
        this.mouseType=mouseType;
    }

    public int getButtonNumber() {
        return buttonNumber;
    }

    public MouseType getMouseType() {
        return mouseType;
    }

    public void printMouse(){

        System.out.println("Mouse has: "+buttonNumber+" buttons"+"\nMouse type: "+mouseType);
    }
}
