package hw12;

public class Work {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor();
        Monitor monitor2 = new Monitor();

        Keyboard keyboard = new Keyboard();

        Mouse mouse1 = new Mouse();
        Mouse mouse2 = new Mouse();

        SystemBlock systemBlock = new SystemBlock();

        Computer computer1 = new Computer("LG 24.0","Apple keyboard", "magic mouse", "Mac Mini");
        Computer computer2 = new Computer("HP 27.0", "Logitech keyboard", "HP mouse", "SB");

        computer1.printInfo();
        computer2.printInfo();
    }
}
