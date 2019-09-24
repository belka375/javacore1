package homeWork14_patr2;

public class ManCity extends Team {
    private String homeArena;
    private String sport;

    public ManCity(String teamName, String city, String country, double budget, String homeArena, String sport) {
        super(teamName, city, country, budget);
        this.sport = sport;
        this.homeArena = homeArena;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getSport() {
        return sport;
    }

    public void setHomeArena(String homeArena) {
        this.homeArena = homeArena;
    }

    public String getHomeArena() {
        return homeArena;
    }

    public void printSoccerTeamInfo() {
        System.out.println("'" + teamName + "' (" + city + ")" + " \n" + country + " \nBudget: " + budget + "$ bln." + "\nHome arena: " + homeArena + "\n" + sport);
    }
}
