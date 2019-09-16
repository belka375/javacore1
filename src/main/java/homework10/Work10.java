package homework10;

public class Work10 {
    public static void main(String[] args) {
        Dog pomeranian = new Dog();
        pomeranian.setName("Cookie");
        pomeranian.setAge(2);
        String[] charac = new String[]{"kind", "cute", "fuzzy"};
        pomeranian.setCharacteristics(charac);
        pomeranian.printDogInfo();

        System.out.println("_____________________");
        Dog pug = new Dog();
        pug.setName("Mou");
        pug.setAge(1);
        pug.setCharacteristics(charac);
        pug.printInfo();

        System.out.println("_____________________");
        Dog terrier = new Dog("Many", 12, charac);
        terrier.printDogInfo();

        System.out.println("_____________________");
        int[] pr = new int[]{1000, 1100, 1200};
        Laptop lenovo = new Laptop("grey", "lenovo", pr);
        lenovo.print();

        System.out.println("_____________________");
        Laptop hp = new Laptop();
            hp.setBrand("HP");
            hp.setColor("Silver");
            hp.setPrice(pr);
            hp.printLaptopInfo();

        System.out.println("_____________________");
        String[] pers = new String[]{"bossy", "funny", "unpredictable"};
        Coworker brian = new Coworker ("Brian", 37, pers);
        brian.print();

        System.out.println("_____________________");
        Coworker anna = new Coworker();
        anna.setAge(35);
        anna.setName("Adam");
        anna.setPersonality(pers);
        anna.printCoworker();

        }



    }




