public class Methods {
    public static void main(String[] args) {






        System.out.println("**********************");
        Book triDruga = new Book();

        triDruga.setName("Tri Druga");
        triDruga.setAuthor("Pushkin");
        triDruga.setBuyingPrice(-12);
        triDruga.setYearOfIssue(1950);

        String bookName = triDruga.getName();
        String bookAuthor = triDruga.getAuthor();
        int bookBuyingPrice = triDruga.getBuyingPrice();
        int yearOfIssue = triDruga.getYearOfIssue();

        System.out.println(bookName+" "+bookAuthor+" "+bookBuyingPrice+" "+yearOfIssue);




//        Person mailman = new Person();
//        mailman.name="John";
//        mailman.lastName="Dole";
//        mailman.eyeColor="Blue";
//        mailman.weight=180;
//        mailman.age=45;
//        mailman.hasChildren=true;
//
//        mailman.printFullName();
//        mailman.printPhysicalConditions();

/*
        Car mashina = new Car();
        mashina.beep();

//        int[] ma = new int[10];
//        int x=5;

        Car ivanCar=new Car();
        ivanCar.brand="BMW";
        ivanCar.model="X5";
        ivanCar.color="Pink";
        ivanCar.gasTankVolume=18.5;

        ivanCar.lightOn();

//        System.out.println("color of "+ivanCar.model+" is "+ivanCar.color);
        ivanCar.printCarInfo();

        Car janeCar = new Car();
        janeCar.color="Silver";
        janeCar.brand="Audi";
        janeCar.model="A2";
        janeCar.gasTankVolume=15;

        janeCar.printCarInfo();
*/




    }
}
