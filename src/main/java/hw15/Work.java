package hw15;

public class Work {
    public static void main(String[] args) {

        Suv honda=new Suv("Honda","Pilot",310,7);
        printCar(honda);
         Sedan nissan=new Sedan("Nissan","Altima",189,5);
         printCar(nissan);
         Truck volvo= new Truck("Volvo",369,"White");
         printCar(volvo);
         Suv hyundai=new Suv("Hyundai","Santa Fe",298,7);
         printCar(hyundai);
    }
    private static void printCar(Auto car){
        car.printInfo();
    }
}
