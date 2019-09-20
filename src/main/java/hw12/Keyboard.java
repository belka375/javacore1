package hw12;


public class Keyboard {
    private String language;
    private int keyNumber;
    private KeyboardType keyboardType;

    public Keyboard (String language, int keyNumber, KeyboardType keyboardType){
        this.language=language;
        this.keyNumber=keyNumber;
        this.keyboardType=keyboardType;
    }

    public String getLanguage() {
        return language;
    }

    public int getKeyNumber() {
        return keyNumber;
    }

    public KeyboardType getKeyboardType() {
        return keyboardType;
    }

    public void printKeyboardInfo(){
        System.out.println("Keyboard language: "+language+"\nNumber of keys: "+ keyNumber+"\nKeyboard type: "+keyboardType);
    }
}
