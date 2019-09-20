package hw12;

public class Monitor {
    private String screenSurface;
    private double screensize;
    private String screenColor;
    private String model;

    public Monitor(String scrsurface, double scrsize, String scrcolor, String model){
        this.screenSurface=scrsurface;
        this.screensize=scrsize;
        this.screenColor=scrcolor;
        this.model=model;
    }

    public String getScreenSurface() {
        return screenSurface;
    }

    public double getScreensize() {
        return screensize;
    }

    public String getScreenColor() {
        return screenColor;
    }

    public String getModel() {
        return model;
    }
    public void printMonitor(){
        System.out.println(model+" "+screenColor+" "+screenSurface+" "+screensize);
    }
}
