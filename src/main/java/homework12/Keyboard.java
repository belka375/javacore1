package homework12;


public class Keyboard {

    private String type;
    private String color;

    public Keyboard(String type, String color) {

        this.type=type;
        this.color=color;
    }


    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
    public void printKeyboardInfo(){
        System.out.println("This keyboard: " +type+ ", " +color);

    }


}

