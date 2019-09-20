package homework12;

public class Work {
    public static void main(String[] args) {
        Monitor Samsung = new Monitor ("Samsung", 17, 200);
        Keyboard keyboardHP = new Keyboard("wireless", "HP", "black",15);
        Mouse mouseHP = new Mouse ("wireless","HP","black", 25);
        Computer myComp = new Computer(Samsung, keyboardHP, mouseHP);
        Samsung.setMonitorPrice(300);
        myComp.computerInfo();
        System.out.println("My computer prise is: ");
        System.out.println(Samsung.getMonitorPrice()+mouseHP.getMousePrice()+keyboardHP.getKeyboardPrice());

    }
}
