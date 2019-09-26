package homework.hw14;

public class Hw14Work {
    public static void main(String[]args){
        /*
         Parent class Item
         Children: Camera and TV
         Enum: Condition
         Print info about camera from class Gift
        */
//Task1. Создать один супер и 2 или 3 детских

Camera canon1=new Camera("Rebel","Canon",2016, 800,Condition.NEW,false, "DSLR",false,18,10);
Camera canon2=new Camera("Powershort","Canon",2010,300,Condition.NEW,true,"point&shoot",true,12,4
        );
Camera nikon1=new Camera("Coolpix","Nikon",2015,628,Condition.NEW, true,"point&shoot",true,16,40);



TV sony1 =new TV("X800G","Sony",2018,688,Condition.NEW,false,55,false,"black");
TV lg1=new TV("Nano 8","LG", 2017,1100,Condition.NEW,true,65,true,"black");
TV samsung=new TV("7 series","Samsung",2019,600,Condition.NEW,true,55,false,"black");

TV[] tvS= new TV[]{sony1,lg1,samsung};


Gift may=new Gift("electronics",canon1,"gift card");
Gift june=new Gift("electronics",canon2,"store card");
Gift march=new Gift("presents",nikon1,"premium");

        System.out.println("TV Sony1");
 sony1.printTv();

        System.out.println("TV LG 1");
 lg1.printTv();

        System.out.println("TV Samsung");
 samsung.printTv();

        System.out.println("Camera Canon1");
 canon1.printCamera();
        System.out.println("Camera Canon2");
 canon2.printCamera();
        System.out.println("Camera Nikon1");
 nikon1.printCamera();


 String canon1Model=may.getCamera().model;
        System.out.println(canon1Model);
 String canon2Type=june.getCamera().type;
        System.out.println(canon2Type);
  int nikon1Zoom=march.getCamera().zoom;
        System.out.println(nikon1Zoom);
  boolean canon2IsOnSale=june.getCamera().isOnSale;
        System.out.println(canon2IsOnSale);
   double canon1Price=may.getCamera().price;
        System.out.println(canon1Price);





    }
}
