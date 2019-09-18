package homeWork_11;

public class Formula1 {

    private F1Teams teamX;
    private Engine engine;
    private double driversSallary;

    public Formula1(F1Teams teamX, Engine engine, double driversSallary) {
        this.teamX = teamX;
        this.engine = engine;
        this.driversSallary = driversSallary;
    }

    public Formula1() {

    }


    public void setTeamX(F1Teams teamX) {
        this.teamX = teamX;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void setDriversSallary(double driversSallary) {
        this.driversSallary = driversSallary;
    }

    public F1Teams getTeamX() {
        return teamX;
    }
    public Engine getEngine() {
        return engine;
    }
    public double getDriversSallary() {
        return driversSallary;
    }


    public void printTeamInfo() {
        System.out.println("Formula1 team - " + teamX + "\nEngine brand - " + engine + "\nDrivers sallary - " + driversSallary + " mln $");
    }


}
