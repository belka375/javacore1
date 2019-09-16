package homeWork8;

public class Work {
    public static void main(String[] args) {
        Jacket classicB3= new Jacket();
        classicB3.brand= "SCOTT";
        classicB3.model="Bomber";
        classicB3.color="Brown/White";
        classicB3.material="LLeather";
        classicB3.size=52;
        classicB3.price=1659.99;

        Jacket classicB4= new Jacket();
        classicB4.brand= "SCOTT";
        classicB4.model="Bomber Black";
        classicB4.color="Black";
        classicB3.material="LLeather";
        classicB4.size=52;
        classicB4.price=1399.99;

        classicB3.printPrice();
        classicB3.printJacketInfo();
        System.out.println("-----------------------");
        classicB4.printPrice();
        classicB4.printJacketInfo();

        System.out.println("________________________________________________________________________________");

        Jewerly catalina =new Jewerly();
        catalina.name="Set: Catalina -Gold Mountain";
        catalina.brand= "Unknown";
        catalina.model=1659;
        catalina.materialMe="White Gold 18K";
        catalina.materialStone="Diamonds 3ct.";
        catalina.price=4000;

        catalina.printJewerlyInfo();
        catalina.printUsage2();
        catalina.printPrice();

        System.out.println("-----------------------");

        Jewerly Navy =new Jewerly();
        Navy.name="Earrings 'Navy'";
        Navy.brand= "Miracle";
        Navy.model=109;
        Navy.materialMe="Silver";
        Navy.materialStone="Sapphire";
        Navy.price=399;

        Navy.printJewerlyInfo();
        Navy.printUsage1();
        Navy.printPrice();

        System.out.println("________________________________________________________________________________");

        Bottle fancy=new Bottle();
        fancy.brand="YETI";
        fancy.capacity=18;
        fancy.material="Stainless Steel";
        fancy.color= "Red";
        fancy.price=29.99;

        fancy.printBottle();

        System.out.println("-----------------------");
        Bottle glassBottle=new Bottle();
        glassBottle.brand="Beaumore";
        glassBottle.capacity=24;
        glassBottle.material="Glass";
        glassBottle.color="White";
        glassBottle.price=34.99;
        glassBottle.printBottle();
    }
}

