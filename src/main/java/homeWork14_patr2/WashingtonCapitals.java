package homeWork14_patr2;

public class WashingtonCapitals extends Team {
    private String captain;

    public WashingtonCapitals(String teamName, String city, String country, double budget, String captain) {
        super(teamName, city, country, budget);
        this.captain = captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public String getCaptain() {
        return captain;
    }


    public void printWCinfo() {
        System.out.println("'" + teamName + "' (" + city + ")" + " \n" + country + " \nBudget: " + budget + "$ bln." + "\nCaptain: " + captain);
    }
}
