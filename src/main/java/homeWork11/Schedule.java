package homeWork11;

public class Schedule {

    private Employee emp;
    private WeekDay day;
    private double hours;
    private PlanetsSolarSystem[] planet;
    private Seasons season;

    public Schedule(Employee name, WeekDay day, double hours, Seasons season) {
        this.emp = name;
        this.day = day;
        this.hours = hours;
        this.season=season;
    }
    public Schedule(){}

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public void setDay(WeekDay day) {
        this.day = day;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setPlanet(PlanetsSolarSystem[] planet) {
        this.planet = planet;
    }

    public void setSeason(Seasons season) {
        this.season = season;
    }

    public Employee getEmp() {
        return emp;
    }

    public WeekDay getDay() {
        return day;
    }

    public double getHours() {
        return hours;
    }

    public PlanetsSolarSystem[] getPlanet() {
        return planet;
    }

    public Seasons getSeason() {
        return season;
    }

    public void printSchedule() {
        System.out.println("Oversee the Planets \n"+ season+" Schedule: \n" + emp + "\nEvery- " + day + "\nStart hours - " + hours+ " am");


    }
}
