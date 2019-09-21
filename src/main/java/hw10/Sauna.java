package hw10;

public class Sauna {
    private int door;
    private String steam;
    private double temperature;
    private String bench;

    public void setBench(String bench) {
        this.bench = bench;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public void setSteam(String steam) {
        this.steam = steam;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getDoor() {
        return door;
    }

    public String getSteam() {
        return steam;
    }

    public String getBench() {
        return bench;
    }
}

