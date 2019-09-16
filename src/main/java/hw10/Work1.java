package hw10;

public class Work1 {
    public static void main(String[] args){
        System.out.println("*************");
//        CellPhone iPhone = new CellPhone("Apple", "11",6);
//        CellPhone samsungGalaxy=new CellPhone();
//        iPhone.getScreenSize(5);
//
           Cat yourCat=new Cat();
           String[] foodextra=new String[]{"milk", "cream","mouse","crocets"};

           yourCat.setBride("russian Blue");
           yourCat.setName("Polkovnik");
           yourCat.setFood(foodextra);
           yourCat.printCatInfo();

           System.out.println("*********************");

           Cat mainCat= new Cat("persian", "Vikky", foodextra );
           mainCat.printCatInfo();

           System.out.println("*********************");

           Bike yourBike = new Bike();

           String[] loc=new String[]{"NPbeach", "LAgunaBeach", "LongBeach", "MAnchattan"};
           yourBike.setModel("beach cruzer");
           yourBike.setNumbersOfWeels(3);
           yourBike.setLocation(loc);

           yourBike.printInfoBike();

           System.out.println("*********************");


           Bike myBike = new Bike( 2, "montain bike", loc);
           myBike.printInfoBike();

           System.out.println("*********************");

           Grossery one=new Grossery();
           String[] ls=new String[]{"milk","water", "lemon"};
           one.setDayOfWeek("monday");
           one.setNameOfPerson("Piter");
           one.setList(ls);
           one.printListOfGrossery();

           System.out.println("*********************");


           Grossery two = new Grossery("Saturday","Mary",ls);
           two.printListOfGrossery();













    }
}
