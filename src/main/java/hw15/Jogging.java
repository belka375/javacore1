package hw15;

public class Jogging implements Activity {
    private String name;
    private String[] schedule;
    private int hours;

    public Jogging (String name, String[] schedule, int hours) {
        this.name = name;
        this.schedule = schedule;
        this.hours = hours;
    }

    @Override
    public int countHours() {
        return hours*3;
    }

    @Override
    public void printActivity() {
    System.out.println ("My activity is " + name);
    }
}
