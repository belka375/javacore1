package hw11;

import org.w3c.dom.CDATASection;

public class Work {


    public static void main(String[] args) {
        WeekDays[] weekDay = new WeekDays[]{WeekDays.WEDNESDAY, WeekDays.TUESDAY, WeekDays.MONDAY, WeekDays.THURSDAY, WeekDays.FRIDAY};
        WeekDays[] weekEnds = new WeekDays[]{WeekDays.SATURDAY, WeekDays.SUNDAY};

        WeekSchedule firstHalfOfWeek = new WeekSchedule(weekDay, "College Classes", "North Seattle College", 11.35);
        WeekSchedule second = new WeekSchedule(weekEnds, "\nBeach,coffee house,dog park,shopping", "Westwood Mall", 12.35);

        firstHalfOfWeek.printWeekActivity();
        second.printWeekActivity();

        System.out.println("-----------Drivers----------");

        DriversByAge Anna = new DriversByAge("Anna",CarsBody.MINI,35,"Middle age drivers");
        DriversByAge Mourad = new DriversByAge("Mourad",CarsBody.SPORT, 20, "Young drivers group.");
        DriversByAge Darya = new DriversByAge("Darya",CarsBody.OFF_ROAD, 28, "Always young and fast.");

        Darya.printDriversInfo();
        Mourad.printDriversInfo();

    }
}





