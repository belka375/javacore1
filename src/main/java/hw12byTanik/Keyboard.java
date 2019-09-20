package hw12byTanik;

public class Keyboard {

    private String buttonsAlphabet;
    private int size;

    public Keyboard(String buttonsAlphabet, int size){
        this.buttonsAlphabet=buttonsAlphabet;
        this.size=size;
    }

    public void setButtonsAlphabet(String buttonsAlphabet) {
        this.buttonsAlphabet = buttonsAlphabet;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getButtonsAlphabet() {
        return buttonsAlphabet;
    }

    public int getSize() {
        return size;
    }

    public void printKeyboardInfo(){
        System.out.println("Keyboard buttons Alphabet: "+buttonsAlphabet+";\nKeyboard size: "+size+";");
    }
}
