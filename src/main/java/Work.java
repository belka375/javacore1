import hw8.Coffee;
import hw8.Phone;
import hw8.Store;

import java.util.concurrent.CompletableFuture;

public class Work {
public static void main(String[]args){

    Phone nataliaPhone = new Phone();
    nataliaPhone.brand = "Samsung";
    nataliaPhone.model = "Galaxy S10 Plus";
    nataliaPhone.displaysize = 6.4;
    nataliaPhone.length = 2.92;
    nataliaPhone.width = 0.31;
    nataliaPhone.height = 6.20;
    nataliaPhone.weight = 6.17;


    nataliaPhone.printName();
    nataliaPhone.printParameters();

    System.out.println("_______________________");

    Phone chinesePhone=new Phone();
    chinesePhone.brand = "OnePlus";
    chinesePhone.model = "7 Pro";
    chinesePhone.displaysize = 6.67;
    chinesePhone.length = 2.99;
    chinesePhone.width = 0.34;
    chinesePhone.height = 6.4;
    chinesePhone.weight = 6.87;

    chinesePhone.printName();
    chinesePhone.printParameters();



    System.out.println("_______________________");
    Store nearestStore = new Store();
    nearestStore.name ="Ralphs";
    nearestStore.hours ="24/7";
    nearestStore.type ="Grocery";

    nearestStore.findNearestStore();

    System.out.println("_______________________");
    Store nearestPharmacy = new Store();
    nearestStore.name ="Walgreens";
    nearestStore.hours ="24/7";
    nearestStore.type ="Pharmacy";

    nearestStore.findNearestStore();

    System.out.println("_______________________");

    Coffee lavazzaCoffee = new Coffee();
    lavazzaCoffee.name ="Crema e Gusto";
    lavazzaCoffee.country ="Italy";
    lavazzaCoffee.roast ="Medium";
    lavazzaCoffee.size =8.8;
    lavazzaCoffee.isDecaff =false;

    lavazzaCoffee.printInfo();

    System.out.println("_______________________");

    Coffee illyCoffee = new Coffee();
    illyCoffee.name ="Espresso";
    illyCoffee.country ="Italy";
    illyCoffee.roast ="Dark";
    illyCoffee.size =8.8;
    illyCoffee.isDecaff =true;

    illyCoffee.printInfo();













}
}
