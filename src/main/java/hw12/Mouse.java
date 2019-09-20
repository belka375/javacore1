package hw12;

public class Mouse {
    private String mouseModel;
    private String mouseType;
    private PCColor pcColor;

    public Mouse(String mModel, String mType, PCColor pcColor){
        this.mouseModel=mModel;
        this.mouseType=mType;
        this.pcColor=pcColor;
    }

    public String getMouseModel() {
        return mouseModel;
    }

    public String getMouseType() {
        return mouseType;
    }

    public PCColor getPcColor() {
        return pcColor;
    }
    public void printMouse(){
        System.out.println(mouseModel+" "+mouseType+" "+pcColor);
    }
}
