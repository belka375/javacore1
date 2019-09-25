package hw14;

public class Work14 {
    public static void main(String[] args) {
        //Super and children classes

        Customer mary=new Customer("Mary", "Clarks", 133458, AccountType.CORPORATE);

        Seller nick= new Seller("Nick", "McMayers", 45776, "Liquid,Inc");

        mary.printCustomer();
        System.out.println("-------------------------------------------------------");
        nick.printSeller();

        //get
        System.out.println("-------------------------------------------------------");
        hw14.Currency[] currency=new hw14.Currency[]{hw14.Currency.UAH};
     Pack shop23=new Pack("Marina", "Nicson", 445322, "Ivan.LSD", 45, "Doll Kitty", Currency.UAH, DeliveryCity.KIEV, "airplane");
     shop23.printPack();
        System.out.println("-------------------------------------------------------");
     String name=shop23.getprodName();
     System.out.println(name);



    }
}
