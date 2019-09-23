package homeWork12;

public class Keyboard {

    private Color color;
    private String touchPad;
    private String [] language;
    private String  keyPad;
    private Brand brand;


    public Keyboard(Color color, String touchPad, String[] language, String keyPad, Brand brand){
        this.color=color;
        this.touchPad=touchPad;
        this.language=language;
        this.keyPad=keyPad;
        this.brand=brand;
    }

    public Color getColor() {
        return color;
    }

    public Brand getBrand() {
        return brand;
    }

    public String[] getLanguage() {
        return language;
    }

    public void printKeyBoard(){
        System.out.print("\nKeyboard " + brand+"\n"+color+ "\nTouchpad- "+touchPad+"\nKeypad- "+ keyPad+"\n");
        for (String lang:language) {
            System.out.print(lang);
        }
        System.out.print("\n");
    }

}
