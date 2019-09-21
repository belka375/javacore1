package hw12yp;

public class Work {
    public static void main (String []args){

       Keyboard kb1 = new Keyboard("Dell","black", 2300056);
       Mouse m1 = new Mouse("Logitech","blue", true, 36);
       SystemBlock sb1 = new SystemBlock("Acer");
       Monitor mon1 = new Monitor("Dell",27, "black", 203455);
       Monitor mon2 = new Monitor("Sony", 34, "white", 400069);
       Computer comp1 = new Computer(kb1, mon1, m1, sb1);

       comp1.printInfo();
    }

}
