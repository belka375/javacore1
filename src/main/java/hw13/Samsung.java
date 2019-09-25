package hw13;

import java.time.LocalDateTime;

public class Samsung extends Phone {
    private Characteristics[] ch;



    public Samsung(String brand, String color, int price, LocalDateTime doi) {
        super(brand, color, price, doi);
    }
    public void samsungprint(){
        printInfo();
    }

    public void setCh(Characteristics[] ch) {
        this.ch = ch;
    }

    public Characteristics[] getCh() {
        return ch;
    }
}
