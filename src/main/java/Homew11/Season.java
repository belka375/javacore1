package Homew11;

public class Season {
    public static void main(String[] arg) {

        Months[] seasonArray = new Months[] {
                Months.SEPTEMBER,
                Months.OCTOBER,
                Months.NOVEMBER,
                Months.DECEMBER,
                Months.JANUARY,
                Months.FEBRUARY,
                Months.MARCH
        };

        printSeason(seasonArray);
    }




    public static void printSeason(Months[] m) {
        for (Months month:m) {
            System.out.println(month);
        }
    }
}

