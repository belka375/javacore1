package lesson12;

public class Homework {
    public static void main(String[] args) {


        Keyboard k = new Keyboard(12, Colors.BLACK, "Plastic");
        Mouse mouse = new Mouse(Colors.RED);
        Monitor mon = new Monitor("Acer", 12.0, 8);
        SystemBlock sb = new SystemBlock(25, "Dell", 8);

        Computer myDell = new Computer(k, mon, mouse, sb);

        Keyboard kb = new Keyboard(15, Colors.BROWN, "Silicon");
        Mouse ms = new Mouse(Colors.WHITE);
        Monitor mnt = new Monitor("Dell", 14.0, 27);
        SystemBlock sblck = new SystemBlock(24, "Dell", 10);

        Computer dell2 = new Computer(kb, mnt, ms, sblck);


    }
}
