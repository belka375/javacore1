package hw11;

public class Week {
    public static void main(String[] arg) {

        Days[] weekArray = new Days[] {
            Days.MONDAY,
            Days.TUESDAY,
            Days.WEDNSDAY,
            Days.THURSDAY,
            Days.FRIDAY,
            Days.SATURDAY,
            Days.SUNDAY
        };

        printWeek(weekArray);
    }

    public static void printWeek(Days[] d) {
        for (Days day:d) {
            System.out.println(day);
        }
    }
}
