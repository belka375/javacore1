package lesson12;

public class Homework {
    public static void main(String[] args) {


        Keyboard k = new Keyboard(10, Colors.BLACK, "Plastic");
        Mouse mouse = new Mouse(Colors.WHITE);
        Monitor mon = new Monitor("Samsung", 12.0, 12);
        SystemBlock sb = new SystemBlock(32, "Philips", 12);

        Computer myDell = new Computer(k, mon, mouse, sb);

        Keyboard kb = new Keyboard(19, Colors.BLACK, "Metal");
        Mouse ms = new Mouse(Colors.GREEN);
        Monitor mnt;
        mnt = new Monitor("Apple", 14.0, 27);
        SystemBlock sblck = new SystemBlock(24, "Dell", 10);

        Computer dell2 = new Computer(kb, mnt, ms, sblck);


    }
}
