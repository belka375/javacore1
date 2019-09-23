package hw10;

import java.util.concurrent.Flow;

public class Work {
    public static void main(String[] args) {

        // FootWear Class
        Double[] sizes = {7.0, 7.5, 8.0, 8.5, 9.0, 9.5, 10.0, 10.5, 11.0, 11.5, 12.0, 12.5, 13.0};
        FootWear pair1 = new FootWear("Nike",10.0, sizes);

        FootWear pair2 = new FootWear();
        pair2.setBrand("Adidas");
        pair2.setSize(10.5);
        pair2.setSizesAvailable(sizes);

        pair1.printFootWear();
        pair2.printFootWear();


        // Artist Class
        String[] albums1 = {"Album 1a", "Album 2a", "Album 3a", "Album 4a", "Album 5a"};
        Artist artist1 = new Artist("Kendrick Lamar", 32, albums1);

        String[] albums2 = {"Album 1b", "Album 2b", "Album 3b", "Album 4b", "Album 5b"};
        Artist artist2 = new Artist();
        artist2.setName("The Weeknd");
        artist2.setAge(29);
        artist2.setAlbums(albums2);

        artist1.printArtist();
        artist2.printArtist();

        // Flower Class
        String[] countriesOfOrigin1 = {"USA", "Canada", "Spain"};
        Flower flower1 = new Flower("Rose", "Red", countriesOfOrigin1);

        String[] countriesOfOrigin2 = {"Germany", "Mexico", "China"};
        Flower flower2 = new Flower();
        flower2.setName("Tulip");
        flower2.setColor("Purple");
        flower2.setCountriesOfOrigin(countriesOfOrigin2);

        flower1.printFlower();
        flower2.printFlower();
    }
}
