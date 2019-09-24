package homeWork14_patr2;

public class Lakers extends Team {
    private String mainStar;
    private int timesChempions;

    public Lakers(String teamName, String city, String country, double budget, String mainStar, int timesChempions) {
        super(teamName, city, country, budget);
        this.mainStar = mainStar;
        this.timesChempions = timesChempions;
    }


    public void setMainStar(String mainStar) {
        this.mainStar = mainStar;
    }

    public void setTimesChempions(int timesChempions) {
        this.timesChempions = timesChempions;
    }

    public String getMainStar() {
        return mainStar;
    }

    public int getTimesChempions() {
        return timesChempions;
    }

    public void printLakersInfo() {
        System.out.println("'" + teamName + "' (" + city + ")" + " \n" + country + " \nBudget: " + budget + "$ bln." + "\nMain star " + mainStar + "\nChampions:" + timesChempions);
    }
}
