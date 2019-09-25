package hw14;

public class Work {
    public static void main(String[]args) {
        Headset samsung = new Headset("iPhone", 200, "wireless");
        Iphone phone = new Iphone(samsung, "silver", 1000);
        Person i = new Person("Irina", phone);

        String ya = i.getIphone().getIphone().getBrand();
        System.out.println("I have a new "+ya);

        int pr = i.getIphone().getIphone().getPrice();
        System.out.println("Headset that is included costs: "+ pr);

    }


}
