package hw12;

public class Work {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("HP", 24.0);
        Monitor monitor2 = new Monitor("Acer", 27.0);

        Keyboard keyboard = new Keyboard("silver","Apple");

        Mouse mouse1 = new Mouse("white","Magic mouse");
        Mouse mouse2 = new Mouse("black", "Optical mouse");

        SystemBlock systemBlock = new SystemBlock("Red");

        Computer computer1 = new Computer(monitor1,keyboard,mouse1,systemBlock);
        Computer computer2 = new Computer(monitor2,keyboard,mouse2,systemBlock);


        System.out.println(computer1);
        System.out.println(computer2);
    }
}
