package hw8;

public class Work {
    public static void main(String[] args) {

        System.out.println("***********ANIMALS***********");

        Animal cat = new Animal();
        cat.age = 10;
        cat.type = "Pers";
        cat.name = "Vaska";
        cat.playSound("Meow");
        cat.whatDoesTheFoxSay("MEOW");

        Animal dog = new Animal();
        dog.type = "Boxer";
        dog.age = 12;
        dog.name = "Tyson";
        dog.playSound("Gav");
        dog.whatDoesTheFoxSay("GAV");


        System.out.println("***********Employees***********");

        Employee vlad = new Employee();
        vlad.department = "Android QA";
        vlad.level = "Middle";
        vlad.salary = 100000;
        int a = vlad.salaryAfterTaxes();
        System.out.println(a);

        Employee yury = new Employee();
        yury.department = "iOS QA";
        yury.salary = 999999999;
        int b = yury.salaryAfterTaxes();
        System.out.println(b);


        System.out.println("***********Phones***********");
        Phone phone1 = new Phone();
        phone1.model = "iPhone 11";
        phone1.os = "iOS";
        phone1.price = 700;
        phone1.phoneData();

        Phone phone2 = new Phone();
        phone2.model = "Pixel 3a";
        phone2.os = "Android";
        phone2.price = 300;
        phone2.phoneData();
    }
    }