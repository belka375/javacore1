package homeWork14_patr2;

public class Work14 {
    public static void main(String[] args) {


        ManCity manchesterCity = new ManCity("Man City FC", "Manchester", "UK", 1.46, "Etihad Stadium", "Soccer");


        WashingtonCapitals washingtonCapitals = new WashingtonCapitals("Washington Capitals", "Washington", "USA", 0.8, "Ovechkin");


        Lakers lakers = new Lakers("LA Lakers", "Los Angeles", "USA", 0.9, "LeBron James", 16);

        lakers.printLakersInfo();
        System.out.println("=========================");
        manchesterCity.printSoccerTeamInfo();
        System.out.println("=========================");
        washingtonCapitals.printWCinfo();

    }
}