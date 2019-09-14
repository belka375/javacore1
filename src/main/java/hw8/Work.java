package hw8;

public class Work {
    public static void main(String[] args) {

        System.out.println("***************************************");
        System.out.println("PETS: ");
        System.out.println("***************************************");
        System.out.println();

        Cats barsik = new Cats();
        barsik.name = "Barsik";
        barsik.owner = "Maria";
        barsik.color = "Black";
        barsik.food = "Fish";
        barsik.age = 2;

        barsik.printCatsInfo();
        System.out.print("Favorite game: ");
        barsik.game();

        System.out.println();
        System.out.println("***************************************");
        System.out.println();


        Dogs bim = new Dogs();
        bim.name = "Bim";
        bim.dogOwner = "Vasya";
        bim.color = "Brown";
        bim.breed = "Shepherd";
        bim.food = "Meat";
        bim.age = 7;

        bim.printDogsInfo();
        System.out.print("Favorite game: ");
        bim.game();

        System.out.println();
        System.out.println("***************************************");
        System.out.println();

        Birds kesha = new Birds();
        kesha.name = "Kesha";
        kesha.type = "Parrot";
        kesha.birdOwner = "Lena";
        kesha.color = "Green";
        kesha.age = 1;
        kesha.food = "grains";

        kesha.printBirdsInfo();
        System.out.print("Favorite game: ");
        kesha.game();
        System.out.println();
        System.out.println("**************************************");



    }

}
