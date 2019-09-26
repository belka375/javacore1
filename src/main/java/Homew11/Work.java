package homew11;

public class Work {
    public static void main(String[] args) {
        Nfl team1 = Nfl.GIANTS;
        Nfl team2 = Nfl.SAINTS;
        Nfl team3 = Nfl.RAMS;
        Months game1 = Months.SEPTEMBER;

        System.out.println("Game with " + team1 + ": ");
        System.out.println(team1 + ", " + team2 + ", " + team3 + ".");
        System.out.println();

        printMonth(Months.SEPTEMBER);
        printGames(Nfl.COWBOYS);
    }

    private static void printGames(Nfl cowboys) {
    }

    public static void printMonth(Months m){
        System.out.println("Games in  " + m + ": ");
    }

    public static void printGame(Nfl n) {
        System.out.println(n);
    }

}