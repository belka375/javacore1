package lesson12;

public class WorkClass {
    public static void main(String[] args) {
       Mouse mo = new Mouse( "red", "Lenovo", "brand new");
       Mouse m= new Mouse("black", "Asus", "preowned");



        Mouse[] ch =new Mouse[]{m, mo};

        Keyboard ke=new Keyboard();
                ke.setColor("blue");
                ke.setBrand("Asus");

        Keyboard key=new Keyboard();
        key.setColor("grey");
        key.setBrand("LG");
        key.setCharacteristics("great");





        SystemBlock sb =new SystemBlock("Asus", "Silver");
        Monitor mon = new Monitor("Asus", "beautiful");

        Computer mine = new Computer(key, mon, ch, sb);
        mine.printComputer();
    }
}