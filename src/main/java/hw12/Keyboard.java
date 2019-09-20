package hw12;

public class Keyboard {
    private String keyboardType;
    private String keyboardModel;
    private PCColor pccolor;

    public Keyboard(String kbtype, String kbmodel, PCColor color){
        this.keyboardType=kbtype;
        this.keyboardModel=kbmodel;
        this.pccolor=color;
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public String getKeyboardModel() {
        return keyboardModel;
    }

    public PCColor getPccolor() {
        return pccolor;
    }
    public void printKeyboard(){
        System.out.println(keyboardModel+" "+keyboardType+" "+pccolor);
    }
}
