package hw14;

import hw11.Currency;

public class Work14 {
    public static void main(String[] args) {
        AccountType[] maryaccount=new AccountType[]{AccountType.FAMILY};
        Customer mary=new Customer("Mary", "Clarks", 133458, maryaccount);

        Seller nick= new Seller("Nick", "McMayers", 45776, "Liquid,Inc");

        mary.printCustomer();
        nick.printSeller();


     Order shop23=new Order("Doll Kate", 45.6, Currency.UAH, DeliveryCity.KIEV);
     shop23.printOrder();


    }
}
