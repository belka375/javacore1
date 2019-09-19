package hw11;

public class Months {
     private Seasons[] season;
     private int totalMonths;
     private int averageTemp;
    public Months() {
    }
    public Months(Seasons[] season,int totalMonths,int averageTemp) {
        this.season=season;
        this.averageTemp=averageTemp;
        this.totalMonths=totalMonths;
    }

    public void setAverageTemp(int averageTemp) {
        this.averageTemp = averageTemp;
    }
    public int getAverageTemp() {
        return averageTemp;
    }
    public Seasons[] getSeason() {
        return season;
    }
    public int getTotalMonths() {
        return totalMonths;
    }
    public void setTotalMonths(int totalMonths) {
        this.totalMonths = totalMonths;
    }
    public void setSeason(Seasons[] season) {
        this.season = season;
    }
    }

 

