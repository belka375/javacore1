package hw15;

public class Work15 {
    public static void main(String[] args) {

        Bus b22 = new SchoolBus(2011, "Ford School", "K4533HR");
        Bus c22 = new SchoolBus(2009, "Toyota School", "J4883LR");

        Bus b23 = new PublicBus(2015, "Ikarus", "R3345DS");
        Bus c23 = new PublicBus(2005, "Uazik", "M3753DA");

        Bus b24 = new CommuterBus(2000, "Pazik", "M234DK");
        Bus c24 = new CommuterBus(1998, "Mazda", "S265DO");


            b22.printInfo();
            System.out.println("=======================");
            b23.printInfo();
            System.out.println("=======================");
            c22.printInfo();
            System.out.println("=======================");
            c23.printInfo();
            System.out.println("=======================");
            c24.printInfo();
            System.out.println("=======================");

    }

    }