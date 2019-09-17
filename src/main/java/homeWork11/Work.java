package homeWork11;

public class Work {

    public static void main(String[] args) {
//Class #1 PayCheck--------------------------------------------------------------------------------------------------------
        PayCheck week45 = new PayCheck(Employee.IVANOV, WeekDay.THURSDAY, 1300.36);
        week45.printCheckInfo();
        System.out.println("------------------------------------------------------------------------------");

        PayCheck week46 = new PayCheck();

        week46.setEmp1(Employee.MALACHOV);
        week46.setDay(WeekDay.MONDAY);
        week46.setSum(1239.33);

        week46.printCheckInfo();
        System.out.println("------------------------------------------------------------------------------");

//Class #2 Schedule--------------------------------------------------------------------------------------------------------
        Schedule summerSchedule = new Schedule(Employee.DOSENKO, WeekDay.FRIDAY, 4.3, Seasons.SUMMER);

        PlanetsSolarSystem[] planetsS = new PlanetsSolarSystem[]{PlanetsSolarSystem.JUPITER, PlanetsSolarSystem.MARS, PlanetsSolarSystem.SATURN};

        summerSchedule.printSchedule();
        System.out.println("Observed Planets:");
        for (PlanetsSolarSystem baby : planetsS) {
            System.out.println(baby);
        }
        System.out.println("------------------------------------------------------------------------------");


        Schedule winterSchedule = new Schedule();

        winterSchedule.setEmp(Employee.MALACHOV);
        winterSchedule.setDay(WeekDay.WEDNESDAY);
        winterSchedule.setHours(2.15);
        winterSchedule.setSeason(Seasons.WINTER);

        PlanetsSolarSystem[] planetsW = new PlanetsSolarSystem[]{PlanetsSolarSystem.NEPTUNE, PlanetsSolarSystem.URANUS, PlanetsSolarSystem.MERCURY};

        winterSchedule.printSchedule();
        System.out.println("Observed Planets:");
        for (PlanetsSolarSystem baby : planetsW) {
            System.out.println(baby);
        }

    }
}
