package HW8;

public class Building {
    public String adress;
    public int yearofbuild;
    public String buildingcompanyname;
    public double stories;
    public String[] buildingmaterials;
    public double sqfeet;
    public boolean buildinsolarenergy;
    public double energyforpowerpermonth;
    public double energyforhvacpermonth;
    public double solarenergyproductionpermonth;

    public void energyconsumption(double energyforhvacpermonth, double energyforpowerpermonth, double solarenergyproductionpermonth){
        double kwhyear;
        if (buildinsolarenergy){
            kwhyear=energyforhvacpermonth+energyforpowerpermonth-solarenergyproductionpermonth;
        }kwhyear=energyforhvacpermonth+energyforpowerpermonth;
        System.out.println("Power consumption "+kwhyear+" kWh per year");
    }
}
