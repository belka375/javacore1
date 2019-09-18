package HW8;

public class Work {
    public static void main(String[]args){


            Dog scally=new Dog();
            scally.name="Scally";
            scally.breed="Labrador";
            scally.size = "Large";
            scally.behavior = "Loves kids";
            scally.weight = 55;


            scally.printDogInfo();

            Dog dazy=new Dog();
            dazy.name="Dazy";
            dazy.breed="Domestic";
            dazy.size = "Small";
            dazy.behavior = "Very nice";
            dazy.weight = 10;

            dazy.printDogInfo();



            Shoes slippers=new Shoes();
            slippers.brand = "Prada";
            slippers.color = "Pink";
            slippers.type  ="cool";
            slippers.printShoesInfo();


            Shoes sneakers=new Shoes();
            sneakers.brand = "Adidas";
            sneakers.color = "Blue";
            sneakers.type  ="running";
            sneakers.printShoesInfo();



            PublicTransport transport=new PublicTransport();
            transport.type="Land";
            transport.name ="School Bus";
            transport.model=345;
            transport.year=2019;

            transport.printTransportationInfo();
            transport.printTransportationCharacteristic();

            PublicTransport transport1=new PublicTransport();
            transport1.type="Underground";
            transport1.name ="Subway";
            transport1.model=34515678;
            transport1.year=1940;

            transport1.printTransportationInfo();
            transport1.printTransportationCharacteristic();


    }
}




