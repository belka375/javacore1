package hw15_1;

import hw15.ProtAnimal;

public class Work {

    public static void main(String[] args) {

        Book peaceAndWar = new Book(" PEACE AND WAR", 1860);
        Magazine cosmopoliten = new Magazine("Cosmopoliten", 2019);
        Newspaper miamiHerald = new Newspaper("Miami Herald", 2019);

        Library library = new Library("Sunny Isles", 1990);

        Library history = new Book("History", 2018);
        Library newYork = new Newspaper("New York News", 2019);
        Library elle = new Magazine("Elle", 2019);

        ProtoLibrary book1 = new Book("Petson and Findus", 1980);
        ProtoLibrary newspaper1 = new Newspaper("Cooking at Home", 2019);
        ProtoLibrary magazine1 = new Magazine("The best Gardens", 2018);

        printLibrary(history);
        printLibrary(miamiHerald);
        printLibrary(book1);


    }

    private static void printLibrary(ProtoLibrary pl) {
        pl.printInfo();
    }
}