package HomeWork_8;

public class Work {
    public static void main(String[] args) {

        PortableSpeaker speaker1 = new PortableSpeaker();
        speaker1.brand = "BOSE";
        speaker1.color = "Black";
        speaker1.bateryLife = 7;
        speaker1.bluetooth = true;
        speaker1.price = 180;

        speaker1.printProductDetails();
        speaker1.play();

        System.out.println("==================");

        PortableSpeaker speaker2 = new PortableSpeaker();
        speaker2.brand = "JBL";
        speaker2.color = "Red";
        speaker2.bateryLife = 5;
        speaker2.bluetooth = true;
        speaker2.price = 120;


        speaker2.printProductDetails();
        speaker2.lightShow();

        System.out.println("==================");

        PortableSpeaker speaker3 = new PortableSpeaker();
        speaker3.brand = "SONY";
        speaker3.color = "Silver";
        speaker3.bateryLife = 4;
        speaker3.bluetooth = true;
        speaker3.price = 110;

        speaker3.printProductDetails();
        speaker3.printProductPrice();

        System.out.println("==================");

        PaymentCard card1 = new PaymentCard();
        card1.type = "Debit";
        card1.bank = "Bank of America";
        card1.paymentSystem = "Visa";
        card1.currency = "USD";
        card1.serviceFee = 25;
        card1.limit = false;

        card1.printCurrency();

        System.out.println("==================");

        card1.printCardDetails();

        System.out.println("==================");

        PaymentCard card2 = new PaymentCard();
        card2.type = "Credit";
        card2.bank = "Capital One";
        card2.paymentSystem = "Master Card";
        card2.currency = "USD";
        card2.serviceFee = 20;

        card2.printCardDetails();

        System.out.println("==================");

        card2.printCurrency();

        System.out.println("==================");

        SportWithBall sport1 = new SportWithBall();
        sport1.sporName = "Soccer";
        sport1.ballSize = 5;
        sport1.playersQty = 11;
        sport1.mostPopularInCountry = "England";
        sport1.starNumberOne = "Messi";

        sport1.details();

        System.out.println("==================");

        sport1.characteristics();


        SportWithBall sport2 = new SportWithBall();
        sport2.starNumberOne = "LeBron James";
        sport2.mostPopularInCountry = "USA";
        sport2.playersQty = 5;
        sport2.ballSize = 7;
        sport2.sporName = "Basketball";

        System.out.println("==================");

        sport2.characteristics();

        System.out.println("==================");

        sport2.details();
    }
}
