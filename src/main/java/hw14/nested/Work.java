package hw14.nested;

public class Work {
    public static void main(String[] args) {
        OwnerName dinaOwner=new OwnerName("Dina White");
        Car dinasCar=new Car (dinaOwner,"CRV", "Gray");
        Country country=new Country();
        country.countryName="JAPAN";
        Maker maker=new Maker("Honda",country);

        Dealership dealership=new Dealership("Stevens Creek Honda", dinasCar,CarType.SUV,maker,1000);

        String countryName=maker.getCountry().countryName;

        String model=dealership.getCar().getModel();
        String color=dealership.getCar().getColor();
        String type=dealership.getCarType().toString();

        String name=dealership.getCar().getName().getFullName();

        System.out.println(countryName+" "+type+" "+color+" "+model+" for "+name);

        OwnerName alexOwner=new OwnerName("Alex Black");
        Car alexCar=new Car (alexOwner,"BMW", "White");
        country.countryName="GERMANY";
        Maker bmwMaker=new Maker("BMW",country);

        Dealership bmwDealership=new Dealership("Stevens Creek BMW", alexCar, CarType.CONVERTIBLE,maker,500);

        String makerCountry=maker.getCountry().countryName;

        String carModel=bmwDealership.getCar().getModel();
        String carColor=bmwDealership.getCar().getColor();
        String carType=bmwDealership.getCarType().toString();

        String ownerName=bmwDealership.getCar().getName().getFullName();

        System.out.print(makerCountry+ " "+carType+" "+carColor+" "+carModel+" for "+ownerName);


    }
}
