package HW8;

public class Star {
    public String type;
    public double temperature;
    public String color;
    public double distance;
    public double mass;
    public double apparentmagnitude;

    public void radiantpower(double d, double qe, double t){
        double fe;
        System.out.println("Radiant Power is "+(fe=(d*qe)/(d*t)));
    }
}
