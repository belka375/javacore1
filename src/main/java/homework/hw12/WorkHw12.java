package homework.hw12;

import java.util.concurrent.Callable;

public class WorkHw12 {
    public static void main(String[]args){

     String[] type =new String[]{"USB", "wireless","bluetooth","infrared"};
     String[] ports=new String[]{"USB 2.0","USB 3.0","HDMI","Display Port"};

     MonitorN dell= new MonitorN("Dell","black",24,2018);
     MonitorN lg= new MonitorN("LG","white",28,2019);

     Keyboard dellK = new Keyboard("Dell","black",2018,40);
     Keyboard acer= new Keyboard("Acer","grey",2019,40);

     SystemBlock dellSb= new SystemBlock("Dell","black",2018,55.5,ports);
     SystemBlock hp = new SystemBlock("HP","white",2019,60,ports);

     Mouse dellM = new Mouse("Dell",2018,type);
     Mouse belkin= new Mouse("Belkin",2019,type);

        ComputerNp dellComputer = new ComputerNp("Dell",2018,600,dell,dellK,dellM,dellSb);
        ComputerNp mixedComputer= new ComputerNp("combined",2019,1000,lg,acer,belkin,hp);


        dellComputer.printComputerNp();
        mixedComputer.printComputerNp();



    }

}
