package hw12;

public class Work {
    public static void main (String [] args){

        Keyboard keyboard1 = new Keyboard("English", 15);
        Monitor monitor1 = new Monitor("MacBook", 15);
        Mouse mouse1= new Mouse("Apple", "white", 4, 5);
        SystemBlock systemBlock1 = new SystemBlock("Processor1", "Intel core", "Laptop HD");

        Computer comp1 = new Computer(keyboard1, monitor1, mouse1, systemBlock1);

        System.out.println("Object 1");
        comp1.printComputer();

        Keyboard keyboard2 = new Keyboard("English", 15);
        Monitor monitor2 = new Monitor("HP", 19);
        Mouse mouse2 = new Mouse("", "black", 5, 4);
        SystemBlock systemBlock2 = new SystemBlock("Processor2", "Corsair", "PC HD");

        Computer comp2 = new Computer(keyboard2, monitor2, mouse2, systemBlock2);


        System.out.println("Object 2");
        comp2.printComputer();
    }



    }

