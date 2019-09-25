package hw8a;

public class Work {

    public static void main (String[]args){

        System.out.println("Home Work 8");

        System.out.println("**********Class Apartment, object 1 ***************");

        Apartment numberOne = new Apartment();
        numberOne.type = "LUXURY";
        numberOne.area = (3400.0);
        numberOne.price = 5000;
        numberOne.numberOfBadrooms = 4;

        numberOne.printApartmentInfo();

        System.out.println("*************Class  Apartment, object 2 ***************");

        Apartment numberTwo = new Apartment();
        numberTwo.area = (1000.0);
        numberTwo.type = ("STUDIO");
        numberTwo.price = 800.99;

        numberTwo.printApartmentInfo();

        System.out.println("**********Class Address ***************");

        Address aptOneAddress = new Address();
        aptOneAddress.streetName = "Peachtree street";
        aptOneAddress.houseNumber = 2050;
        aptOneAddress.zipCode = "30009";
        aptOneAddress.city = "Atlanta";
        aptOneAddress.state = "GA";

        aptOneAddress.printFullAddress();

        System.out.println("*********Class Insect/ Object Ladybug ***************");

        Insect ladyBug = new Insect();
        ladyBug.order = "beetle";
        ladyBug.name = "Ladybug";
        ladyBug.lifespan = 24;
        ladyBug.legs = 6;

        ladyBug.description();
        ladyBug.crawl();
        ladyBug.reproduce();
        ladyBug.legs();

        System.out.println("*********Class Insect/ Object Stink Bug ***************");

        Insect stinkBug = new Insect();
        stinkBug.order = "true bug";
        stinkBug.name = "Stink Bug";
        stinkBug.lifespan = 8;
        stinkBug.legs = 6;

        stinkBug.description();
        stinkBug.fly();
        stinkBug.reproduce();
        stinkBug.legs();
    }
}
