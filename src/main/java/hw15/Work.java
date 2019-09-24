package hw15;

public class Work {
    public static void main(String[] args) {

        Flower rose = new Flower("Rose", "Perennial flower ");
        Tree palm = new Flower("Palm", "Perennial plant");

        Plant indoor = new Flower("Lily", "indoor plant");
        Plant outdoor = new Flower("Lemon tree", "outdoor/indoor plant");

        printPlant(rose);
        //printPlant(palm);
        //printPlant(indoor);
        //printPlant(outdoor);
    }

            private static void printPlant (Plant pl){
            pl.printInfo();
    }
}

