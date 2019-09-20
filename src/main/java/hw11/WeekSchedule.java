package hw11;

public class WeekSchedule {
    private WeekDays[]weekDays;
    private String activity;
    private String places;
    private double napTime;

    public WeekSchedule(){}

    public WeekSchedule(WeekDays[]weekDays,String activity,String places,double napTime){
        this.activity=activity;
        this.napTime=napTime;
        this.places=places;
        this.weekDays=weekDays;
    }


    public void setWeekDays(WeekDays[] weekDays) {
        this.weekDays = weekDays;
    }
    public void setActivity(String activity) {
        this.activity = activity;
    }
    public void setNapTime(double napTime) {
        this.napTime = napTime;
    }
    public void setPlaces(String places) {
        this.places = places;
    }
    public WeekDays[] getWeekDays() {
        return weekDays;
    }
    public double getNapTime() {
        return napTime;
    }
    public String getActivity() {
        return activity;
    }
    public String getPlaces() {
        return places;
    }
    public void printWeekActivity(){
        System.out.println("\nWeek Activity:"+activity+" in "+places+"."+"\nNap Time:"+napTime);
        for(WeekDays wd:weekDays){
            System.out.print(wd+" \n");
        }
    }
}
