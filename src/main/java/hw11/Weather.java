package hw11;

public class Weather {
    private Seasons season;
    private int temp;

    public Weather(){}
    public Weather(Seasons season,int temp){
        this.season=season;
        this.temp=temp;
    }
    public void setSeason(Seasons season) {
        this.season = season;
    }
    public int getTemp() {
        return temp;
    }
    public void setTemp(int temp) {
        this.temp = temp;
    }
    public Seasons getSeason() {
        return season;
    }
}

