package hw11;

public class Work11 {
    public static void main(String[] args) {

        Order new1 = new Order();
        new1.setNumber(5456);
        new1.setAmount(56.34);
        new1.setCurrency(Currency.EUR);

        new1.printOrderInfo();
        System.out.println("-----------------------------------------------------");

        CruiseDate ship1 = new CruiseDate();
        ship1.setName("Caribean");
        ship1.setArrivalday(3);
        Month[] months = new Month[]{Month.JANUARY, Month.FEBRUARY, Month.MARCH, Month.JUNE};

        ship1.setArrivalmonth(months);
        ship1.printCruiseDateInfo();

    }
}
