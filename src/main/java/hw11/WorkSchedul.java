package hw11;

public class WorkSchedul {
    private WeekDays[]weekDays;
    private String name;
    private String weekEnds;
    public WorkSchedul( WeekDays[]weekDays,String name,String weekEnds){
        this.weekDays=weekDays;
        this.name=name;
        this.weekEnds=weekEnds;
    }
    public void setWeekDays(WeekDays[] weekDays) {
        this.weekDays = weekDays;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWeekEnds(String weekEnds) {
        this.weekEnds = weekEnds;
    }
    public String getName() {
        return name;
    }
    public String getWeekEnds() {
        return weekEnds;
    }
    public WeekDays[] getWeekDays() {
        return weekDays;
    }

}
