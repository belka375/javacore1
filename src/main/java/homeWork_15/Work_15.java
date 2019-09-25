package homeWork_15;

public class Work_15 {
    public static void main(String[] args) {

        SoccerTeam manCity = new SoccerTeam("Manchester city", "Manchester", "Etihad Sradium", "UK", 1.4);

        BasketballTeam lakers = new BasketballTeam("LA Lakers", "Los Angeles", "Staples Center", "LeBron James", "NBA");


        ProtoTeam barcelona = new SoccerTeam("FC Barcelona", "Barcelona", "Santiago Bernabéu Stadium", "Spain", 1.1);

        ProtoTeam dallasMavericks = new BasketballTeam("Dallas Mavericks", "Dallas", "American Airlines Center", "Dirk Nowitzki", "NBA");

        manCity.printTeamInfo();
        System.out.println("===================");
        lakers.printTeamInfo();
        System.out.println("===================");
        barcelona.printTeamInfo();
        System.out.println("===================");
        dallasMavericks.printTeamInfo();
    }
}
