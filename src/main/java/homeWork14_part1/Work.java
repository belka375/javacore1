package homeWork14_part1;

public class Work {
    public static void main(String[] args) {

        Address address1 = new Address(9009, "Beverly blvd", "Los Angeles", "CA", 90210, "USA");

        Car car1 = new Car("Audi", "A8", BodyType.SEDAN, Color.RED);
        Car car2 = new Car("Audi", "Q7", BodyType.SUV, Color.BLACK);


        Dealer dealer1 = new Dealer("AutoWorld", car1, 90, address1);
        Dealer dealer2 = new Dealer("Felix", car2, 150, address1);

        AutoDealer autoDealer1 = new AutoDealer(address1, dealer1);
        AutoDealer autoDealer2 = new AutoDealer(address1, dealer2);


        String model = autoDealer1.getDealer().getCarBrand().getModel();
        String brand = autoDealer2.getDealer().getCarBrand().getBrand();


        System.out.println(model);
        System.out.println(brand);
        System.out.println("=============================");

        dealer1.printDealerInfo();
    }

}
