package homework10;

import com.sun.source.tree.UsesTree;

public class Travel {
    private String country;
    private int duration;
    private double expenses;

    public void travelInfo() {
        if (!(country.equals("USA"))) {
            expenses = expenses*2;
        }  System.out.println(country+" "+duration+" "+expenses);
    }
    public Travel (String destination, int during, double cost){
        this.country = destination;
        this.duration = during;
        this.expenses = cost;
    }
    public Travel () {}

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public double getExpenses() {
        return expenses;
    }

    public int getDuration() {
        return duration;
    }

    public String getCountry() {
        return country;
    }
}
