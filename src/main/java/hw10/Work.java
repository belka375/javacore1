package hw10;

import javax.print.DocFlavor;

public class Work {

    public static void main (String[]args){


//        Сделать 3 класса - в каждом классе по краней мере 3 атрибута.
//
//        Каждый аттрибут имеет setter и getter
//
//        Каждый класс имеет по краней мере 2 конструктора - default и полный (можно больше конструкторов)
//
//        создайте в каждом классе метод printClass() - для вывода всех полей на экран
//
//        По крайней мере один атрибут в одном классе должен быть array
//
//        Создайте в классе Work / main() по крайней мере 2 объекта каждого класса - один полным конструктором, один дефолтовым. Объект созданный дефолтовым конструктором заполните при помощи сеттеров
//
//        Выведите на экран эти объекты функцией printClass()




        String[] ament = new String[]{"Dog park", "Garage", "Fireplace", "Pool", "Playground"};

        Apartment numberOne = new Apartment("Luxury",3425.0, 3100,5, ament);
        Apartment numberTwo = new Apartment("AZALEA", 1000, 600,1, ament);
        Apartment numberThree = new Apartment("CAMELIA", 1240.0, 700, 2, ament);
        Apartment numberFour = new Apartment ("BELMONT", 2000, 1800, 4,ament);
        Apartment numberFive = new Apartment();
        numberFive.setType("CONDO");
        numberFive.setArea(1000);
        numberFive.setPrice(600);
        numberFive.setNumberOfBadrooms(1);
        numberFive.setAmenities(ament);


        numberOne.setPrice(500);

        numberOne.printApartmentInfo();
        numberTwo.printApartmentInfo();
        numberThree.printApartmentInfo();
        numberFour.printApartmentInfo();
        numberFive.printApartmentInfo();


        System.out.println("price of apt #3: "+numberThree.getPrice());

        numberOne.setPrice(numberOne.getPrice()*2);
        System.out.println("price of apt #1: "+numberOne.getPrice());

        numberTwo.setPrice(numberThree.getPrice()*3);
        System.out.println("price of apt #2: "+ numberTwo.getPrice());
        System.out.println("sqFeet price for #3: "+numberThree.sqFeetPrice());



        System.out.println("*************************************");

        Address aptOneAddress = new Address();
        aptOneAddress.setHouseNumber(2050);
        aptOneAddress.setStreetName ("Peachtree street");
        aptOneAddress.setCity("Atlanta");
        aptOneAddress.setZipCode("30009");
        aptOneAddress.state = "GA";

        Address aptTwoAddress = new Address();
        aptTwoAddress.setHouseNumber(33);
        aptTwoAddress.setStreetName ("Peachtree rd");
        aptTwoAddress.setCity("Huston");
        aptTwoAddress.setZipCode("30029");
        aptTwoAddress.state = "TX";


        int hnum= aptOneAddress.getHouseNumber();
        String strName= aptOneAddress.getStreetName();
        String city=aptOneAddress.getCity();
        String zip= aptOneAddress.getZipCode();
        String state=aptOneAddress.getState();

        aptOneAddress.printFullAddress();
        aptTwoAddress.printFullAddress();

//        System.out.println(hnum+" "+strName+", " +city+", "+zip+" "+state );

        System.out.println("*************************************");

        Jeans model1 = new Jeans("Levis", 4, "blue", 25.99);
        Jeans model2 = new Jeans("Diesel", 6, "navy", 42.50);

         // пустой конструктор
        Jeans model3 = new Jeans ();

        model1.printJeansInfo();
        model2.printJeansInfo();
        model3.printJeansInfo();
    }
}
