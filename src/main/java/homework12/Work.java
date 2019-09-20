package homework12;


    public class Work {
        public static void main(String[]args){




            Keyboard keyboard=new Keyboard("wireless", "red");
            Mouse mouse=new Mouse("laser", "wireless");
            SystemBlock sb =new SystemBlock(1234, 4567, 1234556677);

            Brands[] monitor1 = new Brands[]{Brands.DELL, Brands.APPLE, Brands.HP, Brands.TOSHIBA};
            Brands[] bbb=new Brands[]{Brands.HP};
            Monitor monitor=new Monitor(bbb, 123, "new");

            Keyboard keyboard1=new Keyboard("with wire", "pink");
            Mouse mouse1=new Mouse("optical", "with wire");
            SystemBlock sb1=new SystemBlock(4321, 5678, 76544);


            Brands[] aaa= new Brands[]{Brands.TOSHIBA};
            Monitor monitor2=new Monitor(aaa, 321, "Used");




            Computer c =new Computer(keyboard, mouse, sb, monitor);
            c.printComputerInfo();

            Computer d =new Computer(keyboard1, mouse1, sb1, monitor2);
            d.printComputerInfo();


        }

    }





