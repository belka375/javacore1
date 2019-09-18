package hw11;

import java.util.Arrays;

public class Seasons {
    private String[] months;
    private String[] summerMonths;
    private String[] autumnMonths;
    private String[] springMonths;
    private String[] winterMonths;

    public Seasons(String Months, String[] summerMonths, String[] autumnMonths, String[] springMonths, String[] winterMonths) {
        this.months = months;
        this.winterMonths = winterMonths;
        this.autumnMonths = autumnMonths;
        this.summerMonths = summerMonths;
        this.springMonths = springMonths;
    }
    public void setMonths(String[] months) {
        this.months = months;
    }
    public void setSummerMonths(String[] summerMonths) {
        return;
    }
    public void setAutumnMonths(String[] autumnMonths) {
        this.autumnMonths = autumnMonths;
    }
    public void setSpringMonths(String[] springMonths) {
        this.springMonths = springMonths;
    }
    public void setWinterMonths(String[] winterMonths) {
        this.winterMonths = winterMonths;
    }
    public String[] getMonths() {
        return months;
    }
    public String[] getAutumnMonths() {
        return autumnMonths;
    }
    public String[] getSpringMonths() {
        return springMonths;
    }
    public String[] getSummerMonths() {
        return summerMonths;
    }
    public String[] getWinterMonths() {
        return winterMonths;
    }
    public void printMonths(Months[] twelweMonths) {
        for (Months all : twelweMonths)
            System.out.println(twelweMonths);
    }
    public void printAutumnMonths(Months[] autumnMonths) {
        for (Months autumn : autumnMonths) {
            System.out.println(autumn);
        }
    }
}
