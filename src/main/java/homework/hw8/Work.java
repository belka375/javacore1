package homework.hw8;

public class Work {
    public static void main(String[]args){
 Art painting = new Art();
        painting.author="Leonardo";
        painting.title="Mona Lisa";
        painting.year=1506;
        painting.width=53;
        painting.height=77;
        painting.frame=true;
        painting.price=1000000000;
        painting.onSale=false;
        painting.location=true;

        System.out.println("Testing methods for object painting.");

        painting.fullName();
        painting.printDimensions();
        painting.hang();
        painting.drop();


 Art myPainting= new Art();
        myPainting.author="N.P.";
        myPainting.title="Sleep";
        myPainting.year=2003;
        myPainting.width=30;
        myPainting.height=24;
        myPainting.frame=false;
        myPainting.price=10000;
        myPainting.onSale=false;
        myPainting.location=false;

  System.out.println("Testing methods for object myPainting.");
        myPainting.fullName();
        myPainting.hang();
        myPainting.printDimensions();


  Fruits Apple=new Fruits();
        Apple.name="Gala";
        Apple.color="yellow";
        Apple.quantity=1;
        Apple.weight=70;
        Apple.radius=2.5;
        Apple.isRipe=true;
        Apple.isTasty=true;

   System.out.println("Testing methods for object Apple.");
        Apple.printPhysicalDescription();
        Apple.taste();

  Fruits pear=new Fruits();
        pear.name="bartlet";
        pear.color="yellow";
        pear.quantity=2;
        pear.radius=3;
        pear.weight=80;
        pear.isRipe=true;
        pear.isTasty=true;

   System.out.println("Testing methods for object pear.");
        pear.grow();
        pear.printPhysicalDescription();
        pear.smell();

  Phone iPhone= new Phone();
        iPhone.brand="apple";
        iPhone.color="black";
        iPhone.isNew=true;
        iPhone.onSale=false;
        iPhone.length=4.5;
        iPhone.price=1000;
        iPhone.year=2018;
        iPhone.width=2.5;

   System.out.println("Testing methods for object iPhone.");
        iPhone.printPhoneInfo();
        iPhone.playMusic();

  Phone Motto=new Phone();
        Motto.brand="Motorola";
        Motto.year=2017;
        Motto.price=200;
        Motto.length=4.2;
        Motto.width=2.7;
        Motto.color="white";
        Motto.onSale=true;

    System.out.println("Testing methods for object Motto.");
        Motto.printDimensions();
        Motto.printPhoneInfo();
        Motto.playMusic();








     }
}
