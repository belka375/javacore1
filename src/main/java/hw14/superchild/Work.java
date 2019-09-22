package hw14.superchild;

import java.time.LocalDateTime;

public class Work {
    public static void main(String[] args) {
        CarType[] type = new CarType[]{CarType.SEDAN, CarType.SUV, CarType.HATCHBACK};
        Dealership dealership = new Dealership("Stevens Creek Honda","Landy", "Rosenberg", LocalDateTime.of(1995, 3, 18, 8, 20), type, CarType.SEDAN);
        CarMaker maker=new CarMaker("Honda", "JAPAN");
        Car dinasCar=new Car("Dina", "Whit", LocalDateTime.of(2000,5,15,3,10),maker, "CRV EX");
        CarMaker maker2 = new CarMaker("BMW", "GERMANY");
        Car car = new Car("Alex", "Black", LocalDateTime.of(1999, 7, 20, 4, 30), maker2, "BMW M6");
        dealership.printDealershipInfo();
        dinasCar.printCarInfo();
        car.printCarInfo();

    }
}
