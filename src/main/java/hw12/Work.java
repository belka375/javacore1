package hw12;

public class Work {
    public static void main(String[]args){

        Monitor acer=new Monitor("Acer,","Pink,",23.6,"LED,",10.8);
        Keyboard dell=new Keyboard("Dell,","Red,",105,"USB");
        Mouse samsung=new Mouse("Samsung,","Blue,","USB",1.1);
        SystemBlock hp=new SystemBlock("HP,","Dark Blue,","Windows10,","AMD Radeon RX,",2000,16,3.7);
        Computer HP=new Computer(hp,acer,dell,samsung);
        HP.printComputer();

        System.out.println("==============2computer2=============");

        Monitor mon=new Monitor("Samsung,","Black,",27.3,"LED,",12.1);
        Keyboard keyboard=new Keyboard("HP,","Black,",105,"Wireless.");
        Mouse mouse=new Mouse("Logitech,","Blue,","Wireless connection,",1.6);
        SystemBlock sb=new SystemBlock("Lenovo,","Red,","Windows10,","NVIDIA GeForce RTX 2060,",2000,32,3.9);
        Computer lenovo=new Computer(sb,mon,keyboard,mouse);
        lenovo.printComputer();








    }
}
