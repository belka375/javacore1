package hw12;

public class Keyboard {
    private String keyboardLetters;
    private int size;

    public Keyboard(String keyboardLetters, int size){
        this.keyboardLetters=keyboardLetters;
        this.size=size;
    }

    public void setButtonsAlphabet(String keyboardLetters) {
        this.keyboardLetters = keyboardLetters;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getButtonsAlphabet() {
        return keyboardLetters;
    }

    public int getSize() {
        return size;
    }

    public void printKeyboardInfo(){
        System.out.print("Keyboard letters: "+keyboardLetters+"; Keyboard size: "+size+";");
    }
}
