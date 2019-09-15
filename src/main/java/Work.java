public class Work {
    public static void main(String [] args){
//        Cat davidCat = new Cat();
//        davidCat.weight=2.2;
//        davidCat.age=8;
//        davidCat.bride="russian bear";
//        davidCat.county="Brazil";
//        davidCat.name="Pily";
//
//        davidCat.jump();
//        davidCat.miau();
//        davidCat.printCat();
//        davidCat.slip();
//        System.out.println("**************************");
//
//        Cat piterCat=new Cat();
//
//        piterCat.name="Copy";
//        piterCat.county="Holland";
//        piterCat.bride="Egypsian";
//        piterCat.age=5;
//        piterCat.weight=2.5;
//        piterCat.slip();
//        piterCat.printCat();
//
//        System.out.println("**************************");
//
//        Bike bk=new Bike();
//        bk.electric=true;
//        bk.model="montain";
//        bk.color="black";
//        bk.condition="new";
//        bk.numOfWeels=2;
//        bk.beep();
//        bk.printBikeInfo();
//
//        System.out.println("**************************");
//
//        Bike childBike = new Bike();
//        childBike.condition="used";
//        childBike.numOfWeels=3;
//        childBike.color="yellow";
//        childBike.model="baby bike";
//        childBike.printBikeInfo();


        CellPhone iPhone = new CellPhone();
        iPhone.setBrand("iPhone");
        iPhone.setModel("XI");
        iPhone.setScreenSize(16);

        String brandPhone=iPhone.getBrand();
        String modelPhone = iPhone.getModel();
        double screenSize = iPhone.getScreenSize();
        System.out.println(brandPhone+", "+modelPhone+", "+screenSize);

        System.out.println("****************");

        CellPhone samsungGalaxy = new CellPhone();

        samsungGalaxy.setModel("paraqueda");
        samsungGalaxy.setBrand("android");
        samsungGalaxy.setScreenSize(1);

        String brandPhone1=samsungGalaxy.getBrand();
        String modelPhone1 = samsungGalaxy.getModel();
        double screenSize1=samsungGalaxy.getScreenSize();

        System.out.println(brandPhone1+", "+modelPhone1+", "+screenSize1);

   }
}
