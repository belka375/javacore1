package hw12;


public class Work {
    public static void main(String[] args){

        String [] intcards=new String[]{"Netork","Sound","Video"};
        Monitor monitor = new Monitor(20, Color.Black, "Asus", "AS-20");
        Keyboard keyboard=new Keyboard(Color.Gray, "Mika");
        Mouse mouse = new Mouse(Color.Gray, true);

        MotherBoard md = new MotherBoard("pixel", 123, intcards);
        SystemBlock systemBlock = new SystemBlock(Color.Gray, md );

        Computer mycomp=new Computer(keyboard, monitor,mouse, systemBlock );
        mycomp.printComruterInfo();

       String keyboardBrand= mycomp.getKeyboard().getBrand();
       String mdBrand=mycomp.getSb().getMotherBoard().getBrand();
       System.out.println(keyboardBrand);
       System.out.println(mdBrand);


    }
}
