package homeWork12;

public class HomeWork12 {
    public static void main(String[] args) {



        Monitor monitor = new Monitor("Samsung", "Black", 17, 150.50);
        Keyboard keyboard = new Keyboard("Assus", "Black", "Wireless", 32.42);
        Mouse mouse = new Mouse("Assus", "Black", "wireless", 28.25);
        SystemBlock sb = new SystemBlock("Norway", "Black", 140.25);

        Mouse mouse1=new Mouse("Dell", "black", "Wire", 13.8);
        Monitor monitor1 = new Monitor("POLALION", "Black", 24, 220.5);
        Keyboard keyboard1 = new Keyboard("ViewSonic", "Black", "Wire", 35);
        SystemBlock sb1 = new SystemBlock("Hannywell", "Black", 130);

        Mouse mouse2=new Mouse("Dell", "Wight", "Wireless", 15.8);
        Monitor monitor2 = new Monitor("ViewSonic", "Wight", 24, 225.5);
        Keyboard keyboard2 = new Keyboard("ViewSonic", "Wight", "Wireless", 38);
        SystemBlock sb2 = new SystemBlock("Hannywell", "Wight", 120);


        Computer myComp = new Computer("Tatyana Kotova", keyboard,mouse, monitor, sb);
        Computer baurComp = new Computer("Baurzhan", keyboard1, mouse1, monitor1, sb1);
        Computer bikaComp = new Computer("Beybit", keyboard2, mouse2, monitor2, sb2);

        myComp.printComputer();
        System.out.println("=========================================");
        baurComp.printComputer();
        System.out.println("=========================================");
        bikaComp.printComputer();



    }
}
