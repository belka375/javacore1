package hw14;

public class main {

    public static void main(String[] args) {
        Citizen donaldTrump = new Citizen("Donald", "Trump", "DT0000001", 888888888, "DTPSP000");
        String donaldsPassportNumber = donaldTrump.getPassportNumber();
        System.out.println(donaldsPassportNumber);
    }

}
