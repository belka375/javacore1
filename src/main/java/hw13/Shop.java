package hw13;

import java.time.LocalDateTime;

public class Shop {
    public static void main(String[]args) {
        Characteristics[] iphone=new Characteristics[]{Characteristics.ERGONOMIC, Characteristics.FAST, Characteristics.SLIM};

        Samsung sam = new Samsung("Samsung", "purple", 900, LocalDateTime.of(2018, 11, 20, 20, 20));

        Iphone i = new Iphone("iPhone", "silver", 1000, LocalDateTime.of(2019, 9, 20, 20, 20), iphone);


        sam.samsungprint();
        i.iPhoneprint();
    }
}

