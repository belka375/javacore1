package Homew11;

public class Games {
    public static void main(String[] args) {
        NFL team1 = NFL.GIANTS;
        NFL team2 = NFL.SAINTS;
        NFL team3 = NFL.RAMS;
        Months game1 = Months.SEPTEMBER;

        System.out.println("Game with " + team1 + ": ");
        System.out.println(team1 + ", " + team2 + ", " + team3 + ".");
        System.out.println();

        printMonth(Months.SEPTEMBER);
        printGames(NFL.COWBOYS);
    }

    private static void printGames(NFL cowboys) {
    }

    public static void printMonth(Months m){
        System.out.println("Games in  " + m + ": ");
    }

    public static void printGame(NFL n) {
        System.out.println(n);
    }

}
