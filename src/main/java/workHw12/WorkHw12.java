package workHw12;
/*
 * Homework 12
 *1.Заполните содержимым классы Monitor, Keyboard, Mouse, SystemBlock
 *2.Создайте 2 объекта типа Computer в классе Work
*/



public class WorkHw12 {

    public static void main(String[] args) {

     //object 1

        Monitor monitor1 = new Monitor("Dell","E2318HR",23,"1920X1080");
        Keyboard keyboard1 = new Keyboard(Language.ENGLISH,"Logitech G513");
        Mouse mouse1 = new Mouse(MColor.GREY,true,false);
        SystemBlock systemBlock1 = new SystemBlock("Intel Core i5-9400F",6,"ATX12V"," RX 560");
        Computer dell = new Computer(keyboard1,monitor1,mouse1,systemBlock1);



     //object 2

        Monitor monitor2 = new Monitor("HP"," FHD IPS",27," HD 1920X1080");
        Keyboard keyboard2 = new Keyboard(Language.SPANISH,"Mafiti RK100 3 Color");
        Mouse mouse2 = new Mouse(MColor.RED,false,true);
        SystemBlock systemBlock2 = new SystemBlock("Intel Core i7-8550U 1.8GHz",8,"Blue Tip 840","MSI AMD Radeon R72402364P");
        Computer hp = new Computer(keyboard2,monitor2,mouse2,systemBlock2);

        System.out.println(keyboard1.getBrand() + " " + keyboard1.getLang());
        System.out.println(keyboard2.getBrand() + " " + keyboard2.getLang());
        systemBlock2.printSystemBlock();
        System.out.println("************************************************************");
        dell.printComputer();
        System.out.println("************************************************************");
        hp.printComputer();
    }


}











