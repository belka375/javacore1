package hw13;

import java.time.LocalDateTime;


public class Iphone extends Phone {
    public Iphone(){}
    private Characteristics[] c;
    public Iphone(String brand, String color, int price, LocalDateTime doi, Characteristics[]c) {
        super(brand, color, price, doi);
        this.c=c;
    }

    public void iPhoneprint() {
        printInfo();
        System.out.println("Main advantages:");
        for (Characteristics a:c
             ) {
            System.out.println(a);


        }
    }


    }
