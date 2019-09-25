package homeWork_15;

public class SoccerTeam extends Team {
    private String country;
    private double budget;

    public SoccerTeam(String teamName, String city, String homeArena, String country, double budget) {
        super(teamName, city, homeArena);
        this.country = country;
        this.budget = budget;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getCountry() {
        return country;
    }

    public double getBudget() {
        return budget;
    }

    public void printTeamInfo() {
        System.out.println("Team name: " + teamName + "\nCity: " + city + "\nHome arena: " + homeArena + "\nCountry: " + country + "\nBudget: " + budget+" bln.");
    }
}



