package hw12byTanik;

public class Work12 {

   public static void main(String[] args) {

       Keyboard keyboard1 = new Keyboard("Russian", 20);
       Monitor monitor1 = new Monitor("Dell", 15);
       Mouse mouse1 = new Mouse("Model super", "black", 5, 3);
       SystemBlock systemBlock1 = new SystemBlock("Processor Number 1", "Super PU", "Best HD");
       Computer comp1 = new Computer(keyboard1, monitor1, mouse1, systemBlock1);

       System.out.println("Object 1 ---> Computer 1");
       comp1.printComputer();

       Keyboard keyboard2 = new Keyboard("English", 28);
       Monitor monitor2 = new Monitor("Samsung", 20);
       Mouse mouse2 = new Mouse("Model duper", "white", 6, 4);
       SystemBlock systemBlock2 = new SystemBlock("Processor Number 2", "Duper PU", "Good HD");
       Computer comp2 = new Computer(keyboard2, monitor2, mouse2, systemBlock2);

       System.out.println("Object 2 ---> Computer 2");
       comp2.printComputer();
   }
}
